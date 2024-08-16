package net.thep2wking.weirdthings.util.render.villagerwither;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.thep2wking.weirdthings.WeirdThings;
import net.thep2wking.weirdthings.content.entity.EntityVillagerWither;

@SideOnly(Side.CLIENT)
public class RenderVillagerWither extends RenderLiving<EntityVillagerWither> {
	public RenderVillagerWither(RenderManager renderManagerIn) {
		super(renderManagerIn, new ModelVillagerWither(0f), 1.0f);
		this.addLayer(new LayerVillagerWitherAura(this));
	}

	@Override
	public ResourceLocation getEntityTexture(EntityVillagerWither entity) {
		int i = entity.getInvulTime();
		return i > 0 && (i > 80 || i / 5 % 2 != 1)
				? new ResourceLocation(WeirdThings.MODID, "textures/entity/villager_wither_invulnerable.png")
				: new ResourceLocation(WeirdThings.MODID, "textures/entity/villager_wither.png");
	}

	@Override
	public void preRenderCallback(EntityVillagerWither entitylivingbaseIn, float partialTickTime) {
		float f = 2.0F;
		int i = entitylivingbaseIn.getInvulTime();
		if (i > 0) {
			f -= ((float) i - partialTickTime) / 220.0F * 0.5F;
		}
		GlStateManager.scale(f, f, f);
	}

	public static final RenderVillagerWither.Factory FACTORY = new RenderVillagerWither.Factory();

	public static class Factory implements IRenderFactory<EntityVillagerWither> {
		@Override
		public Render<? super EntityVillagerWither> createRenderFor(RenderManager manager) {
			return new RenderVillagerWither(manager);
		}
	}
}