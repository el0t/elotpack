package com.elot.elotpack.items;

import net.minecraft.item.IItemPropertyGetter;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.tileentity.AbstractFurnaceTileEntity;
import net.minecraftforge.common.ForgeHooks;
import net.minecraftforge.common.extensions.IForgeItem;

public class ModFuel extends Item implements IForgeItem {

    private int burnTime = -1;
    public ModFuel(Properties properties, int x) {
        super(properties);
        burnTime = x;
    }

    @Override
    public int getBurnTime(ItemStack itemStack) {
        return burnTime;
    }
}

