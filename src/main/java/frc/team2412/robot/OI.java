package frc.team2412.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.button.Button;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import frc.team2412.robot.Commands.ExampleCommand;

//This is the class in charge of all the buttons and joysticks that the drivers will use to control the robot
public class OI {

	// Joysticks
	public Joystick driverStick = new Joystick(0);

	// Buttons
	public Button exampleSubsystemMethod = new JoystickButton(driverStick, 1);

	// Constructor to set all of the commands and buttons
	public OI() {
		// telling the button that when its pressed to execute example command with the
		// robot container's instance of example subsystem
		exampleSubsystemMethod.whenPressed(new ExampleCommand(RobotMap.robotContainer.m_ExampleSubsystem));
	}
}
