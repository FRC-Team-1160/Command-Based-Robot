package com.team1160.feathers;

import com.team1160.feathers.api.Constants;
import com.team1160.feathers.commands.AssistClimb;
import com.team1160.feathers.commands.ManualDrive;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

public class OI {

	protected Joystick driveStick;
	
	protected Joystick leftStick;
	protected Joystick rightStick;
	
	protected Button test;
	protected Button test2;
	protected static OI instance;
	
	public static OI getInstance(){
		if(instance == null){
			instance = new OI();
		}
		return instance;
	}
	
	private OI() {
		driveStick = new Joystick(Constants.DRIVESTICK);
		leftStick = new Joystick(Constants.LeftStick);
		rightStick = new Joystick(Constants.RightStick);
		
		test = new JoystickButton(driveStick, 1);
		test.whenPressed(new AssistClimb());
		test2 = new JoystickButton(driveStick, 2);
		test2.whenPressed(new ManualDrive());
	}
	
	public Joystick getDriveStick(){
		return driveStick;
	}
	
	public Joystick getLeftStick(){
		return leftStick;
	}
	
	public Joystick getRightStick(){
		return rightStick;
	}

}
