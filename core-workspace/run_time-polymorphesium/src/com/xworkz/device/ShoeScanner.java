package com.xworkz.device;

import com.xworkz.device.sub_class.Shoe;
import com.xworkz.device.sub_class.constants.ShoeSize;

public class ShoeScanner {

	public static void main(String[] args) {

		Shoe shoe1 = new Shoe("Lee Cooper", "Brown", 'M', ShoeSize.M);
		Shoe shoe2 = new Shoe("Nike", "Black", 'L', ShoeSize.S);
		Shoe shoe3 = new Shoe("Lee Cooper", "Brown", 'M', ShoeSize.M);

		System.out.println(shoe1.toString());
		System.out.println(shoe1.hashCode());
		
		System.out.println(shoe2.toString());
		System.out.println(shoe2.hashCode());
		
		System.out.println(shoe3.toString());
		System.out.println(shoe3.hashCode());
		
		System.out.println(shoe1.equals(shoe2)+"\n");
		System.out.println(shoe1.equals(shoe3)+"\n");
		System.out.println(shoe1.equals(null)+"\n");
		System.out.println(shoe1.equals("Rock")+"\n");

		
		
	}

}
