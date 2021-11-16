package com.xworkz.dp;

import com.xworkz.dp.dao.milkCanDAO;
import com.xworkz.dp.dto.MilkCanDTO;

public class milkCanStarter {

	public static void main(String[] args) {
	
		MilkCanDTO miCanDTO1=new MilkCanDTO(2.5F, "Round", true, "White", 140F);
		MilkCanDTO miCanDTO2=new MilkCanDTO(2.5F, "square", true, "yellow", 140F);
		MilkCanDTO miCanDTO3=new MilkCanDTO(2.5F, "Round", true, "blue", 140F);
		
		
		milkCanDAO milkCanDAO=new milkCanDAO();
		milkCanDAO.save(miCanDTO1);
		milkCanDAO.save(miCanDTO2);
		milkCanDAO.save(miCanDTO3);
		milkCanDAO.save(new MilkCanDTO(5F, "Rectangle", false, "Silver", 220F));
		milkCanDAO.save(miCanDTO2, 12);
		
		int print=milkCanDAO.occupiedIndex();
		System.out.println("no of index that not null : ".concat(String.valueOf(print)));
		
		milkCanDAO.findmilkCanByColour("red");
		System.out.println(milkCanDAO.findmilkCanByColour("Silver"));
		
		
		MilkCanDTO[] milkCanarray=milkCanDAO.getCanDTOs();
		
		for (int rock = 0; rock < milkCanarray.length; rock++) {
			MilkCanDTO ref=milkCanarray[rock];
			if(ref!=null) {
				System.out.println("MilkCan Colour : ".concat(ref.getColour()));
				System.out.println("Milk can Shape : ".concat(ref.getShape()));
				System.out.println("Milk can Size : ".concat(String.valueOf(ref.getQuantity())));
				System.out.println("Price of milk can is : ".concat(String.valueOf(ref.getPrice())));
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
				
			}
			else {
				System.err.println("index ".concat(String.valueOf(rock)).concat(" Still null"));
			}
		}
		
		
		
		

	}

}
