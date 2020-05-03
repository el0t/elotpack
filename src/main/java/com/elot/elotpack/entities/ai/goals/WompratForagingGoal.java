package com.elot.elotpack.entities.ai.goals;

import com.elot.elotpack.blocks.ModCrop;
import com.elot.elotpack.entities.Womprat;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.CarrotBlock;
import net.minecraft.entity.ai.goal.MoveToBlockGoal;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorldReader;
import net.minecraft.world.World;
import net.minecraftforge.event.ForgeEventFactory;


public class WompratForagingGoal extends MoveToBlockGoal {

    private final Womprat womprat;

        private boolean wantsToForage;
        private boolean canForage;
        private int foragingTimer;

        public WompratForagingGoal(Womprat wompratIn) {
            super(wompratIn, (double)0.7F, 16);
            this.womprat = wompratIn;
        }

        /**
         * Returns whether execution should begin. You can also read and cache any state necessary for execution in this
         * method as well.
         */
        public int getForagingTimer() {
            return foragingTimer;
        }

        public boolean shouldExecute() {
            if (this.runDelay <= 0) {
                if (!ForgeEventFactory.getMobGriefingEvent(this.womprat.world, this.womprat)) {
                    return false;
                }

                this.canForage = false;
                this.wantsToForage = true;
            }

            return super.shouldExecute();
        }

        /**
         * Returns whether an in-progress EntityAIBase should continue executing
         */
        public boolean shouldContinueExecuting() {
            return this.canForage && super.shouldContinueExecuting();
        }

        /**
         * Keep ticking a continuous task that has already been started
         */

        public void tick() {
            super.tick();
            this.womprat.getLookController().setLookPosition((double)this.destinationBlock.getX() + 0.5D, (double)(this.destinationBlock.getY() + 1), (double)this.destinationBlock.getZ() + 0.5D, 10.0F, (float)this.womprat.getVerticalFaceSpeed());
            if (this.getIsAboveDestination()) {
                World world = this.womprat.world;
                BlockPos blockpos = this.destinationBlock.up();
                BlockState blockstate = world.getBlockState(blockpos);
                Block block = blockstate.getBlock();
                if (this.canForage && block instanceof ModCrop && this.foragingTimer <= 1){
                    this.foragingTimer += 80;
                    Integer integer = blockstate.get(ModCrop.AGE);
                    if (integer == 0) {
                        world.setBlockState(blockpos, Blocks.AIR.getDefaultState(), 2);
                        world.destroyBlock(blockpos, true, this.womprat);
                    } else {
                        world.setBlockState(blockpos, blockstate.with(CarrotBlock.AGE, Integer.valueOf(integer - 1)), 2);
                        world.playEvent(2001, blockpos, Block.getStateId(blockstate));
                    }

                }
                foragingTimer = Math.max(0, foragingTimer--);
                this.runDelay = 10;
            }

        }

        /**
         * Return true to set given position as destination
         */
        protected boolean shouldMoveTo(IWorldReader worldIn, BlockPos pos) {
            Block block = worldIn.getBlockState(pos).getBlock();
            if (block == Blocks.FARMLAND && this.wantsToForage && !this.canForage) {
                pos = pos.up();
                BlockState blockstate = worldIn.getBlockState(pos);
                block = blockstate.getBlock();
                if (block instanceof ModCrop && ((ModCrop)block).isMaxAge(blockstate)) {
                    this.canForage = true;
                    return true;
                }
            }

            return false;
        }
    }
