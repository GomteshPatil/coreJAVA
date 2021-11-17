package com.xworkz.bridge.constants;

import com.xworkz.bridge.rules.HospitalAdmitRule;
import com.xworkz.bridge.rules.HospitalDischargeRule;

public class Hospital {

	private String name;
	private String location;
	private HospitalAdmitRule admitRule;
	private HospitalDischargeRule dischargeRule;

	public Hospital() {
		System.out.println("Invoked hospital no-arg const");
	}

	public Hospital(String name, String location, HospitalAdmitRule admitRule, HospitalDischargeRule dischargeRule) {
		super();
		this.name = name;
		this.location = location;
		this.admitRule = admitRule;
		this.dischargeRule = dischargeRule;
	}

	public void admitPatient() {
		System.out.println("Hospital name : ".concat(this.name));
		System.out.println("Hospital location : ".concat(this.location));
		System.out.println("Invoked admit method ");

		if (admitRule != null) {

			String reg = this.admitRule.register();
			boolean incurance = this.admitRule.validInsurance();
			double advance = this.admitRule.payAdvance();

			if (reg != null) {

				if (incurance == true) {
					System.out.println("Your need not to pay the advance ");
				}
				if (incurance != true) {
					System.out.println("You dont have insurance you need to pay the advance");
					if (advance >= 10000) {
						System.out.println("Advance recived");
					} else {
						System.err.println("minimum advance payable is 10000 ");
					}
				}

			}
		} else {
			System.err.println("you need to provide the rules for admit the patient first");
		}
	}

}
