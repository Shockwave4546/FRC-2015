// RobotBuilder Version: 1.5
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc.team4546.robot2.subsystems;

import org.usfirst.frc.team4546.robot2.RobotMap;
import org.usfirst.frc.team4546.robot2.commands.*;
import org.usfirst.frc.team4546.robot2.Robot;

import com.kauailabs.navx.frc.AHRS;

import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;


/**
 *
 */
public class Drivetrain extends Subsystem {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    Talon frontLeft = RobotMap.drivetrainfrontLeft;
    Talon rearLeft = RobotMap.drivetrainrearLeft;
    Talon frontRight = RobotMap.drivetrainfrontRight;
    Talon rearRight = RobotMap.drivetrainrearRight;
    RobotDrive chassis = RobotMap.drivetrainChassis;
    AHRS gyro = RobotMap.drivetrainGyro;
    
    double currentDrive = 0;
    double rampedDrive = 0;

    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND
        setDefaultCommand(new Drive());
        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND
	
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }

    //Method for driving with mecanum
	public void mecanumDrive(double x, double y, double z, double speed) {
		chassis.mecanumDrive_Cartesian(x*speed, y*speed, z*speed, 0);
		
	}
	
	public void mecanumDrive(double x, double y, double z, double angle, double speed)	{
		chassis.mecanumDrive_Cartesian(x*speed, y*speed, z*speed, angle);
	}
	
	public double ramp(double value, double rate)	{
		
		if(value != currentDrive)	{
			
			if(value > 0)	{
				
				rampedDrive = currentDrive + rate;
				
			}	else	{
				
				rampedDrive = currentDrive - rate;
				
			}
			
		}	else	{
			
			rampedDrive = currentDrive;
		}
		
		return rampedDrive;
	}
	
	public double getAngle()	{
		
		return gyro.getAngle();
	}
	
	public boolean isGyroConnected()	{
		
		return gyro.isConnected();
	}
	
	public boolean isGyroCalibrating()	{
		
		return gyro.isCalibrating();
	}
	
	public void zeroYaw()	{
		
		gyro.zeroYaw();
	}
	
	//Method for stopping the robot
	public void driveStop()	{
		
		chassis.drive(0,0);
	}
	
	public AHRS getGyro(){
		
		return gyro;
	}
	
	//Make this return false to disable autonomous

}

