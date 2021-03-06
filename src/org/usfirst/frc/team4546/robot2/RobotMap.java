// RobotBuilder Version: 1.5
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc.team4546.robot2;
    
import edu.wpi.first.wpilibj.*;

import com.kauailabs.navx.frc.AHRS;

import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import java.util.Vector;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {

    public static Talon drivetrainfrontLeft;
    public static Talon drivetrainrearLeft;
    public static Talon drivetrainfrontRight;
    public static Talon drivetrainrearRight;
    public static RobotDrive drivetrainChassis;
    public static Talon liftMotor;
    public static Solenoid clawSolenoid;
    public static DigitalInput liftUpperLimit;
    public static DigitalInput liftLowerLimit;
    public static DigitalInput liftToteLimit;
    public static PowerDistributionPanel pdp;
    public static AHRS drivetrainGyro;

    public static void init() {

        //Drivetrain and motor controllers
    	drivetrainfrontLeft = new Talon(0);
        LiveWindow.addActuator("Drivetrain", "Front Left Motor", (Talon) drivetrainfrontLeft);
        
        drivetrainrearLeft = new Talon(1);
        LiveWindow.addActuator("Drivetrain", "Rear Left Motor", (Talon) drivetrainrearLeft);
        
        drivetrainfrontRight = new Talon(2);
        LiveWindow.addActuator("Drivetrain", "Front Right Motor", (Talon) drivetrainfrontRight);
        
        drivetrainrearRight = new Talon(3);
        LiveWindow.addActuator("Drivetrain", "Rear Right Motor", (Talon) drivetrainrearRight);
        
        drivetrainChassis = new RobotDrive(drivetrainfrontLeft, drivetrainrearLeft,
              drivetrainfrontRight, drivetrainrearRight);
        
        drivetrainGyro = new AHRS(SPI.Port.kMXP);
        LiveWindow.addSensor("Drivetrain", "Gyro", drivetrainGyro);
        
        //Drivetrain configuration
        drivetrainChassis.setSafetyEnabled(true);
        drivetrainChassis.setExpiration(0.1);
        drivetrainChassis.setSensitivity(0.5);
        drivetrainChassis.setMaxOutput(1.0);

        //Inverted motors
        drivetrainChassis.setInvertedMotor(RobotDrive.MotorType.kFrontRight, true);
        drivetrainChassis.setInvertedMotor(RobotDrive.MotorType.kRearRight, true);
        
        //Lift
        liftMotor = new Talon(4);
        LiveWindow.addActuator("Lift", "Lift Motor", (Talon) liftMotor);
        
        liftUpperLimit = new DigitalInput(0);
        LiveWindow.addSensor("Lift", "Lift Upper Limit", (DigitalInput) liftUpperLimit);
        
        liftLowerLimit = new DigitalInput(1);
        LiveWindow.addSensor("Lift", "Lift Lower Limit", (DigitalInput) liftLowerLimit);
        
        liftToteLimit = new DigitalInput(2);
        LiveWindow.addSensor("Lift", "Lift Tote Limit", (DigitalInput) liftToteLimit);
        
        //Claw
        clawSolenoid = new Solenoid(0, 0);
        LiveWindow.addActuator("Lift", "clawSolenoid", clawSolenoid);
        
        pdp = new PowerDistributionPanel();
    }
}
