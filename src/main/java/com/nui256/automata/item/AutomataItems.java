package com.nui256.automata.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

import static com.nui256.automata.Automata.MODID;

public class AutomataItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS,MODID);
    private static <T extends Item> RegistryObject<Item> registerItem(String name, Supplier<T> item) {
        return ITEMS.register(name,item);
    }
    public static void register(IEventBus modEventBus) {
        ITEMS.register(modEventBus);
    }
}
