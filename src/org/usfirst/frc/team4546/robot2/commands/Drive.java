// RobotBuilder Version: 1.5
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc.team4546.robot2.commands;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc.team4546.robot2.Robot;

/**
 *
 */
public class  Drive extends Command {

    double driveX = 0;
    double driveY = 0;
    double driveZ = 0;
    
	public Drive() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);

        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
        requires(Robot.drivetrain);
        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    
    	//Set the speed to the throttle from the driveStick
    	Robot.speed = ((-Robot.oi.driveStick.getThrottle() + 1) / 2);
    	
    	//Check X-axis deadzone
    	if (Robot.oi.driveStick.getX() <= .04 && Robot.oi.driveStick.getX() >= -.04)	{
    		
    		driveX = 0;
    	}	else	{
    	
    		driveX = Robot.oi.driveStick.getX();
    	}
    	
    	//Check Y-axis deadzone
    	if (Robot.oi.driveStick.getY() <= .04 && Robot.oi.driveStick.getY() >= -.04)	{
    		
    		driveY = 0;
    	}	else	{
    		
    		driveY = Robot.oi.driveStick.getY();
    	}
    	
    	//Chack Z-axis deadzone
    	if (Robot.oi.driveStick.getZ() <= .01 && Robot.oi.driveStick.getZ() >= -.01)	{
    		
    		driveZ = 0;
    	}	else	{
    		
    		//Adjust for smaller range of motion on the Z-axis
    		driveZ = (Robot.oi.driveStick.getZ()/2);
    	}
    	
    	//Drive the robot
    	Robot.drivetrain.mecanumDrive(driveX, driveY, driveZ, Robot.speed);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    	
    	Robot.drivetrain.driveStop();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	
    	Robot.drivetrain.driveStop();
    }
}
