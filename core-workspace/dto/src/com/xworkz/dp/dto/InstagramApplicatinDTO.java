package com.xworkz.dp.dto;

public class InstagramApplicatinDTO extends ApplicationDTO {

	private int totalUsers;
	private String serverLocation;

	public InstagramApplicatinDTO() {
		System.out.println("Invoked Instagram no-arg const");
	}

	public InstagramApplicatinDTO(int totalUsers, String serverLocation,String name, String version, String founder,String company) {
		super(name,version,founder,company);
		this.totalUsers = totalUsers;
		this.serverLocation = serverLocation;
	}

	public int getTotalUsers() {
		return totalUsers;
	}

	public void setTotalUsers(int totalUsers) {
		this.totalUsers = totalUsers;
	}

	public String getServerLocation() {
		return serverLocation;
	}

	public void setServerLocation(String serverLocation) {
		this.serverLocation = serverLocation;
	}

}
