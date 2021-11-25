package com.xworkz.main.abstraction;

import com.xworkz.main.constants.AirportDTO;
import com.xworkz.main.interfaces.AirportDAO;

public class AbsAirportDAO {
	
	AirportDAO dao;

	public AbsAirportDAO(AirportDAO dao) {
		this.dao = dao;
	}

	public void save(AirportDTO dto) {
		dao.save(dto);
	}

	public void delete(int dex) {
		dao.delete(dex);
	}

	public void update(AirportDTO dto, int dex) {
		dao.update(dto, dex);

	}

	public void display() {
		dao.displayDetails();
	}


}
