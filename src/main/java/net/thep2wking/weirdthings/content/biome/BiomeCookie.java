package net.thep2wking.weirdthings.content.biome;

import java.util.Random;

import net.minecraft.block.BlockTallGrass;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.feature.WorldGenTallGrass;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.thep2wking.weirdthings.content.entity.EntityCookieConnoisseur;
import net.thep2wking.weirdthings.content.entity.EntityCookieMonster;
import net.thep2wking.weirdthings.init.ModBiomes;
import net.thep2wking.weirdthings.init.ModBlocks;

public class BiomeCookie extends Biome {
	public BiomeCookie() {
		super(new BiomeProperties("Cookie Fields").setWaterColor(0x7c4521).setHeightVariation(0.025f).setBaseHeight(0.05f)
				.setRainDisabled());
		this.topBlock = ModBlocks.COOKIE_GRASS.getDefaultState();
		this.fillerBlock = ModBlocks.COOKIE_DIRT.getDefaultState();
		this.spawnableMonsterList.clear();
		this.spawnableMonsterList.add(new SpawnListEntry(EntityCookieMonster.class, 10, 2, 4));
		this.spawnableCreatureList.clear();
		this.spawnableCreatureList.add(new SpawnListEntry(EntityCookieConnoisseur.class, 10, 1, 2));
		this.addDefaultFlowers();
	}

	@Override
	public int getSkyColorByTemp(float currentTemperature) {
		return 0xde8c4b;
	}

	@Override
	public int getGrassColorAtPos(BlockPos pos) {
		return 0xf8a666;
	}

	@Override
	public int getFoliageColorAtPos(BlockPos pos) {
		return 0xf8a666;
	}

	@Override
	public void decorate(World worldIn, Random rand, BlockPos pos) {
		super.decorate(worldIn, rand, pos);
		WorldGenerator tallGrassGen = new WorldGenTallGrass(BlockTallGrass.EnumType.GRASS);
		WorldGenerator shortGrassGen = new WorldGenTallGrass(BlockTallGrass.EnumType.FERN);
		WorldGenerator chickenTreeGen = ModBiomes.COOKIE_TREE;
		for (int i = 0; i < 48; ++i) {
			int x = rand.nextInt(16) + 8;
			int z = rand.nextInt(16) + 8;
			int y = rand.nextInt(worldIn.getHeight(pos.add(x, 0, z)).getY() + 32);
			BlockPos treePos = pos.add(x, y, z);
			if (worldIn.getBlockState(treePos.down()).getBlock() == ModBlocks.COOKIE_GRASS
					|| worldIn.getBlockState(treePos.down()).getBlock() == ModBlocks.COOKIE_DIRT) {
				chickenTreeGen.generate(worldIn, rand, treePos);
			}
		}
		for (int i = 0; i < 48; ++i) {
			int x = rand.nextInt(16) + 8;
			int z = rand.nextInt(16) + 8;
			int y = rand.nextInt(worldIn.getHeight(pos.add(x, 0, z)).getY() + 32);
			BlockPos grassPos = pos.add(x, y, z);
			if (worldIn.getBlockState(grassPos.down()).getBlock() == ModBlocks.COOKIE_GRASS
					|| worldIn.getBlockState(grassPos.down()).getBlock() == ModBlocks.COOKIE_DIRT) {
				if (rand.nextBoolean()) {
					tallGrassGen.generate(worldIn, rand, grassPos);
				} else {
					shortGrassGen.generate(worldIn, rand, grassPos);
				}
			}
		}
	}
}