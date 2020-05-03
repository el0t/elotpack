package com.elot.elotpack.entities;

import com.elot.elotpack.entities.ai.goals.WompratForagingGoal;
import com.elot.elotpack.util.RegistryHandler;
import net.minecraft.entity.*;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.monster.MonsterEntity;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.entity.passive.WolfEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class Womprat extends AnimalEntity {

    private WompratForagingGoal foragingGoal;
    private int scurryTimer;

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
        this.foragingGoal = new WompratForagingGoal(this);
        this.goalSelector.addGoal(1, new SwimGoal(this));
        this.goalSelector.addGoal(1, new PanicGoal(this, 2.2D));
        this.goalSelector.addGoal(2, new TemptGoal(this, 1.0D, Ingredient.fromItems(RegistryHandler.GARLIC.get()), false));
        this.goalSelector.addGoal(3, new AvoidEntityGoal<>(this, PlayerEntity.class, 8.0F, 1.2D, 2.2D));
        this.goalSelector.addGoal(3, new AvoidEntityGoal<>(this, WolfEntity.class, 12.0F, 1.2D, 2.2D));
        this.goalSelector.addGoal(3, new AvoidEntityGoal<>(this, MonsterEntity.class, 6.0F, 1.2D, 2.2D));
        this.goalSelector.addGoal(4, foragingGoal);
        this.goalSelector.addGoal(5, new WaterAvoidingRandomWalkingGoal(this, 0.8D));
        this.goalSelector.addGoal(16, new LookAtGoal(this, PlayerEntity.class, 16.0F));
    }
    @Override
    protected void updateAITasks() {
        this.scurryTimer = this.foragingGoal.getForagingTimer();
        super.updateAITasks();
    }

    @Override
    public void livingTick() {
        if (this.world.isRemote){
            this.scurryTimer = Math.max(0, this.scurryTimer -1);
        }
        super.livingTick();
    }

    @Override
    protected void registerAttributes() {
        super.registerAttributes();
        this.getAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(6);
        this.getAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.3D);
    }
    //1648
}
