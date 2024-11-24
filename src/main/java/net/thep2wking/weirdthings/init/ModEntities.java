package net.thep2wking.weirdthings.init;

import net.minecraft.entity.EnumCreatureType;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.entity.monster.EntityEnderman;
import net.minecraft.entity.monster.EntityGhast;
import net.minecraft.entity.monster.EntityPigZombie;
import net.minecraft.entity.monster.EntitySkeleton;
import net.minecraft.entity.monster.EntitySpider;
import net.minecraft.entity.monster.EntityWitch;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.passive.EntityBat;
import net.minecraft.entity.passive.EntityChicken;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.entity.passive.EntityRabbit;
import net.minecraft.entity.passive.EntityWolf;
import net.minecraft.init.Biomes;
import net.thep2wking.oedldoedlcore.util.ModLogger;
import net.thep2wking.oedldoedlcore.util.ModRegistryHelper;
import net.thep2wking.oedldoedlcore.util.world.ModBiomeUtil;
import net.thep2wking.weirdthings.WeirdThings;
import net.thep2wking.weirdthings.config.WeirdThingsConfig;
import net.thep2wking.weirdthings.content.entity.EntityArmedCreeper;
import net.thep2wking.weirdthings.content.entity.EntityArrowstormSkeleton;
import net.thep2wking.weirdthings.content.entity.EntityBattleSheep;
import net.thep2wking.weirdthings.content.entity.EntityChickenGhast;
import net.thep2wking.weirdthings.content.entity.EntityChickow;
import net.thep2wking.weirdthings.content.entity.EntityContinuouslyTurningPig;
import net.thep2wking.weirdthings.content.entity.EntityCookieConnoisseur;
import net.thep2wking.weirdthings.content.entity.EntityCookieMonster;
import net.thep2wking.weirdthings.content.entity.EntityCowVillager;
import net.thep2wking.weirdthings.content.entity.EntityCreeperChicken;
import net.thep2wking.weirdthings.content.entity.EntityCrossyRoadChicken;
import net.thep2wking.weirdthings.content.entity.EntityCrueatus;
import net.thep2wking.weirdthings.content.entity.EntityDirtChicken;
import net.thep2wking.weirdthings.content.entity.EntityDirtGolem;
import net.thep2wking.weirdthings.content.entity.EntityEnderVillager;
import net.thep2wking.weirdthings.content.entity.EntityEndermanChicken;
import net.thep2wking.weirdthings.content.entity.EntityFatChicken;
import net.thep2wking.weirdthings.content.entity.EntityFlowerPig;
import net.thep2wking.weirdthings.content.entity.EntityFlyingPig;
import net.thep2wking.weirdthings.content.entity.EntityFlyingSlime;
import net.thep2wking.weirdthings.content.entity.EntityFlyingSquid;
import net.thep2wking.weirdthings.content.entity.EntityHotdog;
import net.thep2wking.weirdthings.content.entity.EntityPigVillager;
import net.thep2wking.weirdthings.content.entity.EntityPotionstormWitch;
import net.thep2wking.weirdthings.content.entity.EntityRainbowVillager;
import net.thep2wking.weirdthings.content.entity.EntityRapig;
import net.thep2wking.weirdthings.content.entity.EntitySkelepig;
import net.thep2wking.weirdthings.content.entity.EntitySlimySheep;
import net.thep2wking.weirdthings.content.entity.EntitySquidBlaze;
import net.thep2wking.weirdthings.content.entity.EntitySquidGhast;
import net.thep2wking.weirdthings.content.entity.EntityTNTCreeper;
import net.thep2wking.weirdthings.content.entity.EntityVeryWeirdPig;
import net.thep2wking.weirdthings.content.entity.EntityVillagerBlaze;
import net.thep2wking.weirdthings.content.entity.EntityVillagerChicken;
import net.thep2wking.weirdthings.content.entity.EntityVillagerDragon;
import net.thep2wking.weirdthings.content.entity.EntityVillagerGhast;
import net.thep2wking.weirdthings.content.entity.EntityVillagerPig;
import net.thep2wking.weirdthings.content.entity.EntityVillagerSpider;
import net.thep2wking.weirdthings.content.entity.EntityVillagerWither;
import net.thep2wking.weirdthings.content.entity.misc.EntityMegaTNT;
import net.thep2wking.weirdthings.content.entity.misc.EntityRainbowEgg;
import net.thep2wking.weirdthings.content.entity.misc.EntityThrowableVillager;

