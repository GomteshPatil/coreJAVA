package com.xworkz.device;

import com.xworkz.device.sub_class.Fish;
import com.xworkz.device.sub_class.constants.FishType;

public class FishScanner {

	public static void main(String[] args) {

		Fish fish1 = new Fish("Gold Fish", 20F, "Golden Orange", FishType.POND);
		Fish fish2 = new Fish("Gold Fish", 20F, "Shark", FishType.SEE);
		Fish fish3 = new Fish("Gold Fish", 20F, "Golden Orange", FishType.POND);

		System.out.println(fish1.hashCode());
		System.out.println(fish1.toString());
		
		System.out.println(fish2.hashCode());
		System.out.println(fish2.toString());
		
		System.out.println(fish3.hashCode());
		System.out.println(fish3.toString());
		
		System.out.println(fish1.equals(fish2)+"\n");
		System.out.println(fish1.equals(fish3)+"\n");
		System.out.println(fish1.equals(null)+"\n");
		System.out.println(fish1.equals(21)+"\n");
		

	}

}
