package com.xworkz.dp.dto;

public class TempleDTO {

	private String name;
	private String location;
	private String mainGOd;
	private boolean prasada;
	private int yestGante;
	
	public TempleDTO() {
	System.out.println("invoked temple no-arg const");
	}

	public TempleDTO(String name, String location, String mainGOd, boolean prasada, int yestGante) {


		this.name = name;
		this.location = location;
		this.mainGOd = mainGOd;
		this.prasada = prasada;
		this.yestGante = yestGante;
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

	public String getMainGOd() {
		return mainGOd;
	}

	public void setMainGOd(String mainGOd) {
		this.mainGOd = mainGOd;
	}

	public boolean isPrasada() {
		return prasada;
	}

	public void setPrasada(boolean prasada) {
		this.prasada = prasada;
	}

	public int getYestGante() {
		return yestGante;
	}

	public void setYestGante(int yestGante) {
		this.yestGante = yestGante;
	}
	
	
}
