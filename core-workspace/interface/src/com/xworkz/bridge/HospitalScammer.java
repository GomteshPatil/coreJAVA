package com.xworkz.bridge;

import com.xworkz.bridge.constants.Hospital;
import com.xworkz.bridge.rules.HospitalAdmitRule;
import com.xworkz.bridge.rules.JaydevaHospitalAdmitRule;
import com.xworkz.bridge.rules.JaydevaHospitalDischargeRule;

public class HospitalScammer {

	public static void main(String[] args) {
		
		HospitalAdmitRule admitRule1=new JaydevaHospitalAdmitRule();
		JaydevaHospitalDischargeRule dischargeRule1=new JaydevaHospitalDischargeRule();
		
		
		
		Hospital hospital=new Hospital("Jaydeva", "BTM 1st Stage", admitRule1, dischargeRule1);
		hospital.admitPatient();

	}

}
