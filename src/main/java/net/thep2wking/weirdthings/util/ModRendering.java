package net.thep2wking.weirdthings.util;

import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
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
import net.thep2wking.weirdthings.util.render.RenderArmedCreeper;
import net.thep2wking.weirdthings.util.render.RenderArrowstormSkeleton;
import net.thep2wking.weirdthings.util.render.RenderContinuouslyTurningPig;
import net.thep2wking.weirdthings.util.render.RenderCookieMonster;
import net.thep2wking.weirdthings.util.render.RenderCreeperChicken;
import net.thep2wking.weirdthings.util.render.RenderCrossyRoadChicken;
import net.thep2wking.weirdthings.util.render.RenderDirtChicken;
import net.thep2wking.weirdthings.util.render.RenderDirtGolem;
import net.thep2wking.weirdthings.util.render.RenderEnderVillager;
import net.thep2wking.weirdthings.util.render.RenderFatChicken;
import net.thep2wking.weirdthings.util.render.RenderHotdog;
import net.thep2wking.weirdthings.util.render.RenderVeryWeirdPig;
import net.thep2wking.weirdthings.util.render.RenderVillagerBlaze;
import net.thep2wking.weirdthings.util.render.RenderVillagerChicken;
import net.thep2wking.weirdthings.util.render.RenderVillagerDragon;
import net.thep2wking.weirdthings.util.render.RenderVillagerGhast;
import net.thep2wking.weirdthings.util.render.RenderVillagerWither;
import net.thep2wking.weirdthings.util.render.RenderWitherGirl;

public class ModRendering {
	@SideOnly(Side.CLIENT)
	public static void registerEntityRender() {
		RenderingRegistry.registerEntityRenderingHandler(EntityCookieMonster.class, RenderCookieMonster.FACTORY);
		RenderingRegistry.registerEntityRenderingHandler(EntityArrowstormSkeleton.class, RenderArrowstormSkeleton.FACTORY);
		RenderingRegistry.registerEntityRenderingHandler(EntityArmedCreeper.class, RenderArmedCreeper.FACTORY);
		RenderingRegistry.registerEntityRenderingHandler(EntityCreeperChicken.class, RenderCreeperChicken.FACTORY);
		RenderingRegistry.registerEntityRenderingHandler(EntityEnderVillager.class, RenderEnderVillager.FACTORY);
		RenderingRegistry.registerEntityRenderingHandler(EntityVillagerBlaze.class, RenderVillagerBlaze.FACTORY);
		RenderingRegistry.registerEntityRenderingHandler(EntityVillagerGhast.class, RenderVillagerGhast.FACTORY);
		RenderingRegistry.registerEntityRenderingHandler(EntityVillagerChicken.class, RenderVillagerChicken.FACTORY);
		RenderingRegistry.registerEntityRenderingHandler(EntityFatChicken.class, RenderFatChicken.FACTORY);
		RenderingRegistry.registerEntityRenderingHandler(EntityCrossyRoadChicken.class, RenderCrossyRoadChicken.FACTORY);
		RenderingRegistry.registerEntityRenderingHandler(EntityVillagerWither.class, RenderVillagerWither.FACTORY);
		RenderingRegistry.registerEntityRenderingHandler(EntityVillagerDragon.class, RenderVillagerDragon.FACTORY);
		RenderingRegistry.registerEntityRenderingHandler(EntityWitherGirl.class, RenderWitherGirl.FACTORY);
		RenderingRegistry.registerEntityRenderingHandler(EntityHotdog.class, RenderHotdog.FACTORY);
		RenderingRegistry.registerEntityRenderingHandler(EntityDirtChicken.class, RenderDirtChicken.FACTORY);
		RenderingRegistry.registerEntityRenderingHandler(EntityDirtGolem.class, RenderDirtGolem.FACTORY);
		RenderingRegistry.registerEntityRenderingHandler(EntityContinuouslyTurningPig.class, RenderContinuouslyTurningPig.FACTORY);
		RenderingRegistry.registerEntityRenderingHandler(EntityVeryWeirdPig.class, RenderVeryWeirdPig.FACTORY);
	}
}