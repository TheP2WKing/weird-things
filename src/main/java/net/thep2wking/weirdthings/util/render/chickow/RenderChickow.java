package net.thep2wking.weirdthings.util.render.chickow;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.thep2wking.weirdthings.WeirdThings;
import net.thep2wking.weirdthings.content.entity.EntityChickow;

@SideOnly(Side.CLIENT)
public class RenderChickow extends RenderLiving<EntityChickow> {
	public RenderChickow(RenderManager renderManagerIn) {
		super(renderManagerIn, new ModelChickow(), 0.6f);
	}

	@Override
	public ResourceLocation getEntityTexture(EntityChickow entity) {
		return new ResourceLocation(WeirdThings.MODID, "textures/entity/chickow.png");
	}

	public static final RenderChickow.Factory FACTORY = new RenderChickow.Factory();

	public static class Factory implements IRenderFactory<EntityChickow> {
		@Override
		public Render<? super EntityChickow> createRenderFor(RenderManager manager) {
			return new RenderChickow(manager);
		}
	}
}