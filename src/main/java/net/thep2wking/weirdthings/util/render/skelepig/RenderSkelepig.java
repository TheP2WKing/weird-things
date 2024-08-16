package net.thep2wking.weirdthings.util.render.skelepig;

import net.minecraft.client.model.ModelPig;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.thep2wking.weirdthings.WeirdThings;
import net.thep2wking.weirdthings.content.entity.EntitySkelepig;

@SideOnly(Side.CLIENT)
public class RenderSkelepig extends RenderLiving<EntitySkelepig> {
	public RenderSkelepig(RenderManager renderManagerIn) {
		super(renderManagerIn, new ModelPig(), 0.7f);
	}

	@Override
	public ResourceLocation getEntityTexture(EntitySkelepig entity) {
		return new ResourceLocation(WeirdThings.MODID, "textures/entity/skelepig.png");
	}

	public static final RenderSkelepig.Factory FACTORY = new RenderSkelepig.Factory();

	public static class Factory implements IRenderFactory<EntitySkelepig> {
		@Override
		public Render<? super EntitySkelepig> createRenderFor(RenderManager manager) {
			return new RenderSkelepig(manager);
		}
	}
}