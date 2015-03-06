package org.usfirst.frc.team4546.robot2.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

import org.usfirst.frc.team4546.robot2.*;

public class StackingAuto extends CommandGroup {

	public StackingAuto()	{
		
		addSequential(new LiftDown());
		addSequential(new CloseClaw());
		addSequential(new LiftUp(), 2);
		addSequential(new AutoDrive(-.25), 1.55);
		addSequential(new OpenClaw(.25));
		addSequential(new LiftDown());
		addSequential(new CloseClaw());
		addSequential(new AutoTurn(1, -.4), 2.75);
		addSequential(new AutoDrive(-.5), 2.3);
		addSequential(new OpenClaw(1));
	}
}
