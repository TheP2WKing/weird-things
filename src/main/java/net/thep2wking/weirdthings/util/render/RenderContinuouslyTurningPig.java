package net.thep2wking.weirdthings.util.render;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.thep2wking.weirdthings.WeirdThings;
import net.thep2wking.weirdthings.content.entity.EntityContinuouslyTurningPig;
import net.thep2wking.weirdthings.content.model.ModelContinuouslyTurningPig;

@SideOnly(Side.CLIENT)
public class RenderContinuouslyTurningPig extends RenderLiving<EntityContinuouslyTurningPig> {
	public RenderContinuouslyTurningPig(RenderManager renderManagerIn) {
		super(renderManagerIn, new ModelContinuouslyTurningPig(), 0.5f);
	}

	@Override
	public ResourceLocation getEntityTexture(EntityContinuouslyTurningPig entity) {
		return new ResourceLocation(WeirdThings.MODID, "textures/entity/continuously_turning_pig.png");
	}

	public static final RenderContinuouslyTurningPig.Factory FACTORY = new RenderContinuouslyTurningPig.Factory();

	public static class Factory implements IRenderFactory<EntityContinuouslyTurningPig> {
		@Override
		public Render<? super EntityContinuouslyTurningPig> createRenderFor(RenderManager manager) {
			return new RenderContinuouslyTurningPig(manager);
		}
	}
}