package net.thep2wking.weirdthings.registry;

import net.minecraft.init.Items;
import net.thep2wking.oedldoedlcore.util.ModLogger;
import net.thep2wking.oedldoedlcore.util.ModRecipeHelper;
import net.thep2wking.weirdthings.WeirdThings;
import net.thep2wking.weirdthings.init.ModBlocks;
import net.thep2wking.weirdthings.init.ModItems;

public class ModOreDict {
	public static void registerOreDict() {
		ModLogger.registeredOreDictLogger(WeirdThings.MODID);

		ModRecipeHelper.addOreDict("oreCookie", ModBlocks.COOKIE_ORE, 0);
		ModRecipeHelper.addOreDict("oreRuby", ModBlocks.RUBY_ORE, 0);
		ModRecipeHelper.addOreDict("oreFire", ModBlocks.FIRE_ORE, 0);
		ModRecipeHelper.addOreDict("oreRendium", ModBlocks.RENDIUM_ORE, 0);

		ModRecipeHelper.addOreDict("blockCookie", ModBlocks.COOKIE_BLOCK, 0);
		ModRecipeHelper.addOreDict("blockRuby", ModBlocks.RUBY_BLOCK, 0);
		ModRecipeHelper.addOreDict("blockRendium", ModBlocks.RENDIUM_BLOCK, 0);

		ModRecipeHelper.addOreDict("grass", ModBlocks.COOKIE_GRASS, 0);
		ModRecipeHelper.addOreDict("dirt", ModBlocks.COOKIE_DIRT, 0);
		ModRecipeHelper.addOreDict("plankWood", ModBlocks.COOKIE_PLANKS, 0);

		ModRecipeHelper.addOreDict("grass", ModBlocks.CHICKEN_GRASS, 0);
		ModRecipeHelper.addOreDict("dirt", ModBlocks.CHICKEN_DIRT, 0);
		ModRecipeHelper.addOreDict("plankWood", ModBlocks.CHICKEN_PLANKS, 0);

		ModRecipeHelper.addOreDict("tntMega", ModBlocks.MEGA_TNT, 0);

		ModRecipeHelper.addOreDict("chest", ModBlocks.CHICKEN_CHEST, 0);
		ModRecipeHelper.addOreDict("chestChicken", ModBlocks.CHICKEN_CHEST, 0);
		ModRecipeHelper.addOreDict("chest", ModBlocks.TRAPPED_CHICKEN_CHEST, 0);
		ModRecipeHelper.addOreDict("chestChickenTrapped", ModBlocks.TRAPPED_CHICKEN_CHEST, 0);

		ModRecipeHelper.addOreDict("fire", ModItems.FIRE, 0);

		ModRecipeHelper.addOreDict("gemCookie", Items.COOKIE, 0);
		ModRecipeHelper.addOreDict("ingotCookie", ModItems.COOKIE_INGOT, 0);
		ModRecipeHelper.addOreDict("ingotBrickFin", ModItems.FIN_BRICK, 0);
		ModRecipeHelper.addOreDict("gemRuby", ModItems.RUBY, 0);
		ModRecipeHelper.addOreDict("gemRendium", ModItems.RENDIUM, 0);

		ModRecipeHelper.addOreDict("eggRainbow", ModItems.RAINBOW_EGG, 0);

		ModRecipeHelper.addOreDict("throwableVillager", ModItems.THROWABLE_VILLAGER, 0);
	}
}