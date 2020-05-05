package com.elot.elotpack.entities.ai.goals;

import java.util.List;
import java.util.function.Predicate;

import com.elot.elotpack.entities.AbstractHerdAnimal;
import net.minecraft.entity.ai.goal.Goal;

public class FollowHerdLeaderGoal extends Goal {
    private final AbstractHerdAnimal taskOwner;
    private int navigateTimer;
    private int anInt;

    public FollowHerdLeaderGoal(AbstractHerdAnimal taskOwnerIn) {
        this.taskOwner = taskOwnerIn;
        this.anInt = this.unmappedFunction(taskOwnerIn);
    }

    protected int unmappedFunction(AbstractHerdAnimal taskOwnerIn) {
        return 200 + taskOwnerIn.getRNG().nextInt(200) % 20;
    }

    /**
     * Returns whether execution should begin. You can also read and cache any state necessary for execution in this
     * method as well.
     */
    public boolean shouldExecute() {
        if (this.taskOwner.isGroupLeader()) {
            return false;
        } else if (this.taskOwner.hasGroupLeader()) {
            return true;
        } else if (this.anInt > 0) {
            --this.anInt;
            return false;
        } else {
            this.anInt = this.unmappedFunction(this.taskOwner);
            Predicate<AbstractHerdAnimal> predicate = (herdPredicate) -> {
                return herdPredicate.canGroupGrow() || !herdPredicate.hasGroupLeader();
            };
            List<AbstractHerdAnimal> list = this.taskOwner.world.getEntitiesWithinAABB(this.taskOwner.getClass(), this.taskOwner.getBoundingBox().grow(8.0D, 8.0D, 8.0D), predicate);
            AbstractHerdAnimal herdAnimal = list.stream().filter(AbstractHerdAnimal::canGroupGrow).findAny().orElse(this.taskOwner);
            herdAnimal.func_212810_a(list.stream().filter((p_212823_0_) -> {
                return !p_212823_0_.hasGroupLeader();
            }));
            return this.taskOwner.hasGroupLeader();
        }
    }

    /**
     * Returns whether an in-progress EntityAIBase should continue executing
     */
    public boolean shouldContinueExecuting() {
        return this.taskOwner.hasGroupLeader() && this.taskOwner.inRangeOfGroupLeader();
    }

    /**
     * Execute a one shot task or start executing a continuous task
     */
    public void startExecuting() {
        this.navigateTimer = 0;
    }

    /**
     * Reset the task's internal state. Called when this task is interrupted by another one
     */
    public void resetTask() {
        this.taskOwner.leaveGroup();
    }

    /**
     * Keep ticking a continuous task that has already been started
     */
    public void tick() {
        if (--this.navigateTimer <= 0) {
            this.navigateTimer = 10;
            this.taskOwner.moveToGroupLeader();
        }
    }
}