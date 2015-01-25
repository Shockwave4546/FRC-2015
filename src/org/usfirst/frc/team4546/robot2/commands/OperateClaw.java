package org.usfirst.frc.team4546.robot2.commands;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc.team4546.robot2.Robot;

public class OperateClaw extends Command	{

	
	public OperateClaw()	{
		
		requires(Robot.claw);
	}
	
	protected void initialize() {
		
		if (Robot.claw.isOpen() == true)	{
			
			Robot.claw.open();
		}	else	{
			
			Robot.claw.close();
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
