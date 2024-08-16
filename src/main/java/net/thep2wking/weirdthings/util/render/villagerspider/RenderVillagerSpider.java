package net.thep2wking.weirdthings.util.render.villagerspider;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.thep2wking.weirdthings.WeirdThings;
import net.thep2wking.weirdthings.content.entity.EntityVillagerSpider;

@SideOnly(Side.CLIENT)
public class RenderVillagerSpider extends RenderLiving<EntityVillagerSpider> {
	public RenderVillagerSpider(RenderManager renderManagerIn) {
		super(renderManagerIn, new ModelVillagerSpider(), 0.5f);
	}

	@Override
	public ResourceLocation getEntityTexture(EntityVillagerSpider entity) {
		return new ResourceLocation(WeirdThings.MODID, "textures/entity/villager_spider.png");
	}

	@Override
	public float getDeathMaxRotation(EntityVillagerSpider entityLivingBaseIn) {
		return 180.0F;
	}

	public static final RenderVillagerSpider.Factory FACTORY = new RenderVillagerSpider.Factory();

	public static class Factory implements IRenderFactory<EntityVillagerSpider> {
		@Override
		public Render<? super EntityVillagerSpider> createRenderFor(RenderManager manager) {
			return new RenderVillagerSpider(manager);
		}
	}
}