package com.xworkz.device;

import com.xworkz.device.sub_class.Belt;

public class BeltScanner {

	public static void main(String[] args) {
		
		Belt belt1=new Belt(230F, "Leather", 1F, "Male");
		Belt belt2=new Belt(330F, "Fox leather", 1F, "Male");
		Belt belt3=new Belt(230F, "Leather", 1F, "Male");
		
		System.out.println(belt1.toString());
		System.out.println(belt1.hashCode());
		
		System.out.println(belt2.toString());
		System.out.println(belt2.hashCode());
		
		System.out.println(belt3.toString());
		System.out.println(belt3.hashCode());
		
		System.out.println(belt1.equals(belt2)+"\n");
		System.out.println(belt1.equals(belt3)+"\n");
		System.out.println(belt1.equals(null)+"\n");
		System.out.println(belt1.equals(26)+"\n");
	}

}
