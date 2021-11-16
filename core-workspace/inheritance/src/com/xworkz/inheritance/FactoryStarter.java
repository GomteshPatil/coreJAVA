package com.xworkz.inheritance;

import com.xworkz.inheritance.shop.Factory;
import com.xworkz.inheritance.shop.SugarFactory;

public class FactoryStarter {

	public static void main(String[] args) {

		SugarFactory sugarFactory = new SugarFactory();

		Factory factory = new SugarFactory();
		System.out.println(factory.since);
	}

}
