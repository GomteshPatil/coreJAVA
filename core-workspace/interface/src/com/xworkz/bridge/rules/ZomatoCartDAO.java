package com.xworkz.bridge.rules;

import com.xworkz.bridge.constants.CartDTO;

public interface ZomatoCartDAO {
	
	boolean save(CartDTO cartDTO);
	CartDTO findByName(String name);
	void displayAllDetails();

}
