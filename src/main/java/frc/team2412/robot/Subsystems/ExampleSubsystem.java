package frc.team2412.robot.Subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.team2412.robot.Subsystems.constants.ExampleConstants;

public class ExampleSubsystem extends SubsystemBase {
	private int m_exampleID;

	public ExampleSubsystem(int exampleID) {
		m_exampleID = exampleID;
		setName("ExampleSubsystem");
	}

	@Override
	public void periodic() {
		System.out.println("Example subsystem");
	}

	public void subsystemMethod() {
		System.out.println("MAX_SPEED: " + ExampleConstants.MAX_SPEED + ", Example ID: " + m_exampleID);
	}

}
