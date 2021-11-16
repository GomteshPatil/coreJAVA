package com.xworkz.device;

import com.xworkz.device.sub_class.Food;

public class FoodScanner {

	public static void main(String[] args) {

		Food food1 = new Food("Dhokala", 30F, "One Plate", true);
		Food food2 = new Food("Kachori", 25F, "One pice", true);
		Food food3 = new Food("Dhokala", 30F, "One Plate", true);

		System.out.println(food1.hashCode());
		System.out.println(food1.toString());

		System.out.println(food2.hashCode());
		System.out.println(food2.toString());

		System.out.println(food3.hashCode());
		System.out.println(food3.toString());

		System.out.println(food1.equals(food2) + "\n");
		System.out.println(food1.equals(food3) + "\n");
		System.out.println(food1.equals(null) + "\n");
		System.out.println(food1.equals(21) + "\n");

	}

}
