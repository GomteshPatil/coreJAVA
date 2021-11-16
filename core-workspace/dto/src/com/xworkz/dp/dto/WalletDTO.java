package com.xworkz.dp.dto;

/**
 * 
 * @author Gomtesh Patil
 *
 */

public class WalletDTO {

	private String material;
	private String companyName;
	private Integer noOfCompartment;
	private float price;
	private boolean coinCompartment;

	public WalletDTO() {
		System.out.println("Invoked wallet no arg-const");
	}

	public WalletDTO(String material, String companyName, Integer noOfCompartment, float price,
			boolean coinCompartment) {

		this.material = material;
		this.companyName = companyName;
		this.noOfCompartment = noOfCompartment;
		this.price = price;
		this.coinCompartment = coinCompartment;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public Integer getNoOfCompartment() {
		return noOfCompartment;
	}

	public void setNoOfCompartment(Integer noOfCompartment) {
		this.noOfCompartment = noOfCompartment;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public boolean isCoinCompartment() {
		return coinCompartment;
	}

	public void setCoinCompartment(boolean coinCompartment) {
		this.coinCompartment = coinCompartment;
	}

}
