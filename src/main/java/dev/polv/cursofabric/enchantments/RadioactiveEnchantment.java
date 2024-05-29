package dev.polv.cursofabric.enchantments;

import dev.polv.cursofabric.custom.ModTags;
import dev.polv.cursofabric.statuseffects.ModStatusEffects;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.resource.featuretoggle.FeatureSet;

import java.util.Optional;

public class RadioactiveEnchantment extends Enchantment {

    public RadioactiveEnchantment() {
        super(new Properties(
                ModTags.Items.RADIOACTIVE_ENCHANTABLE_ITEM,
                Optional.empty(),
                5,
                1,
                new Enchantment.Cost(1, 2),
                new Enchantment.Cost(3, 3),
                1,
                FeatureSet.empty(),
                new EquipmentSlot[]{
                        EquipmentSlot.CHEST,
                        EquipmentSlot.BODY,
                        EquipmentSlot.LEGS,
                        EquipmentSlot.FEET,
                        EquipmentSlot.MAINHAND,
                }
        ));
    }

    @Override
    public void onTargetDamaged(LivingEntity user, Entity target, int level) {
        if (target instanceof LivingEntity livingEntity) {
            livingEntity.addStatusEffect(new StatusEffectInstance(
                    ModStatusEffects.RADIATION_STATUS_EFFECT,
                    20*10,
                    level
            ));
        }
    }

    @Override
    public void onUserDamaged(LivingEntity user, Entity attacker, int level) {
        if (attacker instanceof LivingEntity livingEntity) {
            livingEntity.addStatusEffect(new StatusEffectInstance(
                    ModStatusEffects.RADIATION_STATUS_EFFECT,
                    20*10,
                    level
            ));
        }
    }
}
