package com.xworkz.bridge.constants;

import com.xworkz.bridge.rules.DevoteeRule;

public class TempleTrust {

	private String templeName;
	private DevoteeRule devoteeRule;

	public TempleTrust() {
		System.out.println("invoked temple trust no-arg const");
	}

	public TempleTrust(String templeName, DevoteeRule devoteeRule) {
		super();
		this.setTempleName(templeName);
		this.setDevoteeRule(devoteeRule);
	}

	public void allowDevotee() {
		if (devoteeRule != null) {
			boolean off = this.devoteeRule.slipperOff();
			if (off == true) {
				boolean photo = this.devoteeRule.dontTakePhoto();
				boolean silance = this.devoteeRule.maintainSilance();
				if (photo && silance) {
					System.out.println("Good devotee god will bless you");
				} else {
					System.err.println("Dont take photo inside the temple its not allowed");
				}
			} else {
				System.err.println("Buddi elva Chapalli hakond bartidiya");
			}
		} else {
			System.err.println("First provide the rules ");
		}
	}

	public String getTempleName() {
		return templeName;
	}

	public void setTempleName(String templeName) {
		this.templeName = templeName;
	}

	public DevoteeRule getDevoteeRule() {
		return devoteeRule;
	}

	public void setDevoteeRule(DevoteeRule devoteeRule) {
		this.devoteeRule = devoteeRule;
	}

}
