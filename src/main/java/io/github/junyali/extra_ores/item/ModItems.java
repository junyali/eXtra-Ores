package io.github.junyali.extra_ores.item;

import io.github.junyali.extra_ores.EXtraOres;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registry;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final RegistryKey<Item> LUMINITITE_KEY = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(EXtraOres.MOD_ID, "luminitite"));
    public static final RegistryKey<Item> RAW_LUMINITITE_KEY = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(EXtraOres.MOD_ID, "raw_luminitite"));

    public static final Item LUMINITITE = register(
            new Item(new Item.Settings().registryKey(LUMINITITE_KEY)),
            LUMINITITE_KEY
    );

    public static final Item RAW_LUMINITITE = register(
            new Item(new Item.Settings().registryKey(RAW_LUMINITITE_KEY)),
            RAW_LUMINITITE_KEY
    );

    public static Item register(Item item, RegistryKey<Item> registryKey) {
        Item registeredItem = Registry.register(Registries.ITEM, registryKey.getValue(), item);
        return registeredItem;
    }

    public static void initialize() {
        EXtraOres.LOGGER.info("Registered Mod Items for " + EXtraOres.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(LUMINITITE);
            entries.add(RAW_LUMINITITE);
        });
    }
}
