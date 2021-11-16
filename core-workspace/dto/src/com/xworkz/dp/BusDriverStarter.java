package com.xworkz.dp;

import com.xworkz.dp.dto.BusDriverDTO;

public class BusDriverStarter {

	public static void main(String[] args) {

		BusDriverDTO busDriverDTO = new BusDriverDTO();
		busDriverDTO.setAffordable(true);
		busDriverDTO.setBusCompany("Ashok Layland");
		busDriverDTO.setDepo("BMTC");
		busDriverDTO.setLocation("Banshankari");
		busDriverDTO.setName("Naganna");
		busDriverDTO.setStarttime(8.35F);
		;
		busDriverDTO.setState("Karnataka");

		BusDriverDTO busDriverDTO2 = new BusDriverDTO("Karnataka", "Anand", "Jaynagar", 9.35F, "Jaynagar", "Tata",
				true);
		BusDriverDTO busDriverDTO3 = new BusDriverDTO("Maharastra", "suresh", "kolhapur", 9.35F, "ich", "honda", true);
		BusDriverDTO busDriverDTO4 = new BusDriverDTO("kerala", "amit", "Jaynagar", 9.35F, "Jaynagar", "hero", true);
		BusDriverDTO busDriverDTO5 = new BusDriverDTO("tamilnadu", "anil", "Jaynagar", 9.35F, "Jaynagar", "toyota",
				true);
		BusDriverDTO busDriverDTO6 = new BusDriverDTO("gujarat", "anmol", "Jaynagar", 9.35F, "Jaynagar", "Tata", true);

		BusDriverDTO[] busDrivers = new BusDriverDTO[13];

		busDrivers[0] = busDriverDTO;
		busDrivers[1] = busDriverDTO2;
		busDrivers[2] = busDriverDTO3;
		busDrivers[3] = busDriverDTO4;
		busDrivers[4] = busDriverDTO5;
		busDrivers[5] = busDriverDTO6;

		for (int i = 0; i < busDrivers.length; i++) {

			BusDriverDTO ref = busDrivers[i];
			if (ref != null) {

				System.out.println("State : ".concat(ref.getState()));
				System.out.println("depo name : ".concat(ref.getLocation()));
				System.out.println("name of driver : ".concat(ref.getName()));
				System.out.println("Price is affordable : ".concat(String.valueOf(ref.isAffordable())));
				System.out.println("Depo name : ".concat(ref.getDepo()));
				System.out.println("bus company : ".concat(ref.getBusCompany()));
				System.out.println("Start time : ".concat(String.valueOf(ref.getStarttime())));
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ ");
			} else {
				System.err.println(String.valueOf(i).concat("nd index is pointing to null"));
			}

		}

	}

}
