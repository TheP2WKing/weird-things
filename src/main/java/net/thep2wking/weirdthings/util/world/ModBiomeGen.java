package net.thep2wking.weirdthings.util.world;

import net.minecraftforge.common.BiomeDictionary.Type;
import net.minecraftforge.common.BiomeManager.BiomeType;
import net.thep2wking.oedldoedlcore.util.ModLogger;
import net.thep2wking.oedldoedlcore.util.world.ModBiomeUtil;
import net.thep2wking.weirdthings.WeirdThings;
import net.thep2wking.weirdthings.config.WeirdThingsConfig;
import net.thep2wking.weirdthings.init.ModBiomes;

public class ModBiomeGen {
	public static void registerModBiomeGen() {
		ModLogger.registeredBiomesLogger(WeirdThings.MODID);

		if (WeirdThingsConfig.WORLD.COOKIE_BIOME) {
			ModBiomeUtil.addBasicBiome(ModBiomes.COOKIE, WeirdThings.MODID, "cookie",
					WeirdThingsConfig.WORLD.COOKIE_BIOME_WEIGHT, BiomeType.DESERT, Type.SAVANNA);
		}
		if (WeirdThingsConfig.WORLD.CHICKEN_BIOME) {
			ModBiomeUtil.addBasicBiome(ModBiomes.CHICKEN, WeirdThings.MODID, "chicken",
					WeirdThingsConfig.WORLD.CHICKEN_BIOME_WEIGHT, BiomeType.WARM, Type.PLAINS);
		}
	}
}