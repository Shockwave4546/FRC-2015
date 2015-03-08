package org.usfirst.frc.team4546.robot2.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

import org.usfirst.frc.team4546.robot2.*;

public class ToteFromStation extends CommandGroup	{
	
	public ToteFromStation()	{
		
		addSequential(new CloseClaw());
		addSequential(new LiftToTote());
		
	}

}
