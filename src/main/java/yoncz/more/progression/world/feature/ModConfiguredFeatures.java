package yoncz.more.progression.world.feature;

import net.minecraft.block.Blocks;
import net.minecraft.structure.rule.BlockMatchRuleTest;
import net.minecraft.world.gen.feature.*;
import yoncz.more.progression.item.ModBlocks;
import net.minecraft.util.registry.RegistryEntry;

import java.util.List;

public class ModConfiguredFeatures {
    public static final List<OreFeatureConfig.Target> END_BEYOND_DEBRIS = List.of(
            OreFeatureConfig.createTarget(new BlockMatchRuleTest(Blocks.END_STONE),
                    ModBlocks.BEYOND_DEBRIS.getDefaultState()));

    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> BEYOND_DEBRIS_ORE =
            ConfiguredFeatures.register("end_beyond_debris",Feature.ORE,
                    new OreFeatureConfig(END_BEYOND_DEBRIS, 12));
}
