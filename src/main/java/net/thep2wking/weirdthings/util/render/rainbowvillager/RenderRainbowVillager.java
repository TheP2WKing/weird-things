package net.thep2wking.weirdthings.util.render.rainbowvillager;

import net.minecraft.client.model.ModelVillager;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.thep2wking.weirdthings.WeirdThings;
import net.thep2wking.weirdthings.content.entity.EntityRainbowVillager;

@SideOnly(Side.CLIENT)
public class RenderRainbowVillager extends RenderLiving<EntityRainbowVillager> {
	public RenderRainbowVillager(RenderManager renderManagerIn) {
		super(renderManagerIn, new ModelVillager(0f), 0.5f);
	}

	@Override
	public ResourceLocation getEntityTexture(EntityRainbowVillager entity) {
		return new ResourceLocation(WeirdThings.MODID, "textures/entity/rainbow_villager.png");
	}

	@Override
	public void preRenderCallback(EntityRainbowVillager entitylivingbaseIn, float partialTickTime) {
		float f = 0.9375F;
		if (entitylivingbaseIn.getGrowingAge() < 0) {
			f = (float) ((double) f * 0.5D);
			this.shadowSize = 0.25F;
		} else {
			this.shadowSize = 0.5F;
		}
		GlStateManager.scale(f, f, f);
	}

	public static final RenderRainbowVillager.Factory FACTORY = new RenderRainbowVillager.Factory();

	public static class Factory implements IRenderFactory<EntityRainbowVillager> {
		@Override
		public Render<? super EntityRainbowVillager> createRenderFor(RenderManager manager) {
			return new RenderRainbowVillager(manager);
		}
	}
}