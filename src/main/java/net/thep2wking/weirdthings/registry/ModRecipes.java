package net.thep2wking.weirdthings.registry;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.thep2wking.reloadedlib.util.ModLogger;
import net.thep2wking.reloadedlib.util.ModRecipeHelper;
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

		ModRecipeHelper.add9xBlockCompressRecipe(WeirdThings.MODID, "cookie", ModBlocks.COOKIE_BLOCK, "ingotCookie");
		ModRecipeHelper.add9xIngotUncompressRecipe(WeirdThings.MODID, "cookie", ModItems.COOKIE_INGOT, "blockCookie");

		ModRecipeHelper.add9xBlockCompressRecipe(WeirdThings.MODID, "ruby", ModBlocks.RUBY_BLOCK, "gemRuby");
		ModRecipeHelper.add9xIngotUncompressRecipe(WeirdThings.MODID, "ruby", ModItems.RUBY, "blockRuby");

		ModRecipeHelper.add9xBlockCompressRecipe(WeirdThings.MODID, "rendium", ModBlocks.RENDIUM_BLOCK, "gemRendium");
		ModRecipeHelper.add9xIngotUncompressRecipe(WeirdThings.MODID, "rendium", ModItems.RENDIUM, "blockRendium");

		ModRecipeHelper.addShapedRecipe(WeirdThings.MODID, "cookie_planks", new ItemStack(ModBlocks.COOKIE_PLANKS, 4, 0), "A", 'A', new ItemStack(ModBlocks.COOKIE_LOG, 1, 0));
		ModRecipeHelper.addShapedRecipe(WeirdThings.MODID, "chicken_planks", new ItemStack(ModBlocks.CHICKEN_PLANKS, 4, 0), "A", 'A', new ItemStack(ModBlocks.CHICKEN_LOG, 1, 0));

		ModRecipeHelper.addShapedRecipe(WeirdThings.MODID, "cookie_ingot_alt", new ItemStack(ModItems.COOKIE_INGOT, 4, 0), " A ", "ABA", " A ", 'A', "ingotIron", 'B',"gemCookie");
		ModRecipeHelper.addShapedRecipe(WeirdThings.MODID, "fin_brick", new ItemStack(ModItems.FIN_BRICK, 4, 0), " A ", "ABA", " A ", 'A', "ingotBrickNether", 'B',"fire");
	
		ModRecipeHelper.addSwordRecipe(WeirdThings.MODID, "crossy", new ItemStack(ModItems.CROSSY_SWORD, 1, 0), "stickWood", "eggRainbow");
		ModRecipeHelper.addHoeRecipe(WeirdThings.MODID, "flame", new ItemStack(ModItems.FLAME_HOE, 1, 0), "stickBlaze", "ingotBrickFin");

		ModRecipeHelper.addFullArmorRecipe(WeirdThings.MODID, "chainmail", new ItemStack(Items.CHAINMAIL_HELMET, 1, 0), new ItemStack(Items.CHAINMAIL_CHESTPLATE, 1, 0), new ItemStack(Items.CHAINMAIL_LEGGINGS, 1, 0), new ItemStack(Items.CHAINMAIL_BOOTS, 1, 0), "fire");
		ModRecipeHelper.addFullArmorRecipe(WeirdThings.MODID, "dirt", new ItemStack(ModItems.DIRT_HELMET, 1, 0), new ItemStack(ModItems.DIRT_CHESTPLATE, 1, 0), new ItemStack(ModItems.DIRT_LEGGINGS, 1, 0), new ItemStack(ModItems.DIRT_BOOTS, 1, 0), "dirt");
		ModRecipeHelper.addFullArmorRecipe(WeirdThings.MODID, "cookie", new ItemStack(ModItems.COOKIE_HELMET, 1, 0), new ItemStack(ModItems.COOKIE_CHESTPLATE, 1, 0), new ItemStack(ModItems.COOKIE_LEGGINGS, 1, 0), new ItemStack(ModItems.COOKIE_BOOTS, 1, 0), "ingotCookie");

		ModRecipeHelper.addFullToolRecipe(WeirdThings.MODID, "dirt", new ItemStack(ModItems.DIRT_SWORD, 1, 0), new ItemStack(ModItems.DIRT_SHOVEL, 1, 0), new ItemStack(ModItems.DIRT_PICKAXE, 1, 0), new ItemStack(ModItems.DIRT_AXE, 1, 0), new ItemStack(ModItems.DIRT_HOE, 1, 0), "stickWood", "dirt");
		ModRecipeHelper.addFullToolRecipe(WeirdThings.MODID, "cookie", new ItemStack(ModItems.COOKIE_SWORD, 1, 0), new ItemStack(ModItems.COOKIE_SHOVEL, 1, 0), new ItemStack(ModItems.COOKIE_PICKAXE, 1, 0), new ItemStack(ModItems.COOKIE_AXE, 1, 0), new ItemStack(ModItems.COOKIE_HOE, 1, 0), "stickWood", "ingotCookie");
	}
}