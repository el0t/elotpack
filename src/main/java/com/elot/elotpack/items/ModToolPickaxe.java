package com.elot.elotpack.items;

import com.elot.elotpack.ElotPack;
import net.minecraft.block.Block;
import net.minecraft.item.*;
import net.minecraft.item.crafting.Ingredient;
import net.minecraftforge.common.ToolType;

import java.util.Set;

public class ModToolPickaxe extends PickaxeItem {

    public ModToolPickaxe(IItemTier Tier, Ingredient repairIngredient) {
        super(Tier,1, -2.8F, new Properties().group(ElotPack.TAB));


    }

}
