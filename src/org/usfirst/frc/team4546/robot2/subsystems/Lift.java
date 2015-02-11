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

import org.usfirst.frc.team4546.robot2.Robot;
import org.usfirst.frc.team4546.robot2.RobotMap;
import org.usfirst.frc.team4546.robot2.commands.*;

import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.command.Subsystem;


/**
 *
 */
public class Lift extends Subsystem {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    Talon motor = RobotMap.liftMotor;
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    
    DigitalInput upperLimit = RobotMap.liftUpperLimit;
    DigitalInput lowerLimit = RobotMap.liftLowerLimit;

    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    
    //Method to raise the lift
    public void  up()	{
    	
    	Robot.lift.motor.set(-1);
    }
    
    //Method to lower the lift
    public void down()	{
    	
    	Robot.lift.motor.set(1);
    }
    
    //Method to stop the lift
    public void stop()	{
    	
    	Robot.lift.motor.stopMotor();
    }
    
    //Boolean to check if the lift is all the way up
    public boolean isFullyUp()	{
    	
    	return Robot.lift.upperLimit.get();
    }
    
    //Boolean to check if the lift is all the way down
    public boolean isFullyDown()	{
    	
    	return Robot.lift.lowerLimit.get();
    }
    
    //No default command
    @Override protected void initDefaultCommand() {}
}

