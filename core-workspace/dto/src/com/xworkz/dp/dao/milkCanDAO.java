package com.xworkz.dp.dao;

import com.xworkz.dp.dto.MilkCanDTO;

/**
 * 
 * @author Gomtesh Patil about-this class is all about the Crud operations
 *         performed on class milkCanDTO
 */

public class milkCanDAO {

	private MilkCanDTO[] canDTOs = new MilkCanDTO[25];
	private int lit = 0;

	public MilkCanDTO[] getCanDTOs() {
		return canDTOs;
	}

	public void save(MilkCanDTO can) {
		System.out.println("Invoked save method");
		if (this.lit < this.canDTOs.length && can != null) {
			this.canDTOs[lit++] = can;
		} else {
			System.err.println("either you passing null or the array is full");
		}
	}

	public void save(MilkCanDTO can, int dex) {
		System.out.println("Invoked overloaded save method");
		if (dex < this.canDTOs.length && can != null && dex >= 0) {
			this.canDTOs[dex] = can;
			lit++;
		} else {
			System.err.println("either you passing null or the array is full");
		}
	}

	public int occupiedIndex() {
		return lit;
	}

	public Boolean findmilkCanByColour(String paint) {

		System.out.println("Invoked find method to find milkcan by its colour calour wanted to find : ".concat(paint));
		for (int bag = 0; bag < canDTOs.length; bag++) {
			MilkCanDTO array = canDTOs[bag];
			if (array != null) {
				String check = array.getColour();
				if (paint.equals(check)) {
					System.out.println("milk can of colour ".concat(paint).concat(" is found"));
					return true;
				}

			}
		}

		return false;
	}

}
