package net.thep2wking.weirdthings.integration.jer;

import jeresources.api.conditionals.LightLevel;
import jeresources.api.drop.LootDrop;
import jeresources.api.restrictions.DimensionRestriction;
import jeresources.api.restrictions.Restriction;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.thep2wking.oedldoedlcore.api.integration.JERPlugin;
import net.thep2wking.oedldoedlcore.api.integration.ModJERPluginBase;
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
import net.thep2wking.weirdthings.content.entity.EntityWitherGirl;
import net.thep2wking.weirdthings.init.ModBlocks;
import net.thep2wking.weirdthings.init.ModItems;

@JERPlugin
public class WeirdThingsJERPlugin extends ModJERPluginBase {
	@Override
	public String getModId() {
		return WeirdThings.MODID;
	}

	@Override
	public void register() {
		if (WeirdThingsConfig.INTEGRATION.JER_INTEGRATION) {
			addMob(new EntityArmedCreeper(getWorld()), LightLevel.hostile, EntityArmedCreeper.EXPERIENCE_VALUE, EntityArmedCreeper.LOOT_TABLE);
			addMob(new EntityArrowstormSkeleton(getWorld()), LightLevel.hostile, EntityArrowstormSkeleton.EXPERIENCE_VALUE, EntityArrowstormSkeleton.LOOT_TABLE);
			addMob(new EntityBattleSheep(getWorld()), LightLevel.hostile, EntityBattleSheep.EXPERIENCE_VALUE, EntityBattleSheep.LOOT_TABLE);
			addMob(new EntityChickenGhast(getWorld()), LightLevel.hostile, EntityChickenGhast.EXPERIENCE_VALUE, EntityChickenGhast.LOOT_TABLE);
			addMob(new EntityChickow(getWorld()), LightLevel.any, EntityChickow.EXPERIENCE_VALUE, EntityChickow.LOOT_TABLE);
			addMob(new EntityContinuouslyTurningPig(getWorld()), LightLevel.any, EntityContinuouslyTurningPig.EXPERIENCE_VALUE, EntityContinuouslyTurningPig.LOOT_TABLE);
			addMob(new EntityCookieMonster(getWorld()), LightLevel.hostile, EntityCookieMonster.EXPERIENCE_VALUE, EntityCookieMonster.LOOT_TABLE);
			addMob(new EntityCookieConnoisseur(getWorld()), LightLevel.any, EntityCookieConnoisseur.EXPERIENCE_VALUE, EntityCookieConnoisseur.LOOT_TABLE);
			addMob(new EntityCowVillager(getWorld()), LightLevel.any, EntityCowVillager.EXPERIENCE_VALUE, EntityCowVillager.LOOT_TABLE);
			addMob(new EntityCreeperChicken(getWorld()), LightLevel.hostile, EntityCreeperChicken.EXPERIENCE_VALUE, EntityCreeperChicken.LOOT_TABLE);
			addMob(new EntityCrossyRoadChicken(getWorld()), LightLevel.any, EntityCrossyRoadChicken.EXPERIENCE_VALUE, EntityCrossyRoadChicken.LOOT_TABLE);
			addMob(new EntityCrueatus(getWorld()), LightLevel.any, EntityCrueatus.EXPERIENCE_VALUE, EntityCrueatus.LOOT_TABLE);
			addMob(new EntityDirtChicken(getWorld()), LightLevel.any, EntityDirtChicken.EXPERIENCE_VALUE, EntityDirtChicken.LOOT_TABLE);
			addMob(new EntityDirtGolem(getWorld()), LightLevel.any, EntityDirtGolem.EXPERIENCE_VALUE, EntityDirtGolem.LOOT_TABLE);
			addMob(new EntityEndermanChicken(getWorld()), LightLevel.hostile, EntityEndermanChicken.EXPERIENCE_VALUE, EntityEndermanChicken.LOOT_TABLE);
			addMob(new EntityEnderVillager(getWorld()), LightLevel.hostile, EntityEnderVillager.EXPERIENCE_VALUE, EntityEnderVillager.LOOT_TABLE);
			addMob(new EntityFatChicken(getWorld()), LightLevel.any, EntityFatChicken.EXPERIENCE_VALUE, EntityFatChicken.LOOT_TABLE);
			addMob(new EntityFlowerPig(getWorld()), LightLevel.any, EntityFlowerPig.EXPERIENCE_VALUE, EntityFlowerPig.LOOT_TABLE);
			addMob(new EntityFlyingPig(getWorld()), LightLevel.bat, EntityFlyingPig.EXPERIENCE_VALUE, EntityFlyingPig.LOOT_TABLE);
			addMob(new EntityFlyingSquid(getWorld()), LightLevel.bat, EntityFlyingSquid.EXPERIENCE_VALUE, EntityFlyingSquid.LOOT_TABLE);
			addMob(new EntityFlyingSlime(getWorld()), LightLevel.bat, EntityFlyingSlime.EXPERIENCE_VALUE, EntityFlyingSlime.LOOT_TABLE);
			addMob(new EntityHotdog(getWorld()), LightLevel.any, EntityHotdog.EXPERIENCE_VALUE, EntityHotdog.LOOT_TABLE);
			addMob(new EntityPigVillager(getWorld()), LightLevel.any, EntityPigVillager.EXPERIENCE_VALUE, EntityPigVillager.LOOT_TABLE);
			addMob(new EntityPotionstormWitch(getWorld()), LightLevel.hostile, EntityPotionstormWitch.EXPERIENCE_VALUE, EntityPotionstormWitch.LOOT_TABLE);
			addMob(new EntityRainbowVillager(getWorld()), LightLevel.any, EntityRainbowVillager.EXPERIENCE_VALUE, EntityRainbowVillager.LOOT_TABLE);
			addMob(new EntityRapig(getWorld()), LightLevel.any, EntityRapig.EXPERIENCE_VALUE, EntityRapig.LOOT_TABLE);
			addMob(new EntitySkelepig(getWorld()), LightLevel.hostile, EntitySkelepig.EXPERIENCE_VALUE, EntitySkelepig.LOOT_TABLE);
			addMob(new EntitySlimySheep(getWorld()), LightLevel.any, EntitySlimySheep.EXPERIENCE_VALUE, EntitySlimySheep.LOOT_TABLE);
			addMob(new EntitySquidBlaze(getWorld()), LightLevel.blaze, EntitySquidBlaze.EXPERIENCE_VALUE, EntitySquidBlaze.LOOT_TABLE);
			addMob(new EntitySquidGhast(getWorld()), LightLevel.hostile, EntitySquidGhast.EXPERIENCE_VALUE, EntitySquidGhast.LOOT_TABLE);
			addMob(new EntityTNTCreeper(getWorld()), LightLevel.hostile, EntityTNTCreeper.EXPERIENCE_VALUE, EntityTNTCreeper.LOOT_TABLE);
			addMob(new EntityVeryWeirdPig(getWorld()), LightLevel.any, EntityVeryWeirdPig.EXPERIENCE_VALUE, EntityVeryWeirdPig.LOOT_TABLE);
			addMob(new EntityVillagerBlaze(getWorld()), LightLevel.blaze, EntityVillagerBlaze.EXPERIENCE_VALUE, EntityVillagerBlaze.LOOT_TABLE);
			addMob(new EntityVillagerChicken(getWorld()), LightLevel.any, EntityVillagerChicken.EXPERIENCE_VALUE, EntityVillagerChicken.LOOT_TABLE);
			addMob(new EntityVillagerDragon(getWorld()), LightLevel.any, EntityVillagerDragon.EXPERIENCE_VALUE, EntityVillagerDragon.LOOT_TABLE);
			addMob(new EntityVillagerGhast(getWorld()), LightLevel.hostile, EntityVillagerGhast.EXPERIENCE_VALUE, EntityVillagerGhast.LOOT_TABLE);
			addMob(new EntityVillagerPig(getWorld()), LightLevel.any, EntityVillagerPig.EXPERIENCE_VALUE, EntityVillagerPig.LOOT_TABLE);
			addMob(new EntityVillagerSpider(getWorld()), LightLevel.hostile, EntityVillagerSpider.EXPERIENCE_VALUE, EntityVillagerSpider.LOOT_TABLE);
			addMob(new EntityVillagerWither(getWorld()), LightLevel.any, EntityVillagerWither.EXPERIENCE_VALUE, EntityVillagerWither.LOOT_TABLE);
			addMob(new EntityWitherGirl(getWorld()), LightLevel.any, EntityWitherGirl.EXPERIENCE_VALUE, EntityWitherGirl.LOOT_TABLE);

			registerMobRenderHook(EntityFlyingPig.class, ModRenderHooks.FLYING_MOB);
			registerMobRenderHook(EntityFlyingSquid.class, ModRenderHooks.FLYING_MOB);
			registerMobRenderHook(EntityFlyingSlime.class, ModRenderHooks.FLYING_MOB);
			registerMobRenderHook(EntityVillagerDragon.class, ModRenderHooks.VILLAGER_DRAGON);
			registerMobRenderHook(EntityChickenGhast.class, ModRenderHooks.CHICKEN_GHAST);
			registerMobRenderHook(EntityFatChicken.class, ModRenderHooks.FAT_CHICKEN);
			registerMobRenderHook(EntityVeryWeirdPig.class, ModRenderHooks.VERY_WEIRD_PIG);
			registerMobRenderHook(EntityWitherGirl.class, ModRenderHooks.WITHER_GIRL);
			registerMobRenderHook(EntitySkelepig.class, ModRenderHooks.SKELEPIG);
			
			if (WeirdThingsConfig.WORLD.COOKIE_ORE) {
				addOreGen(ModBlocks.COOKIE_ORE, 9, 14, 48, 128 ,new LootDrop[] { 
					new LootDrop(new ItemStack(Items.COOKIE, 4, 0)) });
			}
			if (WeirdThingsConfig.WORLD.RUBY_ORE) {
				addOreGen(ModBlocks.RUBY_ORE, 5, 4, 8, 24, new LootDrop[] { 
					new LootDrop(new ItemStack(ModItems.RUBY, 1, 0)) });
			}
			if (WeirdThingsConfig.WORLD.FIRE_ORE) {
				addOreGen(ModBlocks.FIRE_ORE, 4, 8, 1, 128, new Restriction(DimensionRestriction.NETHER), new LootDrop[] { 
					new LootDrop(new ItemStack(ModItems.FIRE, 1, 0)) });
			}
			if (WeirdThingsConfig.WORLD.RENDIUM_ORE) {
				addOreGen(ModBlocks.RENDIUM_ORE, 4, 7, 1, 128, new Restriction(DimensionRestriction.END), new LootDrop[] { 
					new LootDrop(new ItemStack(ModItems.RENDIUM, 1, 0)) });
			}
		}
	}
}