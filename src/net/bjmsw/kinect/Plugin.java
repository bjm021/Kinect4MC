package net.bjmsw.kinect;


import edu.ufl.digitalworlds.j4k.DepthMap;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

/**
 *     Copyright (C) 2021 BJM SoftwareWorks (Benjamin J. Meyer)
 *
 *     This program is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 *
 *     This program is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU General Public License for more details.
 *
 *     You should have received a copy of the GNU General Public License
 *     along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */
public class Plugin extends JavaPlugin {

    public static float FLT_EPSILON = 1.1920929E-7F;

    public static boolean enableKinect = false;
    public static boolean autoUpdate = false;
    public static Location center = null;

    public static Plugin instance;

    Kinect kinect;

    public static BlockingQueue<float[]> depth = new LinkedBlockingDeque<>();


    @Override
    public void onEnable() {
        instance = this;

        saveDefaultConfig();


        System.out.println("[Kinect] Enabling...");

        System.out.println("[Kinect] Loading config...");
        System.out.println("[Kinect] ResizeFactor: " + getConfig().getInt("resize-factor"));
        System.out.println("[Kinect] Depth: " + getConfig().getInt("depth"));
        System.out.println("[Kinect] Autoupdate Interval: " + getConfig().getInt("auto-interval"));

        System.out.println("[Kinect] [Connection] Trying to connect to a Kinect V2 Device...");
        kinect = new Kinect();

        if(!kinect.start(Kinect.DEPTH | Kinect.COLOR | Kinect.XYZ))
        {
            System.err.println("[KinectTests] The Kinect device could not be initialized.");
            System.err.println("[KinectTests] Disabling due to error...");
            this.getPluginLoader().disablePlugin(this);
        }

        System.out.println("[Kinect] Successfully connected to 1 Kinect Device");

        getServer().getScheduler().scheduleSyncRepeatingTask(this, () -> {
            if (autoUpdate) {
                updateFrame(null);
            }
        }, 1000, getConfig().getInt("auto-interval"));
    }

    @Override
    public void onDisable() {
        System.out.println("[KinectTests] Disabling...");
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (cmd.getName().equals("kinect")) {
            if (args.length == 1) {
                if (args[0].equalsIgnoreCase("start")) {
                    autoUpdate = true;
                    sender.sendMessage("[Kinect] §aEnabled Kinect Frame Auto-Update");
                    return true;
                } else if (args[0].equalsIgnoreCase("stop")) {
                    autoUpdate = false;
                    sender.sendMessage("[Kinect] §cDisabled Kinect Frame Auto-Update");
                    return true;
                } else if (args[0].equalsIgnoreCase("setCenter")) {
                    if (sender instanceof Player) {
                        Player p = (Player) sender;

                        center = p.getLocation();
                        p.sendMessage("[Kinect] §aSet Center position to: " + center.getX() + " " + center.getY() + " " + center.getZ());

                        return true;
                    } else {
                        sender.sendMessage("Only available in-game");
                        return true;
                    }
                } else if (args[0].equalsIgnoreCase("update")) {

                    updateFrame(sender);

                    return true;

                }
            }
        }
        return false;
    }

    private void updateFrame(CommandSender sender) {
        try {

            enableKinect = true;
            float[] frame = depth.take();
            depth.clear();
            enableKinect = false;

            int x = (int) center.getX();
            int y = (int) center.getY();
            int z = (int) center.getZ();
            if (sender != null)
                sender.sendMessage("[Kinect] §6Clearing Space");
            for (int h = 0; h < kinect.getDepthHeight(); h++) {
                for (int w = 0; w < kinect.getDepthWidth(); w++) {
                    for (int i = 0; i < 100; i++) {
                        center.getWorld().getBlockAt(x+w, y+h, z+i).setType(Material.AIR);
                    }
                }
            }
            if (sender != null) {
                sender.sendMessage("[Kinect] §aSpace cleared!");
                sender.sendMessage("[Kinect] §6Trying to build DepthMap");
            }
            DepthMap map = new DepthMap(kinect.getDepthWidth(), kinect.getDepthHeight(), frame);

            int factor = getConfig().getInt("resize-factor");
            int depth = getConfig().getInt("depth");

            for (int h = 0; h < map.getHeight()/factor; h++) {
                for (int w = 0; w < map.getWidth()/factor; w++) {

                    float dTMP = map.realZ[(h*factor)*map.getWidth()+(w*factor)];
                    int d = (int) dTMP*depth;

                    int flippedHeight = (map.getHeight()/factor)-h;

                    if (!(map.realZ[(h*factor)*map.getWidth()+(w*factor)] < FLT_EPSILON)) {
                        center.getWorld().getBlockAt(x+w, y+flippedHeight, z+d).setType(Material.GRAY_CONCRETE);
                    }
                }
            }
            if (sender != null)
                sender.sendMessage("[Kinect] §aShould be done");

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
