package net.thep2wking.weirdthings.util.render;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.thep2wking.weirdthings.WeirdThings;
import net.thep2wking.weirdthings.content.entity.EntityCreeperChicken;
import net.thep2wking.weirdthings.content.model.ModelCreeperChicken;
import net.thep2wking.weirdthings.util.layer.LayerChickenCreeperCharge;

@SideOnly(Side.CLIENT)
public class RenderCreeperChicken extends RenderLiving<EntityCreeperChicken> {
	public RenderCreeperChicken(RenderManager renderManagerIn) {
		super(renderManagerIn, new ModelCreeperChicken(0f), 0.5f);
		this.addLayer(new LayerChickenCreeperCharge(this));
	}

	@Override
	public ResourceLocation getEntityTexture(EntityCreeperChicken entity) {
		return new ResourceLocation(WeirdThings.MODID, "textures/entity/creeper_chicken.png");
	}

	@Override
	public void preRenderCallback(EntityCreeperChicken entitylivingbaseIn, float partialTickTime) {
		float f = entitylivingbaseIn.getCreeperFlashIntensity(partialTickTime);
		float f1 = 1.0F + MathHelper.sin(f * 100.0F) * f * 0.01F;
		f = MathHelper.clamp(f, 0.0F, 1.0F);
		f = f * f;
		f = f * f;
		float f2 = (1.0F + f * 0.4F) * f1;
		float f3 = (1.0F + f * 0.1F) / f1;
		GlStateManager.scale(f2, f3, f2);
	}

	@Override
	public int getColorMultiplier(EntityCreeperChicken entitylivingbaseIn, float lightBrightness,
			float partialTickTime) {
		float f = entitylivingbaseIn.getCreeperFlashIntensity(partialTickTime);
		if ((int) (f * 10.0F) % 2 == 0) {
			return 0;
		} else {
			int i = (int) (f * 0.2F * 255.0F);
			i = MathHelper.clamp(i, 0, 255);
			return i << 24 | 822083583;
		}
	}

	public static final RenderCreeperChicken.Factory FACTORY = new RenderCreeperChicken.Factory();

	public static class Factory implements IRenderFactory<EntityCreeperChicken> {
		@Override
		public Render<? super EntityCreeperChicken> createRenderFor(RenderManager manager) {
			return new RenderCreeperChicken(manager);
		}
	}
}