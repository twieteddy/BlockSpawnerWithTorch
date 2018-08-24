package de.teddify.BlockSpawnerWithTorch;

import org.bukkit.plugin.java.JavaPlugin;

public class BlockSpawnerWithTorch extends JavaPlugin {
    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new SpawnerSpawnEventListener(), this);
    }

    @Override
    public void onDisable() {}
}
