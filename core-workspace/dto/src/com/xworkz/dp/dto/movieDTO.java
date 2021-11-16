package com.xworkz.dp.dto;

public class movieDTO {

	private String name;
 	private String actor;
 	private float rating;
 	private String producer;
 	
 	public movieDTO() {
		System.out.println("Invoked no-arg const");
		
	}

	public movieDTO(String name, String actor, float rating, String producer) {
		super();
		this.name = name;
		this.actor = actor;
		this.rating = rating;
		this.producer = producer;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getActor() {
		return actor;
	}

	public void setActor(String actor) {
		this.actor = actor;
	}

	public float getRating() {
		return rating;
	}

	public void setRating(float rating) {
		this.rating = rating;
	}

	public String getProducer() {
		return producer;
	}

	public void setProducer(String producer) {
		this.producer = producer;
	}
 	
	
	
}
