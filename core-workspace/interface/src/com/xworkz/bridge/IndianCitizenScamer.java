package com.xworkz.bridge;

import com.xworkz.bridge.constants.Adress;
import com.xworkz.bridge.rules.IndianCitizen;
import com.xworkz.bridge.rules.MarriageRule;
import com.xworkz.bridge.rules.TrafficRule;
import com.xworkz.bridge.rules.VotingRule;

public class IndianCitizenScamer {

	public static void main(String[] args) {

		Object object = new IndianCitizen();
		System.out.println(object.toString());
		
			if (object instanceof IndianCitizen) {
			IndianCitizen casted = (IndianCitizen) object;
			
//			casted.setName("Rajesh");
//			casted.setAdress();

			System.out.println(casted.votingAge());// methods from VotingRule Interface
			System.out.println(casted.validId());

			System.out.println(casted.validlicenseNo());// methods from TrafficRule Interface
			System.out.println(casted.licenseNo());

			System.out.println(casted.validAge('F', 26));// method from interface MarrageRule
			
			

		}
		IndianCitizen indCitizen = new IndianCitizen();

		System.out.println(indCitizen.votingAge());// methods from VotingRule Interface
		System.out.println(indCitizen.validId());

		System.out.println(indCitizen.validlicenseNo());// methods from TrafficRule Interface
		System.out.println(indCitizen.licenseNo());

		System.out.println(indCitizen.validAge('M', 28));// method from interface MarrageRule

		VotingRule votingRule = new IndianCitizen();
		System.out.println(votingRule.votingAge());// methods from VotingRule Interface
		System.out.println(votingRule.validId());

		TrafficRule trafficRule = new IndianCitizen();
		trafficRule.validInsurance();
		trafficRule.validlicenseNo();
		MarriageRule marrRule = new IndianCitizen();
		marrRule.validAge('F', 25);

	}

}
