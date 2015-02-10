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
import edu.wpi.first.wpilibj.*;

import edu.wpi.first.wpilibj.command.Subsystem;


/**
 *
 */
public class Claw extends Subsystem {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    Solenoid solenoid = RobotMap.clawSolenoid;
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS


    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    
    public void close()	{
    	
    	solenoid.set(true);
    }
    
    public void open()	{
    	
    	solenoid.set(false);
    }
    
    
    public boolean isClosed()	{
    	
    	return solenoid.get();
    }
    
    @Override protected void initDefaultCommand()	{}
    
}

