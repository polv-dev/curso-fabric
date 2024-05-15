package dev.polv.cursofabric.items;

import dev.polv.cursofabric.CursoFabric;
import dev.polv.cursofabric.items.custom.UraniumItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item URANIUM = registerItem("uranium", new UraniumItem(new Item.Settings()));

    private static Item registerItem(String itemId, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(CursoFabric.MODID, itemId), item);
    }

    public static void registerItems() {
        CursoFabric.LOGGER.info("Registrando items...");
    }

}
