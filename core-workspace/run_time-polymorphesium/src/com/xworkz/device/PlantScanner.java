package com.xworkz.device;

import com.xworkz.device.sub_class.Plant;
import com.xworkz.device.sub_class.constants.PlantType;

public class PlantScanner {

	public static void main(String[] args) {

		Plant plant1 = new Plant("Coconut", true, 80F, PlantType.BIG);
		Plant plant2 = new Plant("Tamarind", true, 200F, PlantType.RAIN_FOREST);
		Plant plant3 = new Plant("Coconut", true, 80F, PlantType.BIG);

		System.out.println(plant1.toString());
		System.out.println(plant1.hashCode() + "\n");

		System.out.println(plant2.toString());
		System.out.println(plant2.hashCode() + "\n");

		System.out.println(plant3.toString());
		System.out.println(plant3.hashCode() + "\n");

		System.out.println(plant1.equals(plant3) + "\n");
		System.out.println(plant1.equals(plant2) + "\n");
		System.out.println(plant1.equals(null) + "\n");
		System.out.println(plant1.equals(26.7) + "\n");

	}

}
