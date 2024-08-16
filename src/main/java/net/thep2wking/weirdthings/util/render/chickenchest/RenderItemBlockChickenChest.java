package net.thep2wking.weirdthings.util.render.chickenchest;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.renderer.tileentity.TileEntityItemStackRenderer;
import net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.ForgeHooksClient;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.thep2wking.weirdthings.content.block.BlockChickenChest;
import net.thep2wking.weirdthings.content.tile.TileChickenChest;

public class RenderItemBlockChickenChest extends TileEntityItemStackRenderer {
	private TileChickenChest normalChest = new TileChickenChest(BlockChickenChest.Type.BASIC);

	@Override
	public void renderByItem(ItemStack itemStack) {
		renderByItem(itemStack, 1F);
	}

	@Override
	public void renderByItem(ItemStack itemStackIn, float partialTicks) {
		Block block = Block.getBlockFromItem(itemStackIn.getItem());
		if (block instanceof BlockChickenChest) {
			TileEntityRendererDispatcher.instance.render(normalChest, 0.0D, 0.0D, 0.0D, 0.0F, partialTicks);
		} else {
			ForgeHooksClient.renderTileItem(itemStackIn.getItem(), itemStackIn.getMetadata());
		}
	}

	@SideOnly(Side.CLIENT)
	public static void registerTEISRModel(Item item) {
		ModelLoader.setCustomModelResourceLocation(item, 0,
				new ModelResourceLocation(item.getRegistryName(), "inventory"));
		RenderItemBlockChickenChest TEISR = new RenderItemBlockChickenChest();
		item.setTileEntityItemStackRenderer(TEISR);
	}
}