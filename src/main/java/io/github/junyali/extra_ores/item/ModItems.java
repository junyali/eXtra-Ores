package io.github.junyali.extra_ores.item;

import io.github.junyali.extra_ores.EXtraOres;
import io.github.junyali.extra_ores.tool.ModToolMaterial;
import io.github.junyali.extra_ores.armor.ModArmorMaterial;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.item.equipment.EquipmentAsset;
import net.minecraft.item.equipment.EquipmentAssetKeys;
import net.minecraft.item.equipment.EquipmentType;
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

    public static final RegistryKey<EquipmentAsset> INFERNIUM_ARMOR_MATERIAL_KEY = RegistryKey.of(EquipmentAssetKeys.REGISTRY_KEY, Identifier.of(EXtraOres.MOD_ID, "infernium"));
    public static final RegistryKey<Item> INFERNIUM_HELMET_KEY = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(EXtraOres.MOD_ID, "infernium_helmet"));
    public static final RegistryKey<Item> INFERNIUM_CHESTPLATE_KEY = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(EXtraOres.MOD_ID, "infernium_chestplate"));
    public static final RegistryKey<Item> INFERNIUM_LEGGINGS_KEY = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(EXtraOres.MOD_ID, "infernium_leggings"));
    public static final RegistryKey<Item> INFERNIUM_BOOTS_KEY = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(EXtraOres.MOD_ID, "infernium_boots"));

    // Voidium Keys
    public static final RegistryKey<Item> VOIDIUM_DUST_KEY = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(EXtraOres.MOD_ID, "voidium_dust"));

    public static final RegistryKey<Item> VOIDIUM_SWORD_KEY = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(EXtraOres.MOD_ID, "voidium_sword"));
    public static final RegistryKey<Item> VOIDIUM_PICKAXE_KEY = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(EXtraOres.MOD_ID, "voidium_pickaxe"));
    public static final RegistryKey<Item> VOIDIUM_AXE_KEY = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(EXtraOres.MOD_ID, "voidium_axe"));
    public static final RegistryKey<Item> VOIDIUM_SHOVEL_KEY = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(EXtraOres.MOD_ID, "voidium_shovel"));
    public static final RegistryKey<Item> VOIDIUM_HOE_KEY = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(EXtraOres.MOD_ID, "voidium_hoe"));

    public static final RegistryKey<EquipmentAsset> VOIDIUM_ARMOR_MATERIAL_KEY = RegistryKey.of(EquipmentAssetKeys.REGISTRY_KEY, Identifier.of(EXtraOres.MOD_ID, "voidium"));
    public static final RegistryKey<Item> VOIDIUM_HELMET_KEY = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(EXtraOres.MOD_ID, "voidium_helmet"));
    public static final RegistryKey<Item> VOIDIUM_CHESTPLATE_KEY = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(EXtraOres.MOD_ID, "voidium_chestplate"));
    public static final RegistryKey<Item> VOIDIUM_LEGGINGS_KEY = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(EXtraOres.MOD_ID, "voidium_leggings"));
    public static final RegistryKey<Item> VOIDIUM_BOOTS_KEY = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(EXtraOres.MOD_ID, "voidium_boots"));

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
    public static final Item INFERNIUM_HELMET = register(
            new ArmorItem(ModArmorMaterial.INFERNIUM_TIER, EquipmentType.HELMET, new Item.Settings().registryKey(INFERNIUM_HELMET_KEY).maxDamage(EquipmentType.HELMET.getMaxDamage(5))),
            INFERNIUM_HELMET_KEY
    );
    public static final Item INFERNIUM_CHESTPLATE = register(
            new ArmorItem(ModArmorMaterial.INFERNIUM_TIER, EquipmentType.CHESTPLATE, new Item.Settings().registryKey(INFERNIUM_CHESTPLATE_KEY).maxDamage(EquipmentType.CHESTPLATE.getMaxDamage(30))),
            INFERNIUM_CHESTPLATE_KEY
    );
    public static final Item INFERNIUM_LEGGINGS = register(
            new ArmorItem(ModArmorMaterial.INFERNIUM_TIER, EquipmentType.LEGGINGS, new Item.Settings().registryKey(INFERNIUM_LEGGINGS_KEY).maxDamage(EquipmentType.LEGGINGS.getMaxDamage(15))),
            INFERNIUM_LEGGINGS_KEY
    );
    public static final Item INFERNIUM_BOOTS = register(
            new ArmorItem(ModArmorMaterial.INFERNIUM_TIER, EquipmentType.BOOTS, new Item.Settings().registryKey(INFERNIUM_BOOTS_KEY).maxDamage(EquipmentType.BOOTS.getMaxDamage(10))),
            INFERNIUM_BOOTS_KEY
    );

    // Voidium Items
    public static final Item VOIDIUM_DUST = register(
            new Item(new Item.Settings().registryKey(VOIDIUM_DUST_KEY)),
            VOIDIUM_DUST_KEY
    );
    public static final Item VOIDIUM_SWORD = register(
            new SwordItem(ModToolMaterial.VOIDIUM_TIER, 1f, 1f, new Item.Settings().registryKey(VOIDIUM_SWORD_KEY)),
            VOIDIUM_SWORD_KEY
    );
    public static final Item VOIDIUM_PICKAXE = register(
            new PickaxeItem(ModToolMaterial.VOIDIUM_TIER, 1f, 1f, new Item.Settings().registryKey(VOIDIUM_PICKAXE_KEY)),
            VOIDIUM_PICKAXE_KEY
    );
    public static final Item VOIDIUM_AXE = register(
            new AxeItem(ModToolMaterial.VOIDIUM_TIER, 1f, -3.5f, new Item.Settings().registryKey(VOIDIUM_AXE_KEY)),
            VOIDIUM_AXE_KEY
    );
    public static final Item VOIDIUM_SHOVEL = register(
            new ShovelItem(ModToolMaterial.VOIDIUM_TIER, 1f, -2.5f, new Item.Settings().registryKey(VOIDIUM_SHOVEL_KEY)),
            VOIDIUM_SHOVEL_KEY
    );
    public static final Item VOIDIUM_HOE = register(
            new HoeItem(ModToolMaterial.VOIDIUM_TIER, 1f, -2.5f, new Item.Settings().registryKey(VOIDIUM_HOE_KEY)),
            VOIDIUM_HOE_KEY
    );
    public static final Item VOIDIUM_HELMET = register(
            new ArmorItem(ModArmorMaterial.VOIDIUM_TIER, EquipmentType.HELMET, new Item.Settings().registryKey(VOIDIUM_HELMET_KEY).maxDamage(EquipmentType.HELMET.getMaxDamage(5))),
            VOIDIUM_HELMET_KEY
    );
    public static final Item VOIDIUM_CHESTPLATE = register(
            new ArmorItem(ModArmorMaterial.VOIDIUM_TIER, EquipmentType.CHESTPLATE, new Item.Settings().registryKey(VOIDIUM_CHESTPLATE_KEY).maxDamage(EquipmentType.CHESTPLATE.getMaxDamage(30))),
            VOIDIUM_CHESTPLATE_KEY
    );
    public static final Item VOIDIUM_LEGGINGS = register(
            new ArmorItem(ModArmorMaterial.VOIDIUM_TIER, EquipmentType.LEGGINGS, new Item.Settings().registryKey(VOIDIUM_LEGGINGS_KEY).maxDamage(EquipmentType.LEGGINGS.getMaxDamage(15))),
            VOIDIUM_LEGGINGS_KEY
    );
    public static final Item VOIDIUM_BOOTS = register(
            new ArmorItem(ModArmorMaterial.VOIDIUM_TIER, EquipmentType.BOOTS, new Item.Settings().registryKey(VOIDIUM_BOOTS_KEY).maxDamage(EquipmentType.BOOTS.getMaxDamage(10))),
            VOIDIUM_BOOTS_KEY
    );

    public static Item register(Item item, RegistryKey<Item> registryKey) {
        return Registry.register(Registries.ITEM, registryKey.getValue(), item);
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

            entries.add(VOIDIUM_SWORD);
            entries.add(VOIDIUM_PICKAXE);
            entries.add(VOIDIUM_AXE);
            entries.add(VOIDIUM_SHOVEL);
            entries.add(VOIDIUM_HOE);
        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(entries -> {
            entries.add(INFERNIUM_HELMET);
            entries.add(INFERNIUM_CHESTPLATE);
            entries.add(INFERNIUM_LEGGINGS);
            entries.add(INFERNIUM_BOOTS);

            entries.add(VOIDIUM_HELMET);
            entries.add(VOIDIUM_CHESTPLATE);
            entries.add(VOIDIUM_LEGGINGS);
            entries.add(VOIDIUM_BOOTS);
        });

    }
}
