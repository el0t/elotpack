package com.elot.elotpack.events;

import com.elot.elotpack.ElotPack;
import com.elot.elotpack.items.CrystalBallItem;
import com.elot.elotpack.util.RegistryHandler;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraftforge.event.AnvilUpdateEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = ElotPack.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class CrystalBallRepairEvent {

    @SubscribeEvent
    public static void CrystalBallRepairEvent(AnvilUpdateEvent event){
        ItemStack right = event.getRight();
        ItemStack left = event.getLeft();

        if (left.getItem() instanceof CrystalBallItem){
            ElotPack.LOGGER.debug("CrystalBallRepairEvent - fired with CrystalBallItem");
                Block[] targetBlocks = {Blocks.COAL_ORE, Blocks.IRON_ORE, Blocks.GOLD_ORE, Blocks.DIAMOND_ORE,
                        Blocks.EMERALD_ORE, Blocks.REDSTONE_ORE, Blocks.LAPIS_ORE, RegistryHandler.ORE_ONYX.get(),
                        RegistryHandler.ORE_SILVER.get(), RegistryHandler.ORE_MITHRIL.get()};
                Item[] sourceItems = {Items.COAL, Items.IRON_INGOT, Items.GOLD_INGOT, Items.DIAMOND, Items.EMERALD,
                        Items.REDSTONE, Items.LAPIS_LAZULI, RegistryHandler.ONYX.get(), RegistryHandler.INGOT_SILVER.get(),
                        RegistryHandler.INGOT_MITHRIL.get()};
                int[] xpCosts = {3, 5, 9, 12, 12, 5, 9, 9, 5, 12};

            boolean f = false;
            for(int k = 0; k < sourceItems.length; k++){
                if (right.getItem().equals(sourceItems[k])) {
                    f= true;
                }
            }
            if (f) {
                ElotPack.LOGGER.debug("CrystalBallRepairEvent - valid RepairItem inserted");
                ItemStack outputBall = left.copy();
                outputBall.getOrCreateTag().putInt("attuned", 0);

                int k = 0;
                for (int j = 0; j < sourceItems.length; j++){
                    if( right.getItem().equals(sourceItems[j])){
                        k += j;
                    }
                }

                outputBall.getTag().putInt("attuned", k);
                event.setCost(xpCosts[k]);
                event.setMaterialCost(1);

                event.setOutput(outputBall);
            }
        }
    }
}
