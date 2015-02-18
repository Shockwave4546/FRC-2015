package org.usfirst.frc.team4546.robot2.commands;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;

import org.usfirst.frc.team4546.robot2.*;

public class CloseClaw extends Command	{
	
	double closeDelay;

	public CloseClaw()	{
		
		this(0);
	}
	
	public CloseClaw(double delay)	{
		
		closeDelay = delay;
	}
	protected void initialize() {
		
		Timer.delay(closeDelay);
		Robot.claw.close();
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
