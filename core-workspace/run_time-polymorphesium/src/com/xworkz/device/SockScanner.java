package com.xworkz.device;

import com.xworkz.device.sub_class.Sock;
import com.xworkz.device.sub_class.constants.SockMaterial;
import com.xworkz.device.sub_class.constants.SockSize;
import com.xworkz.device.sub_class.constants.SockType;

public class SockScanner {

	public static void main(String[] args) {

		Sock sock1 = new Sock(230F, SockSize.M, SockMaterial.COTTON, SockType.ANCLE);
		Sock sock2 = new Sock(350F, SockSize.L, SockMaterial.WOOL, SockType.WINTER);
		Sock sock3 = new Sock(230F, SockSize.M, SockMaterial.COTTON, SockType.ANCLE);

		System.out.println(sock1.toString());
		System.out.println(sock1.hashCode());

		System.out.println(sock2.toString());
		System.out.println(sock2.hashCode());

		System.out.println(sock3.toString());
		System.out.println(sock3.hashCode());
		
		System.out.println(sock1.equals(sock3)+"\n");
		System.out.println(sock1.equals(sock2)+"\n");
		System.out.println(sock1.equals(null)+"\n");
		System.out.println(sock1.equals(23)+"\n");
	}

}
