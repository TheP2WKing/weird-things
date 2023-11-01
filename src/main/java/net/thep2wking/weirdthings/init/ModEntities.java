package net.thep2wking.weirdthings.init;

import net.thep2wking.reloadedlib.util.ModRegistryHelper;
import net.thep2wking.weirdthings.WeirdThings;
import net.thep2wking.weirdthings.content.entity.EntityArmedCreeper;
import net.thep2wking.weirdthings.content.entity.EntityArrowstormSkeleton;
import net.thep2wking.weirdthings.content.entity.EntityContinuouslyTurningPig;
import net.thep2wking.weirdthings.content.entity.EntityCookieMonster;
import net.thep2wking.weirdthings.content.entity.EntityCreeperChicken;
import net.thep2wking.weirdthings.content.entity.EntityCrossyRoadChicken;
import net.thep2wking.weirdthings.content.entity.EntityDirtChicken;
import net.thep2wking.weirdthings.content.entity.EntityDirtGolem;
import net.thep2wking.weirdthings.content.entity.EntityEnderVillager;
import net.thep2wking.weirdthings.content.entity.EntityFatChicken;
import net.thep2wking.weirdthings.content.entity.EntityHotdog;
import net.thep2wking.weirdthings.content.entity.EntityVeryWeirdPig;
import net.thep2wking.weirdthings.content.entity.EntityVillagerBlaze;
import net.thep2wking.weirdthings.content.entity.EntityVillagerChicken;
import net.thep2wking.weirdthings.content.entity.EntityVillagerDragon;
import net.thep2wking.weirdthings.content.entity.EntityVillagerGhast;
import net.thep2wking.weirdthings.content.entity.EntityVillagerWither;
import net.thep2wking.weirdthings.content.entity.EntityWitherGirl;

public class ModEntities {
	public static void registerEntities() {
		int id = 0;
		ModRegistryHelper.registerEntityWithSpawnEgg(WeirdThings.MODID, "cookie_monster", WeirdThings.INSTANCE, id++, EntityCookieMonster.class, 80, 3, false, 0x252f6d, 0x0e1322);
		ModRegistryHelper.registerEntityWithSpawnEgg(WeirdThings.MODID, "arrowstorm_skeleton", WeirdThings.INSTANCE, id++, EntityArrowstormSkeleton.class, 80, 3, false, 0xc1c1c1, 0xa42a00);
		ModRegistryHelper.registerEntityWithSpawnEgg(WeirdThings.MODID, "armed_creeper", WeirdThings.INSTANCE, id++, EntityArmedCreeper.class, 80, 3, false, 0x0da70b, 0x494949);
		ModRegistryHelper.registerEntityWithSpawnEgg(WeirdThings.MODID, "creeper_chicken", WeirdThings.INSTANCE, id++, EntityCreeperChicken.class, 80, 3, false, 0x0da70b, 0xa1a1a1);
		ModRegistryHelper.registerEntityWithSpawnEgg(WeirdThings.MODID, "ender_villager", WeirdThings.INSTANCE, id++, EntityEnderVillager.class, 80, 3, false, 0x161616, 0xbd8b72);
		ModRegistryHelper.registerEntityWithSpawnEgg(WeirdThings.MODID, "villager_blaze", WeirdThings.INSTANCE, id++, EntityVillagerBlaze.class, 80, 3, false, 0xf6b201, 0xbd8b72);
		ModRegistryHelper.registerEntityWithSpawnEgg(WeirdThings.MODID, "villager_ghast", WeirdThings.INSTANCE, id++, EntityVillagerGhast.class, 80, 3, false, 0xf9f9f9, 0xbd8b72);
		ModRegistryHelper.registerEntityWithSpawnEgg(WeirdThings.MODID, "villager_chicken", WeirdThings.INSTANCE, id++, EntityVillagerChicken.class, 80, 3, false, 0xa1a1a1, 0xbd8b72);
		ModRegistryHelper.registerEntityWithSpawnEgg(WeirdThings.MODID, "fat_chicken", WeirdThings.INSTANCE, id++, EntityFatChicken.class, 80, 3, false, 0x7a7a7a, 0xc90000);
		ModRegistryHelper.registerEntityWithSpawnEgg(WeirdThings.MODID, "crossy_road_chicken", WeirdThings.INSTANCE, id++, EntityCrossyRoadChicken.class, 80, 3, false, 0xffffff, 0xff8067);
		ModRegistryHelper.registerEntityWithSpawnEgg(WeirdThings.MODID, "villager_wither", WeirdThings.INSTANCE, id++, EntityVillagerWither.class, 80, 3, false, 0x283c54, 0xbd8b72);
		ModRegistryHelper.registerEntityWithSpawnEgg(WeirdThings.MODID, "villager_dragon", WeirdThings.INSTANCE, id++, EntityVillagerDragon.class, 80, 3, false, 0x563c33, 0xe079fa);
		ModRegistryHelper.registerEntityWithSpawnEgg(WeirdThings.MODID, "wither_girl", WeirdThings.INSTANCE, id++, EntityWitherGirl.class, 80, 3, false, 0xffdac7, 0x5a4e4c);
		ModRegistryHelper.registerEntityWithSpawnEgg(WeirdThings.MODID, "hotdog", WeirdThings.INSTANCE, id++, EntityHotdog.class, 80, 3, false, 0x7f3300, 0xdf9e59);
		ModRegistryHelper.registerEntityWithSpawnEgg(WeirdThings.MODID, "dirt_chicken", WeirdThings.INSTANCE, id++, EntityDirtChicken.class, 80, 3, false, 0xa1a1a1, 0x7e593d);
		ModRegistryHelper.registerEntityWithSpawnEgg(WeirdThings.MODID, "dirt_golem", WeirdThings.INSTANCE, id++, EntityDirtGolem.class, 80, 3, false, 0xdbcdc2, 0x7e593d);
		ModRegistryHelper.registerEntityWithSpawnEgg(WeirdThings.MODID, "continuously_turning_pig", WeirdThings.INSTANCE, id++, EntityContinuouslyTurningPig.class, 80, 3, false, 0xdb635f, 0xf0a5a2);
		ModRegistryHelper.registerEntityWithSpawnEgg(WeirdThings.MODID, "very_weird_pig", WeirdThings.INSTANCE, id++, EntityVeryWeirdPig.class, 80, 3, false, 0xf0a5a2, 0xf13d39);
	}
}