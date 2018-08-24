package de.teddify.BlockSpawnerWithTorch;

import org.bukkit.Material;
import org.bukkit.block.BlockFace;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.SpawnerSpawnEvent;

public class SpawnerSpawnEventListener implements Listener {

    @EventHandler
    public void onSpawnerSpawnEvent(SpawnerSpawnEvent e) {
        if (e.getSpawner().getBlock().getRelative(BlockFace.UP, 1).getType() == Material.TORCH) {
            e.setCancelled(true);
        }
    }
}
