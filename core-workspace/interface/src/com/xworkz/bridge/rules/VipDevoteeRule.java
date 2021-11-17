package com.xworkz.bridge.rules;

public class VipDevoteeRule implements DevoteeRule {

	@Override
	public boolean slipperOff() {
		System.out.println("should to take of your slippers outside the temple ");
		return true;
	}

	@Override
	public boolean dontTakePhoto() {
		System.out.println("Only VIP's are allowed to take photo inside the tample ");
		return false;
	}

	@Override
	public boolean maintainSilance() {
		System.out.println("Please dont make noise it will disturb others");
		return false;
	}

	
	
}
