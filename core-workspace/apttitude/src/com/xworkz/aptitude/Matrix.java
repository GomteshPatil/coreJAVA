package com.xworkz.aptitude;



public class Matrix  {

	public static void main(String[] args) {
		Matrix matrix=new Matrix();
		matrix.print();
		
		System.out.println("HEy there how you doing");
	}
		
	void print() {
		for(int row=1;row<=5;row++) {
			System.out.print("\n");
		for(int coloum=1;coloum<=5;coloum++) {
			
			System.out.print(row+""+coloum+"\t");
		
		}
		
	  }
	}
}

	




