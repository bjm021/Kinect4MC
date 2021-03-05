# Kinect4MC
A proof-of-concetp implementation of the J4K Library to display a depth image in Minecraft

Works with Kinect V1 & V2

# Usage
- Create a Bukkit/Spigot 1.16.4 Server
- Place the plugin jar file in your plugins folder
- Place the 4 dlls in your servers root folder (where the minecraft-server.jar and the plugin folder is located)
- Review the plugin config.yml and adjust your settings (needs a server restart)
- Connect a Kinect V1 or V2 to your PC
- Start the Server and see in the console whether the plugin identified and connected to your kinect.
- Go to a place in your world and execute /kinect setCenter to set the bottom-right corner of the image
- You can pull a single frame with /kinect update (the first frame will take a while to be placed)
- You can start a auto-update by typing /kinect start (and /kinect stop stops it)

# Example
![Real image](https://cdn.bjmsw.net/img/KinectRealFrame.JPEG)
![MC Output](https://cdn.bjmsw.net/img/KinectDepthMC.jpeg)

# Libraries
This plugin uses the [J4K](https://research.dwi.ufl.edu/projects/ufdw/j4k/) Library 
