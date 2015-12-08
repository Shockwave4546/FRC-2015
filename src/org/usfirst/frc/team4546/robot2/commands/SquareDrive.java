package org.usfirst.frc.team4546.robot2.commands;

import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.command.CommandGroup;

public class SquareDrive extends CommandGroup	{
	
	public SquareDrive()	{
		
		addSequential(new AutoDrive(-.5), 2);
		addSequential(new TurnToAngle(90));
		addSequential(new AutoDrive(-.5), 2);
		addSequential(new TurnToAngle(180));
		addSequential(new AutoDrive(-.5), 2);
		addSequential(new TurnToAngle(270));
		addSequential(new AutoDrive(-.5), 2);
		addSequential(new TurnToAngle(0));
		
	}

}
