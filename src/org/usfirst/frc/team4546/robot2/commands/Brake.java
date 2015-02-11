package org.usfirst.frc.team4546.robot2.commands;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc.team4546.robot2.*;

public class Brake extends Command {

	protected void initialize() {
		
	}

	protected void execute() {
		
		Robot.drivetrain.driveStop();
	}

	protected boolean isFinished() {
		return false;
	}

	protected void end() {
		
	}

	protected void interrupted() {
		
	}

}
