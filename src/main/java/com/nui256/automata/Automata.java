package com.nui256.automata;

import com.mojang.logging.LogUtils;
import com.nui256.automata.block.AutomataBlocks;
import com.nui256.automata.creative_mode_tab.AutomataCreativeModeTab;
import com.nui256.automata.item.AutomataItems;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(Automata.MODID)
public class Automata {

    // Define mod id in a common place for everything to reference
    public static final String MODID = "automata";
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();
    public static final AutomataCreativeModeTab AUTOMATA_TAB = new AutomataCreativeModeTab(MODID);

    public Automata() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        MinecraftForge.EVENT_BUS.register(this);

        AutomataItems.register(modEventBus);
        AutomataBlocks.register(modEventBus);

    }
}
