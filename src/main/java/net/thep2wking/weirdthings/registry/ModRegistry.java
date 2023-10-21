package net.thep2wking.weirdthings.registry;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.thep2wking.reloadedlib.util.ModLogger;
import net.thep2wking.reloadedlib.util.ModRegistryHelper;
import net.thep2wking.weirdthings.WeirdThings;
import net.thep2wking.weirdthings.init.ModBlocks;
import net.thep2wking.weirdthings.init.ModItems;
import net.thep2wking.weirdthings.util.ModRendering;

@Mod.EventBusSubscriber
public class ModRegistry {
	@SubscribeEvent
	public static void onBlockRegister(RegistryEvent.Register<Block> event) {
		ModLogger.registeredBlocksLogger(WeirdThings.MODID);

		ModRegistryHelper.registerBlock(event, ModBlocks.COOKIE_ORE);
		ModRegistryHelper.registerBlock(event, ModBlocks.RUBY_ORE);
		ModRegistryHelper.registerBlock(event, ModBlocks.RENDIUM_ORE);
		ModRegistryHelper.registerBlock(event, ModBlocks.FIRE_ORE);

		ModRegistryHelper.registerBlock(event, ModBlocks.COOKIE_BLOCK);
		ModRegistryHelper.registerBlock(event, ModBlocks.RUBY_BLOCK);
		ModRegistryHelper.registerBlock(event, ModBlocks.RENDIUM_BLOCK);

		ModRegistryHelper.registerBlock(event, ModBlocks.COOKIE_GRASS);
		ModRegistryHelper.registerBlock(event, ModBlocks.COOKIE_DIRT);
		ModRegistryHelper.registerBlock(event, ModBlocks.COOKIE_LOG);
		ModRegistryHelper.registerBlock(event, ModBlocks.COOKIE_PLANKS);

		ModRegistryHelper.registerBlock(event, ModBlocks.CHICKEN_GRASS);
		ModRegistryHelper.registerBlock(event, ModBlocks.CHICKEN_DIRT);
		ModRegistryHelper.registerBlock(event, ModBlocks.CHICKEN_LOG);
		ModRegistryHelper.registerBlock(event, ModBlocks.CHICKEN_PLANKS);

		ModRegistryHelper.registerBlock(event, ModBlocks.MEGA_TNT);
		ModRegistryHelper.registerBlock(event, ModBlocks.CHICKEN_CHEST);
	}

	@SubscribeEvent
	public static void onItemRegister(RegistryEvent.Register<Item> event) {
		ModLogger.registeredItemsLogger(WeirdThings.MODID);

		ModRegistryHelper.registerItemBlock(event, ModItems.COOKIE_ORE);
		ModRegistryHelper.registerItemBlock(event, ModItems.RUBY_ORE);
		ModRegistryHelper.registerItemBlock(event, ModItems.RENDIUM_ORE);
		ModRegistryHelper.registerItemBlock(event, ModItems.FIRE_ORE);

		ModRegistryHelper.registerItemBlock(event, ModItems.COOKIE_BLOCK);
		ModRegistryHelper.registerItemBlock(event, ModItems.RUBY_BLOCK);
		ModRegistryHelper.registerItemBlock(event, ModItems.RENDIUM_BLOCK);

		ModRegistryHelper.registerItemBlock(event, ModItems.COOKIE_GRASS);
		ModRegistryHelper.registerItemBlock(event, ModItems.COOKIE_DIRT);
		ModRegistryHelper.registerItemBlock(event, ModItems.COOKIE_LOG);
		ModRegistryHelper.registerItemBlock(event, ModItems.COOKIE_PLANKS);

		ModRegistryHelper.registerItemBlock(event, ModItems.CHICKEN_GRASS);
		ModRegistryHelper.registerItemBlock(event, ModItems.CHICKEN_DIRT);
		ModRegistryHelper.registerItemBlock(event, ModItems.CHICKEN_LOG);
		ModRegistryHelper.registerItemBlock(event, ModItems.CHICKEN_PLANKS);

		ModRegistryHelper.registerItemBlock(event, ModItems.MEGA_TNT);
		ModRegistryHelper.registerItemBlock(event, ModItems.CHICKEN_CHEST);

		ModRegistryHelper.registerItem(event, ModItems.FIRE);

		ModRegistryHelper.registerItem(event, ModItems.COOKIE_INGOT);
		ModRegistryHelper.registerItem(event, ModItems.FIN_BRICK);
		ModRegistryHelper.registerItem(event, ModItems.RUBY);
		ModRegistryHelper.registerItem(event, ModItems.RENDIUM);

		ModRegistryHelper.registerItem(event, ModItems.THROWABLE_VILLAGER);

		ModRegistryHelper.registerItem(event, ModItems.CROSSY_SWORD);
		ModRegistryHelper.registerItem(event, ModItems.FLAME_HOE);

		ModRegistryHelper.registerItem(event, ModItems.DIRT_HELMET);
		ModRegistryHelper.registerItem(event, ModItems.DIRT_CHESTPLATE);
		ModRegistryHelper.registerItem(event, ModItems.DIRT_LEGGINGS);
		ModRegistryHelper.registerItem(event, ModItems.DIRT_BOOTS);
		ModRegistryHelper.registerItem(event, ModItems.DIRT_SWORD);
		ModRegistryHelper.registerItem(event, ModItems.DIRT_SHOVEL);
		ModRegistryHelper.registerItem(event, ModItems.DIRT_PICKAXE);
		ModRegistryHelper.registerItem(event, ModItems.DIRT_AXE);
		ModRegistryHelper.registerItem(event, ModItems.DIRT_HOE);

		ModRegistryHelper.registerItem(event, ModItems.COOKIE_HELMET);
		ModRegistryHelper.registerItem(event, ModItems.COOKIE_CHESTPLATE);
		ModRegistryHelper.registerItem(event, ModItems.COOKIE_LEGGINGS);
		ModRegistryHelper.registerItem(event, ModItems.COOKIE_BOOTS);
		ModRegistryHelper.registerItem(event, ModItems.COOKIE_SWORD);
		ModRegistryHelper.registerItem(event, ModItems.COOKIE_SHOVEL);
		ModRegistryHelper.registerItem(event, ModItems.COOKIE_PICKAXE);
		ModRegistryHelper.registerItem(event, ModItems.COOKIE_AXE);
		ModRegistryHelper.registerItem(event, ModItems.COOKIE_HOE);

		ModRegistryHelper.registerItem(event, ModItems.VILLAGER_HELMET);
		ModRegistryHelper.registerItem(event, ModItems.VILLAGER_CHESTPLATE);
		ModRegistryHelper.registerItem(event, ModItems.VILLAGER_LEGGINGS);
		ModRegistryHelper.registerItem(event, ModItems.VILLAGER_BOOTS);
		ModRegistryHelper.registerItem(event, ModItems.VILLAGER_SWORD);
		ModRegistryHelper.registerItem(event, ModItems.VILLAGER_SHOVEL);
		ModRegistryHelper.registerItem(event, ModItems.VILLAGER_PICKAXE);
		ModRegistryHelper.registerItem(event, ModItems.VILLAGER_AXE);
		ModRegistryHelper.registerItem(event, ModItems.VILLAGER_HOE);
	}

	@SubscribeEvent
	public static void onSoundModelRegister(ModelRegistryEvent event) {
		ModRendering.registerEntityRender();
	}
}