public class ModEntities {
	public static void registerEntities() {
		ModLogger.registeredEntitiesLogger(WeirdThings.MODID);

		int id = 0; 
		ModRegistryHelper.registerEntity(WeirdThings.MODID, "throwable_villager", WeirdThings.INSTANCE, id++, EntityThrowableVillager.class, 64, 10, true);
		ModRegistryHelper.registerEntity(WeirdThings.MODID, "rainbow_egg", WeirdThings.INSTANCE, id++, EntityRainbowEgg.class, 64, 10, true);
		ModRegistryHelper.registerEntity(WeirdThings.MODID, "mega_tnt", WeirdThings.INSTANCE, id++, EntityMegaTNT.class, 160, 10, true);

		ModRegistryHelper.registerEntityWithSpawnEgg(WeirdThings.MODID, "cookie_monster", WeirdThings.INSTANCE, id++, EntityCookieMonster.class, 80, 3, false, 0x252f6d, 0x0e1322);
		ModRegistryHelper.registerEntitySpawn(EntityCookieMonster.class, EnumCreatureType.MONSTER, 12, 1, 4, WeirdThingsConfig.MOBS.COOKIE_MONSTER, ModBiomeUtil.getBiomesWithMonsters(EntityZombie.class));
		
		ModRegistryHelper.registerEntityWithSpawnEgg(WeirdThings.MODID, "cookie_connoisseur", WeirdThings.INSTANCE, id++, EntityCookieConnoisseur.class, 80, 3, false, 0xd38636, 0x910000);
		// ModRegistryHelper.registerEntitySpawn(EntityCookieConnoisseur.class, EnumCreatureType.CREATURE, 10, 1, 2, WeirdThingsConfig.MOBS.COOKIE_CONNOISSEUR, ModBiomes.COOKIE);

		ModRegistryHelper.registerEntityWithSpawnEgg(WeirdThings.MODID, "arrowstorm_skeleton", WeirdThings.INSTANCE, id++, EntityArrowstormSkeleton.class, 80, 3, false, 0xc1c1c1, 0xa42a00);
		ModRegistryHelper.registerEntitySpawn(EntityArrowstormSkeleton.class, EnumCreatureType.MONSTER, 8, 1, 2, WeirdThingsConfig.MOBS.ARROWSTORM_SKELETON, ModBiomeUtil.getBiomesWithMonsters(EntitySkeleton.class));

		ModRegistryHelper.registerEntityWithSpawnEgg(WeirdThings.MODID, "armed_creeper", WeirdThings.INSTANCE, id++, EntityArmedCreeper.class, 80, 3, false, 0x0da70b, 0x494949);
		ModRegistryHelper.registerEntitySpawn(EntityArmedCreeper.class, EnumCreatureType.MONSTER, 10, 1, 3, WeirdThingsConfig.MOBS.ARMED_CREEPER, ModBiomeUtil.getBiomesWithMonsters(EntityCreeper.class));

		ModRegistryHelper.registerEntityWithSpawnEgg(WeirdThings.MODID, "creeper_chicken", WeirdThings.INSTANCE, id++, EntityCreeperChicken.class, 80, 3, false, 0x0da70b, 0xa1a1a1);
		ModRegistryHelper.registerEntitySpawn(EntityCreeperChicken.class, EnumCreatureType.MONSTER, 10, 1, 4, WeirdThingsConfig.MOBS.CREEPER_CHICKEN, ModBiomeUtil.getBiomesWithMonsters(EntityCreeper.class));

		ModRegistryHelper.registerEntityWithSpawnEgg(WeirdThings.MODID, "ender_villager", WeirdThings.INSTANCE, id++, EntityEnderVillager.class, 80, 3, false, 0x161616, 0xbd8b72);
		ModRegistryHelper.registerEntitySpawn(EntityEnderVillager.class, EnumCreatureType.MONSTER, 8, 1, 2, WeirdThingsConfig.MOBS.ENDER_VILLAGER, ModBiomeUtil.getBiomesWithMonsters(EntityEnderman.class));

		ModRegistryHelper.registerEntityWithSpawnEgg(WeirdThings.MODID, "villager_blaze", WeirdThings.INSTANCE, id++, EntityVillagerBlaze.class, 80, 3, false, 0xf6b201, 0xbd8b72);
		ModRegistryHelper.registerEntitySpawn(EntityVillagerBlaze.class, EnumCreatureType.MONSTER, 10, 1, 3, WeirdThingsConfig.MOBS.VILLAGER_BLAZE, ModBiomeUtil.getBiomesWithMonsters(EntityPigZombie.class));

		ModRegistryHelper.registerEntityWithSpawnEgg(WeirdThings.MODID, "villager_ghast", WeirdThings.INSTANCE, id++, EntityVillagerGhast.class, 80, 3, false, 0xf9f9f9, 0xbd8b72);
		ModRegistryHelper.registerEntitySpawn(EntityVillagerGhast.class, EnumCreatureType.MONSTER, 10, 1, 2, WeirdThingsConfig.MOBS.VILLAGER_GHAST, ModBiomeUtil.getBiomesWithMonsters(EntityGhast.class));

		ModRegistryHelper.registerEntityWithSpawnEgg(WeirdThings.MODID, "villager_chicken", WeirdThings.INSTANCE, id++, EntityVillagerChicken.class, 80, 3, false, 0xa1a1a1, 0xbd8b72);
		ModRegistryHelper.registerEntitySpawn(EntityVillagerChicken.class, EnumCreatureType.CREATURE, 10, 1, 3, WeirdThingsConfig.MOBS.VILLAGER_CHICKEN, ModBiomeUtil.getBiomesWithMonsters(EntityChicken.class));

		ModRegistryHelper.registerEntityWithSpawnEgg(WeirdThings.MODID, "fat_chicken", WeirdThings.INSTANCE, id++, EntityFatChicken.class, 80, 3, false, 0x7a7a7a, 0xc90000);
		ModRegistryHelper.registerEntitySpawn(EntityFatChicken.class, EnumCreatureType.CREATURE, 10, 1, 4, WeirdThingsConfig.MOBS.FAT_CHICKEN, ModBiomeUtil.getBiomesWithCreatures(EntityChicken.class));

		ModRegistryHelper.registerEntityWithSpawnEgg(WeirdThings.MODID, "crossy_road_chicken", WeirdThings.INSTANCE, id++, EntityCrossyRoadChicken.class, 80, 3, false, 0xffffff, 0xff8067);
		// ModRegistryHelper.registerEntitySpawn(EntityCrossyRoadChicken.class, EnumCreatureType.CREATURE, 8, 1, 2, WeirdThingsConfig.MOBS.CROSSY_ROAD_CHICKEN, ModBiomeUtil.getBiomesWithCreatures(EntityChicken.class));

		ModRegistryHelper.registerEntityWithSpawnEgg(WeirdThings.MODID, "villager_wither", WeirdThings.INSTANCE, id++, EntityVillagerWither.class, 80, 3, false, 0x283c54, 0xbd8b72);
		ModRegistryHelper.registerEntityWithSpawnEgg(WeirdThings.MODID, "villager_dragon", WeirdThings.INSTANCE, id++, EntityVillagerDragon.class, 80, 3, false, 0x563c33, 0xe079fa);

		ModRegistryHelper.registerEntityWithSpawnEgg(WeirdThings.MODID, "hotdog", WeirdThings.INSTANCE, id++, EntityHotdog.class, 80, 3, false, 0x7f3300, 0xdf9e59);
		ModRegistryHelper.registerEntitySpawn(EntityHotdog.class, EnumCreatureType.CREATURE, 10, 1, 4, WeirdThingsConfig.MOBS.HOTDOG, ModBiomeUtil.getBiomesWithCreatures(EntityWolf.class));

		ModRegistryHelper.registerEntityWithSpawnEgg(WeirdThings.MODID, "dirt_chicken", WeirdThings.INSTANCE, id++, EntityDirtChicken.class, 80, 3, false, 0xa1a1a1, 0x7e593d);
		// ModRegistryHelper.registerEntitySpawn(EntityDirtChicken.class, EnumCreatureType.CREATURE, 10, 1, 4, WeirdThingsConfig.MOBS.DIRT_CHICKEN, ModBiomes.CHICKEN);

		ModRegistryHelper.registerEntityWithSpawnEgg(WeirdThings.MODID, "dirt_golem", WeirdThings.INSTANCE, id++, EntityDirtGolem.class, 80, 3, false, 0xdbcdc2, 0x7e593d);
		// ModRegistryHelper.registerEntitySpawn(EntityDirtGolem.class, EnumCreatureType.CREATURE, 8, 1, 1, WeirdThingsConfig.MOBS.DIRT_GOLEM, ModBiomes.CHICKEN);

		ModRegistryHelper.registerEntityWithSpawnEgg(WeirdThings.MODID, "continuously_turning_pig", WeirdThings.INSTANCE, id++, EntityContinuouslyTurningPig.class, 80, 3, false, 0xdb635f, 0xf0a5a2);
		ModRegistryHelper.registerEntitySpawn(EntityContinuouslyTurningPig.class, EnumCreatureType.CREATURE, 10, 1, 3, WeirdThingsConfig.MOBS.CONTINUOUSLY_TURNING_PIG, ModBiomeUtil.getBiomesWithCreatures(EntityPig.class));

		ModRegistryHelper.registerEntityWithSpawnEgg(WeirdThings.MODID, "very_weird_pig", WeirdThings.INSTANCE, id++, EntityVeryWeirdPig.class, 80, 3, false, 0xf0a5a2, 0xf13d39);
		ModRegistryHelper.registerEntitySpawn(EntityVeryWeirdPig.class, EnumCreatureType.CREATURE, 10, 1, 3, WeirdThingsConfig.MOBS.VERY_WEIRD_PIG, ModBiomeUtil.getBiomesWithCreatures(EntityPig.class));

		ModRegistryHelper.registerEntityWithSpawnEgg(WeirdThings.MODID, "chickow", WeirdThings.INSTANCE, id++, EntityChickow.class, 80, 3, false, 0x443626, 0xff0000);
		ModRegistryHelper.registerEntitySpawn(EntityChickow.class, EnumCreatureType.CREATURE, 10, 1, 3, WeirdThingsConfig.MOBS.CHICKOW, ModBiomeUtil.getBiomesWithCreatures(EntityCow.class));

		ModRegistryHelper.registerEntityWithSpawnEgg(WeirdThings.MODID, "rapig", WeirdThings.INSTANCE, id++, EntityRapig.class, 80, 3, false, 0xf0a5a2, 0x734831);
		ModRegistryHelper.registerEntitySpawn(EntityRapig.class, EnumCreatureType.CREATURE, 8, 1, 3, WeirdThingsConfig.MOBS.RAPIG, ModBiomeUtil.getBiomesWithCreatures(EntityRabbit.class));

		ModRegistryHelper.registerEntityWithSpawnEgg(WeirdThings.MODID, "skelepig", WeirdThings.INSTANCE, id++, EntitySkelepig.class, 80, 3, false, 0xf0a5a2, 0x494949);
		ModRegistryHelper.registerEntitySpawn(EntitySkelepig.class, EnumCreatureType.MONSTER, 10, 1, 3, WeirdThingsConfig.MOBS.SKELEPIG, ModBiomeUtil.getBiomesWithMonsters(EntitySkeleton.class));

		ModRegistryHelper.registerEntityWithSpawnEgg(WeirdThings.MODID, "villager_pig", WeirdThings.INSTANCE, id++, EntityVillagerPig.class, 80, 3, false, 0xf0a5a2, 0xbd8b72);
		ModRegistryHelper.registerEntitySpawn(EntityVillagerPig.class, EnumCreatureType.CREATURE, 8, 1, 3, WeirdThingsConfig.MOBS.VILLAGER_PIG, ModBiomeUtil.getBiomesWithCreatures(EntityPig.class));

		ModRegistryHelper.registerEntityWithSpawnEgg(WeirdThings.MODID, "pig_villager", WeirdThings.INSTANCE, id++, EntityPigVillager.class, 80, 3, false, 0x563c33, 0xdb635f);
		// ModRegistryHelper.registerEntitySpawn(EntityPigVillager.class, EnumCreatureType.CREATURE, 10, 1, 3, WeirdThingsConfig.MOBS.PIG_VILLAGER, ModBiomeUtil.getBiomesWithCreatures(EntityPig.class));

		ModRegistryHelper.registerEntityWithSpawnEgg(WeirdThings.MODID, "cow_villager", WeirdThings.INSTANCE, id++, EntityCowVillager.class, 80, 3, false, 0x563c33, 0xa1a1a1);
		// ModRegistryHelper.registerEntitySpawn(EntityCowVillager.class, EnumCreatureType.CREATURE, 10, 1, 3, WeirdThingsConfig.MOBS.COW_VILLAGER, ModBiomeUtil.getBiomesWithCreatures(EntityCow.class));

		ModRegistryHelper.registerEntityWithSpawnEgg(WeirdThings.MODID, "potionstorm_witch", WeirdThings.INSTANCE, id++, EntityPotionstormWitch.class, 80, 3, false, 0xa83131, 0x933f00);
		ModRegistryHelper.registerEntitySpawn(EntityPotionstormWitch.class, EnumCreatureType.MONSTER, 5, 1, 2, WeirdThingsConfig.MOBS.POTIONSTORM_WITCH, ModBiomeUtil.getBiomesWithMonsters(EntityWitch.class));

		ModRegistryHelper.registerEntityWithSpawnEgg(WeirdThings.MODID, "flower_pig", WeirdThings.INSTANCE, id++, EntityFlowerPig.class, 80, 3, false, 0xf0a5a2, 0xfcfc00);
		ModRegistryHelper.registerEntitySpawn(EntityFlowerPig.class, EnumCreatureType.CREATURE, 10, 1, 3, WeirdThingsConfig.MOBS.FLOWER_PIG, ModBiomeUtil.getBiomesWithCreatures(EntityPig.class));

		ModRegistryHelper.registerEntityWithSpawnEgg(WeirdThings.MODID, "squid_ghast", WeirdThings.INSTANCE, id++, EntitySquidGhast.class, 80, 3, false, 0x223b4d, 0xbcbcbc);
		ModRegistryHelper.registerEntitySpawn(EntitySquidGhast.class, EnumCreatureType.MONSTER, 10, 1, 2, WeirdThingsConfig.MOBS.SQUID_GHAST, ModBiomeUtil.getBiomesWithMonsters(EntityGhast.class));

		ModRegistryHelper.registerEntityWithSpawnEgg(WeirdThings.MODID, "chicken_ghast", WeirdThings.INSTANCE, id++, EntityChickenGhast.class, 80, 3, false, 0xa1a1a1, 0xbcbcbc);
		ModRegistryHelper.registerEntitySpawn(EntityChickenGhast.class, EnumCreatureType.MONSTER, 10, 1, 2, WeirdThingsConfig.MOBS.CHICKEN_GHAST, ModBiomeUtil.getBiomesWithMonsters(EntityGhast.class));

		ModRegistryHelper.registerEntityWithSpawnEgg(WeirdThings.MODID, "enderman_chicken", WeirdThings.INSTANCE, id++, EntityEndermanChicken.class, 80, 3, false, 0x161616, 0xff0000);
		ModRegistryHelper.registerEntitySpawn(EntityEndermanChicken.class, EnumCreatureType.MONSTER, 8, 1, 3, WeirdThingsConfig.MOBS.ENDERMAN_CHICKEN, ModBiomeUtil.getBiomesWithMonsters(EntityEnderman.class));

		ModRegistryHelper.registerEntityWithSpawnEgg(WeirdThings.MODID, "battle_sheep", WeirdThings.INSTANCE, id++, EntityBattleSheep.class, 80, 3, false, 0x000000, 0xffb5b5);
		ModRegistryHelper.registerEntitySpawn(EntityBattleSheep.class, EnumCreatureType.MONSTER, 5, 1, 2, WeirdThingsConfig.MOBS.BATTLE_SHEEP, ModBiomeUtil.getBiomesWithMonsters(EntityPigZombie.class));

		ModRegistryHelper.registerEntityWithSpawnEgg(WeirdThings.MODID, "squid_blaze", WeirdThings.INSTANCE, id++, EntitySquidBlaze.class, 80, 3, false, 0xf6b201, 0x223b4d);
		ModRegistryHelper.registerEntitySpawn(EntitySquidBlaze.class, EnumCreatureType.MONSTER, 10, 1, 3, WeirdThingsConfig.MOBS.SQUID_BLAZE, ModBiomeUtil.getBiomesWithMonsters(EntityPigZombie.class));

		ModRegistryHelper.registerEntityWithSpawnEgg(WeirdThings.MODID, "crueatus", WeirdThings.INSTANCE, id++, EntityCrueatus.class, 80, 3, false, 0xffd800, 0x0094ff);
		// ModRegistryHelper.registerEntitySpawn(EntityCrueatus.class, EnumCreatureType.MONSTER, 8, 1, 4, WeirdThingsConfig.MOBS.CRUEATUS, ModBiomes.CHICKEN);

		ModRegistryHelper.registerEntityWithSpawnEgg(WeirdThings.MODID, "villager_spider", WeirdThings.INSTANCE, id++, EntityVillagerSpider.class, 80, 3, false, 0x342d27, 0xbd8b72);
		ModRegistryHelper.registerEntitySpawn(EntityVillagerSpider.class, EnumCreatureType.MONSTER, 10, 1, 3, WeirdThingsConfig.MOBS.VILLAGER_SPIDER, ModBiomeUtil.getBiomesWithMonsters(EntitySpider.class));

		ModRegistryHelper.registerEntityWithSpawnEgg(WeirdThings.MODID, "tnt_creeper", WeirdThings.INSTANCE, id++, EntityTNTCreeper.class, 80, 3, false, 0x0da70b, 0xc13c17);
		ModRegistryHelper.registerEntitySpawn(EntityTNTCreeper.class, EnumCreatureType.MONSTER, 8, 1, 3, WeirdThingsConfig.MOBS.TNT_CREEPER, ModBiomeUtil.getBiomesWithMonsters(EntityCreeper.class));

		ModRegistryHelper.registerEntityWithSpawnEgg(WeirdThings.MODID, "rainbow_villager", WeirdThings.INSTANCE, id++, EntityRainbowVillager.class, 80, 3, false, 0x563c33, 0xb5677a);
		// ModRegistryHelper.registerEntitySpawn(EntityRainbowVillager.class, EnumCreatureType.CREATURE, 5, 1, 4, WeirdThingsConfig.MOBS.RAINBOW_VILLAGER, new Biome[] { Biomes.ROOFED_FOREST, Biomes.MUTATED_ROOFED_FOREST, Biomes.MUTATED_FOREST });

		ModRegistryHelper.registerEntityWithSpawnEgg(WeirdThings.MODID, "flying_pig", WeirdThings.INSTANCE, id++, EntityFlyingPig.class, 80, 3, false, 0x4b3e2f, 0xd3625d);
		ModRegistryHelper.registerEntitySpawn(EntityFlyingPig.class, EnumCreatureType.AMBIENT, 8, 1, 2, WeirdThingsConfig.MOBS.FLYING_PIG, ModBiomeUtil.getBiomesWithAmbientCreatures(EntityBat.class));

		ModRegistryHelper.registerEntityWithSpawnEgg(WeirdThings.MODID, "flying_squid", WeirdThings.INSTANCE, id++, EntityFlyingSquid.class, 80, 3, false, 0x4b3e2f, 0x73889a);
		ModRegistryHelper.registerEntitySpawn(EntityFlyingSquid.class, EnumCreatureType.AMBIENT, 8, 1, 2, WeirdThingsConfig.MOBS.FLYING_SQUID, ModBiomeUtil.getBiomesWithAmbientCreatures(EntityBat.class));

		ModRegistryHelper.registerEntityWithSpawnEgg(WeirdThings.MODID, "flying_slime", WeirdThings.INSTANCE, id++, EntityFlyingSlime.class, 80, 3, false, 0x4b3e2f, 0x85bf6a);
		ModRegistryHelper.registerEntitySpawn(EntityFlyingSlime.class, EnumCreatureType.AMBIENT, 8, 1, 2, WeirdThingsConfig.MOBS.FLYING_SLIME, ModBiomeUtil.getBiomesWithAmbientCreatures(EntityBat.class));

		ModRegistryHelper.registerEntityWithSpawnEgg(WeirdThings.MODID, "slimy_sheep", WeirdThings.INSTANCE, id++, EntitySlimySheep.class, 80, 3, false, 0x5ba037, 0xf9b5b4);
		ModRegistryHelper.registerEntitySpawn(EntitySlimySheep.class, EnumCreatureType.CREATURE, 5, 1, 3, WeirdThingsConfig.MOBS.SLIMY_SHEEP, Biomes.SWAMPLAND);
	}
}