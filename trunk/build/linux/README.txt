Mac OS-X 10.7.x Distribution for National Object Library - Install Instructions
-------------------------------------------------------------------------------

This distribution contains 5 top level folders that require installation in the order listed.

0. Create a set of folders in the Macintosh HD, or root folder (/):
	/bim/NOLServer

1. "cg" is a free 3-D rendering library package from NVIDEA corporation.
	It is packaged as a Mac DMG file. Open this file in the finder.
	
	Installation is via a package script that must be run by a user with 
	administrator privileges. It is a prerequisite for running the o3dconverter.
	
2. "blender" is application for viewing, edting and transforming 3D objects.
	Copy or move the "blender" folder and all its contents recursively into /bim/NOLServer

3. "converter" contains the O3D Converter utility that converts Collada files to Web-3D.
	Copy or move the "converter" folder and all its contents recursively into /bim/NOLServer
	
4. "bimserver" is the Derby database that supports the NOL.
	Copy or move the "bimserver" folder and all its contents recursively into /bim/NOLServer
	
5. "apache-tomcat" is the web server & web app container that is pre-installed with the
   web user interface of the NOL.
   Copy or move the "apache-tomcat" folder and all its contents recursively into /bim/NOLServer

6. "update_and_restart.sh" is the shell scipt that starts the Debry database server and the 
   Tomcat web server, and it's NOL web apps.
   
   It can be placed in any folder, and can be executed directly from the command line
   if given execute permissions, or run in a shell by providing it as an argument to 
   the "sh" command. It uses "sudo" to run the NOL server's components in super-user mode, 
   and requires the admin password to do this.


NOTE: initially, the server can be set up with those commands:


sudo apt-get install openjdk-7-jdk
sudo apt-get install subversion
sudo apt-get install libsdl-dev
mkdir /bim
mkdir /bim/NOLServer
cd /bim/NOLServer
svn co https://svn.bee.qut.edu.au/svn/crcci/NationalObjectLibrary/Distribution/NOLServer/linux .
./update_and_restart.sh