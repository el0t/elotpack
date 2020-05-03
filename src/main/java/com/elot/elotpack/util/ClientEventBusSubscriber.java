package com.elot.elotpack.util;

import com.elot.elotpack.ElotPack;
import com.elot.elotpack.client.entity.render.BanthaRender;
import com.elot.elotpack.client.entity.render.WompratRender;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = ElotPack.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientEventBusSubscriber {

    @SubscribeEvent
    public static void clientSetup(FMLClientSetupEvent event){
        RenderTypeLookup.setRenderLayer(RegistryHandler.CORELLIAN_CORN.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(RegistryHandler.GARLIC_CROP.get(), RenderType.getCutout());
        RenderingRegistry.registerEntityRenderingHandler(RegistryHandler.WOMPRAT.get(), WompratRender::new);
        RenderingRegistry.registerEntityRenderingHandler(RegistryHandler.BANTHA.get(), BanthaRender::new);
    }
}
