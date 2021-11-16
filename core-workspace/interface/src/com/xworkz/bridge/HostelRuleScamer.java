package com.xworkz.bridge;

import com.xworkz.bridge.rules.HostelRule;
import com.xworkz.bridge.rules.SharavatiHostelRule;
import com.xworkz.bridge.rules.Visitor;

public class HostelRuleScamer {

	public static void main(String[] args) {

		HostelRule hostelRule = new SharavatiHostelRule();
		hostelRule.intime();
		System.out.println(hostelRule.intime());

		if (hostelRule instanceof SharavatiHostelRule) {
			SharavatiHostelRule casted = (SharavatiHostelRule)hostelRule;
			casted.breakFaast();
		}

		SharavatiHostelRule hostelRule2 = new SharavatiHostelRule(); // 9 methods from object 1-method from visitor
			hostelRule2.intime();								     // 1-method from HostelRule and 1-method from
																    // implimentation class it self
		hostelRule2.intime();

		Visitor visitor = new SharavatiHostelRule();// 9-methods from object,1-method from visitor
		visitor.visitingDay();

		Object object = new SharavatiHostelRule();// 9 methods inherited from object class
		object.toString();
	}

}
