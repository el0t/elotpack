package com.elot.elotpack.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorldReader;


public class BlockBase extends Block {

    private Block beaconBase;
    public BlockBase(Properties properties) {
        super(properties);
    }

    public Block setBeaconBase(){
        return beaconBase = this;
    }
    @Override
    public boolean isBeaconBase(BlockState state, IWorldReader world, BlockPos pos, BlockPos beacon) {
        return (this == beaconBase);
    }



}
