package org.usfirst.frc.team4546.robot2.commands;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

import org.usfirst.frc.team4546.robot2.*;

public class AutoDrive extends Command {

	public AutoDrive() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);

        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
        requires(Robot.drivetrain);
        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	
    	Robot.drivetrain.mecanumDrive(-1, 0, 0, 0);
    	
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        
    	return isTimedOut();
    }

    // Called once after isFinished returns true
    protected void end() {
    	
    	Robot.drivetrain.driveStop();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	
    	Robot.drivetrain.driveStop();
    }
}
