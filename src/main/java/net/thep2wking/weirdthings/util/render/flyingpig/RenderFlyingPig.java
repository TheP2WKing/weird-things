package net.thep2wking.weirdthings.util.render.flyingpig;

import net.minecraft.client.model.ModelPig;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.thep2wking.weirdthings.content.entity.EntityFlyingPig;

@SideOnly(Side.CLIENT)
public class RenderFlyingPig extends RenderLiving<EntityFlyingPig> {
	public RenderFlyingPig(RenderManager renderManagerIn) {
		super(renderManagerIn, new ModelPig(), 0.25f);
	}

	@Override
	public ResourceLocation getEntityTexture(EntityFlyingPig entity) {
		return new ResourceLocation("minecraft", "textures/entity/pig/pig.png");
	}

	@Override
	public void preRenderCallback(EntityFlyingPig entitylivingbaseIn, float partialTickTime) {
		GlStateManager.scale(0.45F, 0.45F, 0.45F);
	}

	@Override
	public void applyRotations(EntityFlyingPig entityLiving, float p_77043_2_, float rotationYaw, float partialTicks) {
		if (entityLiving.getIsBatHanging()) {
			GlStateManager.translate(0.0F, 0.9F, 0.0F);
			GlStateManager.rotate(180.0F, 1.0F, 0.0F, 0.0F);
		} else {
			GlStateManager.translate(0.0F, MathHelper.cos(p_77043_2_ * 0.3F) * 0.1F, 0.0F);
			GlStateManager.rotate(0.0F, 1.0F, 0.0F, 0.0F);
		}
		super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
	}

	public static final RenderFlyingPig.Factory FACTORY = new RenderFlyingPig.Factory();

	public static class Factory implements IRenderFactory<EntityFlyingPig> {
		@Override
		public Render<? super EntityFlyingPig> createRenderFor(RenderManager manager) {
			return new RenderFlyingPig(manager);
		}
	}
}