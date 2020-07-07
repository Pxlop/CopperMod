package io.github.Pxlop.coppermod.util;

import io.github.Pxlop.coppermod.init.ModItems;
import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;

import java.util.function.Supplier;

public enum ModItemTier implements IItemTier {
    COPPER(200, 5.0f, -1.0f, 2, 12, () -> {
        return Ingredient.fromItems(ModItems.COPPER_INGOT.get());
    });
    
    private final int maxUses;
    private final float efficiency;
    private final float attackDamage;
    private final int harvestLevel;
    private final int enchantability;
    private final Supplier<Ingredient> repairMaterial;
    
    ModItemTier(int maxUses, float efficiency, float attackDamage, int harvestLevel, int enchantability, Supplier<Ingredient> repairMaterial) {
        this.maxUses = maxUses;
        this.efficiency = efficiency;
        this.attackDamage = attackDamage;
        this.harvestLevel = harvestLevel;
        this.enchantability = enchantability;
        this.repairMaterial = repairMaterial;
    }
    
    @Override
    public int getMaxUses() {
        return this.maxUses;
    }

    @Override
    public float getEfficiency() {
        return this.efficiency;
    }

    @Override
    public float getAttackDamage() {
        return this.attackDamage;
    }

    @Override
    public int getHarvestLevel() {
        return this.harvestLevel;
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public Ingredient getRepairMaterial() {
        return this.repairMaterial.get();
    }
}
