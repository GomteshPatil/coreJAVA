package com.xworkz.dp;

import com.xworkz.dp.dao.TimerDAO;
import com.xworkz.dp.dto.TimerDTO;

public class TimerStarter {

	public static void main(String[] args) {

		TimerDTO timer1 = new TimerDTO(10.02F, 'Y', false, "Sonata");
		TimerDTO timer2 = new TimerDTO(10.02F, 'N', true, "Rolex");
		TimerDTO timer3 = new TimerDTO(10.02F, 'Y', true, "Ajanta");
		TimerDTO timer4 = new TimerDTO(10.05F, 'N', true, "Fastrack");

		TimerDAO timerDao = new TimerDAO();
		timerDao.save(timer1);
		timerDao.save(timer3);
		timerDao.save(timer4, 22);
		timerDao.save(timer2);

		System.out.println("total occupied index no is : ".concat(String.valueOf(timerDao.occupiedIndex())));

		System.out.println(timerDao.searchBrand("Rolex"));

		TimerDTO[] timeArray = timerDao.getTimerDTOs();
		
		for (int mask = 0; mask < timeArray.length; mask++) {
			
			TimerDTO ref=timeArray[mask];
			if(ref!=null) {
				System.out.println("Timer company : ".concat(ref.getBrand()));
				System.out.println("Correct time : ".concat(String.valueOf(ref.getCorrectTime())));
				System.out.println("Is Timer is degital or not in (if yes-Y for no-N)".concat(String.valueOf(ref.getDegital())));
				System.out.println("Timer has loud beel or not : ".concat(String.valueOf(ref.isBell())));
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			}
			else {
				System.err.println(String.valueOf(mask).concat(" is still null"));
			}
		}

	}

}
