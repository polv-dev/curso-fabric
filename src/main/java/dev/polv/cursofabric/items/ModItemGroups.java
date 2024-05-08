package dev.polv.cursofabric.items;

import dev.polv.cursofabric.CursoFabric;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    public static final ItemGroup URANIUM_ITEM_GROUP = registerItemGroup("uranium_group",
            FabricItemGroup.builder()
                    .displayName(Text.translatable("itemGroup.cursofabric.uranium_group"))
                    .icon(() -> new ItemStack(ModItems.URANIUM))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.URANIUM);
                    })
                    .build()
    );

    private static ItemGroup registerItemGroup(String itemGroupId, ItemGroup itemGroup) {
        return Registry.register(Registries.ITEM_GROUP, new Identifier(CursoFabric.MODID, itemGroupId), itemGroup);
    }

    public static void registerItemGroups() {
        CursoFabric.LOGGER.info("Registrando grupos de item...");
    }

}
