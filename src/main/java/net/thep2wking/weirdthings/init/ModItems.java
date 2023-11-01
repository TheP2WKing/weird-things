package net.thep2wking.weirdthings.init;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.thep2wking.reloadedlib.api.armor.ModItemArmorBase;
import net.thep2wking.reloadedlib.api.item.ModItemBase;
import net.thep2wking.reloadedlib.api.item.ModItemBlockBase;
import net.thep2wking.reloadedlib.api.tool.ModItemAxeBase;
import net.thep2wking.reloadedlib.api.tool.ModItemHoeBase;
import net.thep2wking.reloadedlib.api.tool.ModItemPickaxeBase;
import net.thep2wking.reloadedlib.api.tool.ModItemShovelBase;
import net.thep2wking.reloadedlib.api.tool.ModItemSwordBase;
import net.thep2wking.reloadedlib.util.ModRarities;
import net.thep2wking.weirdthings.WeirdThings;
import net.thep2wking.weirdthings.content.item.ItemCrossySword;
import net.thep2wking.weirdthings.content.item.ItemFire;
import net.thep2wking.weirdthings.content.item.ItemFlameHoe;
import net.thep2wking.weirdthings.content.item.ItemRainbowEgg;
import net.thep2wking.weirdthings.content.item.ItemThrowableVillager;
import net.thep2wking.weirdthings.util.ModArmorMaterial;
import net.thep2wking.weirdthings.util.ModToolMaterial;

public class ModItems {	
    public static final Item COOKIE_ORE = new ModItemBlockBase(ModBlocks.COOKIE_ORE, ModRarities.WHITE, false, 0);
    public static final Item RUBY_ORE = new ModItemBlockBase(ModBlocks.RUBY_ORE, ModRarities.WHITE, false, 0);
    public static final Item FIRE_ORE = new ModItemBlockBase(ModBlocks.FIRE_ORE, ModRarities.WHITE, false, 0);
    public static final Item RENDIUM_ORE = new ModItemBlockBase(ModBlocks.RENDIUM_ORE, ModRarities.WHITE, false, 0);

    public static final Item COOKIE_BLOCK = new ModItemBlockBase(ModBlocks.COOKIE_BLOCK, ModRarities.WHITE, false, 0);
    public static final Item RUBY_BLOCK = new ModItemBlockBase(ModBlocks.RUBY_BLOCK, ModRarities.WHITE, false, 0);
    public static final Item RENDIUM_BLOCK = new ModItemBlockBase(ModBlocks.RENDIUM_BLOCK, ModRarities.WHITE, false, 0);

    public static final Item COOKIE_GRASS = new ModItemBlockBase(ModBlocks.COOKIE_GRASS, ModRarities.WHITE, false, 0);
    public static final Item COOKIE_DIRT = new ModItemBlockBase(ModBlocks.COOKIE_DIRT, ModRarities.WHITE, false, 0);
    public static final Item COOKIE_LOG = new ModItemBlockBase(ModBlocks.COOKIE_LOG, ModRarities.WHITE, false, 0);
    public static final Item COOKIE_PLANKS = new ModItemBlockBase(ModBlocks.COOKIE_PLANKS, ModRarities.WHITE, false, 0);

    public static final Item CHICKEN_GRASS = new ModItemBlockBase(ModBlocks.CHICKEN_GRASS, ModRarities.WHITE, false, 0);
    public static final Item CHICKEN_DIRT = new ModItemBlockBase(ModBlocks.CHICKEN_DIRT, ModRarities.WHITE, false, 0);
    public static final Item CHICKEN_LOG = new ModItemBlockBase(ModBlocks.CHICKEN_LOG, ModRarities.WHITE, false, 0);
    public static final Item CHICKEN_PLANKS = new ModItemBlockBase(ModBlocks.CHICKEN_PLANKS, ModRarities.WHITE, false, 0);

    public static final Item MEGA_TNT = new ModItemBlockBase(ModBlocks.MEGA_TNT, ModRarities.WHITE, false, 0);
    public static final Item CHICKEN_CHEST = new ModItemBlockBase(ModBlocks.CHICKEN_CHEST, ModRarities.WHITE, false, 0);
    public static final Item TRAPPED_CHICKEN_CHEST = new ModItemBlockBase(ModBlocks.TRAPPED_CHICKEN_CHEST, ModRarities.WHITE, false, 0);
    
