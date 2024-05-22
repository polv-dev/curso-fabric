package dev.polv.cursofabric;

import dev.polv.cursofabric.datagen.DatagenAdvancementProvider;
import dev.polv.cursofabric.datagen.DatagenLootTableProvider;
import dev.polv.cursofabric.datagen.DatagenModelProvider;
import dev.polv.cursofabric.datagen.DatagenRecipeProvider;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class CursoFabricDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(DatagenModelProvider::new);
		pack.addProvider(DatagenLootTableProvider::new);
		pack.addProvider(DatagenRecipeProvider::new);
		pack.addProvider(DatagenAdvancementProvider::new);
	}
}
