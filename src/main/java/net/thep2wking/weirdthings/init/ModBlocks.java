package net.thep2wking.weirdthings.init;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.thep2wking.oedldoedlcore.api.block.ModBlockBase;
import net.thep2wking.oedldoedlcore.api.block.ModBlockLogBase;
import net.thep2wking.oedldoedlcore.api.block.ModBlockPlanksBase;
import net.thep2wking.oedldoedlcore.util.ModToolTypes;
import net.thep2wking.weirdthings.WeirdThings;
import net.thep2wking.weirdthings.content.block.BlockChickenChest;
import net.thep2wking.weirdthings.content.block.BlockChickenDirt;
import net.thep2wking.weirdthings.content.block.BlockChickenGrass;
import net.thep2wking.weirdthings.content.block.BlockChickenLeaves;
import net.thep2wking.weirdthings.content.block.BlockChickenSapling;
import net.thep2wking.weirdthings.content.block.BlockCookieDirt;
import net.thep2wking.weirdthings.content.block.BlockCookieGrass;
import net.thep2wking.weirdthings.content.block.BlockCookieLeaves;
import net.thep2wking.weirdthings.content.block.BlockCookieOre;
import net.thep2wking.weirdthings.content.block.BlockCookieSapling;
import net.thep2wking.weirdthings.content.block.BlockFireOre;
import net.thep2wking.weirdthings.content.block.BlockMegaTNT;
import net.thep2wking.weirdthings.content.block.BlockRendium;
import net.thep2wking.weirdthings.content.block.BlockRendiumOre;
import net.thep2wking.weirdthings.content.block.BlockRubyOre;

public class ModBlocks {
    public static final Block COOKIE_ORE = new BlockCookieOre(WeirdThings.MODID, "cookie_ore", WeirdThings.TAB, 1, 2, Material.ROCK, SoundType.STONE, MapColor.STONE, 0, ModToolTypes.PICKAXE, 3.0f, 3.0f, 0);
    public static final Block RUBY_ORE = new BlockRubyOre(WeirdThings.MODID, "ruby_ore", WeirdThings.TAB, 2, 6, Material.ROCK, SoundType.STONE, MapColor.STONE, 2, ModToolTypes.PICKAXE, 3.0f, 3.0f, 0);
    public static final Block FIRE_ORE = new BlockFireOre(WeirdThings.MODID, "fire_ore", WeirdThings.TAB, 0, 1, Material.ROCK, SoundType.STONE, MapColor.NETHERRACK, 0, ModToolTypes.PICKAXE, 3.0f, 3.0f, 4);
    public static final Block RENDIUM_ORE = new BlockRendiumOre(WeirdThings.MODID, "rendium_ore", WeirdThings.TAB, 3, 8, Material.ROCK, SoundType.STONE, MapColor.SAND, 2, ModToolTypes.PICKAXE, 3.0f, 3.0f, 4);
    
    public static final Block COOKIE_BLOCK = new ModBlockBase(WeirdThings.MODID, "cookie_block", WeirdThings.TAB, Material.IRON, SoundType.METAL, MapColor.ORANGE_STAINED_HARDENED_CLAY, 1, ModToolTypes.PICKAXE, 4.0f, 4.0f, 0);
    public static final Block RUBY_BLOCK = new ModBlockBase(WeirdThings.MODID, "ruby_block", WeirdThings.TAB, Material.IRON, SoundType.METAL, MapColor.RED, 2, ModToolTypes.PICKAXE, 6.0f, 6.0f, 0);
    public static final Block RENDIUM_BLOCK = new BlockRendium(WeirdThings.MODID, "rendium_block", WeirdThings.TAB, Material.IRON, SoundType.METAL, MapColor.ADOBE, 2, ModToolTypes.PICKAXE, 8.0f, 8.0f, 8);