    public static final Item FIRE = new ItemFire(WeirdThings.MODID, "fire", WeirdThings.TAB, ModRarities.WHITE, false, 0);
    
    public static final Item COOKIE_INGOT = new ModItemBase(WeirdThings.MODID, "cookie_ingot", WeirdThings.TAB, ModRarities.WHITE, false, 0);
    public static final Item FIN_BRICK = new ModItemBase(WeirdThings.MODID, "fin_brick", WeirdThings.TAB, ModRarities.WHITE, false, 0);
    public static final Item RUBY = new ModItemBase(WeirdThings.MODID, "ruby", WeirdThings.TAB, ModRarities.WHITE, false, 0);
    public static final Item RENDIUM = new ModItemBase(WeirdThings.MODID, "rendium", WeirdThings.TAB, ModRarities.WHITE, false, 0);

    public static final Item RAINBOW_EGG = new ItemRainbowEgg(WeirdThings.MODID, "rainbow_egg", WeirdThings.TAB, ModRarities.WHITE, false, 0);

    public static final Item THROWABLE_VILLAGER = new ItemThrowableVillager(WeirdThings.MODID, "throwable_villager", WeirdThings.TAB, ModRarities.WHITE, false, 0);

    public static final Item CROSSY_SWORD = new ItemCrossySword(WeirdThings.MODID, "crossy_sword", WeirdThings.TAB, ModToolMaterial.CROSSY, 3f, -2.4f, ModRarities.WHITE, false, 0);
    public static final Item FLAME_HOE = new ItemFlameHoe(WeirdThings.MODID, "flame_hoe", WeirdThings.TAB, ModToolMaterial.FLAME, 2f, -1f, ModRarities.WHITE, false, 0);

    public static final Item DIRT_HELMET = new ModItemArmorBase(WeirdThings.MODID, "dirt_helmet", WeirdThings.TAB, ModArmorMaterial.DIRT, 0, EntityEquipmentSlot.HEAD, ModRarities.WHITE, false, 0);
    public static final Item DIRT_CHESTPLATE = new ModItemArmorBase(WeirdThings.MODID, "dirt_chestplate", WeirdThings.TAB, ModArmorMaterial.DIRT, 0, EntityEquipmentSlot.CHEST, ModRarities.WHITE, false, 0);
    public static final Item DIRT_LEGGINGS = new ModItemArmorBase(WeirdThings.MODID, "dirt_leggings", WeirdThings.TAB, ModArmorMaterial.DIRT, 1, EntityEquipmentSlot.LEGS, ModRarities.WHITE, false, 0);
    public static final Item DIRT_BOOTS = new ModItemArmorBase(WeirdThings.MODID, "dirt_boots", WeirdThings.TAB, ModArmorMaterial.DIRT, 0, EntityEquipmentSlot.FEET, ModRarities.WHITE, false, 0);
    public static final Item DIRT_SWORD = new ModItemSwordBase(WeirdThings.MODID, "dirt_sword", WeirdThings.TAB, ModToolMaterial.DIRT, 3f, -2.4f, ModRarities.WHITE, false, 0);
    public static final Item DIRT_SHOVEL = new ModItemShovelBase(WeirdThings.MODID, "dirt_shovel", WeirdThings.TAB, ModToolMaterial.DIRT, 1.5f, -3f, ModRarities.WHITE, false, 0);
    public static final Item DIRT_PICKAXE = new ModItemPickaxeBase(WeirdThings.MODID, "dirt_pickaxe", WeirdThings.TAB, ModToolMaterial.DIRT, -1f, -2.8f, ModRarities.WHITE, false, 0);
    public static final Item DIRT_AXE = new ModItemAxeBase(WeirdThings.MODID, "dirt_axe", WeirdThings.TAB, ModToolMaterial.DIRT, 6f, -3.2f, ModRarities.WHITE, false, 0);
    public static final Item DIRT_HOE = new ModItemHoeBase(WeirdThings.MODID, "dirt_hoe", WeirdThings.TAB, ModToolMaterial.DIRT, 2f, -1f, ModRarities.WHITE, false, 0);

