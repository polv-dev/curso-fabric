package dev.polv.cursofabric.items;

import dev.polv.cursofabric.CursoFabric;
import dev.polv.cursofabric.items.custom.UraniumItem;
import dev.polv.cursofabric.items.materials.UraniumModMaterial;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item URANIUM = registerItem("uranium", new UraniumItem(new Item.Settings()));

    public static final Item URANIUM_SWORD = registerItem("uranium_sword", new SwordItem(UraniumModMaterial.INSTANCE, new Item.Settings()));
    public static final Item URANIUM_PICKAXE = registerItem("uranium_pickaxe", new PickaxeItem(UraniumModMaterial.INSTANCE, new Item.Settings()));
    public static final Item URANIUM_AXE = registerItem("uranium_axe", new AxeItem(UraniumModMaterial.INSTANCE, new Item.Settings()));
    public static final Item URANIUM_SHOVEL = registerItem("uranium_shovel", new ShovelItem(UraniumModMaterial.INSTANCE, new Item.Settings()));
    public static final Item URANIUM_HOE = registerItem("uranium_hoe", new HoeItem(UraniumModMaterial.INSTANCE, new Item.Settings()));

    public static final Item URANIUM_HELMET = registerItem(
            "uranium_helmet",
            new ArmorItem(ModArmorMaterials.URANIUM_ARMOR_MATERIAL, ArmorItem.Type.HELMET, new Item.Settings())
    );
    public static final Item URANIUM_CHESTPLATE = registerItem(
            "uranium_chestplate",
            new ArmorItem(ModArmorMaterials.URANIUM_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE, new Item.Settings())
    );
    public static final Item URANIUM_LEGGINGS = registerItem(
            "uranium_leggings",
            new ArmorItem(ModArmorMaterials.URANIUM_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS, new Item.Settings())
    );
    public static final Item URANIUM_BOOTS = registerItem(
            "uranium_boots",
            new ArmorItem(ModArmorMaterials.URANIUM_ARMOR_MATERIAL, ArmorItem.Type.BOOTS, new Item.Settings())
    );

    private static Item registerItem(String itemId, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(CursoFabric.MODID, itemId), item);
    }

    public static void registerItems() {
        CursoFabric.LOGGER.info("Registrando items...");
    }

}
