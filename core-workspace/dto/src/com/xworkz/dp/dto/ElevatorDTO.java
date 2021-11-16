package com.xworkz.dp.dto;

public class ElevatorDTO {

	private String company;
	private int noOfPeaple;
	private float maxWaight;
	private boolean operatorNeeded;
	private int flore;
	private boolean acAvailable;
	private boolean sefe;

	public ElevatorDTO() {
		System.out.println("Involked no-Arg const");

	}

	public ElevatorDTO(String company, int noOfPeaple, float maxWaight, boolean operatorNeeded, int flore,
			boolean acAvailable, boolean sefe) {
		
		this.company = company;
		this.noOfPeaple = noOfPeaple;
		this.maxWaight = maxWaight;
		this.operatorNeeded = operatorNeeded;
		this.flore = flore;
		this.acAvailable = acAvailable;
		this.sefe = sefe;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public int getNoOfPeaple() {
		return noOfPeaple;
	}

	public void setNoOfPeaple(int noOfPeaple) {
		this.noOfPeaple = noOfPeaple;
	}

	public float getMaxWaight() {
		return maxWaight;
	}

	public void setMaxWaight(float maxWaight) {
		this.maxWaight = maxWaight;
	}

	public boolean isOperatorNeeded() {
		return operatorNeeded;
	}

	public void setOperatorNeeded(boolean operatorNeeded) {
		this.operatorNeeded = operatorNeeded;
	}

	public int getFlore() {
		return flore;
	}

	public void setFlore(int flore) {
		this.flore = flore;
	}

	public boolean isAcAvailable() {
		return acAvailable;
	}

	public void setAcAvailable(boolean acAvailable) {
		this.acAvailable = acAvailable;
	}

	public boolean isSefe() {
		return sefe;
	}

	public void setSefe(boolean sefe) {
		this.sefe = sefe;
	}

}
