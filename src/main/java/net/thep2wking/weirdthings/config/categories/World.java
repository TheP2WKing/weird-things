package net.thep2wking.weirdthings.config.categories;

import net.minecraftforge.common.config.Config;

public class World {
	@Config.Name("Chicken Biome")
	public boolean CHICKEN_BIOME = true;

	@Config.Name("Chicken Biome Weight")
	@Config.RangeInt(min = 0, max = 100)
	public int CHICKEN_BIOME_WEIGHT = 5;

	@Config.Name("Cookie Biome")
	public boolean COOKIE_BIOME = true;

	@Config.Name("Cookie Biome Weight")
	@Config.RangeInt(min = 0, max = 100)
	public int COOKIE_BIOME_WEIGHT = 5;

	@Config.Name("Cookie Ore")
	public boolean COOKIE_ORE = true;

	@Config.Name("Ruby Ore")
	public boolean RUBY_ORE = true;

	@Config.Name("Fire Ore")
	public boolean FIRE_ORE = true;

	@Config.Name("Rendium Ore")
	public boolean RENDIUM_ORE = true;
}