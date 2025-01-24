package io.github.junyali.extra_ores.armor;

import io.github.junyali.extra_ores.EXtraOres;
import io.github.junyali.extra_ores.item.ModItems;
import net.minecraft.item.equipment.ArmorMaterial;
import net.minecraft.item.equipment.EquipmentType;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.SoundEvents;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

import java.util.Map;

public class ModArmorMaterial {
    public static final ArmorMaterial INFERNIUM_TIER = new ArmorMaterial(
            50,
            Map.of(
                    EquipmentType.HELMET, 5,
                    EquipmentType.CHESTPLATE, 10,
                    EquipmentType.LEGGINGS, 8,
                    EquipmentType.BOOTS, 5
            ),
            20,
            SoundEvents.ITEM_ARMOR_EQUIP_IRON,
            6.0F,
            0.5F,
            TagKey.of(RegistryKeys.ITEM, Identifier.of(EXtraOres.MOD_ID,"infernium_clump")),
            ModItems.INFERNIUM_ARMOR_MATERIAL_KEY
    );
    public static final ArmorMaterial CRYOCITE_TIER = new ArmorMaterial(
            50,
            Map.of(
                    EquipmentType.HELMET, 5,
                    EquipmentType.CHESTPLATE, 10,
                    EquipmentType.LEGGINGS, 8,
                    EquipmentType.BOOTS, 5
            ),
            20,
            SoundEvents.ITEM_ARMOR_EQUIP_IRON,
            6.0F,
            0.5F,
            TagKey.of(RegistryKeys.ITEM, Identifier.of(EXtraOres.MOD_ID,"cryo_shard")),
            ModItems.CRYOCITE_ARMOR_MATERIAL_KEY
    );
    public static final ArmorMaterial VOIDIUM_TIER = new ArmorMaterial(
            80,
            Map.of(
                    EquipmentType.HELMET, 8,
                    EquipmentType.CHESTPLATE, 16,
                    EquipmentType.LEGGINGS, 12,
                    EquipmentType.BOOTS, 8
            ),
            30,
            SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE,
            12.0F,
            1.0F,
            TagKey.of(RegistryKeys.ITEM, Identifier.of(EXtraOres.MOD_ID, "voidium_dust")),
            ModItems.VOIDIUM_ARMOR_MATERIAL_KEY
    );
}
