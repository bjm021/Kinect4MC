package net.bjmsw.kinect;

import edu.ufl.digitalworlds.j4k.J4KSDK;

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
public class Kinect extends J4KSDK {

    public Kinect() {
        super();
    }

    @Override
    public void onDepthFrameEvent(short[] depth_frame, byte[] player_index, float[] xyz, float[] uv) {
        if (Plugin.enableKinect) {

            try {
                Plugin.depth.put(xyz);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void onColorFrameEvent(byte[] color_data) {

    }

    @Override
    public void onSkeletonFrameEvent(boolean[] booleans, float[] floats, float[] floats1, byte[] bytes) {

    }
}
