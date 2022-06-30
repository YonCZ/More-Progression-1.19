package yoncz.more.progression.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import yoncz.more.progression.MoreProgression;

import net.minecraft.util.registry.Registry;
import yoncz.more.progression.item.custom.ModAxeItem;
import yoncz.more.progression.item.custom.ModHoeItem;
import yoncz.more.progression.item.custom.ModPickaxeItem;

public class ModItems {
    //ITEMS
    public static final Item ENDERITE_INGOT = registerItem("enderite_ingot",
            new Item(new FabricItemSettings().group(ModItemGroup.ENDERITE)));

    public static final Item ENDERITE_SCRAP = registerItem("enderite_scrap",
            new Item(new FabricItemSettings().group(ModItemGroup.ENDERITE)));
    public static final Item COPPER_PLATE = registerItem("copper_plate",
            new Item(new FabricItemSettings().group(ModItemGroup.COPPER)));



    //TOOLS
    //ENDERITE
    public static final Item ENDERITE_SWORD = registerItem("enderite_sword",
            new SwordItem(ModToolMaterials.ENDERITE, 8, -2.4f,
                    new FabricItemSettings().group(ModItemGroup.ENDERITE)));

    public static final Item ENDERITE_AXE = registerItem("enderite_axe",
            new ModAxeItem(ModToolMaterials.ENDERITE, 10, -3f,
                    new FabricItemSettings().group(ModItemGroup.ENDERITE)));

    public static final Item ENDERITE_PICKAXE = registerItem("enderite_pickaxe",
            new ModPickaxeItem(ModToolMaterials.ENDERITE, 6, -2.8f,
                    new FabricItemSettings().group(ModItemGroup.ENDERITE)));

    public static final Item ENDERITE_HOE = registerItem("enderite_hoe",
            new ModHoeItem(ModToolMaterials.ENDERITE, 1, 0f,
                    new FabricItemSettings().group(ModItemGroup.ENDERITE)));

    public static final Item ENDERITE_SHOVEL = registerItem("enderite_shovel",
            new ShovelItem(ModToolMaterials.ENDERITE, 6, -3f,
                    new FabricItemSettings().group(ModItemGroup.ENDERITE)));

    //COPPER
    public static final Item COPPER_SWORD = registerItem("copper_sword",
            new SwordItem(ModToolMaterials.COPPER, 5, -2.4f,
                    new FabricItemSettings().group(ModItemGroup.COPPER)));

    public static final Item COPPER_AXE = registerItem("copper_axe",
            new ModAxeItem(ModToolMaterials.COPPER, 6, -3f,
                    new FabricItemSettings().group(ModItemGroup.COPPER)));

    public static final Item COPPER_PICKAXE = registerItem("copper_pickaxe",
            new ModPickaxeItem(ModToolMaterials.COPPER, 3, -2.8f,
                    new FabricItemSettings().group(ModItemGroup.COPPER)));

    public static final Item COPPER_HOE = registerItem("copper_hoe",
            new ModHoeItem(ModToolMaterials.COPPER, 0, 0f,
                    new FabricItemSettings().group(ModItemGroup.COPPER)));

    public static final Item COPPER_SHOVEL = registerItem("copper_shovel",
            new ShovelItem(ModToolMaterials.COPPER, 3, -3f,
                    new FabricItemSettings().group(ModItemGroup.COPPER)));



    //ARMOR
    //ENDERITE
    public static final Item ENDERITE_HELMET = registerItem("enderite_helmet",
            new ArmorItem(ModArmorMaterials.ENDERITE, EquipmentSlot.HEAD,
                    new FabricItemSettings().group(ModItemGroup.ENDERITE).fireproof()));

    public static final Item ENDERITE_CHESTPLATE = registerItem("enderite_chestplate",
            new ArmorItem(ModArmorMaterials.ENDERITE, EquipmentSlot.CHEST,
                    new FabricItemSettings().group(ModItemGroup.ENDERITE).fireproof()));

    public static final Item ENDERITE_LEGGINGS = registerItem("enderite_leggings",
            new ArmorItem(ModArmorMaterials.ENDERITE, EquipmentSlot.LEGS,
                    new FabricItemSettings().group(ModItemGroup.ENDERITE).fireproof()));

    public static final Item ENDERITE_BOOTS = registerItem("enderite_boots",
            new ArmorItem(ModArmorMaterials.ENDERITE, EquipmentSlot.FEET,
                    new FabricItemSettings().group(ModItemGroup.ENDERITE).fireproof()));

    //COPPER
    public static final Item COPPER_HELMET = registerItem("copper_helmet",
            new ArmorItem(ModArmorMaterials.COPPER, EquipmentSlot.HEAD,
                    new FabricItemSettings().group(ModItemGroup.COPPER)));

    public static final Item COPPER_CHESTPLATE = registerItem("copper_chestplate",
            new ArmorItem(ModArmorMaterials.COPPER, EquipmentSlot.CHEST,
                    new FabricItemSettings().group(ModItemGroup.COPPER)));

    public static final Item COPPER_LEGGINGS = registerItem("copper_leggings",
            new ArmorItem(ModArmorMaterials.COPPER, EquipmentSlot.LEGS,
                    new FabricItemSettings().group(ModItemGroup.COPPER)));

    public static final Item COPPER_BOOTS = registerItem("copper_boots",
            new ArmorItem(ModArmorMaterials.COPPER, EquipmentSlot.FEET,
                    new FabricItemSettings().group(ModItemGroup.COPPER)));





    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(MoreProgression.MOD_ID, name), item);
    }

    public static void registerModItems() {
        MoreProgression.LOGGER.info("Registering Mod Items for " + MoreProgression.MOD_ID);
    }
}
