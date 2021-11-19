package com.xworkz.bridge;

import com.xworkz.bridge.constants.AmazonBusiness;
import com.xworkz.bridge.constants.CartDTO;
import com.xworkz.bridge.rules.AmazonCartDAO;
import com.xworkz.bridge.rules.ImplimentedAmazonCartDAO;

public class AmazonScammer {

	public static void main(String[] args) {

		CartDTO cartDTO1 = new CartDTO("Wallet", 2, 850F, 3);

		ImplimentedAmazonCartDAO cartDAO1 = new ImplimentedAmazonCartDAO();

		AmazonBusiness amazonBusiness1 = new AmazonBusiness(cartDAO1);
		amazonBusiness1.saveCart(cartDTO1);
		amazonBusiness1.displayCart();
		amazonBusiness1.findCartByName("Wallet");

		CartDTO cartDTO2 = new CartDTO("Moblie", 1, 12400F, 3);
		AmazonCartDAO cartDAO2=new ImplimentedAmazonCartDAO();
		AmazonBusiness amazonBusiness2=new AmazonBusiness(cartDAO2);	
		amazonBusiness2.saveCart(cartDTO2);
		amazonBusiness2.displayCart();
		amazonBusiness2.findCartByName("FaceWash");
		
		

	}

}
