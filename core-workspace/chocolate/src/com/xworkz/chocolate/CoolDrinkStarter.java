package com.xworkz.chocolate;

import com.xworkz.chocolate.operations.CoolDrinks;

public class CoolDrinkStarter {

	public static void main(String[] args) {

		CoolDrinks coolDrinks = new CoolDrinks();
		coolDrinks.addCoolDrinkNames("7 up");
		coolDrinks.addCoolDrinkNames("Coca-Cola");
		coolDrinks.addCoolDrinkNames("Mazza");
		coolDrinks.addCoolDrinkNames("slice");
		coolDrinks.addCoolDrinkNames("Fruity");
		coolDrinks.addCoolDrinkNames("Fizz");
		coolDrinks.addCoolDrinkNames("Mirinda");
		coolDrinks.addCoolDrinkNames("Limka");
		coolDrinks.addCoolDrinkNames("vandu");

		coolDrinks.delete(2);
		coolDrinks.update(2, "Vandu");

		String[] array = coolDrinks.getCoolDrinkNames();
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}

		coolDrinks.delete(6);
		String[] array1 = coolDrinks.getCoolDrinkNames();
		for (int i = 0; i < array1.length; i++) {
			System.out.println(array1[i]);
		}

	}

}
