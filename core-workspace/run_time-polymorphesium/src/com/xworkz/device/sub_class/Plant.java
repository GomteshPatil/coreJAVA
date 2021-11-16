package com.xworkz.device.sub_class;

import com.xworkz.device.sub_class.constants.PlantType;

public class Plant {

	private String name;
	private Boolean alive;
	private Float lifeSpan;
	private PlantType plantType;

	public Plant() {
		System.out.println("Invoked no arg const of Plant");
	}

	public Plant(String name, Boolean alive, Float lifeSpan, PlantType plantType) {
		super();
		this.name = name;
		this.alive = alive;
		this.lifeSpan = lifeSpan;
		this.plantType = plantType;
	}

	@Override
	public String toString() {
		System.out.println("Invoked toString from Palant");
		return "Plant-toString";
	}

	@Override
	public int hashCode() {
		System.out.println("Invoked hashcode from Palant");
		return 11;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null) {
			System.out.println("Right you are not passing null");
			if (obj instanceof Plant) {
				System.out.println("ref that you passed is Plant type");
				Plant casted = (Plant) obj;
				String nameToCheck = casted.getName();
				Float plantLife = casted.getLifeSpan();
				if (this.name.equals(nameToCheck) && this.lifeSpan.equals(plantLife)) {
					System.out.println("plant is found");
					return true;
				} else {
					System.err.println("plant miss match ");
				}
			} else {
				System.err.println("The ref that you passing is not of plant type");
			}
		} else {
			System.err.println("You passing null");
		}

		return false;
	}

	public String getName() {
		return name;
	}

	public Boolean getAlive() {
		return alive;
	}

	public Float getLifeSpan() {
		return lifeSpan;
	}

	public PlantType getPlantType() {
		return plantType;
	}

}
