package com.elot.elotpack.entities;

import com.elot.elotpack.entities.ai.goals.FollowHerdLeaderGoal;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.RandomPositionGenerator;
import net.minecraft.entity.ai.goal.RandomWalkingGoal;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

import java.util.List;
import java.util.stream.Stream;

public abstract class AbstractHerdAnimal extends AnimalEntity {
    private AbstractHerdAnimal groupLeader;
    private int groupSize;

    public AbstractHerdAnimal(EntityType<? extends AnimalEntity> type, World worldIn) {
        super(type, worldIn);
    }

    protected void registerGoals() {
        super.registerGoals();
        this.goalSelector.addGoal(4, new RoamGoal(this, 1.0D));
        this.goalSelector.addGoal(5, new FollowHerdLeaderGoal(this));
    }

    /**
     * Will return how many at most can spawn in a chunk at once.
     */
    public int getMaxSpawnedInChunk() {
        return this.getMaxGroupSize();
    }

    public int getMaxGroupSize() {
        return super.getMaxSpawnedInChunk();
    }

    protected boolean doesNotHaveGroupLeader() {
        return !this.hasGroupLeader();
    }

    public boolean hasGroupLeader() {
        return this.groupLeader != null && this.groupLeader.isAlive();
    }

    public AbstractHerdAnimal func_212803_a(AbstractHerdAnimal groupLeaderIn) {
        this.groupLeader = groupLeaderIn;
        groupLeaderIn.increaseGroupSize();
        return groupLeaderIn;
    }

    public void leaveGroup() {
        this.groupLeader.decreaseGroupSize();
        this.groupLeader = null;
    }

    private void increaseGroupSize() {
        ++this.groupSize;
    }

    private void decreaseGroupSize() {
        --this.groupSize;
    }

    public boolean canGroupGrow() {
        return this.isGroupLeader() && this.groupSize < this.getMaxGroupSize();
    }

    public void tick() {
        super.tick();
        if (this.isGroupLeader() && this.world.rand.nextInt(200) == 1) {
            List<AbstractHerdAnimal> list = this.world.getEntitiesWithinAABB(this.getClass(), this.getBoundingBox().grow(16.0D, 16.0D, 16.0D));
            if (list.size() <= 1) {
                this.groupSize = 1;
            }
        }

    }

    public boolean isGroupLeader() {
        return this.groupSize > 1;
    }

    public boolean inRangeOfGroupLeader() {
        return this.getDistanceSq(this.groupLeader) <= 64.0D;
    }

    public void moveToGroupLeader() {
        if (this.hasGroupLeader()) {
            this.getNavigator().tryMoveToEntityLiving(this.groupLeader, 0.8D);
        }

    }

    public void func_212810_a(Stream<AbstractHerdAnimal> herdAnimalStream) {
        herdAnimalStream.limit((long)(this.getMaxGroupSize() - this.groupSize)).filter((p_212801_1_) -> {
            return p_212801_1_ != this;
        }).forEach((p_212804_1_) -> {
            p_212804_1_.func_212803_a(this);
        });
    }

    static class RoamGoal extends RandomWalkingGoal {
        private final AbstractHerdAnimal roamer;

        public RoamGoal(AbstractHerdAnimal roamer, double speedIn) {
            super(roamer, speedIn, 40);
            this.roamer = roamer;
        }

        protected Vec3d RoamingPosition() {
            Vec3d vec3d = RandomPositionGenerator.findRandomTarget(this.roamer, 100, 7);
            BlockPos blockPos = this.roamer.getPosition();
            if ( vec3d!= null && vec3d.length() < 50.0D ) {
                vec3d.scale(2.0);
            }
            return vec3d;
        }
        /**
         * Returns whether execution should begin. You can also read and cache any state necessary for execution in this
         * method as well.
         */
        @Override
        public boolean shouldExecute() {
            if (this.roamer.hasGroupLeader()) {
                return false;
            } else {
                if (!this.mustUpdate) {
                    if (this.creature.getIdleTime() >= 100) {
                        return false;
                    }

                    if (this.creature.getRNG().nextInt(this.executionChance) != 0) {
                        return false;
                    }
                }

                Vec3d vec3d = this.RoamingPosition();
                if (vec3d == null) {
                    return false;
                } else {
                    this.x = vec3d.x;
                    this.y = vec3d.y;
                    this.z = vec3d.z;
                    this.mustUpdate = false;
                    return true;
                }
            }
        }
    }

}
