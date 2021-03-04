package net.bjmsw.kinect;

import edu.ufl.digitalworlds.j4k.J4KSDK;


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
