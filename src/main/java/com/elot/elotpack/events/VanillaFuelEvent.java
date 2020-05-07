package com.elot.elotpack.events;

import com.elot.elotpack.ElotPack;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraftforge.event.furnace.FurnaceFuelBurnTimeEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = ElotPack.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class VanillaFuelEvent {

    @SubscribeEvent
    public static void VanillaFuelEvent(FurnaceFuelBurnTimeEvent event) {
        ItemStack fuelItem = event.getItemStack();

        if (fuelItem.getItem().equals(Items.ROTTEN_FLESH)){ event.setBurnTime(50); }
        // repeat as above to add burnTimes to more vanilla items
    }

}
