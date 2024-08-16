package net.thep2wking.weirdthings.init;

import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.thep2wking.oedldoedlcore.util.world.ModWorldGenBasicTreeBase;
import net.thep2wking.weirdthings.content.biome.BiomeChicken;
import net.thep2wking.weirdthings.content.biome.BiomeCookie;

public class ModBiomes {
	public static final Biome COOKIE = new BiomeCookie();
	public static final Biome CHICKEN = new BiomeChicken();

	public static final WorldGenerator COOKIE_TREE = new ModWorldGenBasicTreeBase(4, ModBlocks.COOKIE_LOG, ModBlocks.COOKIE_LEAVES);
	public static final WorldGenerator CHICKEN_TREE = new ModWorldGenBasicTreeBase(4, ModBlocks.CHICKEN_LOG, ModBlocks.CHICKEN_LEAVES);
}