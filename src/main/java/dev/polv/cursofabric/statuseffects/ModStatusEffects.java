package dev.polv.cursofabric.statuseffects;

import dev.polv.cursofabric.CursoFabric;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;

public class ModStatusEffects {

    public static final RegistryEntry.Reference<StatusEffect> RADIATION_STATUS_EFFECT = registerEffect("radiation", new RadiationEffect());

    private static RegistryEntry.Reference<StatusEffect> registerEffect(String name, StatusEffect effect) {
        return Registry.registerReference(Registries.STATUS_EFFECT, new Identifier(CursoFabric.MODID, name), effect);
    }

    public static void registerStatusEffects() {
        CursoFabric.LOGGER.info("Registrando efectos...");
    }

}
