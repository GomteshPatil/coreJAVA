package com.xworkz.bridge.rules;

import com.xworkz.bridge.constants.CartDTO;

public interface AmazonCartDAO {

	boolean save(CartDTO cartDTO);

	CartDTO findByName(String itemToCheck);

	void displayDetails();

}
