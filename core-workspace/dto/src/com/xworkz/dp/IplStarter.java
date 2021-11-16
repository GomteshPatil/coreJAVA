package com.xworkz.dp;

import com.xworkz.dp.dao.IplDAO;
import com.xworkz.dp.dto.IplDTO;

public class IplStarter {

	public static void main(String[] args) {

		IplDTO iplDTO2 = new IplDTO("RCB", 24, 11, "USL", "Vandu");
		
		

		IplDAO iplDAO = new IplDAO();
		iplDAO.create(iplDTO2);
		iplDAO.create(iplDTO2, 20);
	
		iplDAO.create(new IplDTO("KKR", 25, 11, "SRK", "dream 11"));
		iplDAO.create(new IplDTO("Delli Capitals", 24, 11, "Ayyappa", "Rakesh"), 45);
		// iplDAO.create(new );
		int index = iplDAO.noOfIndexFull();
		System.out.println(index);
		iplDAO.matchTeamByNAme("RCB");
		boolean re = iplDAO.matchTeamByNAme("KKR");
		boolean rer1 = iplDAO.matchTeamByNAme("Panjab");
		System.out.println(rer1);
		System.out.println(re);

		IplDTO[] array = iplDAO.getIplDTOs();
		for (int i = 0; i < array.length; i++) {
			IplDTO ref = array[i];
			if (ref != null) {
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
				System.out.println("IPL team name : ".concat(ref.getName()));
				System.out.println(ref.getOwner());
				System.out.println(ref.getSponser());
				System.out.println(ref.getNoOfPlayers());
			} else {
				System.err.println("The index is still null : ".concat(String.valueOf(i)));
			}
		}
	}

}
