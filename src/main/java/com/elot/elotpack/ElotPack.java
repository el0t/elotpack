package com.elot.elotpack;


import com.elot.elotpack.util.RegistryHandler;
import com.elot.elotpack.world.gen.ModOreGen;
import net.minecraft.item.*;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLLoadCompleteEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


@Mod("el0t")
@Mod.EventBusSubscriber(modid = ElotPack.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ElotPack {

    public static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "el0t";
    public static ElotPack instance;

    public ElotPack() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);

        RegistryHandler.init();

        instance = this;
        MinecraftForge.EVENT_BUS.register(this);

    }


    private void setup(final FMLCommonSetupEvent event) {    }

    private void doClientStuff(final FMLClientSetupEvent event) {    }
    @SubscribeEvent
    public void onServerStarting(FMLServerStartingEvent event) {    }

    //generate custom ores
    @SubscribeEvent
    public static void loadCompleteEvent(FMLLoadCompleteEvent event){
        ModOreGen.generateOre();
    }

    //creative mode tab
    public static final ItemGroup TAB = new ItemGroup("ElotPack Items") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(RegistryHandler.ONYX.get());
        }
    };
    public static final ItemGroup TAB2 = new ItemGroup("ElotPack Blocks") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(RegistryHandler.ONYX_BLOCK_ITEM.get());
        }
    };
    public static final ItemGroup ARCANE = new ItemGroup("ElotPack Arcane") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(RegistryHandler.CRYSTAL_BALL.get());
        }
    };

}