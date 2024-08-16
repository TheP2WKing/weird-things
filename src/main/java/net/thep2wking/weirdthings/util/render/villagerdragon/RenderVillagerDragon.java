package net.thep2wking.weirdthings.util.render.villagerdragon;

import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.thep2wking.weirdthings.WeirdThings;
import net.thep2wking.weirdthings.content.entity.EntityVillagerDragon;

@SideOnly(Side.CLIENT)
public class RenderVillagerDragon extends RenderLiving<EntityVillagerDragon> {
	public static final ResourceLocation ENDERCRYSTAL_BEAM_TEXTURES = new ResourceLocation(
			"textures/entity/endercrystal/endercrystal_beam.png");
	public static final ResourceLocation DRAGON_EXPLODING_TEXTURES = new ResourceLocation(WeirdThings.MODID,
			"textures/entity/villager_dragon_exploding.png");

	public RenderVillagerDragon(RenderManager renderManagerIn) {
		super(renderManagerIn, new ModelVillagerDragon(0f), 0.5f);
		this.addLayer(new LayerVillagerDragonEyes(this));
		this.addLayer(new LayerVillagerDragonDeath());
	}

	@Override
	public ResourceLocation getEntityTexture(EntityVillagerDragon entity) {
		return new ResourceLocation(WeirdThings.MODID, "textures/entity/villager_dragon.png");
	}

	@Override
	protected void applyRotations(EntityVillagerDragon entityLiving, float p_77043_2_, float rotationYaw,
			float partialTicks) {
		float f = (float) entityLiving.getMovementOffsets(7, partialTicks)[0];
		float f1 = (float) (entityLiving.getMovementOffsets(5, partialTicks)[1]
				- entityLiving.getMovementOffsets(10, partialTicks)[1]);
		GlStateManager.rotate(-f, 0.0F, 1.0F, 0.0F);
		GlStateManager.rotate(f1 * 10.0F, 1.0F, 0.0F, 0.0F);
		GlStateManager.translate(0.0F, 0.0F, 1.0F);

		if (entityLiving.deathTime > 0) {
			float f2 = ((float) entityLiving.deathTime + partialTicks - 1.0F) / 20.0F * 1.6F;
			f2 = MathHelper.sqrt(f2);

			if (f2 > 1.0F) {
				f2 = 1.0F;
			}

			GlStateManager.rotate(f2 * this.getDeathMaxRotation(entityLiving), 0.0F, 0.0F, 1.0F);
		}
	}

	@Override
	public void renderModel(EntityVillagerDragon entitylivingbaseIn, float limbSwing, float limbSwingAmount,
			float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor) {
		if (entitylivingbaseIn.deathTicks > 0) {
			float f = (float) entitylivingbaseIn.deathTicks / 200.0F;
			GlStateManager.depthFunc(515);
			GlStateManager.enableAlpha();
			GlStateManager.alphaFunc(516, f);
			this.bindTexture(DRAGON_EXPLODING_TEXTURES);
			this.mainModel.render(entitylivingbaseIn, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch,
					scaleFactor);
			GlStateManager.alphaFunc(516, 0.1F);
			GlStateManager.depthFunc(514);
		}

		this.bindEntityTexture(entitylivingbaseIn);
		this.mainModel.render(entitylivingbaseIn, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch,
				scaleFactor);

		if (entitylivingbaseIn.hurtTime > 0) {
			GlStateManager.depthFunc(514);
			GlStateManager.disableTexture2D();
			GlStateManager.enableBlend();
			GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA,
					GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
			GlStateManager.color(1.0F, 0.0F, 0.0F, 0.5F);
			this.mainModel.render(entitylivingbaseIn, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch,
					scaleFactor);
			GlStateManager.enableTexture2D();
			GlStateManager.disableBlend();
			GlStateManager.depthFunc(515);
		}
	}

