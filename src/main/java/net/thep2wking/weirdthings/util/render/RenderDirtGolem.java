package net.thep2wking.weirdthings.util.render;

import net.minecraft.client.model.ModelIronGolem;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.thep2wking.weirdthings.WeirdThings;
import net.thep2wking.weirdthings.content.entity.EntityDirtGolem;
import net.thep2wking.weirdthings.util.layer.LayerDirtGolemFlower;

@SideOnly(Side.CLIENT)
public class RenderDirtGolem extends RenderLiving<EntityDirtGolem> {
	public RenderDirtGolem(RenderManager renderManagerIn) {
		super(renderManagerIn, new ModelIronGolem(), 0.5f);
		this.addLayer(new LayerDirtGolemFlower(this));
	}

	@Override
	public ResourceLocation getEntityTexture(EntityDirtGolem entity) {
		return new ResourceLocation(WeirdThings.MODID, "textures/entity/dirt_golem.png");
	}

	@Override
	public void applyRotations(EntityDirtGolem entityLiving, float p_77043_2_, float rotationYaw, float partialTicks) {
		super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
		if ((double) entityLiving.limbSwingAmount >= 0.01D) {
			float f1 = entityLiving.limbSwing - entityLiving.limbSwingAmount * (1.0F - partialTicks) + 6.0F;
			float f2 = (Math.abs(f1 % 13.0F - 6.5F) - 3.25F) / 3.25F;
			GlStateManager.rotate(6.5F * f2, 0.0F, 0.0F, 1.0F);
		}
	}

	public static final RenderDirtGolem.Factory FACTORY = new RenderDirtGolem.Factory();

	public static class Factory implements IRenderFactory<EntityDirtGolem> {
		@Override
		public Render<? super EntityDirtGolem> createRenderFor(RenderManager manager) {
			return new RenderDirtGolem(manager);
		}
	}
}