package com.xworkz.bridge.rules;

import com.xworkz.bridge.constants.CartDTO;

public class ImplimentedAmazonCartDAO implements AmazonCartDAO {

	CartDTO[] dtos = new CartDTO[10];
	int text = 0;

	@Override
	public boolean save(CartDTO cartDTO) {
		if (cartDTO != null) {
			for (int text = 0; text < dtos.length; text++) {
				this.dtos[text] = cartDTO;
				text++;

				return true;
				
			}
		} else {
			System.err.println("may be array index is full or you passing null");
		}
		return false;
	}

	@Override
	public CartDTO findByName(String itemToCheck) {
		if (itemToCheck != null) {
			for (int j = 0; j < dtos.length; j++) {
				if (dtos[j] != null) {
					String itemName = dtos[j].getName();
					if (itemToCheck.equals(itemName)) {
						System.out.println("The item that you are looking for is found : ".concat(itemToCheck));
						break;
					} else {
						System.err.println("Sorry to imform that the item that you looking is not found");
					}
				}
			}

		}
		System.err.println("You are not allowed to pass null please enter the item you want to find");
		return null;
	}

	@Override
	public void displayDetails() {

		for (int k = 0; k < dtos.length; k++) {
			if (dtos[k] != null) {

				System.out.println("item name : " + dtos[k].getName());
				System.out.println("item quantity : " + dtos[k].getQuantity());
				System.out.println("Total items : " + dtos[k].getTotalItems());
			} else {
				System.err.println("this index is empty : ".concat(String.valueOf(k)));

			}

		}

	}

}
