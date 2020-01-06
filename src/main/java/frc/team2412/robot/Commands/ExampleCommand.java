package frc.team2412.robot.Commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.team2412.robot.Subsystems.ExampleSubsystem;

//This is an example command for this year. Make sure all commands extend CommandBase and they use take all dependencies(fields) through a constructor
public class ExampleCommand extends CommandBase {
	ExampleSubsystem m_Subsystem;

	public ExampleCommand(ExampleSubsystem subsystem) {
		m_Subsystem = subsystem;
		addRequirements(subsystem);
	}

	@Override
	public void execute() {
		// run the example method
		m_Subsystem.subsystemMethod();
	}

	@Override
	public boolean isFinished() {
		return true;
	}

}
