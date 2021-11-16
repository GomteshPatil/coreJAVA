package com.xworkz.chocolate;

import com.xworkz.chocolate.operations.Coffice;

public class CofficeStarter {

	public static void main(String[] args) {

		Coffice coffice = new Coffice();
		coffice.addCofficeBrand("Bru");
		coffice.addCofficeBrand("Tata Coffee");
		coffice.addCofficeBrand("Blue Tokai");
		coffice.addCofficeBrand("Davidoff");
		coffice.addCofficeBrand("Lavazza");
		coffice.addCofficeBrand("The Flying Squirrel");
		coffice.addCofficeBrand("The Indian Bean");

		coffice.deleteCofficeBrand(2);
		coffice.updateCofficeBrand(4, "Hard Rock Coffice");
		String[] array = coffice.getCofficeBrand();
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}

	}

}
