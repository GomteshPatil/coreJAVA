package com.xworkz.device;

import com.xworkz.device.sub_class.Ipod;

public class IpodScanner {

	public static void main(String[] args) {

		Ipod ipod = new Ipod();
		String ref = ipod.toString();
		System.out.println(ref);
		System.out.println(ipod.hashCode());
		System.out.println(" the unique id of ref is : " + System.identityHashCode(ref));
		ipod.setModelNo("FHD1212");

		Ipod ipod2 = new Ipod();
		System.out.println(ipod2);
		System.out.println(ipod2.hashCode());
		ipod2.setModelNo("FHD1212");

		System.out.println(ipod.equals(ipod2));

	}

}
