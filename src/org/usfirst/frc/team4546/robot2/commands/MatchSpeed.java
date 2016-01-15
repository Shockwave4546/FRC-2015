package org.usfirst.frc.team4546.robot2.commands;

import org.usfirst.frc.team4546.robot2.*;

import edu.wpi.first.wpilibj.command.PIDCommand;

public class MatchSpeed extends PIDCommand	{

	static double p = 0;
	static double i = .03;
	static double d = 0;
	double targetSpeed;
	
	public MatchSpeed(double speed)	{
		
		super("MatchSpeed", p, i, d);
	}
	@Override
	protected double returnPIDInput() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	protected void usePIDOutput(double output) {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void initialize() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void execute() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	protected void end() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void interrupted() {
		// TODO Auto-generated method stub
		
	}

}
