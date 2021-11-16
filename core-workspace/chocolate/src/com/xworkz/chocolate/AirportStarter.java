package com.xworkz.chocolate;

import com.xworkz.chocolate.operations.Airport;

public class AirportStarter {

	public static void main(String[] args) {
		Airport airport = new Airport();
		System.out.println("Country name : ".concat(airport.getCountry()));
		airport.addAirportNames("Vallabhbhai Patel International Airport");
		airport.addAirportNames("Indira Gandhi airport Delhi");
		airport.addAirportNames("Dabolim Airport Goa");
		airport.addAirportNames("Chennai International Airport");
		airport.addAirportNames("Netaji Subhas Chandra Bose Airport Kolkata ");
		airport.addAirportNames("Surat International Airport");
		airport.addAirportNames("Kempegowda International Airport Bangalore");

		airport.updateAirportName(1, "Air India");
		airport.deleteAirportName(1);

		String[] array = airport.getAirportNames();
		for (int i = 0; i < array.length; i++) {

			System.out.println("Airport name :-->" + (array[i]));

		}

	}

}
