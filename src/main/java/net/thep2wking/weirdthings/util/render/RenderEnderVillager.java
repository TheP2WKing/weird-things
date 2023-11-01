package net.thep2wking.weirdthings.util.render;

import net.minecraft.client.model.ModelVillager;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.thep2wking.weirdthings.WeirdThings;
import net.thep2wking.weirdthings.content.entity.EntityEnderVillager;

@SideOnly(Side.CLIENT)
public class RenderEnderVillager extends RenderLiving<EntityEnderVillager> {
	public RenderEnderVillager(RenderManager renderManagerIn) {
		super(renderManagerIn, new ModelVillager(0f), 0.5f);
	}

	@Override
	public ResourceLocation getEntityTexture(EntityEnderVillager entity) {
		return new ResourceLocation(WeirdThings.MODID, "textures/entity/ender_villager.png");
	}

	public static final RenderEnderVillager.Factory FACTORY = new RenderEnderVillager.Factory();

	public static class Factory implements IRenderFactory<EntityEnderVillager> {
		@Override
		public Render<? super EntityEnderVillager> createRenderFor(RenderManager manager) {
			return new RenderEnderVillager(manager);
		}
	}
}