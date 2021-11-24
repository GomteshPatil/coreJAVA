package com.xworkz.main.abstraction;

import com.xworkz.main.constants.BirdDTO;
import com.xworkz.main.interfaces.BirdCurd;

public class BirdAbstracted {
	BirdCurd dao;

	public BirdAbstracted(BirdCurd dao) {
		this.dao = dao;
	}

	public void save(BirdDTO bird) {
		if (bird != null) {
			System.out.println("Invoked save method from abstract");
			this.dao.save(bird);
		} else {
			System.err.println("pass bird dto please");
		}
	}

	public void findByAge(Integer age) {
		if (age == 0) {
			System.out.println("Invoked find by age");
			dao.findByAge(age);
		} else {
		}

	}
}
