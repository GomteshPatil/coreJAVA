package com.xworkz.main.interfaces;

import com.xworkz.main.constants.BusRouteDTO;

public interface BusRouteDAO {

	public boolean save(BusRouteDTO dto);

	public boolean delete(int dex);

	public boolean update(BusRouteDTO dto, int dex);

	public void displayDetails();

}
