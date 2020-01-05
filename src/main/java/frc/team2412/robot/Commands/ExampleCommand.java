package frc.team2412.robot.Commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.team2412.robot.Subsystems.ExampleSubsystem;

public class ExampleCommand extends CommandBase {
	ExampleSubsystem m_Subsystem;

	public ExampleCommand(ExampleSubsystem subsystem) {
		m_Subsystem = subsystem;
		addRequirements(subsystem);
	}

	@Override
	public void execute() {
		m_Subsystem.subsystemMethod();
	}

	@Override
	public boolean isFinished() {
		return true;
	}

}
