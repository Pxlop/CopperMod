package io.github.Pxlop.coppermod.init;

import io.github.Pxlop.coppermod.CopperMod;
import io.github.Pxlop.coppermod.util.OreGeneration;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLLoadCompleteEvent;

public class OreGenerationRegistry {
    @Mod.EventBusSubscriber(modid = CopperMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class Ore {

        @SubscribeEvent
        public static void addOres(FMLLoadCompleteEvent event) {
            CopperMod.LOGGER.debug("Adding ores!");
            OreGeneration.addOverworldOres();
        }
    }
}
