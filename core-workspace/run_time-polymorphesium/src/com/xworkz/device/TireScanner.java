package com.xworkz.device;

import com.xworkz.device.sub_class.Tire;
import com.xworkz.device.sub_class.constants.TireType;

public class TireScanner {

	public static void main(String[] args) {

		Tire tire1 = new Tire("MRF", 1820F, TireType.SMALL);
		Tire tire2 = new Tire("HONDA", 1820F, TireType.SMALL);
		Tire tire3 = new Tire("MRF", 1820F, TireType.SMALL);

		System.out.println(tire1.toString());
		System.out.println(tire1.hashCode());

		System.out.println(tire2.toString());
		System.out.println(tire2.hashCode());

		System.out.println(tire3.toString());
		System.out.println(tire3.hashCode());

		System.out.println(tire1.equals(tire2) + "\n");
		System.out.println(tire1.equals(tire3) + "\n");
		System.out.println(tire1.equals(null) + "\n");
		System.out.println(tire1.equals(21) + "\n");

	}

}