    public static final Block COOKIE_GRASS = new BlockCookieGrass(WeirdThings.MODID, "cookie_grass", WeirdThings.TAB, Material.GRASS, SoundType.PLANT, MapColor.ORANGE_STAINED_HARDENED_CLAY, 0, ModToolTypes.SHOVEL, 0.6f, 0.6f, 0);
    public static final Block COOKIE_DIRT = new BlockCookieDirt(WeirdThings.MODID, "cookie_dirt", WeirdThings.TAB, Material.GROUND, SoundType.GROUND, MapColor.ORANGE_STAINED_HARDENED_CLAY, 0, ModToolTypes.SHOVEL, 0.5f, 0.5f, 0);
    public static final Block COOKIE_LOG = new ModBlockLogBase(WeirdThings.MODID, "cookie_log", WeirdThings.TAB, Material.WOOD, SoundType.WOOD, MapColor.ORANGE_STAINED_HARDENED_CLAY, 0, ModToolTypes.AXE, 2.0f, 2.0f, 0);
    public static final Block COOKIE_PLANKS = new ModBlockPlanksBase(WeirdThings.MODID, "cookie_planks", WeirdThings.TAB, Material.WOOD, SoundType.WOOD, MapColor.ORANGE_STAINED_HARDENED_CLAY, 0, ModToolTypes.AXE, 2.0f, 2.0f, 0);
    public static final Block COOKIE_LEAVES = new BlockCookieLeaves(WeirdThings.MODID, "cookie_leaves", WeirdThings.TAB, Material.LEAVES, SoundType.PLANT, MapColor.ORANGE_STAINED_HARDENED_CLAY, 0, ModToolTypes.NO_TOOL, 0.2f, 0.2f, 0);
    public static final Block COOKIE_SAPLING = new BlockCookieSapling(WeirdThings.MODID, "cookie_sapling", WeirdThings.TAB, Material.LEAVES, SoundType.PLANT, MapColor.ORANGE_STAINED_HARDENED_CLAY, 0, ModToolTypes.NO_TOOL, 0.0f, 0.0f, 0);

    public static final Block CHICKEN_GRASS = new BlockChickenGrass(WeirdThings.MODID, "chicken_grass", WeirdThings.TAB, Material.GRASS, SoundType.PLANT, MapColor.LIME, 0, ModToolTypes.SHOVEL, 0.6f, 0.6f, 0);
    public static final Block CHICKEN_DIRT = new BlockChickenDirt(WeirdThings.MODID, "chicken_dirt", WeirdThings.TAB, Material.GROUND, SoundType.GROUND, MapColor.SNOW, 0, ModToolTypes.SHOVEL, 0.5f, 0.5f, 0);
    public static final Block CHICKEN_LOG = new ModBlockLogBase(WeirdThings.MODID, "chicken_log", WeirdThings.TAB, Material.WOOD, SoundType.WOOD, MapColor.SNOW, 0, ModToolTypes.AXE, 2.0f, 2.0f, 0);
    public static final Block CHICKEN_PLANKS = new ModBlockPlanksBase(WeirdThings.MODID, "chicken_planks", WeirdThings.TAB, Material.WOOD, SoundType.WOOD, MapColor.SNOW, 0, ModToolTypes.AXE, 2.0f, 2.0f, 0);
    public static final Block CHICKEN_LEAVES = new BlockChickenLeaves(WeirdThings.MODID, "chicken_leaves", WeirdThings.TAB, Material.LEAVES, SoundType.PLANT, MapColor.LIME_STAINED_HARDENED_CLAY, 0, ModToolTypes.NO_TOOL, 0.2f, 0.2f, 0);
    public static final Block CHICKEN_SAPLING = new BlockChickenSapling(WeirdThings.MODID, "chicken_sapling", WeirdThings.TAB, Material.PLANTS, SoundType.PLANT, MapColor.LIME_STAINED_HARDENED_CLAY, 0, ModToolTypes.NO_TOOL, 0.0f, 0.0f, 0);

    public static final Block MEGA_TNT = new BlockMegaTNT(WeirdThings.MODID, "mega_tnt", WeirdThings.TAB, Material.TNT, SoundType.PLANT, MapColor.ADOBE, 0, ModToolTypes.NO_TOOL, 0.0f, 0.0f, 0);
    
    public static final Block CHICKEN_CHEST = new BlockChickenChest(WeirdThings.MODID, "chicken_chest", WeirdThings.TAB, BlockChickenChest.Type.BASIC, Material.WOOD, SoundType.WOOD, MapColor.SNOW, 0, ModToolTypes.AXE, 2.5f, 2.5f, 0);
    public static final Block TRAPPED_CHICKEN_CHEST = new BlockChickenChest(WeirdThings.MODID, "trapped_chicken_chest", WeirdThings.TAB, BlockChickenChest.Type.TRAP, Material.WOOD, SoundType.WOOD, MapColor.SNOW, 0, ModToolTypes.AXE, 2.5f, 2.5f, 0);
}