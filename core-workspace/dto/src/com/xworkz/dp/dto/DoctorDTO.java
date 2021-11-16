package com.xworkz.dp.dto;

public class DoctorDTO {
	
	private String name;
	private String specilization;
	private String hospotalName;
	private char gender;
	private float salary;
	private int age;
	public DoctorDTO() {
		System.out.println("Invoked no-arg const");
	}
	public DoctorDTO(String name, String specilization, String hospotalName, char gender, float salary, int age) {
		super();
		this.name = name;
		this.specilization = specilization;
		this.hospotalName = hospotalName;
		this.gender = gender;
		this.salary = salary;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSpecilization() {
		return specilization;
	}
	public void setSpecilization(String specilization) {
		this.specilization = specilization;
	}
	public String getHospotalName() {
		return hospotalName;
	}
	public void setHospotalName(String hospotalName) {
		this.hospotalName = hospotalName;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	

}
