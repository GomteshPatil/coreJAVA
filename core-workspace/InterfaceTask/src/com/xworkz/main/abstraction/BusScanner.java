package com.xworkz.main.abstraction;

import com.xworkz.main.constants.BusRouteDTO;
import com.xworkz.main.interfaces.BusRouteDAO;
import com.xworkz.main.interfaces.ImplimentedBusDAO;

public class BusScanner {

	public static void main(String[] args) {

		BusRouteDTO dto1 = new BusRouteDTO("201A", "Silk Board", "Mejestic", "Anamol");
		BusRouteDTO dto2 = new BusRouteDTO("45D", "Silk Board", "Mejestic", "Sam");
		BusRouteDTO dto3 = new BusRouteDTO("600F", "Silk Board", "Mejestic", "Nagappa");

		BusRouteDAO implimented = new ImplimentedBusDAO();
		
		AbsBusDAO abstraction=new AbsBusDAO(implimented);
		abstraction.save(dto1);
		abstraction.save(null);
		abstraction.save(dto2);
		abstraction.save(dto3);
		
		abstraction.delete(1);
		
		abstraction.update(dto1, 7);
		
		abstraction.display();

	}

}
