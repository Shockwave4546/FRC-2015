package org.usfirst.frc.team4546.robot2.commands;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;

import org.usfirst.frc.team4546.robot2.*;

public class OpenClaw extends Command	{
	
	double openDelay;

	public OpenClaw()	{
		
		this(0);
	}
	
	public OpenClaw(double delay)	{
		
		openDelay = delay;
	}
	protected void initialize() {
		
		Timer.delay(openDelay);
		Robot.claw.open();
	}

	protected void execute() {
		
	}

	protected boolean isFinished() {

		return true;
	}

	protected void end() {
		
		
	}

	protected void interrupted() {
		
		
	}

}
