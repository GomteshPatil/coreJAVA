package com.xworkz.device;

import com.xworkz.device.sub_class.Headset;
import com.xworkz.device.sub_class.constants.HeadsetType;

public class HeadsetScanner {

	public static void main(String[] args) {

		Headset headset1 = new Headset("Sony", 1240, HeadsetType.SPORTS, 6);
		Headset headset2 = new Headset("Apple", 12000, HeadsetType.AIRPODS, 1);
		Headset headset3 = new Headset("Sony", 1240, HeadsetType.SPORTS, 6);

		System.out.println(headset1.toString());
		System.out.println(headset2.toString());
		System.out.println(headset3.toString().concat("\n"));

		System.out.println(headset1.hashCode());
		System.out.println(headset2.hashCode());
		System.out.println(headset3.hashCode() + "\n");

		System.out.println(headset1.equals(headset2)+"\n");
		System.out.println(headset1.equals(headset3)+"\n");
		System.out.println(headset1.equals(null)+"\n");
		System.out.println(headset1.equals(25)+"\n");

	}

}
