package com.xworkz.diamond;

import com.xworkz.diamond.shop.Shop;
import com.xworkz.diamond.shop.brand.*;



public class DiamondRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		class Mine{	
			   private Shop shop;
			   private String location;	
			}

	Mine mine=new Mine();
	System.out.println(mine.shop);
	
	
	
	Shop shop=new Shop();
	System.out.println(shop);
	
	com.xworkz.diamond.Brand brand=new com.xworkz.diamond.Brand();
	brand.getName();
	String name=brand.getName();
	System.out.println(name);
	com.xworkz.diamond.shop.brand.Brand brand1=new com.xworkz.diamond.shop.brand.Brand();
	System.out.println(brand1);
	
	String diamond=brand1.getDiamondBrand();
	System.out.println(diamond);
}
	
}
