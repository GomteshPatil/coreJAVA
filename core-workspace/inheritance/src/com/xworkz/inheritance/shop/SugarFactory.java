package com.xworkz.inheritance.shop;

public class SugarFactory extends Factory{

	//SugarFactory sugarFactory=new SugarFactory();
	
	
	public String name;
	public String product;
	public int since;
	public int noOfWorkers;
	
	public SugarFactory() {
		super(1957);		
		System.out.println("Invoked no arg of Sugar factory");
	}
	
	
	public SugarFactory(int year) {
	   super(year); 
	}
	SugarFactory(String name){
		super("Abhi","Pen",1999);
		this.name=name;
	}
	
}
