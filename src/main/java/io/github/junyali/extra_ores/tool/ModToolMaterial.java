package io.github.junyali.extra_ores.tool;

import io.github.junyali.extra_ores.EXtraOres;
import io.github.junyali.extra_ores.item.ModItems;
import net.minecraft.item.ToolMaterial;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModToolMaterial {
    public static final ToolMaterial INFERNIUM_TIER = new ToolMaterial(
            BlockTags.INCORRECT_FOR_NETHERITE_TOOL,
            2500,
            10.0F,
            5F,
            25,
            TagKey.of(RegistryKeys.ITEM, Identifier.of(EXtraOres.MOD_ID, "infernium_shard"))
    );
    public static final ToolMaterial CRYOCITE_TIER = new ToolMaterial(
            BlockTags.INCORRECT_FOR_NETHERITE_TOOL,
            2500,
            10.0F,
            5F,
            25,
            TagKey.of(RegistryKeys.ITEM, Identifier.of(EXtraOres.MOD_ID, "cryo_shard"))
    );
    public static final ToolMaterial VOIDIUM_TIER = new ToolMaterial(
            BlockTags.INCORRECT_FOR_NETHERITE_TOOL,
            5120,
            20.0F,
            12F,
            30,
            TagKey.of(RegistryKeys.ITEM, Identifier.of(EXtraOres.MOD_ID, "voidium_dust"))
    );
}
