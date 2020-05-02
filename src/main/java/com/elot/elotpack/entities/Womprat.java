package com.elot.elotpack.entities;

import com.elot.elotpack.util.RegistryHandler;
import net.minecraft.entity.*;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class Womprat extends AnimalEntity {

    private EatGrassGoal eatGrassGoal;
    private int exampleTimer;

    public Womprat(EntityType<? extends AnimalEntity> type, World worldIn){
        super(type, worldIn);
    }

    @Override
    public AgeableEntity createChild(AgeableEntity ageableEntity){
        Womprat womprat = new Womprat(RegistryHandler.WOMPRAT.get(), this.world);
        womprat.onInitialSpawn(this.world, this.world.getDifficultyForLocation(new BlockPos(womprat)), SpawnReason.BREEDING, (ILivingEntityData) null, (CompoundNBT) null);
        return womprat;
    }
    @Override
    protected void registerGoals() {
        super.registerGoals();
        this.eatGrassGoal = new EatGrassGoal(this);
        this.goalSelector.addGoal(0, new SwimGoal(this));
        this.goalSelector.addGoal(1,new PanicGoal(this, 1.25D));
        this.goalSelector.addGoal(2, new BreedGoal(this, 1.0D));
        this.goalSelector.addGoal(3, new TemptGoal(this, 1.1D, Ingredient.fromItems(RegistryHandler.GARLIC.get()), true));
        this.goalSelector.addGoal(4, new FollowParentGoal(this, 1.1D));
        this.goalSelector.addGoal(5, this.eatGrassGoal);
        this.goalSelector.addGoal(6, new WaterAvoidingRandomWalkingGoal(this, 1.0D));
        this.goalSelector.addGoal(7, new LookAtGoal(this, PlayerEntity.class, 6.0F));
        this.goalSelector.addGoal(8, new LookRandomlyGoal(this));
    }
    @Override
    protected void updateAITasks() {
        this.exampleTimer = this.eatGrassGoal.getEatingGrassTimer();
        super.updateAITasks();
    }

    @Override
    public void livingTick() {
        if (this.world.isRemote){
            this.exampleTimer = Math.max(0, this.exampleTimer -1);
        }
        super.livingTick();
    }

    @Override
    protected void registerAttributes() {
        super.registerAttributes();
        this.getAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(6);
        this.getAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.24D);
    }
    //1648
}
