package com.xworkz.dp.dao;

import com.xworkz.dp.dto.TimerDTO;

public class TimerDAO {

	private TimerDTO[] timerDTOs = new TimerDTO[34];
	private int guard = 0;

	public TimerDTO[] getTimerDTOs() {
		return timerDTOs;
	}

	public void save(TimerDTO watch) {
		System.out.println("Invoked save method watch added is of company : ".concat(watch.getBrand()));
		if (this.guard < this.timerDTOs.length && watch != null) {
			this.timerDTOs[this.guard++] = watch;
		} else {
			System.err.println("either you passing null or iarray is full");
		}
	}

	public void save(TimerDTO watch, int dex) {
		System.out.println("Invoked overloaded save method watch added is of company : ".concat(watch.getBrand()));
		if (dex < this.timerDTOs.length && watch != null && dex >= 0) {
			timerDTOs[dex] = watch;
			guard++;
		} else {
			System.err.println("either you passing null or iarray is full");
		}
	}

	public int occupiedIndex() {
		return guard;
	}

	public boolean searchBrand(String company) {

		System.out.println("Invoked search method to find company : ".concat(company));

		for (int box = 0; box < timerDTOs.length; box++) {
			TimerDTO ref = timerDTOs[box];

			if (ref != null) {
				String watch = ref.getBrand();
				if (company.equals(watch))
					;
				System.out.println(company.concat(" Brand watch is found"));
				return true;
			}
		}

		return false;
	}

}
