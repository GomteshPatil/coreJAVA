package com.xworkz.device;

import com.xworkz.device.sub_class.Airoplane;

public class AiroplaneScanner {

	public static void main(String[] args) {
		Airoplane airoplane1 = new Airoplane("Air INDIA", 620, "India Govt");
		Airoplane airoplane2 = new Airoplane("Air INDIA", 620, "India Govt");
		Airoplane airoplane3 = new Airoplane("Star Links", 2210, "India Govt");

		System.out.println(airoplane1.toString());
		System.out.println(airoplane1.hashCode());

		System.out.println(airoplane2.toString());
		System.out.println(airoplane2.hashCode());

		System.out.println(airoplane3.toString());
		System.out.println(airoplane3.hashCode());

		System.out.println(airoplane1.equals(airoplane2) + "\n");
		System.out.println(airoplane1.equals(airoplane3) + "\n");
		System.out.println(airoplane1.equals(null) + "\n");
		System.out.println(airoplane1.equals(21) + "\n");

	}

}
