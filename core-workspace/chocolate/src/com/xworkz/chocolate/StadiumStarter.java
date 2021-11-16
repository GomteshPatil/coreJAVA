package com.xworkz.chocolate;

import com.xworkz.chocolate.operations.Stadium;

public class StadiumStarter {

	public static void main(String[] args) {

		Stadium stadium = new Stadium();
		System.out.println("Nation name : ".concat(stadium.getPlace()));
		stadium.addStadiumNames("Narendra Modi Stadium");
		stadium.addStadiumNames("M. Channaswamy Stadium");
		stadium.addStadiumNames("Eden Gardens");
		stadium.addStadiumNames("M. A. Chidambaram Stadium");
		stadium.addStadiumNames("Indira Gandhi Stadium, Vijayawada");
		stadium.addStadiumNames("Jawaharlal Neharu Stadium");
		stadium.addStadiumNames("Salt Lake Stadium");

		stadium.deleteStadiumName(4);
		stadium.updateStadiumName(20, "Patil");

		String[] array = stadium.getStadiumNames();
		for (int i = 0; i < array.length; i++) {
			System.out.println("Stadium Name :-->" + (array[i]));
		}

	}

}
