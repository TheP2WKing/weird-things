package net.thep2wking.weirdthings.init;

import net.thep2wking.reloadedlib.util.ModRegistryHelper;
import net.thep2wking.weirdthings.WeirdThings;
import net.thep2wking.weirdthings.content.entity.EntityCookieMonster;

public class ModEntities {
	public static void registerEntities() {
		int id = 0;
		ModRegistryHelper.registerEntityWithSpawnEgg(WeirdThings.MODID, "cookie_monster", WeirdThings.INSTANCE, id++, EntityCookieMonster.class, 80, 3, false, 0x252f6d, 0x0e1322);
	}
}