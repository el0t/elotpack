package com.elot.elotpack.items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.tileentity.AbstractFurnaceTileEntity;
import net.minecraftforge.common.ForgeHooks;
import net.minecraftforge.common.extensions.IForgeItem;

public interface ModFuel extends IForgeItem {

    default void setBurnTime(int burnTime) {

    }

    @Override
    default int getBurnTime(ItemStack itemStack) {
        if (itemStack.getItem() == Items.ROTTEN_FLESH) {
            return itemStack.getCount()*50;
        }
        else
            return -1;
    }
}
