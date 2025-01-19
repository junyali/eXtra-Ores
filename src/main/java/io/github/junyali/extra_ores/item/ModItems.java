package io.github.junyali.extra_ores.item;

import io.github.junyali.extra_ores.EXtraOres;
import io.github.junyali.extra_ores.tool.ModToolMaterial;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registry;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

public class ModItems {
    // Luminitite Keys
    public static final RegistryKey<Item> LUMINITITE_KEY = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(EXtraOres.MOD_ID, "luminitite"));
    public static final RegistryKey<Item> RAW_LUMINITITE_KEY = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(EXtraOres.MOD_ID, "raw_luminitite"));

    // Infernium Keys
    public static final RegistryKey<Item> INFERNIUM_CLUMP_KEY = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(EXtraOres.MOD_ID, "infernium_clump"));

    public static final RegistryKey<Item> INFERNIUM_SWORD_KEY = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(EXtraOres.MOD_ID, "infernium_sword"));
    public static final RegistryKey<Item> INFERNIUM_PICKAXE_KEY = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(EXtraOres.MOD_ID, "infernium_pickaxe"));
    public static final RegistryKey<Item> INFERNIUM_AXE_KEY = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(EXtraOres.MOD_ID, "infernium_axe"));
    public static final RegistryKey<Item> INFERNIUM_SHOVEL_KEY = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(EXtraOres.MOD_ID, "infernium_shovel"));
    public static final RegistryKey<Item> INFERNIUM_HOE_KEY = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(EXtraOres.MOD_ID, "infernium_hoe"));

    // Voidium Keys
    public static final RegistryKey<Item> VOIDIUM_DUST_KEY = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(EXtraOres.MOD_ID, "voidium_dust"));

    public static final RegistryKey<Item> VOIDIUM_SWORD_KEY = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(EXtraOres.MOD_ID, "voidium_sword"));
    public static final RegistryKey<Item> VOIDIUM_PICKAXE_KEY = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(EXtraOres.MOD_ID, "voidium_pickaxe"));
    public static final RegistryKey<Item> VOIDIUM_AXE_KEY = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(EXtraOres.MOD_ID, "voidium_axe"));
    public static final RegistryKey<Item> VOIDIUM_SHOVEL_KEY = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(EXtraOres.MOD_ID, "voidium_shovel"));
    public static final RegistryKey<Item> VOIDIUM_HOE_KEY = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(EXtraOres.MOD_ID, "voidium_hoe"));

    // Luminitite Items
    public static final Item LUMINITITE = register(
            new Item(new Item.Settings().registryKey(LUMINITITE_KEY)),
            LUMINITITE_KEY
    );

    public static final Item RAW_LUMINITITE = register(
            new Item(new Item.Settings().registryKey(RAW_LUMINITITE_KEY)),
            RAW_LUMINITITE_KEY
    );

    // Infernium Items
    public static final Item INFERNIUM_CLUMP = register(
            new Item(new Item.Settings().registryKey(INFERNIUM_CLUMP_KEY)),
            INFERNIUM_CLUMP_KEY
    );
    public static final Item INFERNIUM_SWORD = register(
            new SwordItem(ModToolMaterial.INFERNIUM_TIER, 1f, 1f, new Item.Settings().registryKey(INFERNIUM_SWORD_KEY)),
            INFERNIUM_SWORD_KEY
    );
    public static final Item INFERNIUM_PICKAXE = register(
            new PickaxeItem(ModToolMaterial.INFERNIUM_TIER, 1f, 1f, new Item.Settings().registryKey(INFERNIUM_PICKAXE_KEY)),
            INFERNIUM_PICKAXE_KEY
    );
    public static final Item INFERNIUM_AXE = register(
            new AxeItem(ModToolMaterial.INFERNIUM_TIER, 1f, -3.5f, new Item.Settings().registryKey(INFERNIUM_AXE_KEY)),
            INFERNIUM_AXE_KEY
    );
    public static final Item INFERNIUM_SHOVEL = register(
            new ShovelItem(ModToolMaterial.INFERNIUM_TIER, 1f, -2.5f, new Item.Settings().registryKey(INFERNIUM_SHOVEL_KEY)),
            INFERNIUM_SHOVEL_KEY
    );
    public static final Item INFERNIUM_HOE = register(
            new HoeItem(ModToolMaterial.INFERNIUM_TIER, 1f, -2.5f, new Item.Settings().registryKey(INFERNIUM_HOE_KEY)),
            INFERNIUM_HOE_KEY
    );

    // Voidium Items
    public static final Item VOIDIUM_DUST = register(
            new Item(new Item.Settings().registryKey(VOIDIUM_DUST_KEY)),
            VOIDIUM_DUST_KEY
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
            entries.add(INFERNIUM_CLUMP);
            entries.add(VOIDIUM_DUST);
        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(entries -> {
            entries.add(INFERNIUM_SWORD);
            entries.add(INFERNIUM_PICKAXE);
            entries.add(INFERNIUM_AXE);
            entries.add(INFERNIUM_SHOVEL);
            entries.add(INFERNIUM_HOE);
        });
    }
}
