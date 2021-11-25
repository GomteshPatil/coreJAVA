package com.xworkz.main;

import com.xworkz.main.abstraction.AbsAirportDAO;
import com.xworkz.main.constants.AirportDTO;
import com.xworkz.main.interfaces.AirportDAO;
import com.xworkz.main.interfaces.ImplementedAirportDAO;

public class AirportScanner {

	public static void main(String[] args) {
		
		AirportDTO airport1 =new AirportDTO("RamAirport", "AirStar", "Bangalore", "Comertial");
		AirportDTO airport2 =new AirportDTO("Amantrao", "AirShip", "pune", "fighter");
		AirportDTO airport3 =new AirportDTO("RamAirport", "AirStar", "Bangalore", "Comertial");
		
		AirportDAO dao=new ImplementedAirportDAO();
		
		AbsAirportDAO abstraction=new AbsAirportDAO(dao);
		abstraction.save(airport1);
		abstraction.save(airport2);
		abstraction.save(airport3);
		abstraction.save(null);
		
		abstraction.delete(5);
		abstraction.update(airport3, 7);
		
		abstraction.display();

	}

}
