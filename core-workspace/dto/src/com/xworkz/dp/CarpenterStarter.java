package com.xworkz.dp;

import com.xworkz.dp.dto.CarpenterDTO;

public class CarpenterStarter {

	public static void main(String[] args) {

		CarpenterDTO carpenterDTO = new CarpenterDTO();
		carpenterDTO.setLocation("BTM");
		carpenterDTO.setName("Rohit");
		carpenterDTO.setNoOfTools(26);
		carpenterDTO.setPowerTool("Drill machine");
		carpenterDTO.setProduct("Chair");
		carpenterDTO.setTrustable(true);
		carpenterDTO.setWorkers("Vighnesh");

		CarpenterDTO carpenterDTO2 = new CarpenterDTO("amol", "rajainagar", 12, "grainding machine", "Sofa", "ashok",
				true);
		CarpenterDTO carpenterDTO3 = new CarpenterDTO("amit", "myca Layout", 55, "mill cutter machine", "Sofa", "raj",
				true);
		CarpenterDTO carpenterDTO4 = new CarpenterDTO("ratan", "jayanagar", 12, "grainding machine", "bench", "ashok",
				true);
		CarpenterDTO carpenterDTO5 = new CarpenterDTO("vinayak", "jp nagar", 12, "sanding machine", "doors", "ashok",
				true);

		CarpenterDTO[] array = new CarpenterDTO[8];

		array[0] = carpenterDTO;
		array[1] = carpenterDTO2;
		array[2] = carpenterDTO3;
		array[3] = carpenterDTO4;
		array[4] = carpenterDTO5;

		for (int goal = 0; goal < array.length; goal++) {

			CarpenterDTO ref = array[goal];

			if (ref!= null) {

				System.out.println(ref.getName());
				System.out.println(ref.getLocation());
				System.out.println(ref.getProduct());
				System.out.println(ref.getNoOfTools());
				System.out.println(ref.getPowerTool());
				System.out.println(ref.getWorkers());
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

			} else {
				System.err.println("index".concat(String.valueOf(goal).concat(" is pointing to null")));
			}
		}

	}

}
