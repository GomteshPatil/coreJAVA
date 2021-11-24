package com.xworkz.bridge.constants;

import com.xworkz.bridge.rules.ZomatoCartDAO;

public class ZomatoBusiness {

	ZomatoCartDAO zomatoCart;
	
	
	public ZomatoBusiness(ZomatoCartDAO zomatoCart) {
		super();
		this.zomatoCart = zomatoCart;
	}

	public void save(CartDTO dto) {
		if (dto != null) {
			zomatoCart.save(dto);
		} else {
			System.err.println("May be you passing null or array is full");
		}
	}

	public void findByName(String itemToFind) {
		if (itemToFind != null) {
			zomatoCart.findByName(itemToFind);
		} else {
			System.err.println("May be you passing null or array is full");
		}
	}
	public void displayDetails() {
		zomatoCart.displayAllDetails();
	}
}
