package net.bjmsw.kinect;

import java.awt.Color;
import java.util.ArrayList;

/**
 * Java Code to get a color name from rgb/hex value/awt color
 *
 * The part of looking up a color name from the rgb values is edited from
 * https://gist.github.com/nightlark/6482130#file-gistfile1-java (that has some errors) by Ryan Mast (nightlark)
 *
 * @author Xiaoxiao Li
 *
 */
public class ColorUtils {

    /**
     * Initialize the color list that we have.
     */
    private ArrayList<ColorName> initColorList() {
        ArrayList<ColorName> colorList = new ArrayList<ColorName>();
        colorList.add(new ColorName("WHITE_CONCRETE", 0xFF, 0xFF, 0xFF));
        colorList.add(new ColorName("ORANGE_CONCRETE", 0xF9, 0x80, 0x1D));
        colorList.add(new ColorName("MAGENTA_CONCRETE", 0xC6, 0x4F, 0xBD));
        colorList.add(new ColorName("LIGHT_BLUE_CONCRETE", 0x3A, 0xB3, 0xDA));
        colorList.add(new ColorName("YELLOW_CONCRETE", 0xFF, 0xD8, 0x3D));
        colorList.add(new ColorName("LIME_CONCRETE", 0x80, 0xC7, 0x1F));
        colorList.add(new ColorName("PINK_CONCRETE", 0xF3, 0x8C, 0xAA));
        colorList.add(new ColorName("GRAY_CONCRETE", 0x47, 0x4F, 0x52));
        colorList.add(new ColorName("LIGHT_GRAY_CONCRETE", 0x9C, 0x9D, 0x97));
        colorList.add(new ColorName("CYAN_CONCRETE", 0x16, 0x9C, 0x9D));
        colorList.add(new ColorName("PURPLE_CONCRETE", 0x89, 0x32, 0xB7));
        colorList.add(new ColorName("BLUE_CONCRETE", 0x3C, 0x44, 0xA9));
        colorList.add(new ColorName("BROWN_CONCRETE", 0x82, 0x54, 0x32));
        colorList.add(new ColorName("GREEN_CONCRETE", 0x5D, 0x7C, 0x15));
        colorList.add(new ColorName("RED_CONCRETE", 0xB0, 0x2E, 0x26));
        colorList.add(new ColorName("BLACK_CONCRETE0 0x1D, 0x12, 0x21));
        return colorList;
    }

    /**
     * Get the closest color name from our list
     *
     * @param r
     * @param g
     * @param b
     * @return
     */
    public String getColorNameFromRgb(int r, int g, int b) {
        ArrayList<ColorName> colorList = initColorList();
        ColorName closestMatch = null;
        int minMSE = Integer.MAX_VALUE;
        int mse;
        for (ColorName c : colorList) {
            mse = c.computeMSE(r, g, b);
            if (mse < minMSE) {
                minMSE = mse;
                closestMatch = c;
            }
        }

        if (closestMatch != null) {
            return closestMatch.getName();
        } else {
            return "No matched color name.";
        }
    }

    /**
     * Convert hexColor to rgb, then call getColorNameFromRgb(r, g, b)
     *
     * @param hexColor
     * @return
     */
    public String getColorNameFromHex(int hexColor) {
        int r = (hexColor & 0xFF0000) >> 16;
        int g = (hexColor & 0xFF00) >> 8;
        int b = (hexColor & 0xFF);
        return getColorNameFromRgb(r, g, b);
    }

    public int colorToHex(Color c) {
        return Integer.decode("0x"
                + Integer.toHexString(c.getRGB()).substring(2));
    }

    public String getColorNameFromColor(Color color) {
        return getColorNameFromRgb(color.getRed(), color.getGreen(),
                color.getBlue());
    }

    /**
     * SubClass of ColorUtils. In order to lookup color name
     *
     * @author Xiaoxiao Li
     *
     */
    public class ColorName {
        public int r, g, b;
        public String name;

        public ColorName(String name, int r, int g, int b) {
            this.r = r;
            this.g = g;
            this.b = b;
            this.name = name;
        }

        public int computeMSE(int pixR, int pixG, int pixB) {
            return (int) (((pixR - r) * (pixR - r) + (pixG - g) * (pixG - g) + (pixB - b)
                    * (pixB - b)) / 3);
        }

        public int getR() {
            return r;
        }

        public int getG() {
            return g;
        }

        public int getB() {
            return b;
        }

        public String getName() {
            return name;
        }
    }
}