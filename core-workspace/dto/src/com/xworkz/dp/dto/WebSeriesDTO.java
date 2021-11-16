package com.xworkz.dp.dto;

import com.xworkz.dp.constants.Genre;

public class WebSeriesDTO {

	private String name;
	private Genre genre;
	private String cast;
	private int noOfCharacters;
	private float rating;
	private int currentSession;
	private int totalSessions;
	
	public WebSeriesDTO() {
		
		System.out.println("invoked the Webseries no-arg const");
	}

	public WebSeriesDTO(String name, String cast, int noOfCharacters, float rating, int currentSession,
			int totalSessions,Genre genre) {

		this.name = name;
		this.cast = cast;
		this.noOfCharacters = noOfCharacters;
		this.rating = rating;
		this.currentSession = currentSession;
		this.totalSessions = totalSessions;
		this.genre=genre;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCast() {
		return cast;
	}

	public void setCast(String cast) {
		this.cast = cast;
	}

	public int getNoOfCharacters() {
		return noOfCharacters;
	}

	public void setNoOfCharacters(int noOfCharacters) {
		this.noOfCharacters = noOfCharacters;
	}

	public float getRating() {
		return rating;
	}

	public void setRating(float rating) {
		this.rating = rating;
	}

	public int getCurrentSession() {
		return currentSession;
	}

	public void setCurrentSession(int currentSession) {
		this.currentSession = currentSession;
	}

	public int getTotalSessions() {
		return totalSessions;
	}

	public void setTotalSessions(int totalSessions) {
		this.totalSessions = totalSessions;
	}

	public Genre getGenre() {
		return genre;
	}

	public void setGenre(Genre genre) {
		this.genre = genre;
	}
	
	
	
	
	
}
