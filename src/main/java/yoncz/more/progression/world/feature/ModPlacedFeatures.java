package yoncz.more.progression.world.feature;

import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.feature.PlacedFeatures;
import net.minecraft.world.gen.placementmodifier.HeightRangePlacementModifier;

public class ModPlacedFeatures {

    public static final RegistryEntry<PlacedFeature> END_BEYOND_DEBRIS_PLACED = PlacedFeatures.register("end_beyond_debris_placed",
            ModConfiguredFeatures.BEYOND_DEBRIS_ORE, ModOreFeatures.modifiersWithCount(10,
                    HeightRangePlacementModifier.uniform(YOffset.aboveBottom(-80), YOffset.aboveBottom(80))));


}
