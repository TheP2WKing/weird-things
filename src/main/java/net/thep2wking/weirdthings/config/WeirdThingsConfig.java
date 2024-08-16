package net.thep2wking.weirdthings.config;

import net.minecraftforge.common.config.Config;
import net.minecraftforge.common.config.ConfigManager;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.thep2wking.weirdthings.WeirdThings;
import net.thep2wking.weirdthings.config.categories.Integration;
import net.thep2wking.weirdthings.config.categories.Mobs;
import net.thep2wking.weirdthings.config.categories.World;

@Config(modid = WeirdThings.MODID, name = WeirdThings.MODID, category = WeirdThings.MODID)
public class WeirdThingsConfig {
	@Config.Name("world")
	public static final World WORLD = new World();

	@Config.Name("mobs")
	public static final Mobs MOBS = new Mobs();

	@Config.Name("integration")
	public static final Integration INTEGRATION = new Integration();

	@Mod.EventBusSubscriber
	public static class ConfigHolder {
		@SubscribeEvent
		public static void onConfigChanged(ConfigChangedEvent.OnConfigChangedEvent event) {
			if (event.getModID().equals(WeirdThings.MODID)) {
				ConfigManager.sync(WeirdThings.MODID, Config.Type.INSTANCE);
			}
		}
	}
}