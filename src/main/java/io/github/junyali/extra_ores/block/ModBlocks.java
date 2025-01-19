package io.github.junyali.extra_ores.block;

import io.github.junyali.extra_ores.EXtraOres;
import io.github.junyali.extra_ores.item.ModItems;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {
    // Luminitite Keys
    public static final RegistryKey<Block> LUMINITITE_ORE_KEY = RegistryKey.of(
            RegistryKeys.BLOCK,
            Identifier.of(EXtraOres.MOD_ID, "luminitite_ore")
    );
    public static final RegistryKey<Block> DEEPSLATE_LUMINITITE_ORE_KEY = RegistryKey.of(
            RegistryKeys.BLOCK,
            Identifier.of(EXtraOres.MOD_ID, "deepslate_luminitite_ore")
    );
    public static final RegistryKey<Block> RAW_LUMINITITE_BLOCK_KEY = RegistryKey.of(
            RegistryKeys.BLOCK,
            Identifier.of(EXtraOres.MOD_ID, "raw_luminitite_block")
    );
    public static final RegistryKey<Block> LUMINITITE_BLOCK_KEY = RegistryKey.of(
            RegistryKeys.BLOCK,
            Identifier.of(EXtraOres.MOD_ID, "luminitite_block")
    );

    // Infernium Keys
    public static final RegistryKey<Block> NETHER_INFERNIUM_ORE_KEY = RegistryKey.of(
            RegistryKeys.BLOCK,
            Identifier.of(EXtraOres.MOD_ID, "nether_infernium_ore")
    );
    public static final RegistryKey<Block> INFERNIUM_BLOCK_KEY = RegistryKey.of(
            RegistryKeys.BLOCK,
            Identifier.of(EXtraOres.MOD_ID, "infernium_block")
    );

    // Voidium Keys
    public static final RegistryKey<Block> END_VOIDIUM_ORE_KEY = RegistryKey.of(
            RegistryKeys.BLOCK,
            Identifier.of(EXtraOres.MOD_ID, "end_voidium_ore")
    );
    public static final RegistryKey<Block> VOIDIUM_BLOCK_KEY = RegistryKey.of(
            RegistryKeys.BLOCK,
            Identifier.of(EXtraOres.MOD_ID, "voidium_block")
    );

    // Luminitite Blocks
    public static final Block LUMINITITE_ORE = register(
            new Block(AbstractBlock.Settings.create().registryKey(LUMINITITE_ORE_KEY).sounds(BlockSoundGroup.SMALL_AMETHYST_BUD).strength(4.0f).requiresTool()),
            LUMINITITE_ORE_KEY,
            true
    );
    public static final Block DEEPSLATE_LUMINITITE_ORE = register(
            new Block(AbstractBlock.Settings.create().registryKey(DEEPSLATE_LUMINITITE_ORE_KEY).sounds(BlockSoundGroup.LARGE_AMETHYST_BUD).strength(6.0f).requiresTool()),
            DEEPSLATE_LUMINITITE_ORE_KEY,
            true
    );
    public static final Block RAW_LUMINITITE_BLOCK = register(
            new Block(AbstractBlock.Settings.create().registryKey(RAW_LUMINITITE_BLOCK_KEY).sounds(BlockSoundGroup.AMETHYST_CLUSTER).strength(4.0f).requiresTool()),
            RAW_LUMINITITE_BLOCK_KEY,
            true
    );
    public static final Block LUMINITITE_BLOCK = register(
            new Block(AbstractBlock.Settings.create().registryKey(LUMINITITE_BLOCK_KEY).sounds(BlockSoundGroup.AMETHYST_BLOCK).strength(8.0f).requiresTool()),
            LUMINITITE_BLOCK_KEY,
            true
    );

    // Infernium Blocks
    public static final Block NETHER_INFERNIUM_ORE = register(
            new Block(AbstractBlock.Settings.create().registryKey(NETHER_INFERNIUM_ORE_KEY).sounds(BlockSoundGroup.NETHER_GOLD_ORE).strength(6.0f).requiresTool()),
            NETHER_INFERNIUM_ORE_KEY,
            true
    );
    public static final Block INFERNIUM_BLOCK = register(
            new Block(AbstractBlock.Settings.create().registryKey(INFERNIUM_BLOCK_KEY).sounds(BlockSoundGroup.STONE).strength(8.0f).requiresTool()),
            INFERNIUM_BLOCK_KEY,
            true
    );

    // Voidium Blocks
    public static final Block END_VOIDIUM_ORE = register(
            new Block(AbstractBlock.Settings.create().registryKey(END_VOIDIUM_ORE_KEY).sounds(BlockSoundGroup.STONE).strength(6.0f).requiresTool()),
            END_VOIDIUM_ORE_KEY,
            true
    );
    public static final Block VOIDIUM_BLOCK = register(
            new Block(AbstractBlock.Settings.create().registryKey(VOIDIUM_BLOCK_KEY).sounds(BlockSoundGroup.STONE).strength(8.0f).requiresTool()),
            VOIDIUM_BLOCK_KEY,
            true
    );


    public static Block register(Block block, RegistryKey<Block> blockKey, boolean shouldRegisterItem) {

        if (shouldRegisterItem) {
            RegistryKey<Item> itemKey = RegistryKey.of(RegistryKeys.ITEM, blockKey.getValue());

            BlockItem blockItem = new BlockItem(block, new Item.Settings().registryKey(itemKey));
            Registry.register(Registries.ITEM, itemKey, blockItem);
        }

        return Registry.register(Registries.BLOCK, blockKey, block);

    }

    public static void initialize() {
        EXtraOres.LOGGER.info("Registered Mod Blocks for " + EXtraOres.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(entries -> {
            entries.add(LUMINITITE_ORE);
            entries.add(DEEPSLATE_LUMINITITE_ORE);
            entries.add(RAW_LUMINITITE_BLOCK);
            entries.add(LUMINITITE_BLOCK);
            entries.add(NETHER_INFERNIUM_ORE);
            entries.add(INFERNIUM_BLOCK);
            entries.add(END_VOIDIUM_ORE);
            entries.add(VOIDIUM_BLOCK);
        });
    }
}
