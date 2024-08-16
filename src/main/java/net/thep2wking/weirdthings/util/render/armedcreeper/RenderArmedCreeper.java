package net.thep2wking.weirdthings.util.render.armedcreeper;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.thep2wking.weirdthings.WeirdThings;
import net.thep2wking.weirdthings.content.entity.EntityArmedCreeper;

@SideOnly(Side.CLIENT)
public class RenderArmedCreeper extends RenderLiving<EntityArmedCreeper> {
	public RenderArmedCreeper(RenderManager renderManagerIn) {
		super(renderManagerIn, new ModelArmedCreeper(0f, false), 0.5f);
		this.addLayer(new LayerArmedCreeperBow(this));
	}

	@Override
	public ResourceLocation getEntityTexture(EntityArmedCreeper entity) {
		return new ResourceLocation(WeirdThings.MODID, "textures/entity/armed_creeper.png");
	}

	public static final RenderArmedCreeper.Factory FACTORY = new RenderArmedCreeper.Factory();

	public static class Factory implements IRenderFactory<EntityArmedCreeper> {
		@Override
		public Render<? super EntityArmedCreeper> createRenderFor(RenderManager manager) {
			return new RenderArmedCreeper(manager);
		}
	}
}