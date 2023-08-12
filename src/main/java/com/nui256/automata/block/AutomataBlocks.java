package com.nui256.automata.block;

import com.nui256.automata.item.AutomataItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

import static com.nui256.automata.Automata.MODID;

public class AutomataBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS,MODID);
    private static <T extends Block> RegistryObject<Block> registerBlocks(String name, Supplier<T> block) {
        RegistryObject<Block> registryObject = BLOCKS.register(name,block);
        registerBlockItem(name,registryObject);
        return registryObject;
    }
    private static RegistryObject<Item> registerBlockItem(String name, RegistryObject<Block> block) {
        return AutomataItems.ITEMS.register(name,()->new BlockItem(block.get(),new Item.Properties()));
    }
    public static void register(IEventBus modEventBus) {
        BLOCKS.register(modEventBus);
    }
}
