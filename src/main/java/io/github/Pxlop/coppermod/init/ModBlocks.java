package io.github.Pxlop.coppermod.init;

import io.github.Pxlop.coppermod.CopperMod;
import net.minecraft.block.Block;
import net.minecraft.block.OreBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, CopperMod.MOD_ID);

    public static final RegistryObject<Block> COPPER_BLOCK = BLOCKS.register("copper_block", () -> new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(5.0f,6.0f).sound(SoundType.METAL).harvestLevel(1).harvestTool(ToolType.PICKAXE)));
    public static final RegistryObject<Block> COPPER_ORE = BLOCKS.register("copper_ore", () -> new OreBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.0f,3.0f).sound(SoundType.STONE).harvestLevel(1).harvestTool(ToolType.PICKAXE)));
}
