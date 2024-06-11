package net.deathhancox.materiadex.items;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties ZERO_VECTOR_DUST = new FoodProperties.Builder()
        .nutrition(1)
        .fast()
        .alwaysEat()
        .saturationMod(0.2f)
        .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 600, 1), 0.5f)
        .build();
    public static final FoodProperties MATRIX_MUNCHIES = new FoodProperties.Builder()
        .nutrition(2)
        .fast()
        .alwaysEat()
        .saturationMod(0.2f)
        .effect(() -> new MobEffectInstance(MobEffects.NIGHT_VISION, 200, 2), 1)
        .build();
}
