package io.github.junyali.extra_ores.entity;

import io.github.junyali.extra_ores.EXtraOres;
import io.github.junyali.extra_ores.entity.custom.CavernCreeperEntity;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

public class ModEntities {

    // Keys
    public static final RegistryKey<EntityType<?>> CAVERN_CREEPER_KEY = RegistryKey.of(
            RegistryKeys.ENTITY_TYPE,
            Identifier.of(EXtraOres.MOD_ID, "cavern_creeper")
    );

    // Hostile Entities
    public static final EntityType<CavernCreeperEntity> CAVERN_CREEPER = Registry.register(
            Registries.ENTITY_TYPE,
            Identifier.of(EXtraOres.MOD_ID, "cavern_creeper"),
            EntityType.Builder.create(CavernCreeperEntity::new, SpawnGroup.MONSTER)
                    .dimensions(0.6f, 1.95f)
                    .build(CAVERN_CREEPER_KEY)
    );

    public static void initialize() {
        EXtraOres.LOGGER.info("Registered Mod Entities for " + EXtraOres.MOD_ID);
    }
}
