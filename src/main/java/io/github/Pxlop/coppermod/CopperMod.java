package io.github.Pxlop.coppermod;

import io.github.Pxlop.coppermod.init.ModBlocks;
import io.github.Pxlop.coppermod.init.ModItems;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod("coppermod")
public class CopperMod {
    public static final String MOD_ID = "coppermod";
    public static final Logger LOGGER = LogManager.getLogger(MOD_ID);
    
    public CopperMod() {
        LOGGER.debug("Hello from Copper Mod!");

        final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        //Register Deferred Registers
        ModItems.ITEMS.register(modEventBus);
        ModBlocks.BLOCKS.register(modEventBus);

        MinecraftForge.EVENT_BUS.register(this);
    }
}
