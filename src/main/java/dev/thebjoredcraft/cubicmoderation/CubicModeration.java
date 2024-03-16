package dev.thebjoredcraft.cubicmoderation;

import org.bukkit.plugin.java.JavaPlugin;

public final class CubicModeration extends JavaPlugin {
    public static CubicModeration instance;

    @Override
    public void onLoad() {
        instance = this;
    }
    @Override
    public void onEnable() {
        // Plugin startup logic

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
    public static String prefix = "<dark_gray>>> <gold>Cubic <dark_gray>| <yellow>";

    public static String getPrefix() {
        return prefix;
    }

    public static CubicModeration getInstance() {
        return instance;
    }
}
