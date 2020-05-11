package com.elot.elotpack.items;

import com.elot.elotpack.util.RegistryHandler;
import net.minecraft.item.IItemTier;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.DamageSource;
import net.minecraft.util.LazyValue;

import java.util.function.Supplier;

public enum ModItemTier implements IItemTier
    {
        //harvestLevel, maxUses, efficiency, attackDamage, enchantability, repairMaterial
        //see net.minecraft.item.ItemTier class for information on vanilla tools
        MITHRIL(3, 750, 8.0F, 3.5F, 12, () -> {
            return Ingredient.fromItems(RegistryHandler.INGOT_MITHRIL.get());
        });




        private ModItemTier(int harvestLevelIn, int maxUsesIn, float efficiencyIn, float attackDamageIn, int enchantabilityIn, Supplier<Ingredient> repairMaterialIn) {
            this.harvestLevel = harvestLevelIn;
            this.maxUses = maxUsesIn;
            this.efficiency = efficiencyIn;
            this.attackDamage = attackDamageIn;
            this.enchantability = enchantabilityIn;
            this.repairMaterial = new LazyValue<>(repairMaterialIn);
        }

        private final int harvestLevel;
        private final int maxUses;
        private final float efficiency;
        private final float attackDamage;
        private final int enchantability;
        private final LazyValue<Ingredient> repairMaterial;


        @Override
        public int getMaxUses() {
            return maxUses;
        }

        @Override
        public float getEfficiency() {
            return efficiency;
        }

        @Override
        public float getAttackDamage() {
            return attackDamage;
        }

        @Override
        public int getHarvestLevel() {
            return harvestLevel;
        }

        @Override
        public int getEnchantability() {
            return enchantability;
        }

        @Override
        public Ingredient getRepairMaterial() {
            return getRepairMaterial();
        }

    }