    public static final Item COOKIE_HELMET = new ModItemArmorBase(WeirdThings.MODID, "cookie_helmet", WeirdThings.TAB, ModArmorMaterial.COOKIE, 0, EntityEquipmentSlot.HEAD, ModRarities.WHITE, false, 0);
    public static final Item COOKIE_CHESTPLATE = new ModItemArmorBase(WeirdThings.MODID, "cookie_chestplate", WeirdThings.TAB, ModArmorMaterial.COOKIE, 0, EntityEquipmentSlot.CHEST, ModRarities.WHITE, false, 0);
    public static final Item COOKIE_LEGGINGS = new ModItemArmorBase(WeirdThings.MODID, "cookie_leggings", WeirdThings.TAB, ModArmorMaterial.COOKIE, 1, EntityEquipmentSlot.LEGS, ModRarities.WHITE, false, 0);
    public static final Item COOKIE_BOOTS = new ModItemArmorBase(WeirdThings.MODID, "cookie_boots", WeirdThings.TAB, ModArmorMaterial.COOKIE, 0, EntityEquipmentSlot.FEET, ModRarities.WHITE, false, 0);
    public static final Item COOKIE_SWORD = new ModItemSwordBase(WeirdThings.MODID, "cookie_sword", WeirdThings.TAB, ModToolMaterial.COOKIE, 3f, -2.4f, ModRarities.WHITE, false, 0);
    public static final Item COOKIE_SHOVEL = new ModItemShovelBase(WeirdThings.MODID, "cookie_shovel", WeirdThings.TAB, ModToolMaterial.COOKIE, 1.5f, -3f, ModRarities.WHITE, false, 0);
    public static final Item COOKIE_PICKAXE = new ModItemPickaxeBase(WeirdThings.MODID, "cookie_pickaxe", WeirdThings.TAB, ModToolMaterial.COOKIE, 1f, -2.8f, ModRarities.WHITE, false, 0);
    public static final Item COOKIE_AXE = new ModItemAxeBase(WeirdThings.MODID, "cookie_axe", WeirdThings.TAB, ModToolMaterial.COOKIE, 8f, -3.1f, ModRarities.WHITE, false, 0);
    public static final Item COOKIE_HOE = new ModItemHoeBase(WeirdThings.MODID, "cookie_hoe", WeirdThings.TAB, ModToolMaterial.COOKIE, -2f, -1f, ModRarities.WHITE, false, 0);

    public static final Item VILLAGER_HELMET = new ModItemArmorBase(WeirdThings.MODID, "villager_helmet", WeirdThings.TAB, ModArmorMaterial.VILLAGER, 0, EntityEquipmentSlot.HEAD, ModRarities.WHITE, false, 0);
    public static final Item VILLAGER_CHESTPLATE = new ModItemArmorBase(WeirdThings.MODID, "villager_chestplate", WeirdThings.TAB, ModArmorMaterial.VILLAGER, 0, EntityEquipmentSlot.CHEST, ModRarities.WHITE, false, 0);
    public static final Item VILLAGER_LEGGINGS = new ModItemArmorBase(WeirdThings.MODID, "villager_leggings", WeirdThings.TAB, ModArmorMaterial.VILLAGER, 1, EntityEquipmentSlot.LEGS, ModRarities.WHITE, false, 0);
    public static final Item VILLAGER_BOOTS = new ModItemArmorBase(WeirdThings.MODID, "villager_boots", WeirdThings.TAB, ModArmorMaterial.VILLAGER, 0, EntityEquipmentSlot.FEET, ModRarities.WHITE, false, 0);
    public static final Item VILLAGER_SWORD = new ModItemSwordBase(WeirdThings.MODID, "villager_sword", WeirdThings.TAB, ModToolMaterial.VILLAGER, 3f, -2.4f, ModRarities.WHITE, false, 0);
    public static final Item VILLAGER_SHOVEL = new ModItemShovelBase(WeirdThings.MODID, "villager_shovel", WeirdThings.TAB, ModToolMaterial.VILLAGER, 1.5f, -3f, ModRarities.WHITE, false, 0);
    public static final Item VILLAGER_PICKAXE = new ModItemPickaxeBase(WeirdThings.MODID, "villager_pickaxe", WeirdThings.TAB, ModToolMaterial.VILLAGER, 1f, -2.8f, ModRarities.WHITE, false, 0);
    public static final Item VILLAGER_AXE = new ModItemAxeBase(WeirdThings.MODID, "villager_axe", WeirdThings.TAB, ModToolMaterial.VILLAGER, 8f, -3f, ModRarities.WHITE, false, 0);
    public static final Item VILLAGER_HOE = new ModItemHoeBase(WeirdThings.MODID, "villager_hoe", WeirdThings.TAB, ModToolMaterial.VILLAGER, -2f, -1f, ModRarities.WHITE, false, 0);
}