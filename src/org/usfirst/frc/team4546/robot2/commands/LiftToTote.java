package org.usfirst.frc.team4546.robot2.commands;

import edu.wpi.first.wpilibj.command.Command;

import org.usfirst.frc.team4546.robot2.*;

public class LiftToTote extends Command	{

	public LiftToTote()	{
		
		requires(Robot.lift);
	}
	protected void initialize() {
		
	}

	protected void execute() {
		
		if (Robot.lift.isUpOneTote() == false)	{
			
			Robot.lift.up();
		}
	}

	protected boolean isFinished() {

		return Robot.lift.isUpOneTote();
	}

	protected void end() {
		
		Robot.lift.stop();
	}

	protected void interrupted() {

		Robot.lift.stop();
	}

}
