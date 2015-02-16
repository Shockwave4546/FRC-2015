package org.usfirst.frc.team4546.robot2.commands;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.Timer;

import org.usfirst.frc.team4546.robot2.*;

public class AutoLift extends Command{

	public AutoLift()	{
		
		requires(Robot.lift);
	}
	
	protected void initialize() {
		
		Robot.claw.close();
		Timer.delay(1);
		
	}

	protected void execute() {
		
		Robot.lift.up();
	}

	protected boolean isFinished() {
		
		return isTimedOut();
	}

	protected void end() {
		
		Robot.lift.stop();
	}

	protected void interrupted() {
		
		Robot.lift.stop();
		end();
	}

	
}
