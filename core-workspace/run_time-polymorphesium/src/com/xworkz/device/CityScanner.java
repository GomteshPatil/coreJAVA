package com.xworkz.device;

import com.xworkz.device.sub_class.City;

public class CityScanner {

	public static void main(String[] args) {

		City city1 = new City("Kolhapur", "Maharastra", "India");
		City city2 = new City("Belagavi", "Karnataka", "India");
		City city3 = new City("Kolhapur", "Maharastra", "India");

		System.out.println(city1.hashCode());
		System.out.println(city1.toString());

		System.out.println(city2.hashCode());
		System.out.println(city2.toString());

		System.out.println(city3.hashCode());
		System.out.println(city3.toString());

		System.out.println(city1.equals(city2) + "\n");
		System.out.println(city1.equals(city3) + "\n");
		System.out.println(city1.equals(null) + "\n");
		System.out.println(city1.equals(21) + "\n");

	}

}
