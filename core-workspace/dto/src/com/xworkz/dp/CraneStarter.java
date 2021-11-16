package com.xworkz.dp;

import com.xworkz.dp.dto.CraneDTO;

public class CraneStarter {

	public static void main(String[] args) {

		
		CraneDTO crane= new CraneDTO("JCB", "Construction", 150.25F, 75.25F, 2, 15, 2000, "Red");
		CraneDTO crane2=new CraneDTO("Toshiba", "Carry ", 121.45F, 45.50F, 1, 20, 5000.50F, "yellow");
		CraneDTO crane3=new CraneDTO("JCB", "at beach ports", 150.25F, 75.25F, 2, 15, 2000, "yellow");
		CraneDTO crane4 = new CraneDTO("JCB", "elivate things", 150.25F, 75.25F, 2, 15, 2000, "green");
		CraneDTO crane5 = new CraneDTO("JCB", "Construction", 150.25F, 75.25F, 2, 15, 2000, "black");
		CraneDTO crane6 = new CraneDTO("JCB", "Construction", 150.25F, 75.25F, 2, 15, 2000, "blue");
		
		CraneDTO[] cranes = new CraneDTO[8];
		cranes[0] = crane;
		cranes[1] = crane2;
		cranes[2] = crane3;
		cranes[3] = crane4;
		cranes[4] = crane5;
		cranes[5] = crane6;
		cranes[6] = crane3;
		for (int band = 0; band < cranes.length; band++) {

			CraneDTO array = cranes[band];
			if (array != null) {
				System.out.println("Colour : ".concat(array.getColour()));
				System.out.println("Comoany : ".concat(array.getCompany()));
				System.out.println("Operator Needed : ".concat(String.valueOf(array.getNoOfOperators())));
				System.out.println("Hight of crane : ".concat(String.valueOf(array.getHight())));
				System.out.println("length of crane arm : ".concat(String.valueOf(array.getLengthOfArm())));
				System.out.println("purpose : ".concat(array.getPurpose()));
				System.out.println("Max waight limit : ".concat(String.valueOf(array.getWaightCapacity())));
				System.out.println("Maintance Needed in days: ".concat(String.valueOf(array.getMaintanceNeeded())));
				System.out.println("------------------------------------------");

			} else {
				System.err.println("index".concat(String.valueOf(band).concat(" is pointing to null")));
			}
		}

	}

}
