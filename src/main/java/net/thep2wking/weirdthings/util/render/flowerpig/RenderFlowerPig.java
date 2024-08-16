package net.thep2wking.weirdthings.util.render.flowerpig;

import net.minecraft.client.model.ModelPig;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.thep2wking.weirdthings.content.entity.EntityFlowerPig;

@SideOnly(Side.CLIENT)
public class RenderFlowerPig extends RenderLiving<EntityFlowerPig> {
	public RenderFlowerPig(RenderManager renderManagerIn) {
		super(renderManagerIn, new ModelPig(), 0.7f);
		this.addLayer(new LayerFlowerPigFlowers(this));
	}

	@Override
	public ResourceLocation getEntityTexture(EntityFlowerPig entity) {
		return new ResourceLocation("minecraft", "textures/entity/pig/pig.png");
	}

	@Override
	public ModelPig getMainModel() {
		return (ModelPig) super.getMainModel();
	}

	public static final RenderFlowerPig.Factory FACTORY = new RenderFlowerPig.Factory();

	public static class Factory implements IRenderFactory<EntityFlowerPig> {
		@Override
		public Render<? super EntityFlowerPig> createRenderFor(RenderManager manager) {
			return new RenderFlowerPig(manager);
		}
	}
}