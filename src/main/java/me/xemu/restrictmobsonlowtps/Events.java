package me.xemu.restrictmobsonlowtps;

import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntitySpawnEvent;

public class Events implements Listener {

    @EventHandler
    public void onEntitySpawn(EntitySpawnEvent event) {
        if(event.getEntityType() == EntityType.PLAYER) return;

        if(Utils.getTps() < 19) {
            event.setCancelled(true);
        } else {
            event.setCancelled(false);
        }
    }

}
