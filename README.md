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