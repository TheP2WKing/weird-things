package net.thep2wking.weirdthings.util.render;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.thep2wking.weirdthings.WeirdThings;
import net.thep2wking.weirdthings.content.entity.EntityVillagerPig;
import net.thep2wking.weirdthings.content.model.ModelVillagerPig;

@SideOnly(Side.CLIENT)
public class RenderVillagerPig extends RenderLiving<EntityVillagerPig> {
	public RenderVillagerPig(RenderManager renderManagerIn) {
		super(renderManagerIn, new ModelVillagerPig(), 0.5f);
	}

	@Override
	public ResourceLocation getEntityTexture(EntityVillagerPig entity) {
		return new ResourceLocation(WeirdThings.MODID, "textures/entity/villager_pig.png");
	}

	public static final RenderVillagerPig.Factory FACTORY = new RenderVillagerPig.Factory();

	public static class Factory implements IRenderFactory<EntityVillagerPig> {
		@Override
		public Render<? super EntityVillagerPig> createRenderFor(RenderManager manager) {
			return new RenderVillagerPig(manager);
		}
	}
}