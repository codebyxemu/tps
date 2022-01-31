package me.xemu.restrictmobsonlowtps;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class RestrictMobsOnLowTPS extends JavaPlugin {

    public static boolean allowMobs;

    @Override
    public void onEnable() {
        // Plugin startup logic
        getLogger().info("Plugin startet!");
        getServer().getPluginManager().registerEvents(new Events(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
