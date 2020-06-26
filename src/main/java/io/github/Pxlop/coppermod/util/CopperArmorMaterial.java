package io.github.Pxlop.coppermod.util;

import io.github.Pxlop.coppermod.CopperMod;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;

public class CopperArmorMaterial implements IArmorMaterial {
    @Override
    public int getDurability(EquipmentSlotType slotIn) {
        if(slotIn == EquipmentSlotType.HEAD) {
            return 165;
        }
        if(slotIn == EquipmentSlotType.CHEST) {
            return 240;
        }
        if(slotIn == EquipmentSlotType.LEGS) {
            return 225;
        }
        else {
            return 195;
        }
    }

    @Override
    public int getDamageReductionAmount(EquipmentSlotType slotIn) {
        if(slotIn == EquipmentSlotType.HEAD) {
            return 2;
        }
        if(slotIn == EquipmentSlotType.CHEST) {
            return 6;
        }
        if(slotIn == EquipmentSlotType.LEGS) {
            return 5;
        }
        else {
            return 2;
        }
    }

    @Override
    public int getEnchantability() {
        return 8;
    }

    @Override
    public SoundEvent getSoundEvent() {
        return SoundEvents.ITEM_ARMOR_EQUIP_IRON;
    }

    @Override
    public Ingredient getRepairMaterial() {
        return null;
    }

    @Override
    public String getName() {
        return CopperMod.MOD_ID + ":copper";
    }

    @Override
    public float getToughness() {
        return 0;
    }
}
