package dev.polv.cursofabric;

import dev.polv.cursofabric.datagen.*;
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
		pack.addProvider(DatagenBlockTagProvider::new);
		pack.addProvider(DatagenItemTagProvider::new);
	}
}
