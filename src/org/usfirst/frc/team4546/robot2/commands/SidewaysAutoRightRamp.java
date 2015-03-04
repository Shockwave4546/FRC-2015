package org.usfirst.frc.team4546.robot2.commands;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.CommandGroup;

import org.usfirst.frc.team4546.robot2.*;

public class SidewaysAutoRightRamp extends CommandGroup {

		public SidewaysAutoRightRamp()	{
			
			addSequential(new AutoLift(), 2);
			addSequential(new AutoTurn(1, .5),	2);
			addSequential(new AutoDrive(-.7), 2.5);
			addSequential(new OpenClaw(.5));
		}
}
