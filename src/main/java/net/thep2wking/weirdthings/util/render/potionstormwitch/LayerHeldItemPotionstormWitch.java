package net.thep2wking.weirdthings.util.render.potionstormwitch;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.block.model.ItemCameraTransforms;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumBlockRenderType;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.thep2wking.weirdthings.content.entity.EntityPotionstormWitch;

@SideOnly(Side.CLIENT)
public class LayerHeldItemPotionstormWitch implements LayerRenderer<EntityPotionstormWitch> {
	private final RenderPotionstormWitch witchRenderer;

	public LayerHeldItemPotionstormWitch(RenderPotionstormWitch witchRendererIn) {
		this.witchRenderer = witchRendererIn;
	}

	@Override
	public void doRenderLayer(EntityPotionstormWitch entitylivingbaseIn, float limbSwing, float limbSwingAmount,
			float partialTicks, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
		ItemStack itemstack = entitylivingbaseIn.getHeldItemMainhand();
		if (!itemstack.isEmpty()) {
			GlStateManager.color(1.0F, 1.0F, 1.0F);
			GlStateManager.pushMatrix();
			if (this.witchRenderer.getMainModel().isChild) {
				GlStateManager.translate(0.0F, 0.625F, 0.0F);
				GlStateManager.rotate(-20.0F, -1.0F, 0.0F, 0.0F);
				GlStateManager.scale(0.5F, 0.5F, 0.5F);
			}

			this.witchRenderer.getMainModel().villagerNose.postRender(0.0625F);
			GlStateManager.translate(-0.0625F, 0.53125F, 0.21875F);
			Item item = itemstack.getItem();
			Minecraft minecraft = Minecraft.getMinecraft();

			if (Block.getBlockFromItem(item).getDefaultState()
					.getRenderType() == EnumBlockRenderType.ENTITYBLOCK_ANIMATED) {
				GlStateManager.translate(0.0F, 0.0625F, -0.25F);
				GlStateManager.rotate(30.0F, 1.0F, 0.0F, 0.0F);
				GlStateManager.rotate(-5.0F, 0.0F, 1.0F, 0.0F);
				GlStateManager.scale(0.375F, -0.375F, 0.375F);
			} else if (item instanceof net.minecraft.item.ItemBow) {
				GlStateManager.translate(0.0F, 0.125F, -0.125F);
				GlStateManager.rotate(-45.0F, 0.0F, 1.0F, 0.0F);
				GlStateManager.scale(0.625F, -0.625F, 0.625F);
				GlStateManager.rotate(-100.0F, 1.0F, 0.0F, 0.0F);
				GlStateManager.rotate(-20.0F, 0.0F, 1.0F, 0.0F);
			} else if (item.isFull3D()) {
				if (item.shouldRotateAroundWhenRendering()) {
					GlStateManager.rotate(180.0F, 0.0F, 0.0F, 1.0F);
					GlStateManager.translate(0.0F, -0.0625F, 0.0F);
				}

				this.witchRenderer.transformHeldFull3DItemLayer();
				GlStateManager.translate(0.0625F, -0.125F, 0.0F);
				GlStateManager.scale(0.625F, -0.625F, 0.625F);
				GlStateManager.rotate(0.0F, 1.0F, 0.0F, 0.0F);
				GlStateManager.rotate(0.0F, 0.0F, 1.0F, 0.0F);
			} else {
				GlStateManager.translate(0.1875F, 0.1875F, 0.0F);
				GlStateManager.scale(0.875F, 0.875F, 0.875F);
				GlStateManager.rotate(-20.0F, 0.0F, 0.0F, 1.0F);
				GlStateManager.rotate(-60.0F, 1.0F, 0.0F, 0.0F);
				GlStateManager.rotate(-30.0F, 0.0F, 0.0F, 1.0F);
			}

			GlStateManager.rotate(-15.0F, 1.0F, 0.0F, 0.0F);
			GlStateManager.rotate(40.0F, 0.0F, 0.0F, 1.0F);
			minecraft.getItemRenderer().renderItem(entitylivingbaseIn, itemstack,
					ItemCameraTransforms.TransformType.THIRD_PERSON_RIGHT_HAND);
			GlStateManager.popMatrix();
		}
	}

	@Override
	public boolean shouldCombineTextures() {
		return false;
	}
}