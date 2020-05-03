package com.elot.elotpack.entities;

import com.elot.elotpack.util.RegistryHandler;
import net.minecraft.entity.*;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.Hand;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class Bantha extends AnimalEntity {

    private EatGrassGoal eatGrassGoal;
    private int exampleTimer;

    public Bantha(EntityType<? extends AnimalEntity> type, World worldIn){
        super(type, worldIn);
    }

    @Override
    public AgeableEntity createChild(AgeableEntity ageableEntity){
        Bantha b = new Bantha(RegistryHandler.BANTHA.get(), this.world);
        b.onInitialSpawn(this.world, this.world.getDifficultyForLocation(new BlockPos(b)), SpawnReason.BREEDING, (ILivingEntityData) null, (CompoundNBT) null);
        return b;
    }
    @Override
    protected void registerGoals() {
        super.registerGoals();
        this.eatGrassGoal = new EatGrassGoal(this);
        this.goalSelector.addGoal(0, new SwimGoal(this));
        this.goalSelector.addGoal(1,new PanicGoal(this, 1.4D));
        this.goalSelector.addGoal(2, new BreedGoal(this, 1.12D));
        this.goalSelector.addGoal(3, new TemptGoal(this, 1.0D, Ingredient.fromItems(Items.MELON), false));
        this.goalSelector.addGoal(4, new FollowParentGoal(this, 1.2D));
        this.goalSelector.addGoal(5, this.eatGrassGoal);
        this.goalSelector.addGoal(6, new WaterAvoidingRandomWalkingGoal(this, 1.25D));
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
        this.getAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(160.0D);
        this.getAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.2D);
    }

    @Override
    public boolean isBreedingItem(ItemStack stack) {
        return (stack.getItem() == Items.MELON);
    }

    public boolean processInteract(PlayerEntity player, Hand hand) {
        ItemStack itemstack = player.getHeldItem(hand);
        if (itemstack.getItem() == Items.BUCKET && !player.abilities.isCreativeMode && !this.isChild()) {
            player.playSound(SoundEvents.ENTITY_COW_MILK, 1.0F, 1.0F);
            itemstack.shrink(1);
            if (itemstack.isEmpty()) {
                player.setHeldItem(hand, new ItemStack(RegistryHandler.BANTHA_MILK.get()));
            } else if (!player.inventory.addItemStackToInventory(new ItemStack(RegistryHandler.BANTHA_MILK.get()))) {
                player.dropItem(new ItemStack(RegistryHandler.BANTHA_MILK.get()), false);
            }

            return true;
        } else {
            return super.processInteract(player, hand);
        }


    }
    //1648
}