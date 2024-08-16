package net.thep2wking.weirdthings.util.render.squidblaze;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.thep2wking.weirdthings.WeirdThings;
import net.thep2wking.weirdthings.content.entity.EntitySquidBlaze;

@SideOnly(Side.CLIENT)
public class RenderSquidBlaze extends RenderLiving<EntitySquidBlaze> {
	public RenderSquidBlaze(RenderManager renderManagerIn) {
		super(renderManagerIn, new ModelSquidBlaze(), 0.5f);
	}

	@Override
	public ResourceLocation getEntityTexture(EntitySquidBlaze entity) {
		return new ResourceLocation(WeirdThings.MODID, "textures/entity/squid_blaze.png");
	}

	public static final RenderSquidBlaze.Factory FACTORY = new RenderSquidBlaze.Factory();

	public static class Factory implements IRenderFactory<EntitySquidBlaze> {
		@Override
		public Render<? super EntitySquidBlaze> createRenderFor(RenderManager manager) {
			return new RenderSquidBlaze(manager);
		}
	}
}