package net.thep2wking.weirdthings.util.render.dirtgolem;

import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelIronGolem;
import net.minecraft.client.renderer.BlockRendererDispatcher;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.init.Blocks;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.thep2wking.weirdthings.content.entity.EntityDirtGolem;

@SideOnly(Side.CLIENT)
public class LayerDirtGolemFlower implements LayerRenderer<EntityDirtGolem> {
	private final RenderDirtGolem ironGolemRenderer;

	public LayerDirtGolemFlower(RenderDirtGolem ironGolemRendererIn) {
		this.ironGolemRenderer = ironGolemRendererIn;
	}

	@Override
	public void doRenderLayer(EntityDirtGolem entitylivingbaseIn, float limbSwing, float limbSwingAmount,
			float partialTicks, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
		if (entitylivingbaseIn.getHoldRoseTick() != 0) {
			BlockRendererDispatcher blockrendererdispatcher = Minecraft.getMinecraft().getBlockRendererDispatcher();
			GlStateManager.enableRescaleNormal();
			GlStateManager.pushMatrix();
			GlStateManager.rotate(5.0F
					+ 180.0F * ((ModelIronGolem) this.ironGolemRenderer.getMainModel()).ironGolemRightArm.rotateAngleX
							/ (float) Math.PI,
					1.0F, 0.0F, 0.0F);
			GlStateManager.rotate(90.0F, 1.0F, 0.0F, 0.0F);
			GlStateManager.translate(-0.9375F, -0.625F, -0.9375F);
			GlStateManager.scale(0.5F, -0.5F, 0.5F);
			int i = entitylivingbaseIn.getBrightnessForRender();
			int j = i % 65536;
			int k = i / 65536;
			OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit, (float) j, (float) k);
			GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
			this.ironGolemRenderer.bindTexture(TextureMap.LOCATION_BLOCKS_TEXTURE);
			blockrendererdispatcher.renderBlockBrightness(Blocks.RED_FLOWER.getDefaultState(), 1.0F);
			GlStateManager.popMatrix();
			GlStateManager.disableRescaleNormal();
		}
	}

	@Override
	public boolean shouldCombineTextures() {
		return false;
	}
}