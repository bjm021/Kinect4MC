# Kinect4MC
A proof-of-concept implementation of the [J4K](https://research.dwi.ufl.edu/projects/ufdw/j4k/) Library to display a depth and color image in Minecraft.

# Features
- Depth Image printing (Kinect only)
- Color Image printing (Kinect only ATM!)
- Image auto update (adjustable refresh rate)
- Image file (png, jpg, etc.) printing


# Compatability
- Depth works with Kinect V1 & V2
- Color works atm only with Kinect V1 & V2 but:
- There are plans to implement the normal Color Frame feature for any generic webcam
- Image printing works without any requirements 

# Usage
- [Download the latest Plugin release](https://github.com/bjm021/Kinect4MC/releases/latest) from the releases page
- Create a Bukkit/Spigot 1.16.4 Server
- Place the plugin jar file in your plugins folder
- Place the 4 dlls in your servers root folder (where the minecraft-server.jar and the plugin folder is located)
- Run the Server once so that the plugin can create its default config file
- Review the plugin config.yml and adjust your settings (needs a server restart)
- Connect a Kinect V1 or V2 to your PC
- Start the Server and see in the console whether the plugin identified and connected to your kinect.
- Go to a place in your world and execute /kinect setCenter to set the bottom-right corner of the image
- You can pull a single frame with /kinect update (the first frame will take a while to be placed)
- You can start a auto-update by typing /kinect start (and /kinect stop stops it)

# Commands
| Command | Usage |
|---------|-------|
| /kinect setCenter | Sets the bottom left block of your image (towards positive x and positive y ans positiv z)
| /kinect update | Pulls a Depth frame from the connected kinect and places it in the world |
| /kinect start | Starts the auto update of the depth frames |
| /kinect stop | Stops the auto update of the depth frames |
| /kinect color |  Pulls a Color frame from the connected kinect and places it in the world |
| /kinect startColor | Starts the auto update of the color frames |
| /kinect stopColor | Stops the auto update of the color frames |
| /kinect printImage <path> <factor> | Prints an image file to the world resized by the given factor |
  
# Building
To build this you need a 1.16.4 spigot library.<br>
You can obtain this via [Maven](https://www.spigotmc.org/wiki/spigot-maven/) or by adding a server jar file to your libraries if you don't want to use Maven.<br>
To obtain a jar file:
- Download the latest Spigot [BuildTools](https://hub.spigotmc.org/jenkins/job/BuildTools/)
- Run the jar file with `java -jar BuildTools.jar --rev 1.16.4`
- This will create you a server jar file
- You can also use this jar to run the server

# Example
![Real image](https://cdn.bjmsw.net/img/KinectRealFrame.JPEG)
![MC Output](https://cdn.bjmsw.net/img/KinectDepthMC.jpeg)

# Libraries
This plugin uses the [J4K](https://research.dwi.ufl.edu/projects/ufdw/j4k/) Library 
