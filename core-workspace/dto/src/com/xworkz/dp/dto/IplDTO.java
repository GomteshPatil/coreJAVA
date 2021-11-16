package com.xworkz.dp.dto;

public class IplDTO {

	private String name;
	private Integer noOfPlayers;
	private Integer teamsize;
	private String owner;
	private String sponser;

	public IplDTO() {
		System.out.println("invoked IplDTO no-arg const");
	}

	public IplDTO(String name, Integer noOfPlayers, Integer teamsize, String owner, String sponser) {

		this.name = name;
		this.noOfPlayers = noOfPlayers;
		this.teamsize = teamsize;
		this.owner = owner;
		this.sponser = sponser;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getNoOfPlayers() {
		return noOfPlayers;
	}

	public void setNoOfPlayers(Integer noOfPlayers) {
		this.noOfPlayers = noOfPlayers;
	}

	public Integer getTeamsize() {
		return teamsize;
	}

	public void setTeamsize(Integer teamsize) {
		this.teamsize = teamsize;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getSponser() {
		return sponser;
	}

	public void setSponser(String sponser) {
		this.sponser = sponser;
	}

}
