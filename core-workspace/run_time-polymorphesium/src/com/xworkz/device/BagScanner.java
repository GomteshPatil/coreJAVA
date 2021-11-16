package com.xworkz.device;

import com.xworkz.device.sub_class.Bag;
import com.xworkz.device.sub_class.constants.BagColour;

public class BagScanner {

	public static void main(String[] args) {

		Bag bag1 = new Bag(1230, BagColour.BLACK, 3);
		Bag bag2 = new Bag(780, BagColour.WHITE, 5);
		Bag bag3 = new Bag(1230, BagColour.BLACK, 3);
		
		System.out.println(bag1.toString());
		System.out.println(bag1.hashCode());
		
		System.out.println(bag2.toString());
		System.out.println(bag2.hashCode());
		
		System.out.println(bag3.toString());
		System.out.println(bag3.hashCode());
		
		System.out.println(bag1.equals(bag2)+"\n");
		System.out.println(bag2.equals(bag3)+"\n");
		System.out.println(bag2.equals(null)+"\n");
		System.out.println(bag2.equals(25)+"\n");
		

	}

}
