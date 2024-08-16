package net.thep2wking.weirdthings.util.render.flyingslime;

import net.minecraft.client.model.ModelSlime;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.thep2wking.weirdthings.content.entity.EntityFlyingSlime;

@SideOnly(Side.CLIENT)
public class RenderFlyingSlime extends RenderLiving<EntityFlyingSlime> {
	public RenderFlyingSlime(RenderManager renderManagerIn) {
		super(renderManagerIn, new ModelSlime(16), 0.25f);
		this.addLayer(new LayerFlyingSlimeGel(this));
	}

	@Override
	public ResourceLocation getEntityTexture(EntityFlyingSlime entity) {
		return new ResourceLocation("minecraft", "textures/entity/slime/slime.png");
	}

	@Override
	public void preRenderCallback(EntityFlyingSlime entitylivingbaseIn, float partialTickTime) {
		GlStateManager.scale(0.55F, 0.55F, 0.55F);
	}

	@Override
	public void applyRotations(EntityFlyingSlime entityLiving, float p_77043_2_, float rotationYaw, float partialTicks) {
		if (entityLiving.getIsBatHanging()) {
			GlStateManager.translate(0.0F, 0.9F, 0.0F);
			GlStateManager.rotate(180.0F, 1.0F, 0.0F, 0.0F);
		} else {
			GlStateManager.translate(0.0F, MathHelper.cos(p_77043_2_ * 0.3F) * 0.1F, 0.0F);
			GlStateManager.rotate(0.0F, 1.0F, 0.0F, 0.0F);
		}
		super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
	}

	public static final RenderFlyingSlime.Factory FACTORY = new RenderFlyingSlime.Factory();

	public static class Factory implements IRenderFactory<EntityFlyingSlime> {
		@Override
		public Render<? super EntityFlyingSlime> createRenderFor(RenderManager manager) {
			return new RenderFlyingSlime(manager);
		}
	}
}