package com.xworkz.main.interfaces;

import com.xworkz.main.constants.AirportDTO;

public class ImplementedAirportDAO implements AirportDAO {
	AirportDTO[] plane = new AirportDTO[10];
	int counter = 0;

	@Override
	public boolean save(AirportDTO dto) {
		System.out.println("Invoked save method ");
		if (dto != null) {
			this.plane[counter++] = dto;
			System.out.println("DTO is saved at index : ".concat(String.valueOf(counter)));
			return true;
		} else {
			System.err.println("May be array is full or you passing null");
		}
		return false;
	}

	@Override
	public boolean delete(int dex) {
		if (dex <= 0 && dex < plane.length) {
			this.plane[dex] = null;
			System.out.println("Index " + dex + " is deleted");
			return true;

		}

		return false;
	}

	@Override
	public boolean update(AirportDTO dto, int dex) {
		System.out.println("Invoked update method");
		if (dex >= 0 && dex < plane.length && dto != null) {
			this.plane[dex] = dto;
			return true;
		} else {
			System.err.println("you are not allowed to pass null ");
		}
		return false;
	}

	@Override
	public void displayDetails() {
		for (int j = 0; j < plane.length; j++) {
			if (plane[j] != null) {
				System.out.println("Airport name : " + plane[j].getAirportName());
				System.out.println(" Airport location : " + plane[j].getLocation());
				System.out.println("Plane name : " + plane[j].getPlaneName());
				System.out.println("plane Type : " + plane[j].getType());
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			}
		}

	}
}
