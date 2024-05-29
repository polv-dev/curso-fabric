package dev.polv.cursofabric.datagen;

import dev.polv.cursofabric.blocks.ModBlocks;
import dev.polv.cursofabric.custom.ModTags;
import dev.polv.cursofabric.items.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class DatagenItemTagProvider extends FabricTagProvider.ItemTagProvider {

    public DatagenItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(ModTags.Items.RADIOACTIVE_ITEM_TAG)
                .add(ModItems.URANIUM)
                .add(ModItems.URANIUM_SWORD)
                .add(ModItems.URANIUM_AXE)
                .add(ModItems.URANIUM_PICKAXE)
                .add(ModItems.URANIUM_SHOVEL)
                .add(ModItems.URANIUM_HOE)
        ;

        getOrCreateTagBuilder(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.URANIUM_HELMET)
                .add(ModItems.URANIUM_CHESTPLATE)
                .add(ModItems.URANIUM_LEGGINGS)
                .add(ModItems.URANIUM_BOOTS);
    }

}
