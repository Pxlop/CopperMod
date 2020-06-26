package io.github.Pxlop.coppermod.util;

import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;

public class CopperItemTier implements IItemTier {
    private final float AttackDamage;
    public CopperItemTier(float AttackDamage) {
        this.AttackDamage = AttackDamage;
    }
    @Override
    public int getMaxUses() {
        return 200;
    }

    @Override
    public float getEfficiency() {
        return 5;
    }

    @Override
    public float getAttackDamage() {
        return this.AttackDamage;
    }

    @Override
    public int getHarvestLevel() {
        return 2;
    }

    @Override
    public int getEnchantability() {
        return 12;
    }

    @Override
    public Ingredient getRepairMaterial() {
        return null;
    }
}
