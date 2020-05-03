package com.elot.elotpack.items;

import net.minecraft.item.Food;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class ModFoods {

    public static final Food POPCORN = (new Food.Builder()).hunger(1).saturation(0.1F).effect(new EffectInstance(Effects.SPEED, 300, 1), 0.25F).setAlwaysEdible().fastToEat().build();
    public static final Food ZOMBIE_JERKY = (new Food.Builder()).hunger(4).saturation(0.3F).build();
    public static final Food GARLIC = (new Food.Builder()).hunger(2).saturation(0.2F).build();
    public static final Food VAMPIRE_DUST = (new Food.Builder()).setAlwaysEdible().effect(new EffectInstance(Effects.INVISIBILITY, 100), 1.0F).build();

}
