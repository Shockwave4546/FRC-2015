package org.usfirst.frc.team4546.robot2.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

import org.usfirst.frc.team4546.robot2.*;

public class StackingAuto extends CommandGroup {

	public StackingAuto()	{
		
		addSequential(new CloseClaw());
		addSequential(new LiftUp(), 2);
		addSequential(new AutoDrive(-.25), 1);
		addSequential(new OpenClaw(.25));
		addSequential(new LiftDown());
		addSequential(new AutoStrafe(.5), 2);
	}
}
