package com.xworkz.dp.dto;

public class ApplicationDTO {

	private String name;
	private String version;
	private String founder;
	private String company;

	public ApplicationDTO() {
	
		System.out.println("Invoked ApplicationDTO no-arg const");
	}

	public ApplicationDTO(String name, String version, String founder,String company) {
		this.company=company;
		this.name = name;
		this.version = version;
		this.founder = founder;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getFounder() {
		return founder;
	}

	public void setFounder(String founder) {
		this.founder = founder;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}
	
	
	
}
