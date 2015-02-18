package org.usfirst.frc.team4546.robot2.commands;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.CommandGroup;
import edu.wpi.first.wpilibj.Timer;

import org.usfirst.frc.team4546.robot2.Robot;

/**
 *
 */
public class  StraightAutoWithRamp extends CommandGroup {

    public StraightAutoWithRamp() {
    
    		
    		addSequential(new AutoLift(), 2);
        	addSequential(new AutoDrive(-.7), 2.5);
        	addSequential(new OpenClaw(.5));
    	
    }

    
}
