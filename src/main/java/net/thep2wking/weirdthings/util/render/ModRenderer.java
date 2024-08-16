package net.thep2wking.weirdthings.util.render;

import net.thep2wking.oedldoedlcore.util.ModRenderHelper;
import net.thep2wking.oedldoedlcore.util.ModTNTRenderer;
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
import net.thep2wking.weirdthings.content.entity.misc.EntityMegaTNT;
import net.thep2wking.weirdthings.content.entity.misc.EntityRainbowEgg;
import net.thep2wking.weirdthings.content.entity.misc.EntityThrowableVillager;
import net.thep2wking.weirdthings.init.ModBlocks;
import net.thep2wking.weirdthings.init.ModItems;
import net.thep2wking.weirdthings.util.render.armedcreeper.RenderArmedCreeper;
import net.thep2wking.weirdthings.util.render.arrowstormskeleton.RenderArrowstormSkeleton;
import net.thep2wking.weirdthings.util.render.battlesheep.RenderBattleSheep;
import net.thep2wking.weirdthings.util.render.chickenghast.RenderChickenGhast;
import net.thep2wking.weirdthings.util.render.chickow.RenderChickow;
import net.thep2wking.weirdthings.util.render.continuouslyturningpig.RenderContinuouslyTurningPig;
import net.thep2wking.weirdthings.util.render.cookieconnoisseur.RenderCookieConnoisseur;
import net.thep2wking.weirdthings.util.render.cookiemonster.RenderCookieMonster;
import net.thep2wking.weirdthings.util.render.cowvillager.RenderCowVillager;
import net.thep2wking.weirdthings.util.render.creeperchicken.RenderCreeperChicken;
import net.thep2wking.weirdthings.util.render.crossyroadchicken.RenderCrossyRoadChicken;
import net.thep2wking.weirdthings.util.render.crueatus.RenderCrueatus;
import net.thep2wking.weirdthings.util.render.dirtchicken.RenderDirtChicken;
import net.thep2wking.weirdthings.util.render.dirtgolem.RenderDirtGolem;
import net.thep2wking.weirdthings.util.render.endermanchicken.RenderEndermanChicken;
import net.thep2wking.weirdthings.util.render.endervillager.RenderEnderVillager;
import net.thep2wking.weirdthings.util.render.fatchicken.RenderFatChicken;
import net.thep2wking.weirdthings.util.render.flowerpig.RenderFlowerPig;
import net.thep2wking.weirdthings.util.render.flyingpig.RenderFlyingPig;
import net.thep2wking.weirdthings.util.render.flyingslime.RenderFlyingSlime;
import net.thep2wking.weirdthings.util.render.flyingsquid.RenderFlyingSquid;
import net.thep2wking.weirdthings.util.render.hotdog.RenderHotdog;
import net.thep2wking.weirdthings.util.render.pigvillager.RenderPigVillager;
import net.thep2wking.weirdthings.util.render.potionstormwitch.RenderPotionstormWitch;
import net.thep2wking.weirdthings.util.render.rainbowvillager.RenderRainbowVillager;
import net.thep2wking.weirdthings.util.render.rapig.RenderRapig;
import net.thep2wking.weirdthings.util.render.skelepig.RenderSkelepig;
import net.thep2wking.weirdthings.util.render.slimysheep.RenderSlimlySheep;
import net.thep2wking.weirdthings.util.render.squidblaze.RenderSquidBlaze;
import net.thep2wking.weirdthings.util.render.squidghast.RenderSquidGhast;
import net.thep2wking.weirdthings.util.render.tntcreeper.RenderTNTCreeper;
import net.thep2wking.weirdthings.util.render.veryweirdpig.RenderVeryWeirdPig;
import net.thep2wking.weirdthings.util.render.villagerblaze.RenderVillagerBlaze;
import net.thep2wking.weirdthings.util.render.villagerchicken.RenderVillagerChicken;
import net.thep2wking.weirdthings.util.render.villagerdragon.RenderVillagerDragon;
import net.thep2wking.weirdthings.util.render.villagerghast.RenderVillagerGhast;
import net.thep2wking.weirdthings.util.render.villagerpig.RenderVillagerPig;
import net.thep2wking.weirdthings.util.render.villagerspider.RenderVillagerSpider;
import net.thep2wking.weirdthings.util.render.villagerwither.RenderVillagerWither;
import net.thep2wking.weirdthings.util.render.withergirl.RenderWitherGirl;

public class ModRenderer {
	public static void registerRenderer() {
		ModRenderHelper.addThrowableRender(EntityThrowableVillager.class, ModItems.THROWABLE_VILLAGER);
		ModRenderHelper.addThrowableRender(EntityRainbowEgg.class, ModItems.RAINBOW_EGG);
		ModTNTRenderer.register(EntityMegaTNT.class, ModBlocks.MEGA_TNT);
	}
	
