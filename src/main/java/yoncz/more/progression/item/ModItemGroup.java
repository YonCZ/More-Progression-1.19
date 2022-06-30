package yoncz.more.progression.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;
import yoncz.more.progression.MoreProgression;

public class ModItemGroup {
    public static final ItemGroup ENDERITE = FabricItemGroupBuilder.build(new Identifier(MoreProgression.MOD_ID,"enderite"),
            () ->new ItemStack(ModItems.ENDERITE_INGOT));

    public static final ItemGroup COPPER = FabricItemGroupBuilder.build(new Identifier(MoreProgression.MOD_ID,"copper"),
            () ->new ItemStack(Items.COPPER_INGOT));
}
