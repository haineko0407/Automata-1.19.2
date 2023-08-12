package com.nui256.automata.creative_mode_tab;

import net.minecraft.network.chat.TextColor;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.client.event.RenderTooltipEvent;

import static com.nui256.automata.Automata.MODID;

public class AutomataCreativeModeTab extends CreativeModeTab {
    public AutomataCreativeModeTab(String label) {
        super(label);
    }

    public AutomataCreativeModeTab(int p_40773_, String p_40774_) {
        super(p_40773_, p_40774_);
    }

    @Override
    public int getLabelColor() {
        return DyeColor.WHITE.getTextColor();
    }

    @Override
    public ResourceLocation getTabsImage() {
        return new ResourceLocation(MODID,"textures/gui/container/creative_inventory/tabs.png");
    }

    @Override
    public ResourceLocation getBackgroundImage() {
        return new ResourceLocation(MODID,"textures/gui/container/creative_inventory/automata_tab.png");
    }

    @Override
    public ItemStack makeIcon() {
        return Items.ACACIA_BOAT.getDefaultInstance();
    }
}
