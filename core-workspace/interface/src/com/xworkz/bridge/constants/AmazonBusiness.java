package com.xworkz.bridge.constants;

import com.xworkz.bridge.rules.AmazonCartDAO;

public class AmazonBusiness {
	

	AmazonCartDAO dao;

	public AmazonBusiness(AmazonCartDAO dao) {
		super();
		this.dao = dao;
	}

	public void saveCart(CartDTO cto) {
		if (cto != null) {
			boolean found = dao.save(cto);
			if (found) {
				System.out.println("invoked save method in ImplimentedAmazonCartDAO");
			} else {
				System.out.println("not saved");
			}
		} else {
			System.err.println("you are pasing null value");
		}
	}

	/*public void findCartByName(String cto) {
		if (cto != null) {
			this.dao.findByName(cto);
			CartDTO cartDTORef = dao.findByName(cto.getName());
			if (cartDTORef != null) {
				System.out.println(cartDTORef.getName());
				System.out.println(cartDTORef.getTotalItems());
				System.out.println(cartDTORef.getPrice());
				System.out.println(cartDTORef.getQuantity());
			} else {
				System.err.println("returning null  value");
			}

		} else {
			System.out.println("passed null reference");
		}

	}*/
	public void findCartByName(String cto) {
		if (cto != null) {
	this.dao.findByName(cto);
		}else {
			System.err.println("returning null  value");
		}
	}
	
	
	

	public void displayCart() {
		if (dao != null) {
			dao.displayDetails();
		}
	}

}
