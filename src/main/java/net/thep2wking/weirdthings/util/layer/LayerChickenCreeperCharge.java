package net.thep2wking.weirdthings.util.layer;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.thep2wking.weirdthings.content.entity.EntityCreeperChicken;
import net.thep2wking.weirdthings.content.model.ModelCreeperChicken;
import net.thep2wking.weirdthings.util.render.RenderCreeperChicken;

@SideOnly(Side.CLIENT)
public class LayerChickenCreeperCharge implements LayerRenderer<EntityCreeperChicken> {
	private static final ResourceLocation LIGHTNING_TEXTURE = new ResourceLocation(
			"textures/entity/creeper/creeper_armor.png");
	private final RenderCreeperChicken creeperRenderer;
	private final ModelCreeperChicken creeperModel = new ModelCreeperChicken(2.0F);

	public LayerChickenCreeperCharge(RenderCreeperChicken creeperRendererIn) {
		this.creeperRenderer = creeperRendererIn;
	}

	public void doRenderLayer(EntityCreeperChicken entitylivingbaseIn, float limbSwing, float limbSwingAmount,
			float partialTicks, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
		if (entitylivingbaseIn.getPowered()) {
			boolean flag = entitylivingbaseIn.isInvisible();
			GlStateManager.depthMask(!flag);
			this.creeperRenderer.bindTexture(LIGHTNING_TEXTURE);
			GlStateManager.matrixMode(5890);
			GlStateManager.loadIdentity();
			float f = (float) entitylivingbaseIn.ticksExisted + partialTicks;
			GlStateManager.translate(f * 0.01F, f * 0.01F, 0.0F);
			GlStateManager.matrixMode(5888);
			GlStateManager.enableBlend();
			GlStateManager.color(0.5F, 0.5F, 0.5F, 1.0F);
			GlStateManager.disableLighting();
			GlStateManager.blendFunc(GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ONE);
			this.creeperModel.setModelAttributes(this.creeperRenderer.getMainModel());
			Minecraft.getMinecraft().entityRenderer.setupFogColor(true);
			this.creeperModel.render(entitylivingbaseIn, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch,
					scale);
			Minecraft.getMinecraft().entityRenderer.setupFogColor(false);
			GlStateManager.matrixMode(5890);
			GlStateManager.loadIdentity();
			GlStateManager.matrixMode(5888);
			GlStateManager.enableLighting();
			GlStateManager.disableBlend();
			GlStateManager.depthMask(flag);
		}
	}

	public boolean shouldCombineTextures() {
		return false;
	}
}