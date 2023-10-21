package net.thep2wking.weirdthings;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLLoadCompleteEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.thep2wking.reloadedlib.util.ModLogger;
import net.thep2wking.reloadedlib.util.ModNBTUtil;
import net.thep2wking.weirdthings.init.ModEntities;
import net.thep2wking.weirdthings.init.ModItems;
import net.thep2wking.weirdthings.registry.ModOreDict;
import net.thep2wking.weirdthings.registry.ModRecipes;
import net.thep2wking.weirdthings.util.proxy.CommonProxy;

@Mod(modid = WeirdThings.MODID, name = WeirdThings.NAME, version = WeirdThings.VERSION, dependencies = WeirdThings.DEPENDENCIES)
public class WeirdThings {
    public static final String MODID = "weirdthings";
    public static final String PREFIX = MODID + ":";
    public static final String MC_VERSION = "1.12.2";
    public static final String NAME = "Weird Things Reloaded";
    public static final String VERSION = MC_VERSION + "-" + "1.0.0";
    public static final String DEPENDENCIES = "required-after:forge@[14.23.5.2847,);required-after:reloadedlib@[1.12.2-1.0.0,);after:jei@[4.16.1.1000,);after:theoneprobe@[1.4.28,);";
    public static final String CLIENT_PROXY_CLASS = "net.thep2wking.weirdthings.util.proxy.ClientProxy";
    public static final String SERVER_PROXY_CLASS = "net.thep2wking.weirdthings.util.proxy.ServerProxy";

    @Mod.Instance(MODID)
    public static WeirdThings INSTANCE;

    @SidedProxy(clientSide = CLIENT_PROXY_CLASS, serverSide = SERVER_PROXY_CLASS)
    public static CommonProxy PROXY;

    public static final CreativeTabs TAB = new CreativeTabs(WeirdThings.MODID + ".name") {
        @Override
        @SideOnly(Side.CLIENT)
        public ItemStack getTabIconItem() {
            return new ItemStack(ModItems.CROSSY_SWORD, 1, 0);
        }

        @Override
        public void displayAllRelevantItems(NonNullList<ItemStack> itemList) {
            super.displayAllRelevantItems(itemList);
            itemList.add(ModNBTUtil.addSpawnEgg(WeirdThings.PREFIX + "cookie_monster"));
        }
    };

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        ModLogger.preInitLogger(MODID);
        ModEntities.registerEntities();
        PROXY.preInit(event);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        ModLogger.initLogger(MODID);
        ModOreDict.registerOreDict();
        ModRecipes.registerRecipes();
        PROXY.init(event);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        ModLogger.postInitLogger(MODID);
        PROXY.postInit(event);
    }

    @Mod.EventHandler
    public void loadComplete(FMLLoadCompleteEvent event) {
        ModLogger.loadCompleteLogger(MODID, VERSION);
    }
}