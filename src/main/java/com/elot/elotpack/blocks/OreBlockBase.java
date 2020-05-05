package com.elot.elotpack.blocks;

import com.elot.elotpack.util.RegistryHandler;
import net.minecraft.block.OreBlock;
import net.minecraft.util.math.MathHelper;

import java.util.Random;

public class OreBlockBase extends OreBlock {

    public OreBlockBase(Properties properties) {
        super(properties);
    }

    @Override
    protected int getExperience(Random rand) {
        if (this == RegistryHandler.ORE_ONYX.get()){
            return MathHelper.nextInt(rand, 2,6);
        } else {
            return super.getExperience(rand);
        }
    }
}
