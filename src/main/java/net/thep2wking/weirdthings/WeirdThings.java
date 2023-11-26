package net.thep2wking.weirdthings;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLLoadCompleteEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.thep2wking.reloadedlib.util.ModLogger;
import net.thep2wking.reloadedlib.util.ModNBTUtil;
import net.thep2wking.weirdthings.content.tile.TileChickenChestItemRenderer;
import net.thep2wking.weirdthings.content.tile.TileChickenChest;
import net.thep2wking.weirdthings.content.tile.TileChickenChestRenderer;
import net.thep2wking.weirdthings.content.tile.TileTrappedChickenChestItemRenderer;
import net.thep2wking.weirdthings.init.ModBlocks;
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
            itemList.add(ModNBTUtil.addSpawnEgg(WeirdThings.PREFIX + "arrowstorm_skeleton"));
            itemList.add(ModNBTUtil.addSpawnEgg(WeirdThings.PREFIX + "armed_creeper"));
            itemList.add(ModNBTUtil.addSpawnEgg(WeirdThings.PREFIX + "creeper_chicken"));
            itemList.add(ModNBTUtil.addSpawnEgg(WeirdThings.PREFIX + "ender_villager"));
            itemList.add(ModNBTUtil.addSpawnEgg(WeirdThings.PREFIX + "villager_blaze"));
            itemList.add(ModNBTUtil.addSpawnEgg(WeirdThings.PREFIX + "villager_ghast"));
            itemList.add(ModNBTUtil.addSpawnEgg(WeirdThings.PREFIX + "villager_chicken"));
            itemList.add(ModNBTUtil.addSpawnEgg(WeirdThings.PREFIX + "fat_chicken"));
            itemList.add(ModNBTUtil.addSpawnEgg(WeirdThings.PREFIX + "crossy_road_chicken"));
            itemList.add(ModNBTUtil.addSpawnEgg(WeirdThings.PREFIX + "villager_wither"));
            itemList.add(ModNBTUtil.addSpawnEgg(WeirdThings.PREFIX + "villager_dragon"));
            itemList.add(ModNBTUtil.addSpawnEgg(WeirdThings.PREFIX + "wither_girl"));
            itemList.add(ModNBTUtil.addSpawnEgg(WeirdThings.PREFIX + "hotdog"));
            itemList.add(ModNBTUtil.addSpawnEgg(WeirdThings.PREFIX + "dirt_chicken"));
            itemList.add(ModNBTUtil.addSpawnEgg(WeirdThings.PREFIX + "dirt_golem"));
            itemList.add(ModNBTUtil.addSpawnEgg(WeirdThings.PREFIX + "continuously_turning_pig"));
            itemList.add(ModNBTUtil.addSpawnEgg(WeirdThings.PREFIX + "very_weird_pig"));
            itemList.add(ModNBTUtil.addSpawnEgg(WeirdThings.PREFIX + "chickow"));
            itemList.add(ModNBTUtil.addSpawnEgg(WeirdThings.PREFIX + "rapig"));
            itemList.add(ModNBTUtil.addSpawnEgg(WeirdThings.PREFIX + "skelepig"));
            itemList.add(ModNBTUtil.addSpawnEgg(WeirdThings.PREFIX + "villager_pig"));
            itemList.add(ModNBTUtil.addSpawnEgg(WeirdThings.PREFIX + "pig_villager"));
            itemList.add(ModNBTUtil.addSpawnEgg(WeirdThings.PREFIX + "cow_villager"));
            itemList.add(ModNBTUtil.addSpawnEgg(WeirdThings.PREFIX + "potionstorm_witch"));
            itemList.add(ModNBTUtil.addSpawnEgg(WeirdThings.PREFIX + "flower_pig"));
            itemList.add(ModNBTUtil.addSpawnEgg(WeirdThings.PREFIX + "battle_sheep"));
            itemList.add(ModNBTUtil.addSpawnEgg(WeirdThings.PREFIX + "enderman_chicken"));
            itemList.add(ModNBTUtil.addSpawnEgg(WeirdThings.PREFIX + "squid_blaze"));
            itemList.add(ModNBTUtil.addSpawnEgg(WeirdThings.PREFIX + "crueatus"));
            itemList.add(ModNBTUtil.addSpawnEgg(WeirdThings.PREFIX + "villager_spider"));
            itemList.add(ModNBTUtil.addSpawnEgg(WeirdThings.PREFIX + "tnt_creeper"));
            itemList.add(ModNBTUtil.addSpawnEgg(WeirdThings.PREFIX + "rainbow_villager"));
        }
    };

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        ModLogger.preInitLogger(MODID);
        ModEntities.registerEntities();
        GameRegistry.registerTileEntity(TileChickenChest.class, new ResourceLocation(WeirdThings.MODID, "chicken_chest"));
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
        ClientRegistry.bindTileEntitySpecialRenderer(TileChickenChest.class, new TileChickenChestRenderer());
        TileChickenChestItemRenderer.registerTEISRModel(Item.getItemFromBlock(ModBlocks.CHICKEN_CHEST));
        TileTrappedChickenChestItemRenderer.registerTEISRModel(Item.getItemFromBlock(ModBlocks.TRAPPED_CHICKEN_CHEST));
        PROXY.postInit(event);
    }

    @Mod.EventHandler
    public void loadComplete(FMLLoadCompleteEvent event) {
        ModLogger.loadCompleteLogger(MODID, VERSION);
    }
}