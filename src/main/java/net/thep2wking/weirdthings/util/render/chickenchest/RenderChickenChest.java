package net.thep2wking.weirdthings.util.render.chickenchest;

import net.minecraft.item.Item;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.thep2wking.weirdthings.content.tile.TileChickenChest;
import net.thep2wking.weirdthings.init.ModBlocks;

public class RenderChickenChest {
	public static void registerChickenChestRenderer() {
		ClientRegistry.bindTileEntitySpecialRenderer(TileChickenChest.class, new RenderBlockChickenChest());
		RenderItemBlockChickenChest.registerTEISRModel(Item.getItemFromBlock(ModBlocks.CHICKEN_CHEST));
		RenderItemBlockChickenChestTrapped.registerTEISRModel(Item.getItemFromBlock(ModBlocks.TRAPPED_CHICKEN_CHEST));
	}
}