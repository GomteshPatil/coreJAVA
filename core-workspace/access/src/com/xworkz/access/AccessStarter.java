package com.xworkz.access;


import com.xworkz.access.holiday.*;
//import com.xworkz.access.holiday.Flower;

public class AccessStarter {

	public static void main(String[] args) {
	
System.out.println("Start main method");
	

Festival festival=new Festival();
System.out.println(Festival.holiday);

int count=festival.getCount();
System.out.println(count);


Flower flower=new Flower();
//String ref=flower.getName();
System.out.println(flower.getName());
 flower.setTotalFlowers(24);
System.out.println("No of roses is-->"+flower.totalFlowers);
flower.setTotalFlowers(15);
System.out.println(flower.totalFlowers);

//Flower.setColour("red");
	
	}
		
}
