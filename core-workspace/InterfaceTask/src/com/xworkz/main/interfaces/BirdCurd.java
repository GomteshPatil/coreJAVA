package com.xworkz.main.interfaces;

import com.xworkz.main.constants.BirdDTO;

public interface BirdCurd {

	public boolean save(BirdDTO dto);

	public Integer findByAge(Integer age);

	public void displayDetails();
}
