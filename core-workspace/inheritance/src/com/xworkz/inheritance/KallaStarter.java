package com.xworkz.inheritance;

import com.xworkz.inheritance.device.Kalla;
import com.xworkz.inheritance.shop.MobileKalla;

public class KallaStarter {

	public static void main(String[] args) {

		Kalla kalla = new Kalla();
		kalla.robbary("Chain");
		String ref = kalla.item();
		System.out.println(ref);

		kalla.displyDetails();

		Kalla kallaChild = new MobileKalla("Vinod", "Vijaynagar", 3, 27, 12, "Mandya");

		String ref2 = kallaChild.item();
		System.out.println(ref2);
		kallaChild.displyDetails();

	}

}
