package net.thep2wking.weirdthings.util.render.rapig;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.thep2wking.weirdthings.WeirdThings;
import net.thep2wking.weirdthings.content.entity.EntityRapig;

@SideOnly(Side.CLIENT)
public class RenderRapig extends RenderLiving<EntityRapig> {
	public RenderRapig(RenderManager renderManagerIn) {
		super(renderManagerIn, new ModelRapig(), 0.7f);
	}

	@Override
	public ResourceLocation getEntityTexture(EntityRapig entity) {
		return new ResourceLocation(WeirdThings.MODID, "textures/entity/rapig.png");
	}

	public static final RenderRapig.Factory FACTORY = new RenderRapig.Factory();

	public static class Factory implements IRenderFactory<EntityRapig> {
		@Override
		public Render<? super EntityRapig> createRenderFor(RenderManager manager) {
			return new RenderRapig(manager);
		}
	}
}