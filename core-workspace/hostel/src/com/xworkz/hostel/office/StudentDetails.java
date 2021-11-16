package com.xworkz.hostel.office;

import com.xworkz.hostel.PlayGround;

public class StudentDetails {

	public String name1;
	public int year1;
	
	private String name;
	private int roomNo;
	private int hostelFloreNo;
	private String nativePlace;
	private int year;
	final int hostelFees=37900;
	
	public StudentDetails() {
		
	}
	public StudentDetails(String name1,int year1) {
		this.name1=name1;
		this.year1=year1;
		}
	
	
	
	
	
	
	
	
	
	public int getHostelFees() {
	return hostelFees;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRoomNo() {
		return roomNo;
	}
	public void setRoomNo(int roomNo) {
		this.roomNo = roomNo;
	}
	public int getHostelFloreNo() {
		return hostelFloreNo;
	}
	public void setHostelFloreNo(int hostelFloreNo) {
		this.hostelFloreNo = hostelFloreNo;
	}
	public String getNativePlace() {
		return nativePlace;
	}
	public void setNativePlace(String nativePlace) {
		this.nativePlace = nativePlace;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	
}
