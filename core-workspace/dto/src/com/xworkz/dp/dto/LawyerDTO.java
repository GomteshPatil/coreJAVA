package com.xworkz.dp.dto;

public class LawyerDTO {
	private String name;
	private String qualification;
	private Float experience;
	private Character gender;
	private String courtType;
	private Integer casesOwn;
	private Integer casesLost;

	public LawyerDTO() {
		System.out.println("Invoked no-arg LawyerDTO const");
	}

	public LawyerDTO(String name, String qualification, Float experience, Character gender, String courtType,
			Integer casesOwn, Integer casesLost) {

		this.name = name;
		this.qualification = qualification;
		this.experience = experience;
		this.gender = gender;
		this.courtType = courtType;
		this.casesOwn = casesOwn;
		this.casesLost = casesLost;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public Float getExperience() {
		return experience;
	}

	public void setExperience(Float experience) {
		this.experience = experience;
	}

	public Character getGender() {
		return gender;
	}

	public void setGender(Character gender) {
		this.gender = gender;
	}

	public String getCourtType() {
		return courtType;
	}

	public void setCourtType(String courtType) {
		this.courtType = courtType;
	}

	public Integer getCasesOwn() {
		return casesOwn;
	}

	public void setCasesOwn(Integer casesOwn) {
		this.casesOwn = casesOwn;
	}

	public Integer getCasesLost() {
		return casesLost;
	}

	public void setCasesLost(Integer casesLost) {
		this.casesLost = casesLost;
	}

}
