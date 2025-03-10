package com.example.glowingitems;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class ModConfig {
    private static final Path CONFIG_PATH = Path.of("config/glowingitems.json");
    private static final Gson GSON = new GsonBuilder().setPrettyPrinting().create();

    public static int BRIGHTNESS_LEVEL = 10;
    public static List<String> GLOWING_ITEMS = List.of("minecraft:torch", "minecraft:glowstone");

    public static void loadConfig() {
        if (Files.exists(CONFIG_PATH)) {
            try {
                ModConfig config = GSON.fromJson(Files.readString(CONFIG_PATH), ModConfig.class);
                BRIGHTNESS_LEVEL = config.BRIGHTNESS_LEVEL;
                GLOWING_ITEMS = config.GLOWING_ITEMS;
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            saveConfig();
        }
    }

    public static void saveConfig() {
        try {
            Files.writeString(CONFIG_PATH, GSON.toJson(new ModConfig()));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
