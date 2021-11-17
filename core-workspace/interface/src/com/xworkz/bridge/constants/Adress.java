package com.xworkz.bridge.constants;

public class Adress {

	private String atPost;
	private String Tal;
	private String dist;
	private int postalCode;

	public Adress() {
		System.out.println("Invoked no-arg const of class Adress");
	}

	public Adress(String atPost, String tal, String dist, int postalCode) {

		this.atPost = atPost;
		Tal = tal;
		this.dist = dist;
		this.postalCode = postalCode;
	}

	public String getAtPost() {
		return atPost;
	}

	public void setAtPost(String atPost) {
		this.atPost = atPost;
	}

	public String getTal() {
		return Tal;
	}

	public void setTal(String tal) {
		Tal = tal;
	}

	public String getDist() {
		return dist;
	}

	public void setDist(String dist) {
		this.dist = dist;
	}

	public int getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(int postalCode) {
		this.postalCode = postalCode;
	}

}
