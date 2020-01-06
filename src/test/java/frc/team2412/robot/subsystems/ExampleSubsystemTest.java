package frc.team2412.robot.subsystems;

import static org.mockito.Mockito.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.robototes.helpers.MockButton;
import com.robototes.helpers.MockHardwareExtension;
import com.robototes.helpers.TestWithScheduler;

import edu.wpi.first.wpilibj2.command.CommandScheduler;
import frc.team2412.robot.Commands.ExampleCommand;
import frc.team2412.robot.Subsystems.ExampleSubsystem;

public class ExampleSubsystemTest {

	ExampleSubsystem mockedExampleSubsystem;

	@Before
	public void beforeAll() {
		TestWithScheduler.schedulerStart();
		TestWithScheduler.schedulerClear();
		MockHardwareExtension.beforeAll();

		mockedExampleSubsystem = mock(ExampleSubsystem.class);
	}

	@Test
	public void ExampleCommandOnExampleSubsystem() {
		ExampleCommand exampleCommand = new ExampleCommand(mockedExampleSubsystem);

		MockButton fakeButton = new MockButton();

		fakeButton.whenPressed(exampleCommand);

		fakeButton.push();
		CommandScheduler.getInstance().run();
		fakeButton.release();

		verify(mockedExampleSubsystem, times(1)).subsystemMethod();

		TestWithScheduler.schedulerClear();
	}

	@After
	public void after() {
		TestWithScheduler.schedulerDestroy();
		MockHardwareExtension.afterAll();
	}

}
