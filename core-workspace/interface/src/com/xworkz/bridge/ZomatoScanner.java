package com.xworkz.bridge;

import com.xworkz.bridge.constants.CartDTO;
import com.xworkz.bridge.constants.ZomatoBusiness;
import com.xworkz.bridge.rules.ImplementedZomatoDAO;
import com.xworkz.bridge.rules.ZomatoCartDAO;

public class ZomatoScanner {

	public static void main(String[] args) {

		CartDTO data1 = new CartDTO("Rice", 1, 45F, 2);

		CartDTO data2 = new CartDTO("Potato", 1, 45F, 5);

		ZomatoCartDAO ref = new ImplementedZomatoDAO();

		ZomatoBusiness business = new ZomatoBusiness(ref);
		business.save(data1);
		business.save(data2);
		business.findByName("Apple");
		business.displayDetails();

	}

}
