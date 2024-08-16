package net.thep2wking.weirdthings.util.world;

import java.util.Random;

import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;
import net.thep2wking.oedldoedlcore.util.ModLogger;
import net.thep2wking.oedldoedlcore.util.world.ModOreGenHelper;
import net.thep2wking.weirdthings.WeirdThings;
import net.thep2wking.weirdthings.config.WeirdThingsConfig;
import net.thep2wking.weirdthings.init.ModBlocks;

public class ModOreGen implements IWorldGenerator {
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
		ModOreGenHelper.addOreGenOverworld(world, random, chunkX, chunkZ, ModBlocks.COOKIE_ORE, 9, 14, 48, 128, WeirdThingsConfig.WORLD.COOKIE_ORE);
		ModOreGenHelper.addOreGenOverworld(world, random, chunkX, chunkZ, ModBlocks.RUBY_ORE, 5, 4, 8, 24, WeirdThingsConfig.WORLD.RUBY_ORE);
		ModOreGenHelper.addOreGenNether(world, random, chunkX, chunkZ, ModBlocks.FIRE_ORE, 4, 8, 1, 128, WeirdThingsConfig.WORLD.FIRE_ORE);
		ModOreGenHelper.addOreGenEnd(world, random, chunkX, chunkZ, ModBlocks.RENDIUM_ORE, 4, 7, 1, 128, WeirdThingsConfig.WORLD.RENDIUM_ORE);
	}

	public static void registerModOredGen() {
		ModLogger.registeredWorldGenLogger(WeirdThings.MODID);

		ModOreGenHelper.registerOreGen(new ModOreGen());
	}
}