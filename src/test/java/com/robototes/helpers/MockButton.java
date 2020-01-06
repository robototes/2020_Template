package com.robototes.helpers;

import edu.wpi.first.wpilibj2.command.button.Button;

public class MockButton extends Button {

	private boolean pushed = false;

	@Override
	public boolean get() {
		// TODO Auto-generated method stub
		return pushed;
	}

	public void push() {
		pushed = true;
	}

	public void release() {
		pushed = false;
	}
}
