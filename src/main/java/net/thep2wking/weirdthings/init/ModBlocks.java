package net.thep2wking.weirdthings.init;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.thep2wking.reloadedlib.api.block.ModBlockBase;
import net.thep2wking.reloadedlib.api.block.ModBlockOreBase;
import net.thep2wking.reloadedlib.api.block.ModBlockRotatedPillarBase;
import net.thep2wking.reloadedlib.util.ModToolTypes;
import net.thep2wking.weirdthings.WeirdThings;

public class ModBlocks {
    public static final Block COOKIE_ORE = new ModBlockOreBase(WeirdThings.MODID, "cookie_ore", WeirdThings.TAB, 1, 2, Material.ROCK, SoundType.STONE, MapColor.STONE, 0, ModToolTypes.PICKAXE, 3.0f, 3.0f, 0);
    public static final Block RUBY_ORE = new ModBlockOreBase(WeirdThings.MODID, "ruby_ore", WeirdThings.TAB, 3, 7, Material.ROCK, SoundType.STONE, MapColor.STONE, 2, ModToolTypes.PICKAXE, 3.0f, 3.0f, 0);
    public static final Block RENDIUM_ORE = new ModBlockOreBase(WeirdThings.MODID, "rendium_ore", WeirdThings.TAB, 0, 0, Material.ROCK, SoundType.STONE, MapColor.SAND, 2, ModToolTypes.PICKAXE, 3.0f, 3.0f, 4);
    public static final Block FIRE_ORE = new ModBlockOreBase(WeirdThings.MODID, "fire_ore", WeirdThings.TAB, 0, 1, Material.ROCK, SoundType.STONE, MapColor.NETHERRACK, 0, ModToolTypes.PICKAXE, 3.0f, 3.0f, 4);
    
    public static final Block COOKIE_BLOCK = new ModBlockBase(WeirdThings.MODID, "cookie_block", WeirdThings.TAB, Material.IRON, SoundType.METAL, MapColor.ORANGE_STAINED_HARDENED_CLAY, 1, ModToolTypes.PICKAXE, 5.0f, 6.0f, 0);
    public static final Block RUBY_BLOCK = new ModBlockBase(WeirdThings.MODID, "ruby_block", WeirdThings.TAB, Material.IRON, SoundType.METAL, MapColor.RED, 2, ModToolTypes.PICKAXE, 5.0f, 6.0f, 0);
    public static final Block RENDIUM_BLOCK = new ModBlockBase(WeirdThings.MODID, "rendium_block", WeirdThings.TAB, Material.IRON, SoundType.METAL, MapColor.ADOBE, 2, ModToolTypes.PICKAXE, 5.0f, 6.0f, 8);

    public static final Block COOKIE_GRASS = new ModBlockBase(WeirdThings.MODID, "cookie_grass", WeirdThings.TAB, Material.GRASS, SoundType.PLANT, MapColor.ORANGE_STAINED_HARDENED_CLAY, 0, ModToolTypes.SHOVEL, 0.6f, 0.6f, 0);
    public static final Block COOKIE_DIRT = new ModBlockBase(WeirdThings.MODID, "cookie_dirt", WeirdThings.TAB, Material.GROUND, SoundType.GROUND, MapColor.ORANGE_STAINED_HARDENED_CLAY, 0, ModToolTypes.SHOVEL, 0.5f, 0.5f, 0);
    public static final Block COOKIE_LOG = new ModBlockRotatedPillarBase(WeirdThings.MODID, "cookie_log", WeirdThings.TAB, Material.WOOD, SoundType.WOOD, MapColor.ORANGE_STAINED_HARDENED_CLAY, 0, ModToolTypes.AXE, 2.0f, 2.0f, 0);
    public static final Block COOKIE_PLANKS = new ModBlockBase(WeirdThings.MODID, "cookie_planks", WeirdThings.TAB, Material.WOOD, SoundType.WOOD, MapColor.ORANGE_STAINED_HARDENED_CLAY, 0, ModToolTypes.AXE, 2.0f, 2.0f, 0);

    public static final Block CHICKEN_GRASS = new ModBlockBase(WeirdThings.MODID, "chicken_grass", WeirdThings.TAB, Material.GRASS, SoundType.PLANT, MapColor.LIME, 0, ModToolTypes.SHOVEL, 0.6f, 0.6f, 0);
    public static final Block CHICKEN_DIRT = new ModBlockBase(WeirdThings.MODID, "chicken_dirt", WeirdThings.TAB, Material.GROUND, SoundType.GROUND, MapColor.SNOW, 0, ModToolTypes.SHOVEL, 0.5f, 0.5f, 0);
    public static final Block CHICKEN_LOG = new ModBlockRotatedPillarBase(WeirdThings.MODID, "chicken_log", WeirdThings.TAB, Material.WOOD, SoundType.WOOD, MapColor.SNOW, 0, ModToolTypes.AXE, 2.0f, 2.0f, 0);
    public static final Block CHICKEN_PLANKS = new ModBlockBase(WeirdThings.MODID, "chicken_planks", WeirdThings.TAB, Material.WOOD, SoundType.WOOD, MapColor.SNOW, 0, ModToolTypes.AXE, 2.0f, 2.0f, 0);

    public static final Block MEGA_TNT = new ModBlockBase(WeirdThings.MODID, "mega_tnt", WeirdThings.TAB, Material.PLANTS, SoundType.PLANT, MapColor.ADOBE, 0, ModToolTypes.NO_TOOL, 0.0f, 0.0f, 0);
    public static final Block CHICKEN_CHEST = new ModBlockBase(WeirdThings.MODID, "chicken_chest", WeirdThings.TAB, Material.WOOD, SoundType.WOOD, MapColor.SNOW, 0, ModToolTypes.AXE, 2.5f, 2.5f, 0);
}