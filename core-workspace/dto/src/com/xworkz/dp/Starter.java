package com.xworkz.dp;

import com.xworkz.dp.dto.BraceletDTO;

public class Starter {

	public static void main(String[] args) {

		BraceletDTO braceletDTO1 = new BraceletDTO();
		braceletDTO1.setColour("Gold");
		braceletDTO1.setMaterial("Iron");
		braceletDTO1.setPrice(25);
		braceletDTO1.setGifted(true);
		braceletDTO1.setGemUsed(false);

		BraceletDTO braceletDTO2 = new BraceletDTO("green", "plastic", 15, true, false);
		BraceletDTO braceletDTO3 = new BraceletDTO("red", "plastic", 15, true, false);
		BraceletDTO braceletDTO4 = new BraceletDTO("white", "plastic", 15, true, false);
		BraceletDTO braceletDTO5 = new BraceletDTO("purple", "plastic", 15, true, false);

		BraceletDTO[] bracelets = new BraceletDTO[5];
		// now all index is null
		bracelets[0] = braceletDTO1;
		bracelets[1] = braceletDTO2;
		bracelets[3] = braceletDTO4;
		bracelets[4] = braceletDTO5;

		for (int lock = 0; lock < bracelets.length; lock++) {

			BraceletDTO ref = bracelets[lock];
			if (ref != null) {

				System.out.println("Colour : ".concat(ref.getColour()));
				System.out.println("Material : ".concat(ref.getMaterial()));
				System.out.println("Price of Bracelet : ".concat(String.valueOf(ref.getPrice())));
				System.out.println("is gem used in Bracelet : ".concat(String.valueOf(ref.isGemUsed())));
				System.out.println("bracelet is gifted or not : ".concat(String.valueOf(ref.isGifted())));
			} else {
				System.err.println(String.valueOf(lock).concat("nd index is pointing to null"));
			}

		}

	}

}
