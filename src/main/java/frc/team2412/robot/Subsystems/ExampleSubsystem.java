package frc.team2412.robot.Subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.team2412.robot.Subsystems.constants.ExampleConstants;

// This is an example subsystem. Make sure all subsystems extend Subsystem base and take in all dependencies through a constructor
public class ExampleSubsystem extends SubsystemBase {
	// no need to make public as it should be defined before an instance is created
	private int m_exampleID;

	public ExampleSubsystem(int exampleID) {
		m_exampleID = exampleID;
		setName("ExampleSubsystem");
	}

	// Run every loop of the robot
	@Override
	public void periodic() {
		// Be careful with this function... It is run every loop and must be used
		// sparingly. Ask me first if you should use this over a command. It is
		// appropriate to update sensor values in this function, but unlikely you will
		// control motors from here

		System.out.printf("Example subsystem, EXAMPLE_DISTANCE: %o\n", ExampleConstants.EXAMPLE_DISTANCE);
	}

	// Example method to be called by a command
	public void subsystemMethod() {
		System.out.println("MAX_SPEED: " + ExampleConstants.MAX_SPEED + ", Example ID: " + m_exampleID);
	}

}
