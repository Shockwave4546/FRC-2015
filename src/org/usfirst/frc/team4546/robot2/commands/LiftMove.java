package org.usfirst.frc.team4546.robot2.commands;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.*;

import org.usfirst.frc.team4546.robot2.*;

public class LiftMove extends Command	{

	double speed;
	
	public LiftMove(double speed)	{
		
		this.speed = speed;
	}
	
	protected void initialize() {
		
		
	}

	protected void execute() {
		
		Robot.lift.move(speed);
	}

	protected boolean isFinished() {
		
		return false;
	}

	protected void end() {
		
		Robot.lift.stop();
	}

	protected void interrupted() {
		
		Robot.lift.stop();
	}

}
