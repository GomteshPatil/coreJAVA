package com.xworkz.archive;

import com.xworkz.archive.main.Dana1;
import com.xworkz.archive.tamilnadu.District;
import com.xworkz.archive.tamilnadu.Tamilnadu;

public class CreateJarStarter {

	public static void main(String[] args) {

		Tamilnadu tamilnadu = new Tamilnadu();
		tamilnadu.setCapital("Chennai");
		System.out.println(tamilnadu.getCapital());
		System.out.println(tamilnadu.getStateName());

		District district = new District();
		district.name = "Ayyappa";
		district.popullation = 336758;
		System.out.println(district.name);
		System.out.println(district.popullation);

		Dana1 dana = new Dana1();

		dana.setName("Cow");
		dana.getName();
		dana.rate = 25400.2f;
		System.out.println(dana.getName());
		System.out.println(dana.rate);

	}

}
