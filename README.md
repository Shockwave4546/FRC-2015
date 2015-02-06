# FRC-2015
Code for Team 4546's 2015 Robot, Arnold

This is Shockwave's first year using Java.

COMMON PROBLEMS

-Can't connect to robot/internet
	Navigate to "Network and Sharing Center"
	"Change Adapter Settings"
	Right-click "Wireless Network Connection" select "Properties"
	Select "Internet Protocol Version 4 (TCP/IPv4)" click "Properties"
	For internet/unconfigured bridge:
		Select "Obtain an IP address automatically"
	For configured bridge:
		Select "Use the following IP address"
			IP address: 10.45.46.1
			Subnet mask: 255.0.0.0
			Default gateway: leave blank

-Driver Station gives error "Unknown error status at edu.wpi.first.wpilibj.hal.HALUtil.checkStatus(HALUtil.java:51)"
as well as no power to bridge/pnuematics
	Check fuses on the PDP
	
-PDP gives an unclearable sticky fault
	Check CAN bus order:
		RIO-PCM-PDP is the proper order
		
OMG NOLAN ISNT HERE WHAT DO I DO

-Connect to the robot
	Follow above steps if necessary
	
-Pull the latest code from github
	Open command prompt
	Enter "cd workspace\Arnold 2"
	Enter "git pull"
	Wait while it downloads the code

-Compile and deploy code
	Right click on the folder "Arnold 2" in eclipse
		In the rightmost window "Navigator"
		Select "Run as" then "WPILib Java deploy"
		Wait while it compiles and downloads code (should take 15 seconds)
			If it gives the error "assertion failed boolean test," ensure you are connected properly to the robot
			
-Drive the robot
	Driver Station is located on the taskbar
	
CURRENT CONTTROLS

A Button - Unbound
B Button - Raises the lift while held
X Button - Toggles the claw when pressed
Y Button - Lowers the lift while held
LB - Lowers the robot to half speed while held
LT - Lowers the robot to quarter speed while held
RB - Increments the robot speed up by 10%, up to 100%
RT - Increments the robot speed down by 10%, down to 10%
Left stick - Translation on the XY plane
Right Stick - Rotation about the Z axis