package org.usfirst.frc.team4546.robot2.commands;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc.team4546.robot2.Robot;

public class OperateClaw extends Command	{

	boolean done = false;
	
	public OperateClaw()	{
		
		requires(Robot.claw);
	}
	
	protected void initialize() {
		
		if(Robot.claw.isClosed())	{
			
			Robot.claw.open();
		}	else	{
			
			Robot.claw.close();
		}
		
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
