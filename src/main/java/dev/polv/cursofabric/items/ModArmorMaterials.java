package dev.polv.cursofabric.items;

import dev.polv.cursofabric.CursoFabric;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.ArmorMaterials;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;

import java.util.List;
import java.util.Map;

public class ModArmorMaterials {

    public static final RegistryEntry<ArmorMaterial> URANIUM_ARMOR_MATERIAL = registerArmorMaterial(
            "uranium",
            new ArmorMaterial(
                    Map.of(
                            ArmorItem.Type.HELMET, 2,
                            ArmorItem.Type.CHESTPLATE, 5,
                            ArmorItem.Type.LEGGINGS, 6,
                            ArmorItem.Type.BOOTS, 2,
                            ArmorItem.Type.BODY, 8
                    ),
                    9,
                    SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE,
                    () -> Ingredient.ofItems(ModItems.URANIUM),
                    List.of(new ArmorMaterial.Layer(new Identifier(CursoFabric.MODID, "uranium"))),
                    0f,
                    0f
            )
    );

    private static RegistryEntry<ArmorMaterial> registerArmorMaterial(String id, ArmorMaterial armorMaterial) {
        return Registry.registerReference(Registries.ARMOR_MATERIAL, new Identifier(CursoFabric.MODID, id), armorMaterial);
    }

    public static void registerArmorMaterials() {
        CursoFabric.LOGGER.info("Registrando Armor Materials...");
    }

}
