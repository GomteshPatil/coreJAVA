package com.xworkz.main.interfaces;

import com.xworkz.main.constants.BirdDTO;

public class BirdCrudImplemented implements BirdCurd {
	private BirdDTO[] bird = new BirdDTO[10];
	private int counter = 0;

	@Override
	public boolean save(BirdDTO dto) {
		System.out.println("Invoked save method");
		if (dto != null) {
			for (int i = 0; i < bird.length; i++) {
				this.bird[this.counter++] = dto;
				return true;
			}
		} else {
			System.err.println("May be you passing null or the array is full");
		}
		return false;
	}

	@Override
	public Integer findByAge(Integer ageToCheck) {
		if (ageToCheck == 0) {
			for (int j = 0; j < bird.length; j++) {
				if (bird[j] != null) {
					int checkWith = bird[j].getAge();
					if (ageToCheck.equals(checkWith)) {
						System.out.println("Bird that you finding is found : " + ageToCheck);
						break;
					}
				} else {
					System.err.println("Index " + j + " is not holding any bird details");
				}
			}
		} else {
			System.err.println("You can not pass 0 as age");
		}

		return null;
	}

	@Override
	public void displayDetails() {

		for (int k = 0; k < bird.length; k++) {
			if (bird[k] != null) {
				System.out.println("Bird id ".concat(bird[k].getId()));
				System.out.println("Bird Breed : ".concat(bird[k].getBreed()));
				System.out.println("Bird age : ".concat(String.valueOf(bird[k].getAge())));
				System.out.println("Bird orign : ".concat(bird[k].getOrigin()));
			}
		}

	}

}
