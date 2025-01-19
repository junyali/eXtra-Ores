package io.github.junyali.extra_ores.armor;

import io.github.junyali.extra_ores.EXtraOres;
import io.github.junyali.extra_ores.item.ModItems;
import net.minecraft.item.equipment.ArmorMaterial;
import net.minecraft.item.equipment.ArmorMaterials;
import net.minecraft.item.equipment.EquipmentType;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.SoundEvents;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

import java.util.Map;

public class ModArmorMaterial {
    public static final ArmorMaterial INFERNIUM_TIER = new ArmorMaterial(
            15,
            Map.of(
                    EquipmentType.HELMET, 3,
                    EquipmentType.CHESTPLATE, 8,
                    EquipmentType.LEGGINGS, 6,
                    EquipmentType.BOOTS, 3
            ),
            5,
            SoundEvents.ITEM_ARMOR_EQUIP_IRON,
            0.0F,
            0.0F,
            TagKey.of(RegistryKeys.ITEM, Identifier.of("infurium_clump")),
            ModItems.INFERNIUM_ARMOR_MATERIAL_KEY
    );
    public static final ArmorMaterial VOIDIUM_TIER = new ArmorMaterial(
            20,
            Map.of(
                    EquipmentType.HELMET, 4,
                    EquipmentType.CHESTPLATE, 10,
                    EquipmentType.LEGGINGS, 8,
                    EquipmentType.BOOTS, 4
            ),
            6,
            SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE,
            4.0F,
            4.0F,
            TagKey.of(RegistryKeys.ITEM, Identifier.of("voidium_dust")),
            ModItems.VOIDIUM_ARMOR_MATERIAL_KEY
    );
}
