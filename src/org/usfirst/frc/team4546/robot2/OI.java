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

import org.usfirst.frc.team4546.robot2.commands.*;

import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.*;


/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    //// CREATING BUTTONS
    // One type of button is a joystick button which is any button on a joystick.
    // You create one by telling it which joystick it's on and which button
    // number it is.
    // Joystick stick = new Joystick(port);
    // Button button = new JoystickButton(stick, buttonNumber);
    
    // There are a few additional built in buttons you can use. Additionally,
    // by subclassing Button you can create custom triggers and bind those to
    // commands the same as any other Button.
    
    //// TRIGGERING COMMANDS WITH BUTTONS
    // Once you have a button, it's trivial to bind it to a button in one of
    // three ways:
    
    // Start the command when the button is pressed and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenPressed(new ExampleCommand());
    
    // Run the command while the button is being held down and interrupt it once
    // the button is released.
    // button.whileHeld(new ExampleCommand());
    
    // Start the command when the button is released  and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenReleased(new ExampleCommand());

    
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public Joystick driveStick;
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    

    public OI() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS

        driveStick = new Joystick(0);
        

	    
        // SmartDashboard Buttons
        SmartDashboard.putData("Autonomous Command", new AutonomousCommand());

        SmartDashboard.putData("Drive", new Drive());

        SmartDashboard.putData("LiftUp", new LiftUp());

        SmartDashboard.putData("LiftDown", new LiftDown());

        SmartDashboard.putData("OperateClaw", new OperateClaw());

        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        
        SmartDashboard.putNumber("Speed %", Robot.speed*100);
        SmartDashboard.putBoolean("Claw Status", Robot.claw.isClosed());
        SmartDashboard.putBoolean("Lift Fully Up", Robot.lift.isFullyUp());
        SmartDashboard.putBoolean("Lift Fully Down", Robot.lift.isFullyDown());
        
        Button xButton = new JoystickButton(driveStick, 1);
        //Button aButton = new JoystickButton(driveStick, 2);
        Button bButton = new JoystickButton(driveStick, 3);
        Button yButton = new JoystickButton(driveStick, 4);
        //Button leftBumper= new JoystickButton(driveStick, 5);
        //Button rightBumper = new JoystickButton(driveStick, 6);
        //Button leftTrigger = new JoystickButton(driveStick, 7);
        //Button rightTrigger = new JoystickButton(driveStick, 8);
        //Button backButton = new JoystickButton(driveStick, 9);
        //Button startButton = new JoystickButton(driveStick, 10);
        //Button leftStickPress = new JoystickButton(driveStick, 11);
        //Button rightStickPress = new JoystickButton(driveStick, 12);
        
        
        xButton.whenPressed(new OperateClaw());
        bButton.whileHeld(new LiftUp());
        yButton.whileHeld(new LiftDown());
    }
    
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
    public Joystick getdriveStick() {
        return driveStick;
    }

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
}

