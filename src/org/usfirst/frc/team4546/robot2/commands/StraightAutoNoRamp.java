package org.usfirst.frc.team4546.robot2.commands;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.CommandGroup;
import edu.wpi.first.wpilibj.Timer;

import org.usfirst.frc.team4546.robot2.Robot;

/**
 *
 */
public class  StraightAutoNoRamp extends CommandGroup {

    public StraightAutoNoRamp() {
    
    		
    		addSequential(new AutoLift(), 2);
        	addSequential(new AutoDrive(-.5), 2.75);
        	addSequential(new AutoClaw());
    	
    }

    
}
