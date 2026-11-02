package dev.addon.hammers;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.stirdrem.overgeared.item.custom.SmithingHammer;

public class HammersAddon implements ModInitializer {
    public static final String MOD_ID = "overgeared_hammers";

    public static final Item IRON_HAMMER_HEAD = register("iron_hammer_head",
            new Item(new FabricItemSettings()));

    // SmithingHammer(ToolMaterial material, int attackDamage, float attackSpeed, Item.Settings settings)
    public static final Item STEEL_SMITHING_HAMMER = register("steel_smithing_hammer",
            new SmithingHammer(SteelToolMaterial.INSTANCE, 5, -3.2f, new FabricItemSettings()));

    private static Item register(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(MOD_ID, name), item);
    }

    @Override
    public void onInitialize() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(e -> e.add(IRON_HAMMER_HEAD));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(e -> e.add(STEEL_SMITHING_HAMMER));
    }
}
