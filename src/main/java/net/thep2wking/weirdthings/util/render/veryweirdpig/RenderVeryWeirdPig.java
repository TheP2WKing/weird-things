package net.thep2wking.weirdthings.util.render.veryweirdpig;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.thep2wking.weirdthings.WeirdThings;
import net.thep2wking.weirdthings.content.entity.EntityVeryWeirdPig;

@SideOnly(Side.CLIENT)
public class RenderVeryWeirdPig extends RenderLiving<EntityVeryWeirdPig> {
	public RenderVeryWeirdPig(RenderManager renderManagerIn) {
		super(renderManagerIn, new ModelVeryWeirdPig(), 0.75f);
	}

	@Override
	public ResourceLocation getEntityTexture(EntityVeryWeirdPig entity) {
		return new ResourceLocation(WeirdThings.MODID, "textures/entity/very_weird_pig.png");
	}

	public static final RenderVeryWeirdPig.Factory FACTORY = new RenderVeryWeirdPig.Factory();

	public static class Factory implements IRenderFactory<EntityVeryWeirdPig> {
		@Override
		public Render<? super EntityVeryWeirdPig> createRenderFor(RenderManager manager) {
			return new RenderVeryWeirdPig(manager);
		}
	}
}