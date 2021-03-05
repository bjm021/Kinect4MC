package net.bjmsw.kinect;


import com.sun.image.codec.jpeg.JPEGCodec;
import com.sun.image.codec.jpeg.JPEGImageDecoder;
import edu.ufl.digitalworlds.j4k.DepthMap;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.util.ArrayList;
import java.util.List;
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
    public static boolean enableColor = false;
    public static boolean autoUpdate = false;
    public static boolean autoUpdateColor = false;
    public static Location center = null;

    public static Plugin instance;

    Kinect kinect;

    public static BlockingQueue<float[]> depth = new LinkedBlockingDeque<>();
    public static BlockingQueue<byte[]> color = new LinkedBlockingDeque<>();


    @Override
    public void onEnable() {
        instance = this;

        saveDefaultConfig();
        reloadConfig();


        System.out.println("[Kinect] Enabling...");

        System.out.println("[Kinect] Loading config...");
        System.out.println("[Kinect] Depth ResizeFactor: " + getConfig().getInt("depth.resize-factor"));
        System.out.println("[Kinect] Depth Depth: " + getConfig().getInt("depth.depth"));
        System.out.println("[Kinect] ADepth utoupdate Interval: " + getConfig().getInt("depth.auto-interval"));

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
        }, 1000, getConfig().getInt("depth.auto-interval"));

        getServer().getScheduler().scheduleSyncRepeatingTask(this, () -> {
            if (autoUpdateColor) {
                updateColor(null);
            }
        }, 1000, getConfig().getInt("color.auto-interval"));
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
                } else if (args[0].equalsIgnoreCase("startColor")) {
                    autoUpdateColor = true;
                    sender.sendMessage("[Kinect] §aEnabled Kinect Color Frame Auto-Update");
                    return true;
                } else if (args[0].equalsIgnoreCase("stopColor")) {
                    autoUpdateColor = false;
                    sender.sendMessage("[Kinect] §cDisabled Kinect Color Frame Auto-Update");
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

                } else if (args[0].equalsIgnoreCase("color")) {

                    updateColor(sender);
                    return true;

                }
            } else if (args.length == 2) {
                if (args[0].equalsIgnoreCase("testColor")) {
                    if (sender instanceof Player) {
                        Player p = (Player) sender;
                        ColorUtils utils = new ColorUtils();

                        int r = Integer.valueOf(args[1].substring( 1, 3 ), 16 );
                        int g = Integer.valueOf( args[1].substring( 3, 5 ), 16 );
                        int b = Integer.valueOf( args[1].substring( 5, 7 ), 16 );

                        String c = utils.getColorNameFromRgb(r,g,b);

                        ItemStack stack = new ItemStack(Material.valueOf(c));
                        ItemMeta meta = stack.getItemMeta();
                        meta.setDisplayName("Generated Color: " + c);
                        List<String> lore = new ArrayList<>();
                        lore.add("From inputs: R: " + r + ", G: " + g + ", B: " + b);
                        lore.add("The best fitted color name was: " + c);
                        lore.add("Generated by b.jm021's Kinect Plugin");
                        meta.setLore(lore);
                        stack.setItemMeta(meta);
                        p.getInventory().addItem(stack);

                        return true;
                    }
                }
            }
        }
        return false;
    }

    /**
     *
     * @param colorStr e.g. "#FFFFFF"
     * @return
     */
    public Material mapColorToMaterial(String colorStr) {
        return mapColorToMaterial(Integer.valueOf( colorStr.substring( 1, 3 ), 16 ), Integer.valueOf( colorStr.substring( 3, 5 ), 16 ), Integer.valueOf( colorStr.substring( 5, 7 ), 16 ));
    }

    private Material mapColorToMaterial(int r, int g, int b) {



        return Material.AIR;
    }

    private void updateColor(CommandSender sender) {

        if (sender != null)
            sender.sendMessage("[Kinect] §6Starting build of color frame...");

        int factor = getConfig().getInt("color.resize-factor");
        ColorUtils utils = new ColorUtils();

        int x = (int) center.getX();
        int y = (int) center.getY();
        int z = (int) center.getZ();

        try {
            enableColor = true;
            byte[] color_data = color.take();
            enableColor = false;

            System.out.println("[Kinect] [TestModule] Trying to parse image...");
            try {

                BufferedImage image = new BufferedImage(kinect.getColorWidth(), kinect.getColorHeight(), BufferedImage.TYPE_INT_ARGB);

                IntBuffer intBuf
                        = ByteBuffer.wrap(color_data)
                        .order(ByteOrder.LITTLE_ENDIAN)
                        .asIntBuffer();

                int[] array = new int[intBuf.remaining()];
                intBuf.get(array);
                image.setRGB(0, 0, kinect.getColorWidth(), kinect.getColorHeight(), array, 0, kinect.getColorWidth());

                File out = new File("./test.png");
                ImageIO.write(image, "png", out);

                System.out.println("[Kinect] [TestModule] ./test.png should be created!");

                for (int h = 0; h < image.getHeight()/factor; h++) {
                    for (int w = 0; w < image.getWidth()/factor; w++) {
                        int flippedHeight = (image.getHeight()/factor)-h;
                        String c = utils.getColorNameFromHex(image.getRGB(w*factor, h*factor));
                        Material mat = Material.valueOf(c);
                        center.getWorld().getBlockAt(x+w, y+flippedHeight, z).setType(mat);
                    }
                }
                if (sender != null)
                    sender.sendMessage("[Kinect] §aShould be done!");


            } catch (IOException e) {
                e.printStackTrace();
            }

            /*
            for (int h = 0; h < kinect.getColorHeight()/factor; h++) {
                for (int w = 0; w < kinect.getColorWidth()/factor; w++) {
                    int index = (h*factor)*kinect.getColorWidth()+(w*factor);

                    int red=color_data[index];
                    int green=color_data[index+1];
                    int blue=color_data[index+2];

                    int rgb = (red << 16) | (green << 8) | blue;

                    //String c = utils.getColorNameFromHex(rgb);
                    String c = utils.getColorNameFromRgb(red, green, blue);
                    Material mat = Material.valueOf(c + "_CONCRETE");
                    //System.out.println(mat);

                    //only tests

                    center.getWorld().getBlockAt(x+w, y+h, z).setType(mat);
                }
            }
            if (sender != null)
                sender.sendMessage("[Kinect] §aShould be done!");

             */
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

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

            int factor = getConfig().getInt("depth.resize-factor");
            int depth = getConfig().getInt("depth.depth");

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
