package net.thep2wking.weirdthings.util.proxy;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.thep2wking.oedldoedlcore.api.integration.ModJERPluginBase;
import net.thep2wking.weirdthings.integration.jer.WeirdThingsJERPlugin;
import net.thep2wking.weirdthings.util.render.ModRenderer;
import net.thep2wking.weirdthings.util.render.chickenchest.RenderChickenChest;

public class ClientProxy extends CommonProxy {
	public void preInit(FMLPreInitializationEvent event) {
		super.preInit(event);
		ModRenderer.registerEntityRender();
	}

	public void init(FMLInitializationEvent event) {
		super.init(event);
		ModJERPluginBase.registerPlugin(new WeirdThingsJERPlugin());
	}

	public void postInit(FMLPostInitializationEvent event) {
		super.postInit(event);
		RenderChickenChest.registerChickenChestRenderer();
	}

	@Override
	public void render() {
		ModRenderer.registerRenderer();
	}
}