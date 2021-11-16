package com.xworkz.dp.dto;

public class CarpenterDTO {

	private String name;
	private String location;
	private int noOfTools;
	private String powerTool;
	private String product;
	private String workers;
	private boolean trustable;
	
	public CarpenterDTO() {
		System.out.println("invoked no-arg const");
	}

	public CarpenterDTO(String name, String location, int noOfTools, String powerTool, String product, String workers,
			boolean trustable) {
		super();
		this.name = name;
		this.location = location;
		this.noOfTools = noOfTools;
		this.powerTool = powerTool;
		this.product = product;
		this.workers = workers;
		this.trustable = trustable;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getNoOfTools() {
		return noOfTools;
	}

	public void setNoOfTools(int noOfTools) {
		this.noOfTools = noOfTools;
	}

	public String getPowerTool() {
		return powerTool;
	}

	public void setPowerTool(String powerTool) {
		this.powerTool = powerTool;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public String getWorkers() {
		return workers;
	}

	public void setWorkers(String workers) {
		this.workers = workers;
	}

	public boolean isTrustable() {
		return trustable;
	}

	public void setTrustable(boolean trustable) {
		this.trustable = trustable;
	}
	
	
	
	
}
