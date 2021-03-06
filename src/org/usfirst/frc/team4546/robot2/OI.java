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
import org.usfirst.frc.team4546.robot2.triggers.*;

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
    public Joystick controlStick;

    public OI() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS

        driveStick = new Joystick(0);
        controlStick = new Joystick(1);
        
        
        
       //Control Stick buttons
       //Uncomment any button to open it for binding
        
       Button xButton = new JoystickButton(controlStick, 1);
        //Button aButton = new JoystickButton(controlStick, 2);
        //Button bButton = new JoystickButton(controlStick, 3);
        //Button yButton = new JoystickButton(controlStick, 4);
        Button leftBumper= new JoystickButton(controlStick, 5);
        Button rightBumper = new JoystickButton(controlStick, 6);
        Button leftTrigger = new JoystickButton(controlStick, 7);
        Button rightTrigger = new JoystickButton(controlStick, 8);
        //Button backButton = new JoystickButton(controlStick, 9);
        //Button startButton = new JoystickButton(controlStick, 10);
        //Button leftStickPress = new JoystickButton(controlStick, 11);
        //Button rightStickPress = new JoystickButton(controlStick, 12);
        
        //Control Stick commands
        //Comment any of these out to remove them
        
        xButton.whenPressed(new OperateClaw());
        leftBumper.whileHeld(new LiftUp());
        leftTrigger.whileHeld(new LiftDown());
        rightBumper.whileHeld(new LiftMove(-.5));
        rightTrigger.whileHeld(new LiftMove(.25));
        
        //Drive Stick buttons
        //Uncomment any button to open it for binding
        
        Button trigger = new JoystickButton(driveStick, 1);
        //Button thumbButton = new JoystickButton(driveStick, 2);
        //Button threeButton = new JoystickButton(driveStick, 3);
        //Button fourButton = new JoystickButton(driveStick, 4);
        //Button fiveButton= new JoystickButton(driveStick, 5);
        //Button sixButton = new JoystickButton(driveStick, 6);
        //Button sevenButton = new JoystickButton(driveStick, 7);
        //Button eightButton = new JoystickButton(driveStick, 8);
        //Button nineButton = new JoystickButton(driveStick, 9);
        //Button tenButton = new JoystickButton(driveStick, 10);
        //Button elevenButton = new JoystickButton(driveStick, 11);
        //Button twelveButton = new JoystickButton(driveStick, 12);
        
        POVButton driveUp = new POVButton(driveStick, 0, 0);
        POVButton driveRight = new POVButton(driveStick, 0, 90);
        POVButton driveDown = new POVButton(driveStick, 0, 180);
        POVButton driveLeft = new POVButton(driveStick, 0, 270);
        
        //Drive Stick commands
        //Comment any of these out to remove them
        
        trigger.whenPressed(new Drive());
        driveUp.whenActive(new TurnToAngle(0));
        driveRight.whenActive(new TurnToAngle(90));
        driveDown.whenActive(new TurnToAngle(180));
        driveLeft.whenActive(new TurnToAngle(270));
        
    }
    
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
    public Joystick getdriveStick() {
        return driveStick;
    }

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
    
    public Joystick getControlStick() {
        return controlStick;
    }
}

