package frc.team2412.robot;

import frc.team2412.robot.Subsystems.ExampleSubsystem;

public class RobotContainer {
	public OI m_OI;
	public ExampleSubsystem m_ExampleSubsystem;
	
	public RobotContainer() {
		m_ExampleSubsystem = new ExampleSubsystem(RobotMap.exampleID);
		
		m_OI = new OI();
	}
}
