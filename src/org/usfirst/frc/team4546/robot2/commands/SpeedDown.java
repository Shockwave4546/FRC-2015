package org.usfirst.frc.team4546.robot2.commands;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc.team4546.robot2.Robot;

public class SpeedDown extends Command {

	protected void initialize() {
		
		if (Robot.speed >= .2)	{
			
			Robot.speed = Robot.speed - .1;
		}
	}

	protected void execute() {
		
	}

	protected boolean isFinished() {
		return false;
	}

	protected void end() {
		
	}

	protected void interrupted() {
		
	}

}

