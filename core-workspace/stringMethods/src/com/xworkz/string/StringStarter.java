package com.xworkz.string;

public class StringStarter {

	public static void main(String[] args) { //throws UnsupportedEncodingException {
	

		java.lang.String name="Dashara";
		String name1="Holi";
		System.out.println(name1.concat("_Festival of colour"));
		System.out.println(name.concat("_Habba"));
		
		String string=new String("Dipavali");
		
		String ref=string.concat("_Festival");
		System.out.println(ref);                      //1st
		
		boolean sfix= string.endsWith("a");
		System.out.println(sfix);
		System.out.println(name.endsWith("ra"));     //2nd
		
		//String[] code= {"a","b","c"};
		//string.getBytes(name);
		
		
	     System.out.println(string.equals(name1));    //3rd
		
	     char[] gp= {'G','o','m','t','e','s','h','P'};
	     System.out.println(string.copyValueOf(gp));   //4th  
	
	     int hii=string.compareToIgnoreCase(name);   //5th
	     System.out.println(hii);
	     
	      System.out.println(string.equalsIgnoreCase(name));   //6th
	
	   System.out.println(string.codePointAt(7));
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
	
	
	
	
	

}
