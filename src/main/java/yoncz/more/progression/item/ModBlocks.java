package yoncz.more.progression.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import yoncz.more.progression.MoreProgression;
import net.minecraft.util.registry.Registry;


public class ModBlocks {

    public static final Block ENDERITE_BLOCK = registerBlock("enderite_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(30f).requiresTool().sounds(BlockSoundGroup.NETHERITE)), ModItemGroup.ENDERITE);

    public static final Block BEYOND_DEBRIS = registerBlock("beyond_debris",
            new Block(FabricBlockSettings.of(Material.METAL).strength(30f).requiresTool().sounds(BlockSoundGroup.ANCIENT_DEBRIS)), ModItemGroup.ENDERITE);

    public static final Block COPPER_FURNACE = registerBlock("copper_furnace",
            new Block(FabricBlockSettings.of(Material.METAL).strength(3f).requiresTool().sounds(BlockSoundGroup.COPPER)), ModItemGroup.COPPER);



    private static  Block registerBlock(String name, Block block, ItemGroup group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registry.BLOCK, new Identifier(MoreProgression.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group) {
        return Registry.register(Registry.ITEM, new Identifier(MoreProgression.MOD_ID, name),
            new BlockItem(block, new FabricItemSettings().group(group)));
    }

    public static void registerModBlocks(){
        MoreProgression.LOGGER.info("Register ModBlocks for " + MoreProgression.MOD_ID);
    }
}
