package net.thep2wking.weirdthings.util.render.slimysheep;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.thep2wking.weirdthings.WeirdThings;
import net.thep2wking.weirdthings.content.entity.EntitySlimySheep;

@SideOnly(Side.CLIENT)
public class LayerSlimySheepWool implements LayerRenderer<EntitySlimySheep> {
	private static final ResourceLocation TEXTURE = new ResourceLocation(WeirdThings.MODID,
			"textures/entity/slimy_sheep_fur.png");
	private final RenderSlimlySheep sheepRenderer;
	private final ModelSlimySheep1 sheepModel = new ModelSlimySheep1();

	public LayerSlimySheepWool(RenderSlimlySheep sheepRendererIn) {
		this.sheepRenderer = sheepRendererIn;
	}

	@Override
	public void doRenderLayer(EntitySlimySheep entitylivingbaseIn, float limbSwing, float limbSwingAmount,
			float partialTicks, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
		if (!entitylivingbaseIn.getSheared() && !entitylivingbaseIn.isInvisible()) {
			this.sheepRenderer.bindTexture(TEXTURE);
			this.sheepModel.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTicks);
			GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
			GlStateManager.enableNormalize();
			GlStateManager.enableBlend();
			GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA,
					GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
			this.sheepModel.setModelAttributes(this.sheepRenderer.getMainModel());
			this.sheepModel.render(entitylivingbaseIn, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch,
					scale);
			GlStateManager.disableBlend();
			GlStateManager.disableNormalize();
		}
	}

	@Override
	public boolean shouldCombineTextures() {
		return true;
	}
}