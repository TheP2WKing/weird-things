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
import net.thep2wking.weirdthings.content.entity.EntityChickenGhast;
import net.thep2wking.weirdthings.content.model.ModelChickenGhast;

@SideOnly(Side.CLIENT)
public class RenderChickenGhast extends RenderLiving<EntityChickenGhast> {
	public RenderChickenGhast(RenderManager renderManagerIn) {
		super(renderManagerIn, new ModelChickenGhast(), 0.5f);
	}

	@Override
	public ResourceLocation getEntityTexture(EntityChickenGhast entity) {
		return entity.isAttacking()
				? new ResourceLocation(WeirdThings.MODID, "textures/entity/chicken_ghast_shooting.png")
				: new ResourceLocation(WeirdThings.MODID, "textures/entity/chicken_ghast.png");
	}

	@Override
	public void preRenderCallback(EntityChickenGhast entitylivingbaseIn, float partialTickTime) {
		GlStateManager.scale(4.5F, 4.5F, 4.5F);
		GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
	}

	public static final RenderChickenGhast.Factory FACTORY = new RenderChickenGhast.Factory();

	public static class Factory implements IRenderFactory<EntityChickenGhast> {
		@Override
		public Render<? super EntityChickenGhast> createRenderFor(RenderManager manager) {
			return new RenderChickenGhast(manager);
		}
	}
}