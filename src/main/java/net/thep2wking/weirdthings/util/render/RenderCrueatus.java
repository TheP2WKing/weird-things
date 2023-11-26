package net.thep2wking.weirdthings.util.render;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.thep2wking.weirdthings.WeirdThings;
import net.thep2wking.weirdthings.content.entity.EntityCrueatus;
import net.thep2wking.weirdthings.content.model.ModelCrueatus;

@SideOnly(Side.CLIENT)
public class RenderCrueatus extends RenderLiving<EntityCrueatus> {
	public RenderCrueatus(RenderManager renderManagerIn) {
		super(renderManagerIn, new ModelCrueatus(), 0.5f);
	}

	@Override
	public ResourceLocation getEntityTexture(EntityCrueatus entity) {
		return new ResourceLocation(WeirdThings.MODID, "textures/entity/crueatus.png");
	}

	public static final RenderCrueatus.Factory FACTORY = new RenderCrueatus.Factory();

	public static class Factory implements IRenderFactory<EntityCrueatus> {
		@Override
		public Render<? super EntityCrueatus> createRenderFor(RenderManager manager) {
			return new RenderCrueatus(manager);
		}
	}
}