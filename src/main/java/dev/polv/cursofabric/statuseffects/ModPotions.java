package dev.polv.cursofabric.statuseffects;

import dev.polv.cursofabric.CursoFabric;
import dev.polv.cursofabric.items.ModItems;
import net.fabricmc.fabric.api.registry.FabricBrewingRecipeRegistryBuilder;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.item.Item;
import net.minecraft.potion.Potion;
import net.minecraft.potion.Potions;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;

public class ModPotions {

    public static final RegistryEntry<Potion> RADIATION_POTION = registerPotion(
            "radiation",
            new Potion(
                    new StatusEffectInstance(
                            ModStatusEffects.RADIATION_STATUS_EFFECT,
                            3600,
                            0
                    )
            ),
            ModItems.URANIUM
    );

    private static RegistryEntry<Potion> registerPotion(String potionId, Potion potion, Item ingredient) {
        RegistryEntry<Potion> potionRegistryEntry = Registry.registerReference(
                Registries.POTION,
                new Identifier(CursoFabric.MODID, potionId),
                potion
        );

        FabricBrewingRecipeRegistryBuilder.BUILD.register(builder ->
                builder.registerPotionRecipe(Potions.WATER, ingredient, potionRegistryEntry)
        );

        return potionRegistryEntry;
    }

    public static void registerPotions() {
        CursoFabric.LOGGER.info("Registrando pociones...");
    }

}
