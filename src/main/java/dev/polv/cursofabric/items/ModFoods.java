package dev.polv.cursofabric.items;

import dev.polv.cursofabric.statuseffects.ModStatusEffects;
import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;

import java.util.List;

public class ModFoods {

    public static final FoodComponent URANIUM = new FoodComponent(
            5,
            0.2f,
            false,
            2.5f,
            List.of(
                    new FoodComponent.StatusEffectEntry(
                            new StatusEffectInstance(
                                    ModStatusEffects.RADIATION_STATUS_EFFECT,
                                    20*15,
                                    2
                            ),
                            0.5f
                    ),
                    new FoodComponent.StatusEffectEntry(
                            new StatusEffectInstance(
                                    StatusEffects.NAUSEA,
                                    20*15,
                                    3
                            ),
                            1f
                    )
            )
    );

}
