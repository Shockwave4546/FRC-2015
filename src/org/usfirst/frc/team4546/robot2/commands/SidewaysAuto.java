package org.usfirst.frc.team4546.robot2.commands;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.CommandGroup;

import org.usfirst.frc.team4546.robot2.*;

public class SidewaysAuto extends CommandGroup {

		public SidewaysAuto(String direction)	{
			
			addSequential(new AutoLift(), 2);
			if (direction == "Right")	{
				
				addSequential(new AutoTurn(1, .5), .5);
			}	else	{
				
				addSequential(new AutoTurn(1, -.5),	.5);
			}
			
			addSequential(new AutoDrive(-.5), 2.75);
			addSequential(new OpenClaw(.5));
		}
}
