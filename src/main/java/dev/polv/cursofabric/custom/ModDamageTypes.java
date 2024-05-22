package dev.polv.cursofabric.custom;

import dev.polv.cursofabric.CursoFabric;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.damage.DamageType;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.world.World;

public class ModDamageTypes {

    public static final RegistryKey<DamageType> RADIATION_DAMAGE_TYPE = RegistryKey.of(RegistryKeys.DAMAGE_TYPE, new Identifier(CursoFabric.MODID, "radiation"));

    public static DamageSource of(World world, RegistryKey<DamageType> damageTypeKey) {
        return new DamageSource(world.getRegistryManager().get(RegistryKeys.DAMAGE_TYPE).entryOf(RADIATION_DAMAGE_TYPE));
    }

}
