package net.thep2wking.weirdthings.util.render.slimysheep;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.thep2wking.weirdthings.WeirdThings;
import net.thep2wking.weirdthings.content.entity.EntitySlimySheep;


@SideOnly(Side.CLIENT)
public class RenderSlimlySheep extends RenderLiving<EntitySlimySheep> {
	public RenderSlimlySheep(RenderManager renderManagerIn) {
		super(renderManagerIn, new ModelSlimySheep2(), 0.7f);
		this.addLayer(new LayerSlimySheepWool(this));
	}

	@Override
	public ResourceLocation getEntityTexture(EntitySlimySheep entity) {
		return new ResourceLocation(WeirdThings.MODID, "textures/entity/slimy_sheep.png");
	}

	public static final RenderSlimlySheep.Factory FACTORY = new RenderSlimlySheep.Factory();

	public static class Factory implements IRenderFactory<EntitySlimySheep> {
		@Override
		public Render<? super EntitySlimySheep> createRenderFor(RenderManager manager) {
			return new RenderSlimlySheep(manager);
		}
	}
}