package io.github.junyali.extra_ores.item;

import io.github.junyali.extra_ores.EXtraOres;
import io.github.junyali.extra_ores.block.ModBlocks;
import io.github.junyali.extra_ores.tool.ModToolMaterial;
import io.github.junyali.extra_ores.armor.ModArmorMaterial;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.registry.FuelRegistryEvents;
import net.minecraft.component.type.ConsumableComponent;
import net.minecraft.component.type.ConsumableComponents;
import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.*;
import net.minecraft.item.consume.ApplyEffectsConsumeEffect;
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

    // Cryocite Keys
    public static final RegistryKey<Item> CRYO_SHARD_KEY = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(EXtraOres.MOD_ID, "cryo_shard"));

    public static final RegistryKey<Item> CRYOCITE_SWORD_KEY = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(EXtraOres.MOD_ID, "cryocite_sword"));
    public static final RegistryKey<Item> CRYOCITE_PICKAXE_KEY = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(EXtraOres.MOD_ID, "cryocite_pickaxe"));
    public static final RegistryKey<Item> CRYOCITE_AXE_KEY = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(EXtraOres.MOD_ID, "cryocite_axe"));
    public static final RegistryKey<Item> CRYOCITE_SHOVEL_KEY = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(EXtraOres.MOD_ID, "cryocite_shovel"));
    public static final RegistryKey<Item> CRYOCITE_HOE_KEY = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(EXtraOres.MOD_ID, "cryocite_hoe"));

    public static final RegistryKey<EquipmentAsset> CRYOCITE_ARMOR_MATERIAL_KEY = RegistryKey.of(EquipmentAssetKeys.REGISTRY_KEY, Identifier.of(EXtraOres.MOD_ID, "cryocite"));
    public static final RegistryKey<Item> CRYOCITE_HELMET_KEY = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(EXtraOres.MOD_ID, "cryocite_helmet"));
    public static final RegistryKey<Item> CRYOCITE_CHESTPLATE_KEY = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(EXtraOres.MOD_ID, "cryocite_chestplate"));
    public static final RegistryKey<Item> CRYOCITE_LEGGINGS_KEY = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(EXtraOres.MOD_ID, "cryocite_leggings"));
    public static final RegistryKey<Item> CRYOCITE_BOOTS_KEY = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(EXtraOres.MOD_ID, "cryocite_boots"));

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

    // Misc Keys
    public static final RegistryKey<Item> SCORCHED_COAL_KEY = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(EXtraOres.MOD_ID, "scorched_coal"));
    public static final RegistryKey<Item> CRYOCITE_UPGRADE_SMITHING_TEMPLATE_KEY = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(EXtraOres.MOD_ID, "cryocite_upgrade_smithing_template"));
    public static final RegistryKey<Item> INFERNIUM_UPGRADE_SMITHING_TEMPLATE_KEY = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(EXtraOres.MOD_ID, "infernium_upgrade_smithing_template"));
    public static final RegistryKey<Item> VOIDIUM_UPGRADE_SMITHING_TEMPLATE_KEY = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(EXtraOres.MOD_ID, "voidium_upgrade_smithing_template"));

    // Consumables Keys
    public static final RegistryKey<Item> LUMINOUS_APPLE_KEY = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(EXtraOres.MOD_ID, "luminous_apple"));
    public static final RegistryKey<Item> FIERY_APPLE_KEY = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(EXtraOres.MOD_ID, "fiery_apple"));
    public static final RegistryKey<Item> INFERNO_STEW_KEY = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(EXtraOres.MOD_ID, "inferno_stew"));
    public static final RegistryKey<Item> FUSION_CARROT_KEY = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(EXtraOres.MOD_ID, "fusion_carrot"));
    public static final RegistryKey<Item> VOID_BERRIES_KEY = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(EXtraOres.MOD_ID, "void_berries"));

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
            new ArmorItem(ModArmorMaterial.INFERNIUM_TIER, EquipmentType.HELMET, new Item.Settings().registryKey(INFERNIUM_HELMET_KEY).maxDamage(EquipmentType.HELMET.getMaxDamage(11))),
            INFERNIUM_HELMET_KEY
    );
    public static final Item INFERNIUM_CHESTPLATE = register(
            new ArmorItem(ModArmorMaterial.INFERNIUM_TIER, EquipmentType.CHESTPLATE, new Item.Settings().registryKey(INFERNIUM_CHESTPLATE_KEY).maxDamage(EquipmentType.CHESTPLATE.getMaxDamage(16))),
            INFERNIUM_CHESTPLATE_KEY
    );
    public static final Item INFERNIUM_LEGGINGS = register(
            new ArmorItem(ModArmorMaterial.INFERNIUM_TIER, EquipmentType.LEGGINGS, new Item.Settings().registryKey(INFERNIUM_LEGGINGS_KEY).maxDamage(EquipmentType.LEGGINGS.getMaxDamage(15))),
            INFERNIUM_LEGGINGS_KEY
    );
    public static final Item INFERNIUM_BOOTS = register(
            new ArmorItem(ModArmorMaterial.INFERNIUM_TIER, EquipmentType.BOOTS, new Item.Settings().registryKey(INFERNIUM_BOOTS_KEY).maxDamage(EquipmentType.BOOTS.getMaxDamage(13))),
            INFERNIUM_BOOTS_KEY
    );

    // Cryocite Items
    public static final Item CRYO_SHARD = register(
            new Item(new Item.Settings().registryKey(CRYO_SHARD_KEY)),
            CRYO_SHARD_KEY
    );
    public static final Item CRYOCITE_SWORD = register(
            new SwordItem(ModToolMaterial.CRYOCITE_TIER, 1f, 1f, new Item.Settings().registryKey(CRYOCITE_SWORD_KEY)),
            CRYOCITE_SWORD_KEY
    );
    public static final Item CRYOCITE_PICKAXE = register(
            new PickaxeItem(ModToolMaterial.CRYOCITE_TIER, 1f, 1f, new Item.Settings().registryKey(CRYOCITE_PICKAXE_KEY)),
            CRYOCITE_PICKAXE_KEY
    );
    public static final Item CRYOCITE_AXE = register(
            new AxeItem(ModToolMaterial.CRYOCITE_TIER, 1f, -3.5f, new Item.Settings().registryKey(CRYOCITE_AXE_KEY)),
            CRYOCITE_AXE_KEY
    );
    public static final Item CRYOCITE_SHOVEL = register(
            new ShovelItem(ModToolMaterial.CRYOCITE_TIER, 1f, -2.5f, new Item.Settings().registryKey(CRYOCITE_SHOVEL_KEY)),
            CRYOCITE_SHOVEL_KEY
    );
    public static final Item CRYOCITE_HOE = register(
            new HoeItem(ModToolMaterial.CRYOCITE_TIER, 1f, -2.5f, new Item.Settings().registryKey(CRYOCITE_HOE_KEY)),
            CRYOCITE_HOE_KEY
    );
    public static final Item CRYOCITE_HELMET = register(
            new ArmorItem(ModArmorMaterial.CRYOCITE_TIER, EquipmentType.HELMET, new Item.Settings().registryKey(CRYOCITE_HELMET_KEY).maxDamage(EquipmentType.HELMET.getMaxDamage(11))),
            CRYOCITE_HELMET_KEY
    );
    public static final Item CRYOCITE_CHESTPLATE = register(
            new ArmorItem(ModArmorMaterial.CRYOCITE_TIER, EquipmentType.CHESTPLATE, new Item.Settings().registryKey(CRYOCITE_CHESTPLATE_KEY).maxDamage(EquipmentType.CHESTPLATE.getMaxDamage(16))),
            CRYOCITE_CHESTPLATE_KEY
    );
    public static final Item CRYOCITE_LEGGINGS = register(
            new ArmorItem(ModArmorMaterial.CRYOCITE_TIER, EquipmentType.LEGGINGS, new Item.Settings().registryKey(CRYOCITE_LEGGINGS_KEY).maxDamage(EquipmentType.LEGGINGS.getMaxDamage(15))),
            CRYOCITE_LEGGINGS_KEY
    );
    public static final Item CRYOCITE_BOOTS = register(
            new ArmorItem(ModArmorMaterial.CRYOCITE_TIER, EquipmentType.BOOTS, new Item.Settings().registryKey(CRYOCITE_BOOTS_KEY).maxDamage(EquipmentType.BOOTS.getMaxDamage(13))),
            CRYOCITE_BOOTS_KEY
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
            new ArmorItem(ModArmorMaterial.VOIDIUM_TIER, EquipmentType.HELMET, new Item.Settings().registryKey(VOIDIUM_HELMET_KEY).maxDamage(EquipmentType.HELMET.getMaxDamage(12))),
            VOIDIUM_HELMET_KEY
    );
    public static final Item VOIDIUM_CHESTPLATE = register(
            new ArmorItem(ModArmorMaterial.VOIDIUM_TIER, EquipmentType.CHESTPLATE, new Item.Settings().registryKey(VOIDIUM_CHESTPLATE_KEY).maxDamage(EquipmentType.CHESTPLATE.getMaxDamage(16))),
            VOIDIUM_CHESTPLATE_KEY
    );
    public static final Item VOIDIUM_LEGGINGS = register(
            new ArmorItem(ModArmorMaterial.VOIDIUM_TIER, EquipmentType.LEGGINGS, new Item.Settings().registryKey(VOIDIUM_LEGGINGS_KEY).maxDamage(EquipmentType.LEGGINGS.getMaxDamage(15))),
            VOIDIUM_LEGGINGS_KEY
    );
    public static final Item VOIDIUM_BOOTS = register(
            new ArmorItem(ModArmorMaterial.VOIDIUM_TIER, EquipmentType.BOOTS, new Item.Settings().registryKey(VOIDIUM_BOOTS_KEY).maxDamage(EquipmentType.BOOTS.getMaxDamage(12))),
            VOIDIUM_BOOTS_KEY
    );

    // Misc Items
    public static final Item SCORCHED_COAL = register(
            new Item(new Item.Settings().registryKey(SCORCHED_COAL_KEY)),
            SCORCHED_COAL_KEY
    );
    public static final Item CRYOCITE_UPGRADE_SMITHING_TEMPLATE = register(
            new Item(new Item.Settings().registryKey(CRYOCITE_UPGRADE_SMITHING_TEMPLATE_KEY)),
            CRYOCITE_UPGRADE_SMITHING_TEMPLATE_KEY
    );
    public static final Item INFERNIUM_UPGRADE_SMITHING_TEMPLATE = register(
            new Item(new Item.Settings().registryKey(INFERNIUM_UPGRADE_SMITHING_TEMPLATE_KEY)),
            INFERNIUM_UPGRADE_SMITHING_TEMPLATE_KEY
    );
    public static final Item VOIDIUM_UPGRADE_SMITHING_TEMPLATE = register(
            new Item(new Item.Settings().registryKey(VOIDIUM_UPGRADE_SMITHING_TEMPLATE_KEY)),
            VOIDIUM_UPGRADE_SMITHING_TEMPLATE_KEY
    );

    // Consumables Components
    public static final ConsumableComponent GLOWING_FOOD_CONSUMABLE_COMPONENT = ConsumableComponents.food()
            // 2 minutes: 2 * 60 seconds * 20 ticks per second
            .consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.GLOWING, 2 * 60 * 20, 1), 1.0f))
            .consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.NIGHT_VISION, 2 * 60 * 20, 1), 1.0f))
            .build();
    public static final FoodComponent GLOWING_FOOD_COMPONENT = new FoodComponent.Builder()
            .alwaysEdible()
            .nutrition(4)
            .saturationModifier(9.6f)
            .build();

    public static final ConsumableComponent FIERY_FOOD_CONSUMABLE_COMPONENT = ConsumableComponents.food()
            .consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 8 * 60 * 20, 1), 1.0f))
            .consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 2 * 60 * 20, 2), 1.0f))
            .consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.HASTE, 4 * 60 * 20, 2), 1.0f))
            .build();
    public static final FoodComponent FIERY_FOOD_COMPONENT = new FoodComponent.Builder()
            .alwaysEdible()
            .nutrition(4)
            .saturationModifier(9.6f)
            .build();

    public static final ConsumableComponent INFERNO_FOOD_CONSUMABLE_COMPONENT = ConsumableComponents.food()
            .consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 20 * 60 * 20, 1), 0.8f))
            .consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 2 * 60 * 20, 3), 0.5f))
            .consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.WEAKNESS, 3 * 60 * 20, 3), 0.3f))
            .consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 4 * 60 * 20, 3), 0.6f))
            // too spicy 4 u lol!
            .consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.WITHER, 20 * 20, 1), 0.1f))
            .consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.HUNGER, 30 * 20, 2), 1.0f))
            .build();
    public static final FoodComponent INFERNO_FOOD_COMPONENT = new FoodComponent.Builder()
            .nutrition(6)
            .saturationModifier(7.2f)
            .build();

    public static final ConsumableComponent FUSION_FOOD_CONSUMABLE_COMPONENT = ConsumableComponents.food()
            .consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 8 * 60 * 20, 1), 1.0f))
            .consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 8 * 60 * 20, 2), 1.0f))
            .consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 8 * 60 * 20, 2), 1.0f))
            .consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.GLOWING, 8 * 60 * 20, 1), 1.0f))
            .consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.NIGHT_VISION, 8 * 60 * 20, 1), 1.0f))
            .consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.INSTANT_DAMAGE, 20, 2), 1.0f))
            .build();
    public static final FoodComponent FUSION_FOOD_COMPONENT = new FoodComponent.Builder()
            .nutrition(6)
            .saturationModifier(14.4f)
            .build();

    public static final ConsumableComponent VOID_FOOD_CONSUMABLE_COMPONENT = ConsumableComponents.food()
            .consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.LEVITATION, 5 * 20, 1), 1.0f))
            .consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.INVISIBILITY, 20 * 20, 1), 1.0f))
            .consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 8 * 60 * 20, 3), 1.0f))
            .build();
    public static final FoodComponent VOID_FOOD_COMPONENT = new FoodComponent.Builder()
            .nutrition(2)
            .saturationModifier(4.8f)
            .build();

    // Consumables Items
    public static final Item LUMINOUS_APPLE = register(
            new Item(new Item.Settings().registryKey(LUMINOUS_APPLE_KEY).food(GLOWING_FOOD_COMPONENT, GLOWING_FOOD_CONSUMABLE_COMPONENT)),
            LUMINOUS_APPLE_KEY
    );
    public static final Item FIERY_APPLE = register(
            new Item(new Item.Settings().registryKey(FIERY_APPLE_KEY).food(FIERY_FOOD_COMPONENT, FIERY_FOOD_CONSUMABLE_COMPONENT)),
            FIERY_APPLE_KEY
    );
    public static final Item INFERNO_STEW = register(
            new Item(new Item.Settings().registryKey(INFERNO_STEW_KEY).food(INFERNO_FOOD_COMPONENT, INFERNO_FOOD_CONSUMABLE_COMPONENT)),
            INFERNO_STEW_KEY
    );
    public static final Item FUSION_CARROT = register(
            new Item(new Item.Settings().registryKey(FUSION_CARROT_KEY).food(FUSION_FOOD_COMPONENT, FUSION_FOOD_CONSUMABLE_COMPONENT)),
            FUSION_CARROT_KEY
    );
    public static final Item VOID_BERRIES = register(
            new Item(new Item.Settings().registryKey(VOID_BERRIES_KEY).food(VOID_FOOD_COMPONENT, VOID_FOOD_CONSUMABLE_COMPONENT)),
            VOID_BERRIES_KEY
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
            entries.add(SCORCHED_COAL);
            entries.add(CRYO_SHARD);
        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(entries -> {
            entries.add(INFERNIUM_SWORD);
            entries.add(INFERNIUM_PICKAXE);
            entries.add(INFERNIUM_AXE);
            entries.add(INFERNIUM_SHOVEL);
            entries.add(INFERNIUM_HOE);

            entries.add(CRYOCITE_SWORD);
            entries.add(CRYOCITE_PICKAXE);
            entries.add(CRYOCITE_AXE);
            entries.add(CRYOCITE_SHOVEL);
            entries.add(CRYOCITE_HOE);

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

            entries.add(CRYOCITE_HELMET);
            entries.add(CRYOCITE_CHESTPLATE);
            entries.add(CRYOCITE_LEGGINGS);
            entries.add(CRYOCITE_BOOTS);

            entries.add(VOIDIUM_HELMET);
            entries.add(VOIDIUM_CHESTPLATE);
            entries.add(VOIDIUM_LEGGINGS);
            entries.add(VOIDIUM_BOOTS);
        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register(entries -> {
           entries.add(INFERNIUM_UPGRADE_SMITHING_TEMPLATE);
           entries.add(CRYOCITE_UPGRADE_SMITHING_TEMPLATE);
           entries.add(VOIDIUM_UPGRADE_SMITHING_TEMPLATE);
        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(entries -> {
            entries.add(LUMINOUS_APPLE);
            entries.add(FIERY_APPLE);
            entries.add(INFERNO_STEW);
            entries.add(FUSION_CARROT);
            entries.add(VOID_BERRIES);
        });

        FuelRegistryEvents.BUILD.register((builder, context) -> {
            builder.add(SCORCHED_COAL, 3200);
            builder.add(ModBlocks.SCORCHED_IGNIS_BLOCK, 40000);
        });

    }
}
