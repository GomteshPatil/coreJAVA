package com.xworkz.inheritance;

import com.xworkz.inheritance.shop.NaturalSaloons;
import com.xworkz.inheritance.shop.Saloon;

public class SaloonStarter {

	public static void main(String[] args){

		NaturalSaloons naturalSaloon = new NaturalSaloons();
		System.out.println(naturalSaloon.name);
		System.out.println(naturalSaloon.noOfHajamas);
		System.out.println("***********************");

		Saloon saloon = new Saloon();
		System.out.println(saloon.name);
		System.out.println(saloon.noOfHajamas);
		System.out.println("***********************");

		Saloon naturalSaloons1 = new NaturalSaloons();
		System.out.println(naturalSaloons1.name);
		System.out.println(naturalSaloons1.noOfHajamas);
		System.out.println("***********************");

	}

}
