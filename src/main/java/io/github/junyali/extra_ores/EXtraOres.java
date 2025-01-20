package io.github.junyali.extra_ores;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.feature.PlacedFeature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import io.github.junyali.extra_ores.item.ModItems;
import io.github.junyali.extra_ores.block.ModBlocks;

public class EXtraOres implements ModInitializer {
	public static final String MOD_ID = "extra-ores";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	public static final RegistryKey<PlacedFeature> LUMINITITE_ORE_PLACED_KEY = RegistryKey.of(RegistryKeys.PLACED_FEATURE, Identifier.of(MOD_ID, "luminitite_ore_generation"));

	@Override
	public void onInitialize() {
		LOGGER.info("Mod started!");
		ModItems.initialize();
		ModBlocks.initialize();
		BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, LUMINITITE_ORE_PLACED_KEY);
	}
}