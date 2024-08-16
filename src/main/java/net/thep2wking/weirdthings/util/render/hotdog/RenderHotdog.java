package net.thep2wking.weirdthings.util.render.hotdog;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.thep2wking.weirdthings.WeirdThings;
import net.thep2wking.weirdthings.content.entity.EntityHotdog;

@SideOnly(Side.CLIENT)
public class RenderHotdog extends RenderLiving<EntityHotdog> {
	public RenderHotdog(RenderManager renderManagerIn) {
		super(renderManagerIn, new ModelHotdog(), 0.5f);
	}

	@Override
	public ResourceLocation getEntityTexture(EntityHotdog entity) {
		if (entity.isTamed()) {
			return new ResourceLocation(WeirdThings.MODID, "textures/entity/hotdog_tamed.png");
		} else {
			return entity.isAngry() ? new ResourceLocation(WeirdThings.MODID, "textures/entity/hotdog_angry.png")
					: new ResourceLocation(WeirdThings.MODID, "textures/entity/hotdog.png");
		}
	}

	@Override
	public float handleRotationFloat(EntityHotdog livingBase, float partialTicks) {
		return livingBase.getTailRotation();
	}

	@Override
	public void doRender(EntityHotdog entity, double x, double y, double z, float entityYaw, float partialTicks) {
		if (entity.isWolfWet()) {
			float f = entity.getBrightness() * entity.getShadingWhileWet(partialTicks);
			GlStateManager.color(f, f, f);
		}
		super.doRender(entity, x, y, z, entityYaw, partialTicks);
	}

	public static final RenderHotdog.Factory FACTORY = new RenderHotdog.Factory();

	public static class Factory implements IRenderFactory<EntityHotdog> {
		@Override
		public Render<? super EntityHotdog> createRenderFor(RenderManager manager) {
			return new RenderHotdog(manager);
		}
	}
}