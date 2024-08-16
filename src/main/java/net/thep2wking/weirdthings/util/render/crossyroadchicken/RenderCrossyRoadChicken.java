package net.thep2wking.weirdthings.util.render.crossyroadchicken;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.thep2wking.weirdthings.WeirdThings;
import net.thep2wking.weirdthings.content.entity.EntityCrossyRoadChicken;

@SideOnly(Side.CLIENT)
public class RenderCrossyRoadChicken extends RenderLiving<EntityCrossyRoadChicken> {
	public RenderCrossyRoadChicken(RenderManager renderManagerIn) {
		super(renderManagerIn, new ModelCrossyRoadChicken(), 0.5f);
	}

	@Override
	public ResourceLocation getEntityTexture(EntityCrossyRoadChicken entity) {
		return new ResourceLocation(WeirdThings.MODID, "textures/entity/crossy_road_chicken.png");
	}

	@Override
	public float handleRotationFloat(EntityCrossyRoadChicken livingBase, float partialTicks) {
		float f = livingBase.oFlap + (livingBase.wingRotation - livingBase.oFlap) * partialTicks;
		float f1 = livingBase.oFlapSpeed + (livingBase.destPos - livingBase.oFlapSpeed) * partialTicks;
		return (MathHelper.sin(f) + 1.0F) * f1;
	}

	public static final RenderCrossyRoadChicken.Factory FACTORY = new RenderCrossyRoadChicken.Factory();

	public static class Factory implements IRenderFactory<EntityCrossyRoadChicken> {
		@Override
		public Render<? super EntityCrossyRoadChicken> createRenderFor(RenderManager manager) {
			return new RenderCrossyRoadChicken(manager);
		}
	}
}