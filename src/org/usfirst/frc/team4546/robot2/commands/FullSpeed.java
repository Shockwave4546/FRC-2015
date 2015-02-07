package org.usfirst.frc.team4546.robot2.commands;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc.team4546.robot2.Robot;

public class FullSpeed extends Command {

	private boolean done = false;
	
	protected void initialize() {
		
		Robot.speed = 1;
		done = true;
	}

	protected void execute() {
		
	}

	protected boolean isFinished() {
		return done;
	}

	protected void end() {
		
	}

	protected void interrupted() {
		
	}

}
