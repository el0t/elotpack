package com.elot.elotpack.items;

import com.elot.elotpack.ElotPack;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;


public class ItemBase extends Item {
    public ItemBase(Properties properties) {
        super(properties.group(ElotPack.TAB));

    }

    private Item beaconPayment;
    public Item setBeaconPayment(){
        return beaconPayment = this;
    }

    @Override
    public boolean isBeaconPayment(ItemStack stack) {
        return (this == beaconPayment);
    }
}
