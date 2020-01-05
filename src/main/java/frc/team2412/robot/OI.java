package frc.team2412.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import frc.team2412.robot.Commands.ExampleCommand;

public class OI {
	public Joystick driverStick = new Joystick(0);

	public JoystickButton exampleSubsystemMethod = new JoystickButton(driverStick, 1);

	public OI() {
		exampleSubsystemMethod.whenPressed(new ExampleCommand(RobotMap.robotContainer.m_ExampleSubsystem));
	}
}
