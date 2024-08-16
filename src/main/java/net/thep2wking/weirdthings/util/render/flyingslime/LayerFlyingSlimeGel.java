package net.thep2wking.weirdthings.util.render.flyingslime;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelSlime;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.thep2wking.weirdthings.content.entity.EntityFlyingSlime;

@SideOnly(Side.CLIENT)
public class LayerFlyingSlimeGel implements LayerRenderer<EntityFlyingSlime> {
	private final RenderFlyingSlime slimeRenderer;
	private final ModelBase slimeModel = new ModelSlime(0);

	public LayerFlyingSlimeGel(RenderFlyingSlime slimeRendererIn) {
		this.slimeRenderer = slimeRendererIn;
	}

	@Override
	public void doRenderLayer(EntityFlyingSlime entitylivingbaseIn, float limbSwing, float limbSwingAmount,
			float partialTicks, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
		if (!entitylivingbaseIn.isInvisible()) {
			GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
			GlStateManager.enableNormalize();
			GlStateManager.enableBlend();
			GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA,
					GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
			this.slimeModel.setModelAttributes(this.slimeRenderer.getMainModel());
			this.slimeModel.render(entitylivingbaseIn, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch,
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