	public static void registerEntityRender() {
		ModRenderHelper.addEntityRender(EntityCookieMonster.class, RenderCookieMonster.FACTORY);
		ModRenderHelper.addEntityRender(EntityCookieConnoisseur.class, RenderCookieConnoisseur.FACTORY);
		ModRenderHelper.addEntityRender(EntityArrowstormSkeleton.class, RenderArrowstormSkeleton.FACTORY);
		ModRenderHelper.addEntityRender(EntityArmedCreeper.class, RenderArmedCreeper.FACTORY);
		ModRenderHelper.addEntityRender(EntityCreeperChicken.class, RenderCreeperChicken.FACTORY);
		ModRenderHelper.addEntityRender(EntityEnderVillager.class, RenderEnderVillager.FACTORY);
		ModRenderHelper.addEntityRender(EntityVillagerBlaze.class, RenderVillagerBlaze.FACTORY);
		ModRenderHelper.addEntityRender(EntityVillagerGhast.class, RenderVillagerGhast.FACTORY);
		ModRenderHelper.addEntityRender(EntityVillagerChicken.class, RenderVillagerChicken.FACTORY);
		ModRenderHelper.addEntityRender(EntityFatChicken.class, RenderFatChicken.FACTORY);
		ModRenderHelper.addEntityRender(EntityCrossyRoadChicken.class, RenderCrossyRoadChicken.FACTORY);
		ModRenderHelper.addEntityRender(EntityVillagerWither.class, RenderVillagerWither.FACTORY);
		ModRenderHelper.addEntityRender(EntityVillagerDragon.class, RenderVillagerDragon.FACTORY);
		ModRenderHelper.addEntityRender(EntityWitherGirl.class, RenderWitherGirl.FACTORY);
		ModRenderHelper.addEntityRender(EntityHotdog.class, RenderHotdog.FACTORY);
		ModRenderHelper.addEntityRender(EntityDirtChicken.class, RenderDirtChicken.FACTORY);
		ModRenderHelper.addEntityRender(EntityDirtGolem.class, RenderDirtGolem.FACTORY);
		ModRenderHelper.addEntityRender(EntityContinuouslyTurningPig.class, RenderContinuouslyTurningPig.FACTORY);
		ModRenderHelper.addEntityRender(EntityVeryWeirdPig.class, RenderVeryWeirdPig.FACTORY);
		ModRenderHelper.addEntityRender(EntityChickow.class, RenderChickow.FACTORY);
		ModRenderHelper.addEntityRender(EntityRapig.class, RenderRapig.FACTORY);
		ModRenderHelper.addEntityRender(EntitySkelepig.class, RenderSkelepig.FACTORY);
		ModRenderHelper.addEntityRender(EntityVillagerPig.class, RenderVillagerPig.FACTORY);
		ModRenderHelper.addEntityRender(EntityPigVillager.class, RenderPigVillager.FACTORY);
		ModRenderHelper.addEntityRender(EntityCowVillager.class, RenderCowVillager.FACTORY);
		ModRenderHelper.addEntityRender(EntityPotionstormWitch.class, RenderPotionstormWitch.FACTORY);
		ModRenderHelper.addEntityRender(EntityFlowerPig.class, RenderFlowerPig.FACTORY);
		ModRenderHelper.addEntityRender(EntitySquidGhast.class, RenderSquidGhast.FACTORY);
		ModRenderHelper.addEntityRender(EntityChickenGhast.class, RenderChickenGhast.FACTORY);
		ModRenderHelper.addEntityRender(EntityEndermanChicken.class, RenderEndermanChicken.FACTORY);
		ModRenderHelper.addEntityRender(EntityBattleSheep.class, RenderBattleSheep.FACTORY);
		ModRenderHelper.addEntityRender(EntitySquidBlaze.class, RenderSquidBlaze.FACTORY);
		ModRenderHelper.addEntityRender(EntityCrueatus.class, RenderCrueatus.FACTORY);
		ModRenderHelper.addEntityRender(EntityVillagerSpider.class, RenderVillagerSpider.FACTORY);
		ModRenderHelper.addEntityRender(EntityTNTCreeper.class, RenderTNTCreeper.FACTORY);
		ModRenderHelper.addEntityRender(EntityRainbowVillager.class, RenderRainbowVillager.FACTORY);
		ModRenderHelper.addEntityRender(EntityFlyingPig.class, RenderFlyingPig.FACTORY);
		ModRenderHelper.addEntityRender(EntityFlyingSquid.class, RenderFlyingSquid.FACTORY);
		ModRenderHelper.addEntityRender(EntityFlyingSlime.class, RenderFlyingSlime.FACTORY);
		ModRenderHelper.addEntityRender(EntitySlimySheep.class, RenderSlimlySheep.FACTORY);
	}
}