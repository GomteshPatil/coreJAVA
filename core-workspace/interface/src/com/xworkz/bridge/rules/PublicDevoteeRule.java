package com.xworkz.bridge.rules;

public class PublicDevoteeRule implements DevoteeRule {

	// implemented methods from DevoteeRule Interface
	@Override
	public boolean slipperOff() {
		System.out.println("Invoked slipperOff ");
		return true;
	}

	@Override
	public boolean dontTakePhoto() {
		System.out.println("Invoked dontTakePhoto ");

		return true;
	}

	@Override
	public boolean maintainSilance() {
		System.out.println("Invoked dontTakePhoto ");

		return true;
	}

}
