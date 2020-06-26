package io.github.Pxlop.coppermod.init;

import io.github.Pxlop.coppermod.util.CopperArmorMaterial;
import io.github.Pxlop.coppermod.util.CopperItemTier;
import io.github.Pxlop.coppermod.CopperMod;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {
    //Normal items DeferredRegister
    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, CopperMod.MOD_ID);

    //Normal items
    //Copper ingot
    public static final RegistryObject<Item> COPPER_INGOT = ITEMS.register("copper_ingot", () -> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));
    //Copper nugget
    public static final RegistryObject<Item> COPPER_NUGGET = ITEMS.register("copper_nugget", () -> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));

    //Tools
    //Copper sword
    public static final RegistryObject<Item> COPPER_SWORD = ITEMS.register("copper_sword", () -> new SwordItem(new CopperItemTier(6.0f), -1, -2.4f, new Item.Properties().group(ItemGroup.COMBAT)));
    //Copper pickaxe
    public static final RegistryObject<Item> COPPER_PICKAXE = ITEMS.register("copper_pickaxe", () -> new PickaxeItem(new CopperItemTier(4.0f), -1, -2.8f, new Item.Properties().group(ItemGroup.TOOLS)));
    //Copper axe
    public static final RegistryObject<Item> COPPER_AXE = ITEMS.register("copper_axe", () -> new AxeItem(new CopperItemTier(9.0f), -1, -3.1f, new Item.Properties().group(ItemGroup.TOOLS)));
    //Copper shovel
    public static final RegistryObject<Item> COPPER_SHOVEL = ITEMS.register("copper_shovel", () -> new ShovelItem(new CopperItemTier(4.5f), -1, -3.0f, new Item.Properties().group(ItemGroup.TOOLS)));
    //Copper hoe
    public static final RegistryObject<Item> COPPER_HOE = ITEMS.register("copper_hoe", () -> new HoeItem(new CopperItemTier(1.0f), -1.0f, new Item.Properties().group(ItemGroup.TOOLS)));

    //Armor
    //Copper helmet
    public static final RegistryObject<Item> COPPER_HELMET = ITEMS.register("copper_helmet", () -> new ArmorItem(new CopperArmorMaterial(), EquipmentSlotType.HEAD, new Item.Properties().group(ItemGroup.COMBAT)));
    //Copper chestplate
    public static final RegistryObject<Item> COPPER_CHESTPLATE = ITEMS.register("copper_chestplate", () -> new ArmorItem(new CopperArmorMaterial(), EquipmentSlotType.CHEST, new Item.Properties().group(ItemGroup.COMBAT).maxStackSize(1)));
    //Copper leggings
    public static final RegistryObject<Item> COPPER_LEGGINGS = ITEMS.register("copper_leggings", () -> new ArmorItem(new CopperArmorMaterial(), EquipmentSlotType.LEGS, new Item.Properties().group(ItemGroup.COMBAT).maxStackSize(1)));
    //Copper boots
    public static final RegistryObject<Item> COPPER_BOOTS = ITEMS.register("copper_boots", () -> new ArmorItem(new CopperArmorMaterial(), EquipmentSlotType.FEET, new Item.Properties().group(ItemGroup.COMBAT).maxStackSize(1)));

    //Block items
    //Copper block item
    public static final RegistryObject<Item> COPPER_BLOCK_ITEM = ITEMS.register("copper_block", () -> new BlockItem(ModBlocks.COPPER_BLOCK.get(), new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    //Copper ore item
    public static final RegistryObject<Item> COPPER_ORE_ITEM = ITEMS.register("copper_ore", () -> new BlockItem(ModBlocks.COPPER_ORE.get(), new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
}
