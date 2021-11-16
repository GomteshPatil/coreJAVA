package com.xworkz.dp;

import com.xworkz.dp.dao.CircusDAO;
import com.xworkz.dp.dto.CircusDTO;

public class CircusStarter {

	public static void main(String[] args) {

		CircusDTO cirDto1 = new CircusDTO();
		cirDto1.setNoOfAnimals(22);
		cirDto1.setNoOfShowsInDay(4);
		cirDto1.setOwner("Abhi+");
		cirDto1.setShowDuration(1.30F);
		cirDto1.setTicketPrice(160F);

		CircusDTO cirDto2 = new CircusDTO("Ayyapa", 280F, 18, 3, 2.35F);
		CircusDTO cirDto3 = new CircusDTO("Rakesh", 280F, 18, 3, 2.35F);
		CircusDTO cirDto4 = new CircusDTO("Mohan", 280F, 18, 3, 2.35F);

		CircusDAO cirDao = new CircusDAO();
		cirDao.save(cirDto1);
		cirDao.save(new CircusDTO("amit", 450F, 35, 4, 135F));
		cirDao.save(cirDto2);
		cirDao.save(cirDto3);
		cirDao.save(cirDto4, 9);

		System.out.println(cirDao.occupiedIndex());
		
		boolean no=cirDao.findCircusByTotalAnimals(18);
		System.out.println(no);

		CircusDTO[] circusArray = cirDao.getCircusDTOs();
		for (int bed = 0; bed < circusArray.length; bed++) {

			CircusDTO ref = circusArray[bed];
			if (ref != null) {
				System.out.println("Owner of circus : ".concat(ref.getOwner()));
				System.out.println(" Total animals circus : ".concat(String.valueOf(ref.getNoOfAnimals())));
				System.out.println("No shows of circus : ".concat(String.valueOf(ref.getNoOfShowsInDay())));
				System.out.println("circus ticket price : ".concat(String.valueOf(ref.getTicketPrice())));
				System.out.println("Show duration : ".concat(String.valueOf(ref.getShowDuration())));
				System.err.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			}
			else {
				System.err.println(String.valueOf(bed).concat(" This index is still null"));
			}

		}

	}

}
