package dev.polv.cursofabric.statuseffects;

import dev.polv.cursofabric.custom.ModDamageTypes;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;

public class RadiationEffect extends StatusEffect {

    public RadiationEffect() {
        super(StatusEffectCategory.HARMFUL, 0x00ff00);
    }

    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        int i = 30 >> amplifier;

        if (i > 0) {
            return duration % i == 0;
        } else {
            return true;
        }
    }

    @Override
    public boolean applyUpdateEffect(LivingEntity entity, int amplifier) {
        entity.damage(ModDamageTypes.of(entity.getWorld(), ModDamageTypes.RADIATION_DAMAGE_TYPE), 0.5f);

        return true;
    }
}
