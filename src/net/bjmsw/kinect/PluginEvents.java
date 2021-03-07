package net.bjmsw.kinect;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;

public class PluginEvents implements Listener {

    @EventHandler
    private void blockBreak(BlockBreakEvent e) {
        System.out.println("[Kinect] [EventWatcher] Block broke!! " + e.getBlock().getType());
    }

}
