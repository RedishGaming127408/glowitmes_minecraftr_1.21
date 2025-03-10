package com.example.glowingitems;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GlowingItemsMod implements ModInitializer {
    public static final String MOD_ID = "glowingitems";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        LOGGER.info("Glowing Items Mod Initialized!");
        ModConfig.loadConfig();
    }
}
