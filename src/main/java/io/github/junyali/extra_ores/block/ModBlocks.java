package io.github.junyali.extra_ores.block;

import io.github.junyali.extra_ores.EXtraOres;
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

    // Cryocite Keys
    public static final RegistryKey<Block> ICE_CRYOCITE_ORE_KEY = RegistryKey.of(
            RegistryKeys.BLOCK,
            Identifier.of(EXtraOres.MOD_ID, "ice_cryocite_ore")
    );
    public static final RegistryKey<Block> CRYOCITE_ORE_KEY = RegistryKey.of(
            RegistryKeys.BLOCK,
            Identifier.of(EXtraOres.MOD_ID, "cryocite_ore")
    );
    public static final RegistryKey<Block> DEEPSLATE_CRYOCITE_ORE_KEY = RegistryKey.of(
            RegistryKeys.BLOCK,
            Identifier.of(EXtraOres.MOD_ID, "deepslate_cryocite_ore")
    );
    public static final RegistryKey<Block> CRYOCITE_BLOCK_KEY = RegistryKey.of(
            RegistryKeys.BLOCK,
            Identifier.of(EXtraOres.MOD_ID, "cryocite_block")
    );
    public static final RegistryKey<Block> FREEZING_CRYOCITE_BLOCK_KEY = RegistryKey.of(
            RegistryKeys.BLOCK,
            Identifier.of(EXtraOres.MOD_ID, "freezing_cryocite_block")
    );

    // Misc Keys
    public static final RegistryKey<Block> IGNIS_BLOCK_KEY = RegistryKey.of(
            RegistryKeys.BLOCK,
            Identifier.of(EXtraOres.MOD_ID, "ignis_block")
    );
    public static final RegistryKey<Block> SCORCHED_IGNIS_BLOCK_KEY = RegistryKey.of(
            RegistryKeys.BLOCK,
            Identifier.of(EXtraOres.MOD_ID, "scorched_ignis_block")
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

    // Cryocite Blocks
    public static final Block ICE_CRYOCITE_ORE = register(
            new Block(AbstractBlock.Settings.create().registryKey(ICE_CRYOCITE_ORE_KEY).sounds(BlockSoundGroup.GLASS).strength(1.0f)),
            ICE_CRYOCITE_ORE_KEY,
            true
    );
    public static final Block CRYOCITE_ORE = register(
            new Block(AbstractBlock.Settings.create().registryKey(CRYOCITE_ORE_KEY).sounds(BlockSoundGroup.STONE).strength(3.0f).requiresTool()),
            CRYOCITE_ORE_KEY,
            true
    );
    public static final Block DEEPSLATE_CRYOCITE_ORE = register(
            new Block(AbstractBlock.Settings.create().registryKey(DEEPSLATE_CRYOCITE_ORE_KEY).sounds(BlockSoundGroup.STONE).strength(4.0f).requiresTool()),
            DEEPSLATE_CRYOCITE_ORE_KEY,
            true
    );
    public static final Block CRYOCITE_BLOCK = register(
            new Block(AbstractBlock.Settings.create().registryKey(CRYOCITE_BLOCK_KEY).sounds(BlockSoundGroup.GLASS).strength(6.0f).requiresTool()),
            CRYOCITE_BLOCK_KEY,
            true
    );
    public static final Block FREEZING_CRYOCITE_BLOCK = register(
            new Block(AbstractBlock.Settings.create().registryKey(FREEZING_CRYOCITE_BLOCK_KEY).sounds(BlockSoundGroup.CALCITE).strength(8.0f).requiresTool()),
            FREEZING_CRYOCITE_BLOCK_KEY,
            true
    );

    // Misc Blocks
    public static final Block IGNIS_BLOCK = register(
            new Block(AbstractBlock.Settings.create().registryKey(IGNIS_BLOCK_KEY).sounds(BlockSoundGroup.NETHERRACK).strength(3.0f).requiresTool()),
            IGNIS_BLOCK_KEY,
            true
    );
    public static final Block SCORCHED_IGNIS_BLOCK = register(
            new Block(AbstractBlock.Settings.create().registryKey(SCORCHED_IGNIS_BLOCK_KEY).sounds(BlockSoundGroup.NETHERRACK).strength(1.0f).requiresTool()),
            SCORCHED_IGNIS_BLOCK_KEY,
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
            entries.add(IGNIS_BLOCK);
            entries.add(SCORCHED_IGNIS_BLOCK);
            entries.add(ICE_CRYOCITE_ORE);
            entries.add(CRYOCITE_ORE);
            entries.add(DEEPSLATE_CRYOCITE_ORE);
            entries.add(CRYOCITE_BLOCK);
            entries.add(FREEZING_CRYOCITE_BLOCK);
        });
    }
}
