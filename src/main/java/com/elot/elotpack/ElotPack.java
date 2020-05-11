package com.elot.elotpack;


import com.elot.elotpack.blocks.ModCrop;
import com.elot.elotpack.items.BlockItemBase;
import com.elot.elotpack.util.RegistryHandler;
import com.elot.elotpack.world.gen.ModOreGen;
import net.minecraft.item.*;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLLoadCompleteEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.IForgeRegistry;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.rmi.registry.Registry;


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

    // Register BlockItems
    @SubscribeEvent
    public static void onRegisterItems(final RegistryEvent.Register<Item> event) {
        final IForgeRegistry<Item> registry = event.getRegistry();
        RegistryHandler.BLOCKS.getEntries().stream()
                .filter(block -> !(block.get() instanceof ModCrop))
                .map(RegistryObject::get).forEach(block -> {
            final BlockItem blockItem = new BlockItemBase(block);
            blockItem.setRegistryName(block.getRegistryName());
            registry.register(blockItem);
        });

        LOGGER.debug("Registered BlockItems.");
    }



    private void setup(final FMLCommonSetupEvent event) {    }

    private void doClientStuff(final FMLClientSetupEvent event) {    }

    @SubscribeEvent
    public void onServerStarting(FMLServerStartingEvent event) {    }

    //Generate CustomOres
    @SubscribeEvent
    public static void loadCompleteEvent(FMLLoadCompleteEvent event){

        ModOreGen.generateOre();
    }

    //Creative Mode tabs
    public static final ItemGroup TAB = new ItemGroup("ElotPack Items") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(RegistryHandler.ONYX.get());
        }};
    public static final ItemGroup TAB2 = new ItemGroup("ElotPack Blocks") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(RegistryHandler.ONYX_BLOCK.get().asItem());
        }};
    public static final ItemGroup ARCANE = new ItemGroup("ElotPack Arcane") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(RegistryHandler.CRYSTAL_BALL.get());
        }};

}