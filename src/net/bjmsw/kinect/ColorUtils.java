package net.bjmsw.kinect;

import org.bukkit.Material;

import java.awt.Color;
import java.util.ArrayList;

/**
 * Java Code to get a color name from rgb/hex value/awt color
 *
 * The part of looking up a color name from the rgb values is edited from
 * https://gist.github.com/nightlark/6482130#file-gistfile1-java (that has some errors) by Ryan Mast (nightlark)
 *
 * @author Xiaoxiao Li
 * @author b.jm021
 *
 *
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
public class ColorUtils {

    /**
     * Initialize the color list that we have.
     */
    private ArrayList<ColorName> initColorList() {
        ArrayList<ColorName> colorList = new ArrayList<ColorName>();
        colorList.add(new ColorName(Material.WHITE_CONCRETE, 0xFF, 0xFF, 0xFF));
        colorList.add(new ColorName(Material.ORANGE_CONCRETE, 0xF9, 0x80, 0x1D));
        colorList.add(new ColorName(Material.MAGENTA_CONCRETE, 0xC6, 0x4F, 0xBD));
        colorList.add(new ColorName(Material.LIGHT_BLUE_CONCRETE, 0x3A, 0xB3, 0xDA));
        colorList.add(new ColorName(Material.YELLOW_CONCRETE, 0xFF, 0xD8, 0x3D));
        colorList.add(new ColorName(Material.LIME_CONCRETE, 0x80, 0xC7, 0x1F));
        colorList.add(new ColorName(Material.PINK_CONCRETE, 0xF3, 0x8C, 0xAA));
        colorList.add(new ColorName(Material.GRAY_CONCRETE, 0x47, 0x4F, 0x52));
        colorList.add(new ColorName(Material.LIGHT_GRAY_CONCRETE, 0x9C, 0x9D, 0x97));
        colorList.add(new ColorName(Material.CYAN_CONCRETE, 0x16, 0x9C, 0x9D));
        colorList.add(new ColorName(Material.PURPLE_CONCRETE, 0x89, 0x32, 0xB7));
        colorList.add(new ColorName(Material.BLUE_CONCRETE, 0x3C, 0x44, 0xA9));
        colorList.add(new ColorName(Material.BROWN_CONCRETE, 0x82, 0x54, 0x32));
        colorList.add(new ColorName(Material.GREEN_CONCRETE, 0x5D, 0x7C, 0x15));
        colorList.add(new ColorName(Material.RED_CONCRETE, 0xB0, 0x2E, 0x26));
        colorList.add(new ColorName(Material.BLACK_CONCRETE, 0x1D, 0x12, 0x21));

        //auto generated
        //colorList.add(new ColorName(Material.LIME_STAINED_GLASS, 0x7f, 0xcc, 0x19));
        //colorList.add(new ColorName(Material.GREEN_STAINED_GLASS, 0x66, 0x7f, 0x33));
        colorList.add(new ColorName(Material.MAGENTA_CONCRETE, 0xa9, 0x30, 0x9f));
        colorList.add(new ColorName(Material.STRIPPED_SPRUCE_LOG, 0x73, 0x59, 0x34));
        colorList.add(new ColorName(Material.IRON_BARS, 0x3e, 0x3f, 0x3d));
        colorList.add(new ColorName(Material.CRIMSON_ROOTS, 0x2c, 0x02, 0x0e));
        colorList.add(new ColorName(Material.BROWN_TERRACOTTA, 0x4d, 0x33, 0x23));
        colorList.add(new ColorName(Material.PURPLE_GLAZED_TERRACOTTA, 0x6d, 0x30, 0x98));
        colorList.add(new ColorName(Material.CHISELED_QUARTZ_BLOCK, 0xe7, 0xe2, 0xda));
        colorList.add(new ColorName(Material.BLUE_CONCRETE, 0x2c, 0x2e, 0x8f));
        colorList.add(new ColorName(Material.CRYING_OBSIDIAN, 0x20, 0x0a, 0x3c));
        //colorList.add(new ColorName(Material.WARPED_NYLIUM, 0x2b, 0x72, 0x65));
        colorList.add(new ColorName(Material.SMOOTH_STONE, 0x9e, 0x9e, 0x9e));
        colorList.add(new ColorName(Material.WARPED_STEM, 0x3a, 0x3a, 0x4d));
        //colorList.add(new ColorName(Material.PINK_STAINED_GLASS, 0xf2, 0x7f, 0xa5));
        colorList.add(new ColorName(Material.CRIMSON_PLANKS, 0x65, 0x30, 0x46));
        colorList.add(new ColorName(Material.CYAN_CONCRETE, 0x15, 0x77, 0x88));
        colorList.add(new ColorName(Material.SANDSTONE, 0xd8, 0xcb, 0x9b));
        colorList.add(new ColorName(Material.BROWN_CONCRETE_POWDER, 0x7d, 0x54, 0x35));
        colorList.add(new ColorName(Material.LIGHT_GRAY_CONCRETE_POWDER, 0x9a, 0x9a, 0x94));
        colorList.add(new ColorName(Material.NETHERITE_BLOCK, 0x42, 0x3d, 0x3f));
        colorList.add(new ColorName(Material.CRACKED_POLISHED_BLACKSTONE_BRICKS, 0x2b, 0x25, 0x2b));
        colorList.add(new ColorName(Material.BEDROCK, 0x55, 0x55, 0x55));
        colorList.add(new ColorName(Material.LIME_GLAZED_TERRACOTTA, 0xa2, 0xc5, 0x37));
        colorList.add(new ColorName(Material.STRIPPED_WARPED_STEM, 0x39, 0x96, 0x93));
        colorList.add(new ColorName(Material.STRIPPED_BIRCH_LOG, 0xc4, 0xb0, 0x76));
        colorList.add(new ColorName(Material.WHITE_WOOL, 0xe9, 0xec, 0xec));
        colorList.add(new ColorName(Material.ACACIA_LEAVES, 0x56, 0x55, 0x55));
        colorList.add(new ColorName(Material.GREEN_TERRACOTTA, 0x4c, 0x53, 0x2a));
        colorList.add(new ColorName(Material.JUNGLE_LOG, 0x55, 0x43, 0x19));
        colorList.add(new ColorName(Material.MAGENTA_CONCRETE_POWDER, 0xc0, 0x53, 0xb8));
        colorList.add(new ColorName(Material.CLAY, 0xa0, 0xa6, 0xb3));
        //colorList.add(new ColorName(Material.PURPLE_SHULKER_BOX, 0x67, 0x20, 0x9c));
        colorList.add(new ColorName(Material.POLISHED_ANDESITE, 0x84, 0x86, 0x85));
        colorList.add(new ColorName(Material.EMERALD_BLOCK, 0x2a, 0xcb, 0x57));
        colorList.add(new ColorName(Material.OBSIDIAN, 0x0f, 0x0a, 0x18));
        colorList.add(new ColorName(Material.OAK_LOG, 0x6d, 0x55, 0x32));
        colorList.add(new ColorName(Material.ACACIA_PLANKS, 0xa8, 0x5a, 0x32));
        colorList.add(new ColorName(Material.PURPLE_CONCRETE_POWDER, 0x83, 0x37, 0xb1));
        colorList.add(new ColorName(Material.BRICKS, 0x96, 0x61, 0x53));
        colorList.add(new ColorName(Material.DIRT, 0x86, 0x60, 0x43));
        colorList.add(new ColorName(Material.GRAY_CONCRETE_POWDER, 0x4c, 0x51, 0x54));
        colorList.add(new ColorName(Material.ORANGE_TERRACOTTA, 0xa1, 0x53, 0x25));
        //colorList.add(new ColorName(Material.CRIMSON_FUNGUS, 0x21, 0x0a, 0x06));
        //colorList.add(new ColorName(Material.ORANGE_STAINED_GLASS, 0xd8, 0x7f, 0x33));
        //colorList.add(new ColorName(Material.FARMLAND, 0x8f, 0x66, 0x46));
        colorList.add(new ColorName(Material.QUARTZ_PILLAR, 0xeb, 0xe6, 0xe0));
        colorList.add(new ColorName(Material.REDSTONE_ORE, 0x85, 0x6b, 0x6b));
        colorList.add(new ColorName(Material.LIGHT_BLUE_WOOL, 0x3a, 0xaf, 0xd9));
        //colorList.add(new ColorName(Material.WITHER_ROSE, 0x06, 0x08, 0x03));
        colorList.add(new ColorName(Material.DIORITE, 0xbc, 0xbc, 0xbc));
        colorList.add(new ColorName(Material.WARPED_WART_BLOCK, 0x16, 0x77, 0x79));
        colorList.add(new ColorName(Material.BIRCH_LOG, 0xd8, 0xd7, 0xd2));
        colorList.add(new ColorName(Material.STRIPPED_ACACIA_LOG, 0xae, 0x5c, 0x3b));
        colorList.add(new ColorName(Material.NOTE_BLOCK, 0x58, 0x3a, 0x28));
        colorList.add(new ColorName(Material.CYAN_WOOL, 0x15, 0x89, 0x91));
        colorList.add(new ColorName(Material.CHISELED_POLISHED_BLACKSTONE, 0x35, 0x30, 0x38));
        colorList.add(new ColorName(Material.ORANGE_GLAZED_TERRACOTTA, 0x9a, 0x93, 0x5b));
        colorList.add(new ColorName(Material.LAPIS_ORE, 0x63, 0x6e, 0x84));
        //colorList.add(new ColorName(Material.CYAN_STAINED_GLASS, 0x4c, 0x7f, 0x99));
        colorList.add(new ColorName(Material.COARSE_DIRT, 0x77, 0x55, 0x3b));
        colorList.add(new ColorName(Material.LIME_CONCRETE, 0x5e, 0xa8, 0x18));
        colorList.add(new ColorName(Material.COAL_ORE, 0x74, 0x74, 0x74));
        colorList.add(new ColorName(Material.CUT_SANDSTONE, 0xd9, 0xce, 0x9f));
        colorList.add(new ColorName(Material.COAL_BLOCK, 0x10, 0x0f, 0x0f));
        //colorList.add(new ColorName(Material.WHITE_STAINED_GLASS, 0xff, 0xff, 0xff));
        colorList.add(new ColorName(Material.BROWN_CONCRETE, 0x60, 0x3b, 0x1f));
        colorList.add(new ColorName(Material.NETHER_QUARTZ_ORE, 0x75, 0x41, 0x3e));
        colorList.add(new ColorName(Material.YELLOW_WOOL, 0xf8, 0xc5, 0x27));
        colorList.add(new ColorName(Material.LIGHT_BLUE_TERRACOTTA, 0x71, 0x6c, 0x89));
        colorList.add(new ColorName(Material.STONE_BRICKS, 0x7a, 0x79, 0x7a));
        //colorList.add(new ColorName(Material.LEVER, 0x08, 0x07, 0x05));
        colorList.add(new ColorName(Material.CUT_RED_SANDSTONE, 0xbd, 0x65, 0x1f));
        colorList.add(new ColorName(Material.GRAY_CONCRETE, 0x36, 0x39, 0x3d));
        //colorList.add(new ColorName(Material.CYAN_SHULKER_BOX, 0x14, 0x79, 0x87));
        //colorList.add(new ColorName(Material.END_ROD, 0x34, 0x32, 0x2f));
        //colorList.add(new ColorName(Material.LIME_SHULKER_BOX, 0x63, 0xac, 0x17));
        colorList.add(new ColorName(Material.SPONGE, 0xc3, 0xc0, 0x4a));
        //colorList.add(new ColorName(Material.WARPED_FUNGUS, 0x0e, 0x15, 0x11));
        //colorList.add(new ColorName(Material.SUGAR_CANE, 0x51, 0x6a, 0x37));
        colorList.add(new ColorName(Material.POLISHED_BLACKSTONE, 0x35, 0x30, 0x38));
        colorList.add(new ColorName(Material.WHITE_CONCRETE, 0xcf, 0xd5, 0xd6));
        colorList.add(new ColorName(Material.SPRUCE_LEAVES, 0x4e, 0x4e, 0x4e));
        colorList.add(new ColorName(Material.BLUE_WOOL, 0x35, 0x39, 0x9d));
        colorList.add(new ColorName(Material.WARPED_PLANKS, 0x2b, 0x68, 0x63));
        colorList.add(new ColorName(Material.GOLD_BLOCK, 0xf6, 0xd0, 0x3d));
        colorList.add(new ColorName(Material.GRAVEL, 0x83, 0x7f, 0x7e));
        colorList.add(new ColorName(Material.BLACK_TERRACOTTA, 0x25, 0x16, 0x10));
        colorList.add(new ColorName(Material.GREEN_CONCRETE_POWDER, 0x61, 0x77, 0x2c));
        //colorList.add(new ColorName(Material.TURTLE_EGG, 0xc8, 0xc7, 0xb5));
        colorList.add(new ColorName(Material.GREEN_CONCRETE, 0x49, 0x5b, 0x24));
        colorList.add(new ColorName(Material.SPRUCE_PLANKS, 0x72, 0x54, 0x30));
        colorList.add(new ColorName(Material.PINK_TERRACOTTA, 0xa1, 0x4e, 0x4e));
        colorList.add(new ColorName(Material.BEACON, 0x75, 0xdc, 0xd7));
        colorList.add(new ColorName(Material.CHISELED_NETHER_BRICKS, 0x2f, 0x17, 0x1c));
        colorList.add(new ColorName(Material.CHISELED_STONE_BRICKS, 0x77, 0x76, 0x77));
        //colorList.add(new ColorName(Material.SNOW, 0xf9, 0xfe, 0xfe));
        colorList.add(new ColorName(Material.REDSTONE_LAMP, 0x5f, 0x36, 0x1e));
        //colorList.add(new ColorName(Material.CRIMSON_NYLIUM, 0x82, 0x1f, 0x1f));
        colorList.add(new ColorName(Material.MAGENTA_TERRACOTTA, 0x95, 0x58, 0x6c));
        colorList.add(new ColorName(Material.POLISHED_BLACKSTONE_BRICKS, 0x2e, 0x29, 0x30));
        colorList.add(new ColorName(Material.SOUL_TORCH, 0x08, 0x08, 0x07));
        colorList.add(new ColorName(Material.BROWN_WOOL, 0x72, 0x47, 0x28));
        colorList.add(new ColorName(Material.COBBLESTONE, 0x7f, 0x7f, 0x7f));
        colorList.add(new ColorName(Material.IRON_ORE, 0x88, 0x82, 0x7f));
        colorList.add(new ColorName(Material.GILDED_BLACKSTONE, 0x38, 0x2b, 0x26));
        colorList.add(new ColorName(Material.WHITE_CONCRETE_POWDER, 0xe1, 0xe3, 0xe3));
        colorList.add(new ColorName(Material.WARPED_ROOTS, 0x07, 0x31, 0x2c));
        colorList.add(new ColorName(Material.DARK_PRISMARINE, 0x33, 0x5b, 0x4b));
        //colorList.add(new ColorName(Material.ALLIUM, 0x23, 0x22, 0x2c));
        //colorList.add(new ColorName(Material.SHULKER_BOX, 0x8b, 0x60, 0x8b));
        colorList.add(new ColorName(Material.PRISMARINE, 0x63, 0x9c, 0x97));
        colorList.add(new ColorName(Material.PURPLE_CONCRETE, 0x64, 0x1f, 0x9c));
        colorList.add(new ColorName(Material.YELLOW_CONCRETE_POWDER, 0xe8, 0xc7, 0x36));
        colorList.add(new ColorName(Material.WET_SPONGE, 0xab, 0xb5, 0x46));
        colorList.add(new ColorName(Material.TERRACOTTA, 0x98, 0x5e, 0x43));
        colorList.add(new ColorName(Material.CHISELED_RED_SANDSTONE, 0xb7, 0x60, 0x1b));
        colorList.add(new ColorName(Material.RED_NETHER_BRICKS, 0x45, 0x07, 0x09));
        colorList.add(new ColorName(Material.SPAWNER, 0x19, 0x1f, 0x2b));
        colorList.add(new ColorName(Material.GRAY_TERRACOTTA, 0x39, 0x2a, 0x23));
        colorList.add(new ColorName(Material.PINK_GLAZED_TERRACOTTA, 0xeb, 0x9a, 0xb5));
        colorList.add(new ColorName(Material.POLISHED_GRANITE, 0x9a, 0x6a, 0x59));
        //colorList.add(new ColorName(Material.BLACK_SHULKER_BOX, 0x19, 0x19, 0x1d));
        //colorList.add(new ColorName(Material.LADDER, 0x46, 0x36, 0x1e));
        colorList.add(new ColorName(Material.SEA_LANTERN, 0xac, 0xc7, 0xbe));
        colorList.add(new ColorName(Material.STRIPPED_DARK_OAK_LOG, 0x60, 0x4c, 0x31));
        colorList.add(new ColorName(Material.ANDESITE, 0x88, 0x88, 0x88));
        //colorList.add(new ColorName(Material.COBWEB, 0x5d, 0x5f, 0x60));
        //colorList.add(new ColorName(Material.GRAY_SHULKER_BOX, 0x37, 0x3a, 0x3e));
        colorList.add(new ColorName(Material.PINK_CONCRETE_POWDER, 0xe4, 0x99, 0xb5));
        colorList.add(new ColorName(Material.CHISELED_SANDSTONE, 0xd8, 0xca, 0x9b));
        colorList.add(new ColorName(Material.RED_SANDSTONE, 0xba, 0x63, 0x1d));
        colorList.add(new ColorName(Material.GOLD_ORE, 0x8f, 0x8c, 0x7d));
        //colorList.add(new ColorName(Material.PINK_SHULKER_BOX, 0xe6, 0x79, 0x9d));
        colorList.add(new ColorName(Material.GRAY_GLAZED_TERRACOTTA, 0x53, 0x5a, 0x5d));
        //colorList.add(new ColorName(Material.WHITE_SHULKER_BOX, 0xd7, 0xdc, 0xdd));
        //colorList.add(new ColorName(Material.PURPLE_STAINED_GLASS, 0x7f, 0x3f, 0xb2));
        //colorList.add(new ColorName(Material.RED_SHULKER_BOX, 0x8c, 0x1f, 0x1e));
        //colorList.add(new ColorName(Material.LIGHT_GRAY_STAINED_GLASS, 0x99, 0x99, 0x99));
        colorList.add(new ColorName(Material.STRIPPED_CRIMSON_STEM, 0x89, 0x39, 0x5a));
        colorList.add(new ColorName(Material.CYAN_CONCRETE_POWDER, 0x24, 0x93, 0x9d));
        //colorList.add(new ColorName(Material.BLUE_SHULKER_BOX, 0x2b, 0x2d, 0x8c));
        //colorList.add(new ColorName(Material.BROWN_SHULKER_BOX, 0x6a, 0x42, 0x23));
        colorList.add(new ColorName(Material.CARVED_PUMPKIN, 0x96, 0x54, 0x11));
        colorList.add(new ColorName(Material.BLACK_GLAZED_TERRACOTTA, 0x43, 0x1e, 0x20));
        //colorList.add(new ColorName(Material.WEEPING_VINES_PLANT, 0x3b, 0x07, 0x05));
        colorList.add(new ColorName(Material.LIGHT_GRAY_TERRACOTTA, 0x87, 0x6a, 0x61));
        colorList.add(new ColorName(Material.IRON_BLOCK, 0xdc, 0xdc, 0xdc));
        colorList.add(new ColorName(Material.GRASS, 0x4f, 0x4f, 0x4f));
        //colorList.add(new ColorName(Material.SEAGRASS, 0x3f, 0x63, 0x2b));
        colorList.add(new ColorName(Material.STONE, 0x7d, 0x7d, 0x7d));
        colorList.add(new ColorName(Material.PINK_CONCRETE, 0xd5, 0x65, 0x8e));
        colorList.add(new ColorName(Material.ACACIA_LOG, 0x67, 0x60, 0x56));
        //colorList.add(new ColorName(Material.KELP_PLANT, 0x21, 0x32, 0x10));
        //colorList.add(new ColorName(Material.BREWING_STAND, 0x3c, 0x32, 0x27));
        //colorList.add(new ColorName(Material.LIGHT_BLUE_STAINED_GLASS, 0x66, 0x99, 0xd8));
        colorList.add(new ColorName(Material.MAGENTA_GLAZED_TERRACOTTA, 0xd0, 0x64, 0xbf));
        colorList.add(new ColorName(Material.END_STONE, 0xdb, 0xde, 0x9e));
        //colorList.add(new ColorName(Material.MAGENTA_STAINED_GLASS, 0xb2, 0x4c, 0xd8));
        colorList.add(new ColorName(Material.EMERALD_ORE, 0x75, 0x88, 0x7c));
        colorList.add(new ColorName(Material.GREEN_GLAZED_TERRACOTTA, 0x75, 0x8e, 0x43));
        colorList.add(new ColorName(Material.CRACKED_NETHER_BRICKS, 0x28, 0x14, 0x17));
        colorList.add(new ColorName(Material.NETHER_BRICKS, 0x2c, 0x15, 0x1a));
        colorList.add(new ColorName(Material.YELLOW_CONCRETE, 0xf0, 0xaf, 0x15));
        //colorList.add(new ColorName(Material.MELON_STEM, 0x15, 0x15, 0x15));
        colorList.add(new ColorName(Material.BLUE_GLAZED_TERRACOTTA, 0x2f, 0x40, 0x8b));
        colorList.add(new ColorName(Material.GREEN_WOOL, 0x54, 0x6d, 0x1b));
        //colorList.add(new ColorName(Material.GREEN_SHULKER_BOX, 0x4f, 0x64, 0x1f));
        //colorList.add(new ColorName(Material.ANVIL, 0x44, 0x44, 0x44));
        colorList.add(new ColorName(Material.RED_CONCRETE_POWDER, 0xa8, 0x36, 0x32));
        colorList.add(new ColorName(Material.ORANGE_WOOL, 0xf0, 0x76, 0x13));
        colorList.add(new ColorName(Material.GRAY_WOOL, 0x3e, 0x44, 0x47));
        colorList.add(new ColorName(Material.BROWN_GLAZED_TERRACOTTA, 0x77, 0x6a, 0x55));
        //colorList.add(new ColorName(Material.BLUE_ICE, 0x74, 0xa7, 0xfd));
        //colorList.add(new ColorName(Material.RED_MUSHROOM, 0x1b, 0x09, 0x08));
        colorList.add(new ColorName(Material.LIGHT_GRAY_CONCRETE, 0x7d, 0x7d, 0x73));
        colorList.add(new ColorName(Material.BLUE_TERRACOTTA, 0x4a, 0x3b, 0x5b));
        //colorList.add(new ColorName(Material.ICE, 0x91, 0xb7, 0xfd));
        colorList.add(new ColorName(Material.BLACK_WOOL, 0x14, 0x15, 0x19));
        colorList.add(new ColorName(Material.DEAD_BUSH, 0x20, 0x18, 0x0c));
        //colorList.add(new ColorName(Material.GRAY_STAINED_GLASS, 0x4c, 0x4c, 0x4c));
        //colorList.add(new ColorName(Material.ATTACHED_MELON_STEM, 0x12, 0x12, 0x12));
        colorList.add(new ColorName(Material.WHITE_TERRACOTTA, 0xd1, 0xb2, 0xa1));
        colorList.add(new ColorName(Material.SHROOMLIGHT, 0xf0, 0x92, 0x46));
        colorList.add(new ColorName(Material.RED_GLAZED_TERRACOTTA, 0xb5, 0x3b, 0x35));
        colorList.add(new ColorName(Material.DIAMOND_BLOCK, 0x62, 0xed, 0xe4));
        colorList.add(new ColorName(Material.MOSSY_STONE_BRICKS, 0x73, 0x79, 0x69));
        colorList.add(new ColorName(Material.NETHER_GOLD_ORE, 0x73, 0x36, 0x2a));
        //colorList.add(new ColorName(Material.RED_STAINED_GLASS, 0x99, 0x33, 0x33));
        colorList.add(new ColorName(Material.LIME_TERRACOTTA, 0x67, 0x75, 0x34));
        //colorList.add(new ColorName(Material.TWISTING_VINES, 0x05, 0x27, 0x22));
        colorList.add(new ColorName(Material.YELLOW_TERRACOTTA, 0xba, 0x85, 0x23));
        colorList.add(new ColorName(Material.LIME_WOOL, 0x70, 0xb9, 0x19));
        //colorList.add(new ColorName(Material.YELLOW_STAINED_GLASS, 0xe5, 0xe5, 0x33));
        colorList.add(new ColorName(Material.POLISHED_DIORITE, 0xc0, 0xc1, 0xc2));
        colorList.add(new ColorName(Material.RED_MUSHROOM_BLOCK, 0xc8, 0x2e, 0x2d));
        colorList.add(new ColorName(Material.REDSTONE_BLOCK, 0xaf, 0x18, 0x05));
        colorList.add(new ColorName(Material.RED_TERRACOTTA, 0x8f, 0x3d, 0x2e));
        //colorList.add(new ColorName(Material.BLACK_STAINED_GLASS, 0x19, 0x19, 0x19));
        //colorList.add(new ColorName(Material.TRIPWIRE, 0x15, 0x15, 0x15));
        //colorList.add(new ColorName(Material.PACKED_ICE, 0x8d, 0xb4, 0xfa));
        //colorList.add(new ColorName(Material.BLUE_STAINED_GLASS, 0x33, 0x4c, 0xb2));
        //colorList.add(new ColorName(Material.NETHER_SPROUTS, 0x02, 0x12, 0x10));
        colorList.add(new ColorName(Material.SOUL_SAND, 0x51, 0x3e, 0x32));
        colorList.add(new ColorName(Material.RED_WOOL, 0xa0, 0x27, 0x22));
        //colorList.add(new ColorName(Material.ATTACHED_PUMPKIN_STEM, 0x11, 0x11, 0x11));
        colorList.add(new ColorName(Material.DARK_OAK_LEAVES, 0x69, 0x69, 0x69));
        colorList.add(new ColorName(Material.LIGHT_GRAY_WOOL, 0x8e, 0x8e, 0x86));
        colorList.add(new ColorName(Material.LIGHT_GRAY_GLAZED_TERRACOTTA, 0x90, 0xa6, 0xa7));
        colorList.add(new ColorName(Material.NETHER_WART_BLOCK, 0x72, 0x02, 0x02));
        //colorList.add(new ColorName(Material.BROWN_STAINED_GLASS, 0x66, 0x4c, 0x33));
        colorList.add(new ColorName(Material.OAK_LEAVES, 0x60, 0x60, 0x60));
        colorList.add(new ColorName(Material.BROWN_MUSHROOM_BLOCK, 0x95, 0x6f, 0x51));
        colorList.add(new ColorName(Material.RED_SAND, 0xbe, 0x66, 0x21));
        //colorList.add(new ColorName(Material.ORANGE_SHULKER_BOX, 0xea, 0x6a, 0x08));
        colorList.add(new ColorName(Material.BLUE_CONCRETE_POWDER, 0x46, 0x49, 0xa6));
        //colorList.add(new ColorName(Material.YELLOW_SHULKER_BOX, 0xf8, 0xbc, 0x1d));
        colorList.add(new ColorName(Material.STRUCTURE_BLOCK, 0x58, 0x4a, 0x5a));
        colorList.add(new ColorName(Material.OAK_PLANKS, 0xa2, 0x82, 0x4e));
        colorList.add(new ColorName(Material.STRIPPED_OAK_LOG, 0xb1, 0x90, 0x56));
        colorList.add(new ColorName(Material.DARK_OAK_PLANKS, 0x42, 0x2b, 0x14));
        colorList.add(new ColorName(Material.SPRUCE_LOG, 0x3a, 0x25, 0x10));
        colorList.add(new ColorName(Material.GLOWSTONE, 0xab, 0x83, 0x54));
        colorList.add(new ColorName(Material.PRISMARINE_BRICKS, 0x63, 0xab, 0x9e));
        //colorList.add(new ColorName(Material.PUMPKIN_STEM, 0x15, 0x15, 0x15));
        colorList.add(new ColorName(Material.BLACK_CONCRETE_POWDER, 0x19, 0x1a, 0x1f));
        colorList.add(new ColorName(Material.MAGENTA_WOOL, 0xbd, 0x44, 0xb3));
        colorList.add(new ColorName(Material.MOSSY_COBBLESTONE, 0x6e, 0x76, 0x5e));
        colorList.add(new ColorName(Material.PURPUR_BLOCK, 0xa9, 0x7d, 0xa9));
        colorList.add(new ColorName(Material.JUNGLE_PLANKS, 0xa0, 0x73, 0x50));
        colorList.add(new ColorName(Material.PINK_WOOL, 0xed, 0x8d, 0xac));
        colorList.add(new ColorName(Material.LAPIS_BLOCK, 0x1e, 0x43, 0x8c));
        colorList.add(new ColorName(Material.NETHERRACK, 0x61, 0x26, 0x26));
        //colorList.add(new ColorName(Material.GLASS, 0x8c, 0x95, 0x97));
        colorList.add(new ColorName(Material.JUNGLE_LEAVES, 0x6d, 0x6b, 0x63));
        colorList.add(new ColorName(Material.CYAN_GLAZED_TERRACOTTA, 0x34, 0x76, 0x7d));
        colorList.add(new ColorName(Material.SLIME_BLOCK, 0x6f, 0xc0, 0x5b));
        colorList.add(new ColorName(Material.SAND, 0xdb, 0xcf, 0xa3));
        colorList.add(new ColorName(Material.PURPLE_TERRACOTTA, 0x76, 0x46, 0x56));
        colorList.add(new ColorName(Material.LIGHT_BLUE_GLAZED_TERRACOTTA, 0x5e, 0xa4, 0xd0));
        colorList.add(new ColorName(Material.CYAN_TERRACOTTA, 0x56, 0x5b, 0x5b));
        colorList.add(new ColorName(Material.DARK_OAK_LOG, 0x3c, 0x2e, 0x1a));
        colorList.add(new ColorName(Material.PURPUR_PILLAR, 0xab, 0x81, 0xab));
        colorList.add(new ColorName(Material.LIGHT_BLUE_CONCRETE_POWDER, 0x4a, 0xb4, 0xd5));
        //colorList.add(new ColorName(Material.MUSHROOM_STEM, 0xcb, 0xc4, 0xb9));
        colorList.add(new ColorName(Material.BLACKSTONE, 0x2a, 0x23, 0x28));
        //colorList.add(new ColorName(Material.DRAGON_EGG, 0x0c, 0x09, 0x0f));
        colorList.add(new ColorName(Material.ORANGE_CONCRETE_POWDER, 0xe3, 0x83, 0x1f));
        colorList.add(new ColorName(Material.YELLOW_GLAZED_TERRACOTTA, 0xea, 0xc0, 0x58));
        colorList.add(new ColorName(Material.PURPLE_WOOL, 0x79, 0x2a, 0xac));
        colorList.add(new ColorName(Material.END_STONE_BRICKS, 0xda, 0xe0, 0xa2));
        colorList.add(new ColorName(Material.HONEYCOMB_BLOCK, 0xe5, 0x94, 0x1d));
        //colorList.add(new ColorName(Material.BLUE_ORCHID, 0x08, 0x1b, 0x1c));
        colorList.add(new ColorName(Material.CRIMSON_STEM, 0x5c, 0x19, 0x1d));
        colorList.add(new ColorName(Material.WHITE_GLAZED_TERRACOTTA, 0xbc, 0xd4, 0xca));
        colorList.add(new ColorName(Material.LIME_CONCRETE_POWDER, 0x7d, 0xbd, 0x29));
        //colorList.add(new ColorName(Material.POPPY, 0x13, 0x0b, 0x05));
        colorList.add(new ColorName(Material.STRIPPED_JUNGLE_LOG, 0xab, 0x84, 0x54));
        //colorList.add(new ColorName(Material.LIGHT_BLUE_SHULKER_BOX, 0x31, 0xa3, 0xd4));
        colorList.add(new ColorName(Material.GRANITE, 0x95, 0x67, 0x55));
        colorList.add(new ColorName(Material.LIGHT_BLUE_CONCRETE, 0x23, 0x89, 0xc6));
        colorList.add(new ColorName(Material.BIRCH_LEAVES, 0x49, 0x48, 0x49));
        //colorList.add(new ColorName(Material.WEEPING_VINES, 0x0b, 0x00, 0x00));
        colorList.add(new ColorName(Material.RED_CONCRETE, 0x8e, 0x20, 0x20));
        colorList.add(new ColorName(Material.QUARTZ_BRICKS, 0xea, 0xe5, 0xdd));
        colorList.add(new ColorName(Material.CRACKED_STONE_BRICKS, 0x76, 0x75, 0x76));
        colorList.add(new ColorName(Material.BLACK_CONCRETE, 0x08, 0x0a, 0x0f));
        //colorList.add(new ColorName(Material.LIGHT_GRAY_SHULKER_BOX, 0x7c, 0x7c, 0x73));
        colorList.add(new ColorName(Material.ORANGE_CONCRETE, 0xe0, 0x61, 0x00));
        colorList.add(new ColorName(Material.BOOKSHELF, 0x75, 0x5e, 0x3b));
        colorList.add(new ColorName(Material.BIRCH_PLANKS, 0xc0, 0xaf, 0x79));
        //colorList.add(new ColorName(Material.MAGENTA_SHULKER_BOX, 0xad, 0x36, 0xa3));
        colorList.add(new ColorName(Material.SOUL_SOIL, 0x4b, 0x39, 0x2e));
        colorList.add(new ColorName(Material.DIAMOND_ORE, 0x7d, 0x8e, 0x8d));



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
    public Material getColorNameFromRgb(int r, int g, int b) {
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
            return null;
        }
    }

    /**
     * Convert hexColor to rgb, then call getColorNameFromRgb(r, g, b)
     *
     * @param hexColor
     * @return
     */
    public Material getColorNameFromHex(int hexColor) {
        int r = (hexColor & 0xFF0000) >> 16;
        int g = (hexColor & 0xFF00) >> 8;
        int b = (hexColor & 0xFF);
        return getColorNameFromRgb(r, g, b);
    }

    public int colorToHex(Color c) {
        return Integer.decode("0x"
                + Integer.toHexString(c.getRGB()).substring(2));
    }

    public Material getColorNameFromColor(Color color) {
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
        public Material name;

        public ColorName(Material name, int r, int g, int b) {
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

        public Material getName() {
            return name;
        }
    }
}