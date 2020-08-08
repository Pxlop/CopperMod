package io.github.Pxlop.coppermod.util;

import io.github.Pxlop.coppermod.CopperMod;
import io.github.Pxlop.coppermod.init.ModItems;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;

import java.util.function.Supplier;

public enum ModArmorMaterial implements IArmorMaterial {
    COPPER(new int[] {165, 240, 225, 195}, new int[] {2, 6, 5, 2}, 8, SoundEvents.ITEM_ARMOR_EQUIP_IRON, () -> {
        return Ingredient.fromItems(ModItems.COPPER_INGOT.get());
    }, "copper", 0);
    
    private final int[] durability;
    private final int[] damageReductionAmount;
    private final int enchantability;
    private final SoundEvent equipSound;
    private final Supplier<Ingredient> repairMaterial;
    private final String name;
    private final int toughness;
    
    ModArmorMaterial(int[] durability, int[] damageReductionAmount, int enchantability, SoundEvent equipSound, Supplier<Ingredient> repairMaterial, String name, int toughness) {
        this.durability = durability;
        this.damageReductionAmount = damageReductionAmount;
        this.enchantability = enchantability;
        this.equipSound = equipSound;
        this.repairMaterial = repairMaterial;
        this.name = name;
        this.toughness = toughness;
    }
    
    @Override
    public int getDurability(EquipmentSlotType slotIn) {
        return this.durability[slotIn.getIndex()];
    }

    @Override
    public int getDamageReductionAmount(EquipmentSlotType slotIn) {
        return this.damageReductionAmount[slotIn.getIndex()];
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public SoundEvent getSoundEvent() {
        return this.equipSound;
    }

    @Override
    public Ingredient getRepairMaterial() {
        return this.repairMaterial.get();
    }

    @Override
    public String getName() {
        return CopperMod.MOD_ID + ":" + this.name;
    }

    @Override
    public float getToughness() {
        return this.toughness;
    }
}
