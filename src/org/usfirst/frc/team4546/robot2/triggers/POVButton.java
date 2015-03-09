package org.usfirst.frc.team4546.robot2.triggers;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.*;

public class POVButton extends Trigger	{

	private Joystick joystick;
	private int POV, degrees;
	
	public POVButton(Joystick joystick, int pov, int degrees)	{
		
		this.joystick = joystick;
		this.POV = pov;
		this.degrees = degrees;
	}
	
	public boolean get() {

		if (joystick.getPOV(POV) == degrees)	{
			
			return true;
		}	else	{
			
			return false;
		}
		
	}

}
