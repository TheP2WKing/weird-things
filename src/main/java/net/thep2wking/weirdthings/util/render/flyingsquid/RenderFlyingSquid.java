package net.thep2wking.weirdthings.util.render.flyingsquid;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.thep2wking.weirdthings.content.entity.EntityFlyingSquid;

@SideOnly(Side.CLIENT)
public class RenderFlyingSquid extends RenderLiving<EntityFlyingSquid> {
	public RenderFlyingSquid(RenderManager renderManagerIn) {
		super(renderManagerIn, new ModelFlyingSquid(), 0.25f);
	}

	@Override
	public ResourceLocation getEntityTexture(EntityFlyingSquid entity) {
		return new ResourceLocation("minecraft", "textures/entity/squid.png");
	}

	@Override
	public void preRenderCallback(EntityFlyingSquid entitylivingbaseIn, float partialTickTime) {
		GlStateManager.scale(0.45F, 0.45F, 0.45F);
	}

	@Override
	public void applyRotations(EntityFlyingSquid entityLiving, float p_77043_2_, float rotationYaw, float partialTicks) {
		if (entityLiving.getIsBatHanging()) {
			GlStateManager.translate(0.0F, 0.75F, 0.0F);
			GlStateManager.rotate(180.0F, 1.0F, 0.0F, 0.0F);
		} else {
			GlStateManager.translate(0.0F, MathHelper.cos(p_77043_2_ * 0.3F) * 0.1F, 0.0F);
			GlStateManager.rotate(0.0F, 1.0F, 0.0F, 0.0F);
		}
		super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
	}

	public static final RenderFlyingSquid.Factory FACTORY = new RenderFlyingSquid.Factory();

	public static class Factory implements IRenderFactory<EntityFlyingSquid> {
		@Override
		public Render<? super EntityFlyingSquid> createRenderFor(RenderManager manager) {
			return new RenderFlyingSquid(manager);
		}
	}
}