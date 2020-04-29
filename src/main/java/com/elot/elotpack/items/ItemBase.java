package com.elot.elotpack.items;

import com.elot.elotpack.ElotPack;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;


public class ItemBase extends Item {
    public ItemBase() {
        super(new Item.Properties().group(ElotPack.TAB));
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
