package net.thep2wking.weirdthings.util.render;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.thep2wking.weirdthings.WeirdThings;
import net.thep2wking.weirdthings.content.entity.EntitySquidGhast;
import net.thep2wking.weirdthings.content.model.ModelSquidGhast;

@SideOnly(Side.CLIENT)
public class RenderSquidGhast extends RenderLiving<EntitySquidGhast> {
	public RenderSquidGhast(RenderManager renderManagerIn) {
		super(renderManagerIn, new ModelSquidGhast(), 0.5f);
	}

	@Override
	public ResourceLocation getEntityTexture(EntitySquidGhast entity) {
		return entity.isAttacking()
				? new ResourceLocation(WeirdThings.MODID, "textures/entity/squid_ghast_shooting.png")
				: new ResourceLocation(WeirdThings.MODID, "textures/entity/squid_ghast.png");
	}

	@Override
	public void preRenderCallback(EntitySquidGhast entitylivingbaseIn, float partialTickTime) {
		GlStateManager.scale(4.5F, 4.5F, 4.5F);
		GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
	}

	public static final RenderSquidGhast.Factory FACTORY = new RenderSquidGhast.Factory();

	public static class Factory implements IRenderFactory<EntitySquidGhast> {
		@Override
		public Render<? super EntitySquidGhast> createRenderFor(RenderManager manager) {
			return new RenderSquidGhast(manager);
		}
	}
}