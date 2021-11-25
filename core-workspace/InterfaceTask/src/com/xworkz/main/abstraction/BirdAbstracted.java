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
		} /*
			 * else { System.err.println("pass bird dto please"); }
			 */
	}

	public void findByAge(Integer age) {
		dao.findByAge(age);

	}
	
	public void display() {
		dao.displayDetails();
	}
}
