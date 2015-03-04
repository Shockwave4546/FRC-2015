package org.usfirst.frc.team4546.robot2.commands;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.CommandGroup;

import org.usfirst.frc.team4546.robot2.*;

public class SidewaysAutoLeft extends CommandGroup {

		public SidewaysAutoLeft()	{
			
			addSequential(new AutoLift(), 2);
			addSequential(new AutoTurn(1, -.5),	2);
			addSequential(new AutoDrive(-.5), 2.1);
			addSequential(new OpenClaw(.5));
		}
}
