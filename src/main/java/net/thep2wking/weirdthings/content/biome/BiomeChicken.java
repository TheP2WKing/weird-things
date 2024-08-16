package net.thep2wking.weirdthings.content.biome;

import java.util.Random;

import net.minecraft.block.BlockTallGrass;
import net.minecraft.entity.passive.EntityChicken;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.feature.WorldGenTallGrass;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.thep2wking.weirdthings.content.entity.EntityCrossyRoadChicken;
import net.thep2wking.weirdthings.content.entity.EntityCrueatus;
import net.thep2wking.weirdthings.content.entity.EntityDirtChicken;
import net.thep2wking.weirdthings.content.entity.EntityDirtGolem;
import net.thep2wking.weirdthings.content.entity.EntityFatChicken;
import net.thep2wking.weirdthings.content.entity.EntityVillagerChicken;
import net.thep2wking.weirdthings.init.ModBiomes;
import net.thep2wking.weirdthings.init.ModBlocks;

public class BiomeChicken extends Biome {
	public BiomeChicken() {
		super(new BiomeProperties("Chicken Fields").setWaterColor(0x61a137).setHeightVariation(0.025f).setBaseHeight(0.05f));
		this.topBlock = ModBlocks.CHICKEN_GRASS.getDefaultState();
		this.fillerBlock = ModBlocks.CHICKEN_DIRT.getDefaultState();
		this.spawnableCreatureList.clear();
		this.spawnableCreatureList.add(new SpawnListEntry(EntityChicken.class, 5, 2, 6));
		this.spawnableCreatureList.add(new SpawnListEntry(EntityDirtChicken.class, 10, 3, 5));
		this.spawnableCreatureList.add(new SpawnListEntry(EntityFatChicken.class, 10, 2, 4));
		this.spawnableCreatureList.add(new SpawnListEntry(EntityVillagerChicken.class, 10, 2, 4));
		this.spawnableCreatureList.add(new SpawnListEntry(EntityCrossyRoadChicken.class, 10, 1, 2));
		this.spawnableCreatureList.add(new SpawnListEntry(EntityDirtGolem.class, 5, 1, 2));
		this.spawnableCreatureList.add(new SpawnListEntry(EntityCrueatus.class, 8, 1, 4));
		this.addDefaultFlowers();
	}

	@Override
	public int getSkyColorByTemp(float currentTemperature) {
		return 0x9fce6f;
	}

	@Override
	public int getGrassColorAtPos(BlockPos pos) {
		return 0xc9ff91;
	}

	@Override
	public int getFoliageColorAtPos(BlockPos pos) {
		return 0xc9ff91;
	}

	@Override
	public void decorate(World worldIn, Random rand, BlockPos pos) {
		super.decorate(worldIn, rand, pos);
		WorldGenerator tallGrassGen = new WorldGenTallGrass(BlockTallGrass.EnumType.GRASS);
		WorldGenerator shortGrassGen = new WorldGenTallGrass(BlockTallGrass.EnumType.FERN);
		WorldGenerator chickenTreeGen = ModBiomes.CHICKEN_TREE;
		for (int i = 0; i < 48; ++i) {
			int x = rand.nextInt(16) + 8;
			int z = rand.nextInt(16) + 8;
			int y = rand.nextInt(worldIn.getHeight(pos.add(x, 0, z)).getY() + 32);
			BlockPos treePos = pos.add(x, y, z);
			if (worldIn.getBlockState(treePos.down()).getBlock() == ModBlocks.CHICKEN_GRASS
					|| worldIn.getBlockState(treePos.down()).getBlock() == ModBlocks.CHICKEN_DIRT) {
				chickenTreeGen.generate(worldIn, rand, treePos);
			}
		}
		for (int i = 0; i < 48; ++i) {
			int x = rand.nextInt(16) + 8;
			int z = rand.nextInt(16) + 8;
			int y = rand.nextInt(worldIn.getHeight(pos.add(x, 0, z)).getY() + 32);
			BlockPos grassPos = pos.add(x, y, z);
			if (worldIn.getBlockState(grassPos.down()).getBlock() == ModBlocks.CHICKEN_GRASS
					|| worldIn.getBlockState(grassPos.down()).getBlock() == ModBlocks.CHICKEN_DIRT) {
				if (rand.nextBoolean()) {
					tallGrassGen.generate(worldIn, rand, grassPos);
				} else {
					shortGrassGen.generate(worldIn, rand, grassPos);
				}
			}
		}
	}
}