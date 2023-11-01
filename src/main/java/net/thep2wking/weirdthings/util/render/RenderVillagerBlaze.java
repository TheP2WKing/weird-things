package net.thep2wking.weirdthings.util.render;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.thep2wking.weirdthings.WeirdThings;
import net.thep2wking.weirdthings.content.entity.EntityVillagerBlaze;
import net.thep2wking.weirdthings.content.model.ModelVillagerBlaze;

@SideOnly(Side.CLIENT)
public class RenderVillagerBlaze extends RenderLiving<EntityVillagerBlaze> {
	public RenderVillagerBlaze(RenderManager renderManagerIn) {
		super(renderManagerIn, new ModelVillagerBlaze(), 0.5f);
	}

	@Override
	public ResourceLocation getEntityTexture(EntityVillagerBlaze entity) {
		return new ResourceLocation(WeirdThings.MODID, "textures/entity/villager_blaze.png");
	}

	public static final RenderVillagerBlaze.Factory FACTORY = new RenderVillagerBlaze.Factory();

	public static class Factory implements IRenderFactory<EntityVillagerBlaze> {
		@Override
		public Render<? super EntityVillagerBlaze> createRenderFor(RenderManager manager) {
			return new RenderVillagerBlaze(manager);
		}
	}
}