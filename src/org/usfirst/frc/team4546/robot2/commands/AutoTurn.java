package org.usfirst.frc.team4546.robot2.commands;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.Timer;

import org.usfirst.frc.team4546.robot2.*;

public class AutoTurn extends Command{

	double startDelay;
	double driveSpeed;
	
	public AutoTurn(double delay, double speed)	{
		
		startDelay = delay;
		driveSpeed = speed;
		
	}
	
	protected void initialize() {
		
		Timer.delay(startDelay);
	}

	protected void execute() {
		
		Robot.drivetrain.mecanumDrive(0, 0, driveSpeed, 1);
	}

	protected boolean isFinished() {
		return false;
	}

	protected void end() {
		
		Robot.drivetrain.driveStop();
	}

	protected void interrupted() {
		
		Robot.drivetrain.driveStop();
	}

}
