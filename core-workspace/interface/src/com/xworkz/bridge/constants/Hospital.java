
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
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("Invoked admit method ");

		if (admitRule != null) {

			String reg = this.admitRule.register();
			boolean incurance = this.admitRule.validInsurance();
			double advance = this.admitRule.payAdvance();

			if (reg != null) {
				System.out.println("Patient is regestered with hospital : ".concat(this.admitRule.register()));
				if (incurance == true) {
					System.out.println("Patient has insurance no neew to pay the advance");
				} else {
					System.out.println("Patient has no inscurance so need to pay the advance");
					if (advance >= 10000) {
						System.out.println("Advance Paid : ".concat(String.valueOf(this.admitRule.payAdvance())));
					} else {
						System.err.println("you need to pay minimum 10,000 of advance");
					}
				}

			} else {
				System.err.println("The guy with this name is not regesterd");
			}
		} else {
			System.err.println("Rules to be assigned first then call the method again");
		}System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	}

	public void dischargePatient() {
		System.out.println("Invoked method to discharge ");
		boolean paiedOrnot = this.dischargeRule.payBill();
		double discout = this.dischargeRule.discount();

		if (this.dischargeRule != null) {
			if (paiedOrnot) {
				System.out.println("complete bill payed : ".concat(String.valueOf(dischargeRule.payBill())));
				System.out.println("Discount applicable for your fees : ".concat(String.valueOf(discout)));
			} else {
				System.err.println("Without paying complete fees discharge not allowed");
			}

		}else {
			System.out.println("first you need to give discharge rules");
		} 

	}

}
