package com.robototes.helpers;

import edu.wpi.first.wpilibj2.command.CommandScheduler;;

/**
 * Extend this class when your test requires commands or command groups to be
 * exercised with the full WPI scheduler. Use
 * {@link SchedulerPumpHelper#runForDuration(int, int...)} to pump the
 * scheduler.
 */
public class TestWithScheduler {

	public static void schedulerStart() {
		CommandScheduler.getInstance().enable();
	}

	public static void schedulerClear() {
		CommandScheduler.getInstance().cancelAll();
		CommandScheduler.getInstance().clearButtons();
	}

	public static void schedulerDestroy() {
		CommandScheduler.getInstance().disable();
	}
}