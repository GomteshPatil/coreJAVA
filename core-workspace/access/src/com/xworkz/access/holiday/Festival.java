package com.xworkz.access.holiday;

public class Festival {
	
	
	public static boolean holiday;
	private int count=2;
	
	public  int getCount() {
		return count;
		
	}
		public Festival() {
			System.out.println("invoked the non-para const");
		}
	
	public void celebration(String name) {
		System.out.println("invoked celibration"+name);	
	}
	public static void enjoy() {
		System.out.println("invoked the enjoy");
	}
}

