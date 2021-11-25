package com.xworkz.main.interfaces;

import com.xworkz.main.constants.BusRouteDTO;

public class ImplimentedBusDAO implements BusRouteDAO {

	BusRouteDTO[] bus = new BusRouteDTO[10];
	int counter = 0;

	@Override
	public boolean save(BusRouteDTO dto) {
		System.out.println("Invoked save method ");
		if (dto != null) {
			this.bus[counter++] = dto;
			System.out.println("DTO is saved at index : ".concat(String.valueOf(counter)));
			return true;
		} else {
			System.err.println("May be array is full or you passing null");
		}
		return false;
	}

	@Override
	public boolean delete(int dex) {
		if (dex <= 0 && dex < bus.length) {
			this.bus[dex] = null;
			System.out.println("Index " + dex + " is deleted");
			return true;

		}

		return false;
	}

	@Override
	public boolean update(BusRouteDTO dto, int dex) {
		System.out.println("Invoked update method");
		if (dex >= 0 && dex < bus.length && dto != null) {
			this.bus[dex] = dto;
			return true;
		}else {
			System.err.println("you are not allowed to pass null ");
		}
		return false;
	}

	@Override
	public void displayDetails() {
		for (int j = 0; j < bus.length; j++) {
			if (bus[j] != null) {
				System.out.println("Driver Name : " + bus[j].getDriverName());
				System.out.println(" Bus No : " + bus[j].getBusNo());
				System.out.println("Bus Starts at : " + bus[j].getStartPoint());
				System.out.println("Bus Destination : " + bus[j].getDestination());
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			}
		}

	}

}