	@Override
	public void doRender(EntityVillagerDragon entity, double x, double y, double z, float entityYaw,
			float partialTicks) {
		super.doRender(entity, x, y, z, entityYaw, partialTicks);

		if (entity.healingEnderCrystal != null) {
			this.bindTexture(ENDERCRYSTAL_BEAM_TEXTURES);
			float f = MathHelper.sin(((float) entity.healingEnderCrystal.ticksExisted + partialTicks) * 0.2F) / 2.0F
					+ 0.5F;
			f = (f * f + f) * 0.2F;
			renderCrystalBeams(x, y, z, partialTicks,
					entity.posX + (entity.prevPosX - entity.posX) * (double) (1.0F - partialTicks),
					entity.posY + (entity.prevPosY - entity.posY) * (double) (1.0F - partialTicks),
					entity.posZ + (entity.prevPosZ - entity.posZ) * (double) (1.0F - partialTicks), entity.ticksExisted,
					entity.healingEnderCrystal.posX, (double) f + entity.healingEnderCrystal.posY,
					entity.healingEnderCrystal.posZ);
		}
	}

	public static void renderCrystalBeams(double p_188325_0_, double p_188325_2_, double p_188325_4_, float p_188325_6_,
			double p_188325_7_, double p_188325_9_, double p_188325_11_, int p_188325_13_, double p_188325_14_,
			double p_188325_16_, double p_188325_18_) {
		float f = (float) (p_188325_14_ - p_188325_7_);
		float f1 = (float) (p_188325_16_ - 1.0D - p_188325_9_);
		float f2 = (float) (p_188325_18_ - p_188325_11_);
		float f3 = MathHelper.sqrt(f * f + f2 * f2);
		float f4 = MathHelper.sqrt(f * f + f1 * f1 + f2 * f2);
		GlStateManager.pushMatrix();
		GlStateManager.translate((float) p_188325_0_, (float) p_188325_2_ + 2.0F, (float) p_188325_4_);
		GlStateManager.rotate((float) (-Math.atan2((double) f2, (double) f)) * (180F / (float) Math.PI) - 90.0F, 0.0F,
				1.0F, 0.0F);
		GlStateManager.rotate((float) (-Math.atan2((double) f3, (double) f1)) * (180F / (float) Math.PI) - 90.0F, 1.0F,
				0.0F, 0.0F);
		Tessellator tessellator = Tessellator.getInstance();
		BufferBuilder bufferbuilder = tessellator.getBuffer();
		RenderHelper.disableStandardItemLighting();
		GlStateManager.disableCull();
		GlStateManager.shadeModel(7425);
		float f5 = 0.0F - ((float) p_188325_13_ + p_188325_6_) * 0.01F;
		float f6 = MathHelper.sqrt(f * f + f1 * f1 + f2 * f2) / 32.0F - ((float) p_188325_13_ + p_188325_6_) * 0.01F;
		bufferbuilder.begin(5, DefaultVertexFormats.POSITION_TEX_COLOR);

		for (int j = 0; j <= 8; ++j) {
			float f7 = MathHelper.sin((float) (j % 8) * ((float) Math.PI * 2F) / 8.0F) * 0.75F;
			float f8 = MathHelper.cos((float) (j % 8) * ((float) Math.PI * 2F) / 8.0F) * 0.75F;
			float f9 = (float) (j % 8) / 8.0F;
			bufferbuilder.pos((double) (f7 * 0.2F), (double) (f8 * 0.2F), 0.0D).tex((double) f9, (double) f5)
					.color(0, 0, 0, 255).endVertex();
			bufferbuilder.pos((double) f7, (double) f8, (double) f4).tex((double) f9, (double) f6)
					.color(255, 255, 255, 255).endVertex();
		}

		tessellator.draw();
		GlStateManager.enableCull();
		GlStateManager.shadeModel(7424);
		RenderHelper.enableStandardItemLighting();
		GlStateManager.popMatrix();
	}

	public static final RenderVillagerDragon.Factory FACTORY = new RenderVillagerDragon.Factory();

	public static class Factory implements IRenderFactory<EntityVillagerDragon> {
		@Override
		public Render<? super EntityVillagerDragon> createRenderFor(RenderManager manager) {
			return new RenderVillagerDragon(manager);
		}
	}
}