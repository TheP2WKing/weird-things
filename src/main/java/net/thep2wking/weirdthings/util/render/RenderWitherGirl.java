package net.thep2wking.weirdthings.util.render;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.thep2wking.weirdthings.WeirdThings;
import net.thep2wking.weirdthings.content.entity.EntityWitherGirl;
import net.thep2wking.weirdthings.content.model.ModelWitherGirl;
import net.thep2wking.weirdthings.util.layer.LayerWitherGirlAura;

@SideOnly(Side.CLIENT)
public class RenderWitherGirl extends RenderLiving<EntityWitherGirl> {
	public RenderWitherGirl(RenderManager renderManagerIn) {
		super(renderManagerIn, new ModelWitherGirl(0f), 1.25f);
		this.addLayer(new LayerWitherGirlAura(this));
	}

	@Override
	public ResourceLocation getEntityTexture(EntityWitherGirl entity) {
		int i = entity.getInvulTime();
		return i > 0 && (i > 80 || i / 5 % 2 != 1)
				? new ResourceLocation(WeirdThings.MODID, "textures/entity/wither_girl_invulnerable.png")
				: new ResourceLocation(WeirdThings.MODID, "textures/entity/wither_girl.png");
	}

	@Override
	public void preRenderCallback(EntityWitherGirl entitylivingbaseIn, float partialTickTime) {
		float f = 2.0F;
		int i = entitylivingbaseIn.getInvulTime();
		if (i > 0) {
			f -= ((float) i - partialTickTime) / 220.0F * 0.5F;
		}
		GlStateManager.scale(f, f, f);
	}

	public static final RenderWitherGirl.Factory FACTORY = new RenderWitherGirl.Factory();

	public static class Factory implements IRenderFactory<EntityWitherGirl> {
		@Override
		public Render<? super EntityWitherGirl> createRenderFor(RenderManager manager) {
			return new RenderWitherGirl(manager);
		}
	}
}