package com.example.glowingitems;

import net.minecraft.client.MinecraftClient;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;

public class GlowHandler {
    public static int getGlowLevel(ItemStack stack) {
        if (stack.isEmpty()) return 0;

        Identifier itemId = Registries.ITEM.getId(stack.getItem());

        if (ModConfig.GLOWING_ITEMS.contains(itemId.toString())) {
            return ModConfig.BRIGHTNESS_LEVEL;
        }
        return 0;
    }
}
