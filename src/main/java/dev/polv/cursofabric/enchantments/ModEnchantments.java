package dev.polv.cursofabric.enchantments;

import dev.polv.cursofabric.CursoFabric;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModEnchantments {

    public static final Enchantment RADIOACTIVE_ENCHANTMENT = registerEnchantment("radioactive", new RadioactiveEnchantment());

    private static Enchantment registerEnchantment(String enchantmentId, Enchantment enchantment) {
        return Registry.register(Registries.ENCHANTMENT, new Identifier(CursoFabric.MODID, enchantmentId), enchantment);
    }

    public static void registerEnchantments() {
        CursoFabric.LOGGER.info("Registrando encantamientos...");
    }

}
