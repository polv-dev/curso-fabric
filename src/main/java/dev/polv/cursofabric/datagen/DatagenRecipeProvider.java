package dev.polv.cursofabric.datagen;

import dev.polv.cursofabric.blocks.ModBlocks;
import dev.polv.cursofabric.items.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class DatagenRecipeProvider extends FabricRecipeProvider {

    public DatagenRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BREWING, ModItems.URANIUM, RecipeCategory.DECORATIONS, ModBlocks.URANIUM_BLOCK.getRight());
    }

}
