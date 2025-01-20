package io.github.junyali.extra_ores.generation;

import io.github.junyali.extra_ores.EXtraOres;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.feature.PlacedFeature;

public class ModGeneration {

    public static final RegistryKey<PlacedFeature> LUMINITITE_ORE_PLACED_KEY = RegistryKey.of(RegistryKeys.PLACED_FEATURE, Identifier.of(EXtraOres.MOD_ID, "luminitite_ore_generation"));
    public static final RegistryKey<PlacedFeature> INFERNIUM_ORE_PLACED_KEY = RegistryKey.of(RegistryKeys.PLACED_FEATURE, Identifier.of(EXtraOres.MOD_ID, "infernium_ore_generation"));
    public static final RegistryKey<PlacedFeature> VOIDIUM_ORE_PLACED_KEY = RegistryKey.of(RegistryKeys.PLACED_FEATURE, Identifier.of(EXtraOres.MOD_ID, "voidium_ore_generation"));

    public static void initialize() {
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, LUMINITITE_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(), GenerationStep.Feature.UNDERGROUND_ORES, INFERNIUM_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.foundInTheEnd(), GenerationStep.Feature.UNDERGROUND_ORES, VOIDIUM_ORE_PLACED_KEY);
    }

}
