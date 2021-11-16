package com.xworkz.dp.dao;

import com.xworkz.dp.dto.CircusDTO;

public class CircusDAO {

	private CircusDTO[] circusDTOs = new CircusDTO[23];
	private int cable = 0;

	public CircusDTO[] getCircusDTOs() {
		return circusDTOs;
	}

	public void save(CircusDTO add) {

		if (this.cable < this.circusDTOs.length && add != null) {
			System.out.println("Invoked save method and owner of circus is : ".concat(add.getOwner()));
			this.circusDTOs[this.cable++] = add;

		} else {
			System.err.println("either you passing null or array is full");
		}

	}

	public void save(CircusDTO add, int x) {
		if (x < this.circusDTOs.length && add != null && x >= 0) {
			System.out.println("Invoked overloaded save method and it stored at  index  : ".concat(String.valueOf(x)));
			circusDTOs[x] = add;
			cable++;
		} else {
			System.err.println("either you passing null or array is full");

		}

	}

	public int occupiedIndex() {
		System.out.println("Invoked occupied index method and no of index occupied is :");
		return cable;
	}

	public boolean findCircusByTotalAnimals(int animal) {

		System.out.println("Invoked find method and finding circus of total animals : ".concat(String.valueOf(animal)));

		for (int simba = 0; simba < circusDTOs.length; simba++) {

			CircusDTO ref = circusDTOs[simba];
			if (ref != null) {

				Integer find = ref.getNoOfAnimals();
				if (find.equals(simba)) {
					return true;
				}

			}

		}

		return false;
	}

}
