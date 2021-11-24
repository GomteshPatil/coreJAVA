package com.xworkz.bridge.rules;

import com.xworkz.bridge.constants.CartDTO;

public class ImplementedZomatoDAO implements ZomatoCartDAO {

	private int tax = 0;

	CartDTO[] cart = new CartDTO[10];

	@Override
	public boolean save(CartDTO cartDTO) {
		System.out.println("Invoked save Method ");
		if (cartDTO != null) {
			for (int i = 0; i <= cart.length; i++) {
				this.cart[tax] = cartDTO;
				tax++;
				return true;
			}
		} else {
			System.err.println("May be you passing null or index is full");
		}
		return false;
	}

	@Override
	public CartDTO findByName(String name) {
		if (name != null) {
			for (int y = 0; y < cart.length; y++) {
				if (cart[y] != null) {
					String checkWith = cart[y].getName();
					if (name.equals(checkWith)) {
						System.out.println("The Item that you searching is found ".concat(name));
						break;
					} else {
						System.out.println("product that you looking is may be out of stock");
					}
				} else {
					System.err.println("Index is not storing any product ".concat(String.valueOf(y)));
				}
			}
		} else {
			System.err.println("To find the product you need to enter the product name");
		}
		return null;
	}

	@Override
	public void displayAllDetails() {
		if (cart != null) {
			for (int i = 0; i < cart.length; i++) {
				if (cart[i] != null) {
					System.out.println("Product : " + cart[i].getName());
					System.out.println("Product price  : " + cart[i].getPrice());
					System.out.println("Product quantity : " + cart[i].getQuantity());
					System.out.println("Total items  : " + cart[i].getTotalItems());
					System.out.println("~~~~~~~~~~~~~~~~~~~");
				}
			}
		}

	}

}
