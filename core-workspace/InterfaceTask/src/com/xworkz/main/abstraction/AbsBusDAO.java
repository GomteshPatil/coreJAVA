package com.xworkz.main.abstraction;

import com.xworkz.main.constants.BusRouteDTO;
import com.xworkz.main.interfaces.BusRouteDAO;

public class AbsBusDAO {

	BusRouteDAO dao;

	public AbsBusDAO(BusRouteDAO dao) {
		this.dao = dao;
	}

	public void save(BusRouteDTO dto) {
		dao.save(dto);
	}

	public void delete(int dex) {
		dao.delete(dex);
	}

	public void update(BusRouteDTO dto, int dex) {
		dao.update(dto, dex);

	}

	public void display() {
		dao.displayDetails();
	}

}
