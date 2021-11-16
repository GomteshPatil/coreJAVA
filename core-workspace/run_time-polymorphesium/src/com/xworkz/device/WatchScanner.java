package com.xworkz.device;

import com.xworkz.device.sub_class.Watch;
import com.xworkz.device.sub_class.constants.Type;

public class WatchScanner {

	public static void main(String[] args) {
		
		Watch watch1=new Watch();
		watch1.setBrand("Titan");
		watch1.setWatchType(Type.ANALOG);
		watch1.setPrice(2320.50F);
		Watch watch2=new Watch("Fastrack", 4150.50F, Type.DEGITAL);
		Watch watch3=new Watch("Fastrack", 5230, Type.DEGITAL);
		
		System.out.println(watch1.toString());
		System.out.println("To String of watch1 : ".concat(String.valueOf(System.identityHashCode(watch1))).concat("\n"));
		System.out.println(watch2.toString());
		System.out.println("To String of watch2 : ".concat(String.valueOf(System.identityHashCode(watch2))).concat("\n"));
		System.out.println(watch3.toString());
		
		System.out.println(watch1.hashCode());
		System.out.println(watch2.hashCode());
		System.out.println(watch3.hashCode());
		
		boolean checked=watch2.equals(watch2);
		System.out.println(checked);
	}

}
