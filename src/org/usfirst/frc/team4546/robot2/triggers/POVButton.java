package org.usfirst.frc.team4546.robot2.triggers;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.*;

public class POVButton extends Trigger	{

	private Joystick joystick;
	private int POV, degrees;
	private boolean value;
	
	public POVButton(Joystick joystick, int POV, int degrees)	{
		
		this.joystick = joystick;
		this.POV = POV;
		this.degrees = degrees;
	}
	
	public boolean get() {

		if (joystick.getPOV(POV) == degrees)	{
			
			value = true;
		}
		
		return value;
	}

}
