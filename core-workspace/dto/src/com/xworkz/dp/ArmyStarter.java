package com.xworkz.dp;

import com.xworkz.dp.dto.ArmyDTO;

public class ArmyStarter {

	public static void main(String[] args) {

		ArmyDTO armyDTO = new ArmyDTO();
		armyDTO.setCountry("INDIA");
		armyDTO.setMilitaryPersonnels(1440000);
		armyDTO.setAircraftCarriour(true);
		armyDTO.setNoOfTanks(4300);
		armyDTO.setNoOfFiterJet(290);
		armyDTO.setSpecialForce("MARCOS");

		ArmyDTO armyDTO2 = new ArmyDTO("China", 2545000, 3370, true, 3500, "Changfing");
		ArmyDTO armyDTO3 = new ArmyDTO("USA", 2545000, 3370, true, 3500, "Blue seal");
		ArmyDTO armyDTO4 = new ArmyDTO("esrel", 2545000, 3370, false, 3500, "Sayeret Matkal");
		ArmyDTO armyDTO5 = new ArmyDTO("Viatanam", 100000, 2050, false, 140, "LLDB");
		ArmyDTO armyDTO6 = new ArmyDTO("Somania", 230005, 1044, false, 50, "Changfing");

		ArmyDTO[] armys = new ArmyDTO[10];
		armys[0] = armyDTO;
		armys[1] = armyDTO2;
		armys[2] = armyDTO3;
		armys[3] = armyDTO4;
		armys[4] = armyDTO5;
		armys[5] = armyDTO6;

		for (int me = 0; me < armys.length; me++) {

			ArmyDTO ref = armys[me];
			if (ref != null) {

				System.out.println("Index is ".concat(String.valueOf(me)));
				System.out.println(ref.getCountry());
				System.out.println(ref.getMilitaryPersonnels());
				System.out.println(ref.getNoOfFiterJet());
				System.out.println(ref.getNoOfTanks());
				System.out.println(ref.getSpecialForce());
				System.out.println(ref.isAircraftCarriour());
				System.out.println("-----------------------------------------------------------------------");
			} else {
				System.err.println("Index ".concat(String.valueOf(me)).concat(" is pointin to Null"));
			}

		}

	}

}
