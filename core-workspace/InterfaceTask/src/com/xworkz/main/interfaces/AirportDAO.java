package com.xworkz.main.interfaces;

import com.xworkz.main.constants.AirportDTO;

public interface AirportDAO {
	public boolean save(AirportDTO dto);

	public boolean delete(int dex);

	public boolean update(AirportDTO dto, int dex);

	public void displayDetails();
}
