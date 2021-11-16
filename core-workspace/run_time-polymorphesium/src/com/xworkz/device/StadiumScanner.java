package com.xworkz.device;

import com.xworkz.device.sub_class.Stadium;

public class StadiumScanner {

	public static void main(String[] args) {

		Stadium stadium1 = new Stadium("Chinna Swami", "Channai", 2.4F);
		Stadium stadium2 = new Stadium("Eden Garden", "Kolkatta", 3.2F);
		Stadium stadium3 = new Stadium("Chinna Swami", "Channai", 2.4F);

		System.out.println(stadium1.hashCode());
		System.out.println(stadium1.toString());

		System.out.println(stadium2.hashCode());
		System.out.println(stadium2.toString());

		System.out.println(stadium3.hashCode());
		System.out.println(stadium3.toString());

		System.out.println(stadium1.equals(stadium2) + "\n");
		System.out.println(stadium1.equals(stadium3) + "\n");
		System.out.println(stadium1.equals(null) + "\n");
		System.out.println(stadium1.equals(21) + "\n");
	}

}
