package dev.polv.cursofabric.items;

import dev.polv.cursofabric.CursoFabric;
import net.fabricmc.fabric.api.registry.FuelRegistry;

public class ModFuels {

    public static void registerFuels() {
        CursoFabric.LOGGER.info("Registrando combustibles...");

        FuelRegistry.INSTANCE.add(ModItems.URANIUM, 20*60);
    }

}
