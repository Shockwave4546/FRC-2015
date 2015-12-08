package org.usfirst.frc.team4546.robot2.commands;

import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.command.PIDCommand;
import org.usfirst.frc.team4546.robot2.*;

public class TurnToAngle extends PIDCommand	{
	
	static double p = 0.03;
	static double i = 0;
	static double d = 0;
	static double tolerance = 2.0f;
	double turnRate;
	double angle;

	public TurnToAngle(double angle)	{
		
		super("TurnToAngle", p, i, d);
		getPIDController().setInputRange(-180.0f,  180.0f);
		getPIDController().setOutputRange(-1.0, 1.0);
		getPIDController().setAbsoluteTolerance(tolerance);
		getPIDController().setContinuous(true);
		
		this.angle = angle;
		
	}
	protected double returnPIDInput() {

		return Robot.drivetrain.getAngle();
	}

	protected void usePIDOutput(double output) {

		turnRate = output;
	}

	protected void initialize() {

		
	}

	protected void execute() {

		Robot.drivetrain.mecanumDrive(0, 0, turnRate, Robot.drivetrain.getAngle(), 1);
	}

	protected boolean isFinished() {

		return (Robot.drivetrain.getAngle() == angle);
	}

	protected void end() {
		
		
	}

	protected void interrupted() {

		
	}

}
