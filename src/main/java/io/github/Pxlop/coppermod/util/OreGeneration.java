package io.github.Pxlop.coppermod.util;

import io.github.Pxlop.coppermod.CopperMod;
import io.github.Pxlop.coppermod.init.ModBlocks;
import net.minecraft.block.BlockState;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.registries.ForgeRegistries;

public class OreGeneration {
    public static void addOverworldOres() {
        for(Biome biome: ForgeRegistries.BIOMES) {
            CopperMod.LOGGER.debug("Adding copper ore to: " + biome);
            addOre(biome, OreFeatureConfig.FillerBlockType.NATURAL_STONE, ModBlocks.COPPER_ORE.get().getDefaultState(), 8, 16, 7, 0, 60);
        }
    }
    
    public static void addOre(Biome biome, OreFeatureConfig.FillerBlockType fillerBlock, BlockState defaultBlockState, int size, int count, int bottomOffset, int topOffset, int max) {
        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig(fillerBlock, defaultBlockState, size)).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(count, bottomOffset, topOffset, max))));
    }
}
