package com.xworkz.bridge;

import com.xworkz.bridge.constants.TempleTrust;
import com.xworkz.bridge.rules.DevoteeRule;
import com.xworkz.bridge.rules.PublicDevoteeRule;
import com.xworkz.bridge.rules.VipDevoteeRule;

public class TampleScammer {

	public static void main(String[] args) {

		DevoteeRule publicDevoteeRule = new PublicDevoteeRule();
		TempleTrust trust1 = new TempleTrust("Iscon", publicDevoteeRule);
		trust1.allowDevotee();
		
		DevoteeRule VipDevoteeRule=new VipDevoteeRule();
		
		TempleTrust trust2=new TempleTrust();
		trust2.setDevoteeRule(VipDevoteeRule);
		trust2.setTempleName("Ragigudda temple");
		trust2.allowDevotee();
		
	}

}
