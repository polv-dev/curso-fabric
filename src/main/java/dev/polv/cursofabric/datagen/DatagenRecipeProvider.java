package dev.polv.cursofabric.datagen;

import dev.polv.cursofabric.blocks.ModBlocks;
import dev.polv.cursofabric.items.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.util.Identifier;

import java.util.concurrent.CompletableFuture;

public class DatagenRecipeProvider extends FabricRecipeProvider {

    public DatagenRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BREWING, ModItems.URANIUM, RecipeCategory.DECORATIONS, ModBlocks.URANIUM_BLOCK.getRight());

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.URANIUM_SWORD)
                .input('U', ModItems.URANIUM)
                .input('S', Items.STICK)
                .pattern(" U ")
                .pattern(" U ")
                .pattern(" S ")
                .criterion(hasItem(ModItems.URANIUM), conditionsFromItem(ModItems.URANIUM))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.URANIUM_SWORD)));
    }

}
