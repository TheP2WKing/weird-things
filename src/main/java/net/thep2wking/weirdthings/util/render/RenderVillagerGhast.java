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
import net.thep2wking.weirdthings.content.entity.EntityVillagerGhast;
import net.thep2wking.weirdthings.content.model.ModelVillagerGhast;

@SideOnly(Side.CLIENT)
public class RenderVillagerGhast extends RenderLiving<EntityVillagerGhast> {
	public RenderVillagerGhast(RenderManager renderManagerIn) {
		super(renderManagerIn, new ModelVillagerGhast(), 0.5f);
	}

	@Override
	public ResourceLocation getEntityTexture(EntityVillagerGhast entity) {
		return entity.isAttacking()
				? new ResourceLocation(WeirdThings.MODID, "textures/entity/villager_ghast_shooting.png")
				: new ResourceLocation(WeirdThings.MODID, "textures/entity/villager_ghast.png");
	}

	@Override
	public void preRenderCallback(EntityVillagerGhast entitylivingbaseIn, float partialTickTime) {
		GlStateManager.scale(4.5F, 4.5F, 4.5F);
		GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
	}

	public static final RenderVillagerGhast.Factory FACTORY = new RenderVillagerGhast.Factory();

	public static class Factory implements IRenderFactory<EntityVillagerGhast> {
		@Override
		public Render<? super EntityVillagerGhast> createRenderFor(RenderManager manager) {
			return new RenderVillagerGhast(manager);
		}
	}
}