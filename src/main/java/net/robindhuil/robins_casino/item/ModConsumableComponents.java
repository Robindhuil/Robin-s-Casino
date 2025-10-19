package net.robindhuil.robins_casino.item;

import net.minecraft.component.type.ConsumableComponent;
import net.minecraft.component.type.ConsumableComponents;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.consume.ApplyEffectsConsumeEffect;

import java.util.List;

public class ModConsumableComponents {


    public static final ConsumableComponent WHISKEY_BOTTLE = ConsumableComponents.drink()
            .consumeEffect(
                    new ApplyEffectsConsumeEffect(
                            List.of(
                                    new StatusEffectInstance(StatusEffects.NAUSEA, 1000, 1),
                                    new StatusEffectInstance(StatusEffects.STRENGTH, 1000, 1),
                                    new StatusEffectInstance(StatusEffects.SPEED, 500, 1)
                            )
                    )
            )
            .build();



}
