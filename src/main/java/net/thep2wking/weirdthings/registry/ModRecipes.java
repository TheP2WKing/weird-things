package net.thep2wking.weirdthings.registry;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.thep2wking.oedldoedlcore.util.ModLogger;
import net.thep2wking.oedldoedlcore.util.ModRecipeHelper;
import net.thep2wking.weirdthings.WeirdThings;
import net.thep2wking.weirdthings.init.ModBlocks;
import net.thep2wking.weirdthings.init.ModItems;

public class ModRecipes {
	public static void registerRecipes() {
		ModLogger.registeredRecipesLogger(WeirdThings.MODID);

		ModRecipeHelper.addOreDictSmeltingRecipe(new ItemStack(Items.COOKIE, 1, 0), "oreCookie", 0.1f);
		ModRecipeHelper.addOreDictSmeltingRecipe(new ItemStack(ModItems.RUBY, 1, 0), "oreRuby", 1.0f);
		ModRecipeHelper.addOreDictSmeltingRecipe(new ItemStack(ModItems.RENDIUM, 1, 0), "oreRendium", 1.0f);
		ModRecipeHelper.addOreDictSmeltingRecipe(new ItemStack(ModItems.FIRE, 1, 0), "oreFire", 0.2f);

		ModRecipeHelper.add9xCompressRecipe(WeirdThings.MODID, "cookie_block_from_ingot", ModBlocks.COOKIE_BLOCK,
				"ingotCookie");
		ModRecipeHelper.add9xDecompressRecipe(WeirdThings.MODID, "cookie_ingot_from_block", ModItems.COOKIE_INGOT,
				"blockCookie");

		ModRecipeHelper.add9xCompressRecipe(WeirdThings.MODID, "ruby_block_from_gem", ModBlocks.RUBY_BLOCK, "gemRuby");
		ModRecipeHelper.add9xDecompressRecipe(WeirdThings.MODID, "ruby_from_block", ModItems.RUBY, "blockRuby");

		ModRecipeHelper.add9xCompressRecipe(WeirdThings.MODID, "rendium_block_from_gem", ModBlocks.RENDIUM_BLOCK,
				"gemRendium");
		ModRecipeHelper.add9xDecompressRecipe(WeirdThings.MODID, "rendium_from_block", ModItems.RENDIUM,
				"blockRendium");

		ModRecipeHelper.addShapelessRecipe(WeirdThings.MODID, "cookie_planks",
				new ItemStack(ModBlocks.COOKIE_PLANKS, 4, 0), new ItemStack(ModBlocks.COOKIE_LOG, 1, 0));
		ModRecipeHelper.addShapelessRecipe(WeirdThings.MODID, "chicken_planks",
				new ItemStack(ModBlocks.CHICKEN_PLANKS, 4, 0), new ItemStack(ModBlocks.CHICKEN_LOG, 1, 0));

		ModRecipeHelper.addShapedRecipe(WeirdThings.MODID, "mega_tnt", new ItemStack(ModBlocks.MEGA_TNT, 1, 0), "AAA",
				"ABA", "AAA", 'A', "tnt", 'B', "gemRendium");

		ModRecipeHelper.addShapedRecipe(WeirdThings.MODID, "chicken_chest",
				new ItemStack(ModBlocks.CHICKEN_CHEST, 1, 0), "AAA", "ABA", "AAA", 'A',
				new ItemStack(ModBlocks.CHICKEN_PLANKS), 'B', "feather");
		ModRecipeHelper.addShapelessRecipe(WeirdThings.MODID, "trapped_chicken_chest",
				new ItemStack(ModBlocks.TRAPPED_CHICKEN_CHEST, 1, 0), "chestChicken",
				new ItemStack(Blocks.TRIPWIRE_HOOK, 1, 0));

		ModRecipeHelper.addShapelessRecipe(WeirdThings.MODID, "cookie_ingot",
				new ItemStack(ModItems.COOKIE_INGOT, 1, 0), "ingotIron", "gemCookie");
		ModRecipeHelper.addShapelessRecipe(WeirdThings.MODID, "fin_brick", new ItemStack(ModItems.FIN_BRICK, 1, 0),
				"ingotBrickNether", "fire");

		ModRecipeHelper.addShapedRecipe(WeirdThings.MODID, "throwable_villager",
				new ItemStack(ModItems.THROWABLE_VILLAGER, 1, 0), "ABA", "BCB", "ABA", 'A', "gemRuby", 'B', "tnt", 'C',
				"snowball");

		ModRecipeHelper.addSwordRecipe(WeirdThings.MODID, "crossy", new ItemStack(ModItems.CROSSY_SWORD, 1, 0),
				"stickWood", "eggRainbow");
		ModRecipeHelper.addHoeRecipe(WeirdThings.MODID, "flame", new ItemStack(ModItems.FLAME_HOE, 1, 0), "stickBlaze",
				"ingotBrickFin");

		ModRecipeHelper.addFullArmorRecipe(WeirdThings.MODID, "chainmail", new ItemStack(Items.CHAINMAIL_HELMET, 1, 0),
				new ItemStack(Items.CHAINMAIL_CHESTPLATE, 1, 0), new ItemStack(Items.CHAINMAIL_LEGGINGS, 1, 0),
				new ItemStack(Items.CHAINMAIL_BOOTS, 1, 0), "fire");
		ModRecipeHelper.addFullArmorRecipe(WeirdThings.MODID, "dirt", new ItemStack(ModItems.DIRT_HELMET, 1, 0),
				new ItemStack(ModItems.DIRT_CHESTPLATE, 1, 0), new ItemStack(ModItems.DIRT_LEGGINGS, 1, 0),
				new ItemStack(ModItems.DIRT_BOOTS, 1, 0), "dirt");
		ModRecipeHelper.addFullArmorRecipe(WeirdThings.MODID, "cookie", new ItemStack(ModItems.COOKIE_HELMET, 1, 0),
				new ItemStack(ModItems.COOKIE_CHESTPLATE, 1, 0), new ItemStack(ModItems.COOKIE_LEGGINGS, 1, 0),
				new ItemStack(ModItems.COOKIE_BOOTS, 1, 0), "ingotCookie");
		ModRecipeHelper.addFullArmorRecipe(WeirdThings.MODID, "villager", new ItemStack(ModItems.VILLAGER_HELMET, 1, 0),
				new ItemStack(ModItems.VILLAGER_CHESTPLATE, 1, 0), new ItemStack(ModItems.VILLAGER_LEGGINGS, 1, 0),
				new ItemStack(ModItems.VILLAGER_BOOTS, 1, 0), "gemRuby");

		ModRecipeHelper.addDefaultToolRecipe(WeirdThings.MODID, "dirt", new ItemStack(ModItems.DIRT_SWORD, 1, 0),
				new ItemStack(ModItems.DIRT_SHOVEL, 1, 0), new ItemStack(ModItems.DIRT_PICKAXE, 1, 0),
				new ItemStack(ModItems.DIRT_AXE, 1, 0), new ItemStack(ModItems.DIRT_HOE, 1, 0), "stickWood", "dirt");
		ModRecipeHelper.addDefaultToolRecipe(WeirdThings.MODID, "cookie", new ItemStack(ModItems.COOKIE_SWORD, 1, 0),
				new ItemStack(ModItems.COOKIE_SHOVEL, 1, 0), new ItemStack(ModItems.COOKIE_PICKAXE, 1, 0),
				new ItemStack(ModItems.COOKIE_AXE, 1, 0), new ItemStack(ModItems.COOKIE_HOE, 1, 0), "stickWood",
				"ingotCookie");
		ModRecipeHelper.addDefaultToolRecipe(WeirdThings.MODID, "villager",
				new ItemStack(ModItems.VILLAGER_SWORD, 1, 0), new ItemStack(ModItems.VILLAGER_SHOVEL, 1, 0),
				new ItemStack(ModItems.VILLAGER_PICKAXE, 1, 0), new ItemStack(ModItems.VILLAGER_AXE, 1, 0),
				new ItemStack(ModItems.VILLAGER_HOE, 1, 0), "stickWood", "gemRuby");
	}
}