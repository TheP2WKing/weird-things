package net.thep2wking.weirdthings.util.render.arrowstormskeleton;

import net.minecraft.client.model.ModelSkeleton;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.layers.LayerBipedArmor;
import net.minecraft.client.renderer.entity.layers.LayerHeldItem;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.thep2wking.weirdthings.WeirdThings;
import net.thep2wking.weirdthings.content.entity.EntityArrowstormSkeleton;

@SideOnly(Side.CLIENT)
public class RenderArrowstormSkeleton extends RenderLiving<EntityArrowstormSkeleton> {
	public RenderArrowstormSkeleton(RenderManager renderManagerIn) {
		super(renderManagerIn, new ModelSkeleton(0f, false), 0.5f);
		this.addLayer(new LayerHeldItem(this));
		this.addLayer(new LayerBipedArmor(this) {
			@Override
			public void initArmor() {
				this.modelLeggings = new ModelSkeleton(0.5F, true);
				this.modelArmor = new ModelSkeleton(1.0F, true);
			}
		});
	}

	@Override
	public ResourceLocation getEntityTexture(EntityArrowstormSkeleton entity) {
		return new ResourceLocation(WeirdThings.MODID, "textures/entity/arrowstorm_skeleton.png");
	}

	public static final RenderArrowstormSkeleton.Factory FACTORY = new RenderArrowstormSkeleton.Factory();

	public static class Factory implements IRenderFactory<EntityArrowstormSkeleton> {
		@Override
		public Render<? super EntityArrowstormSkeleton> createRenderFor(RenderManager manager) {
			return new RenderArrowstormSkeleton(manager);
		}
	}
}