package com.xworkz.dp.dto;

public class FacebookApplicationDTO extends ApplicationDTO {

	private String ceoName;
	private String headQuarter;

	public FacebookApplicationDTO() {
		System.out.println("Invoked Facebook no-arg const");
	}

	public FacebookApplicationDTO(String ceoName, String headQuarter,String name,String version,String founder,String company) {
		super(name,version,founder,company);
		this.ceoName = ceoName;
		this.headQuarter = headQuarter;
	}

	public String getCeoName() {
		return ceoName;
	}

	public void setCeoName(String ceoName) {
		this.ceoName = ceoName;
	}

	public String getHeadQuarter() {
		return headQuarter;
	}

	public void setHeadQuarter(String headQuarter) {
		this.headQuarter = headQuarter;
	}

}
