package dev.addon.hammers;

import net.minecraft.item.Item;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class SteelToolMaterial implements ToolMaterial {
    public static final SteelToolMaterial INSTANCE = new SteelToolMaterial();
    private static final TagKey<Item> STEEL = TagKey.of(RegistryKeys.ITEM, new Identifier("c", "ingots/steel"));

    @Override public int getDurability() { return 900; }
    @Override public float getMiningSpeedMultiplier() { return 7.0f; }
    @Override public float getAttackDamage() { return 2.5f; }
    @Override public int getMiningLevel() { return 2; }
    @Override public int getEnchantability() { return 10; }
    @Override public Ingredient getRepairIngredient() { return Ingredient.fromTag(STEEL); }
}
