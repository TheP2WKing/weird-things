package net.thep2wking.weirdthings.util.render.cowvillager;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.thep2wking.weirdthings.WeirdThings;
import net.thep2wking.weirdthings.content.entity.EntityCowVillager;

@SideOnly(Side.CLIENT)
public class RenderCowVillager extends RenderLiving<EntityCowVillager> {
	public RenderCowVillager(RenderManager renderManagerIn) {
		super(renderManagerIn, new ModelCowVillager(), 0.5f);
	}

	@Override
	public ResourceLocation getEntityTexture(EntityCowVillager entity) {
		return new ResourceLocation(WeirdThings.MODID, "textures/entity/cow_villager.png");
	}

	public static final RenderCowVillager.Factory FACTORY = new RenderCowVillager.Factory();

	public static class Factory implements IRenderFactory<EntityCowVillager> {
		@Override
		public Render<? super EntityCowVillager> createRenderFor(RenderManager manager) {
			return new RenderCowVillager(manager);
		}
	}
}