package com.xworkz.inheritance.shop;

/**
 * @author it is parent class
 *
 */
public class Factory {
	public String name;
	public String product;
	public int since;
	public int noOfWorkers;

	public Factory() {
		System.out.println("Invoked Factory no arg const");
	}

	public Factory(int since) {
		System.out.println("invoked since from factory");
		this.since = since;

		System.out.println(this.since);
	}

	public Factory(String name, String product, int since) {

		this.name = name;
		this.product = product;
		this.since = since;

		System.out.println(this.name);
		System.out.println(this.product);
		System.out.println(this.since);

	}

}
