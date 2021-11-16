package com.xworkz.aptitude;

public class PrimeNoCheck {

	int A = 21;

	public static void main(String[] args) {

		PrimeNoCheck ref = new PrimeNoCheck();
		ref.check();

	}

	public void check() {
		if ((A % 2)!= 0) {
			System.out.println("The given no is odd");
			int i=2;
			if (i<=A ) {
				System.out.println("its a prime no ");
			} else {
				System.out.println("Given no is not prime no ");
			}

		} else {
			System.out.println("It is even and it is not a prime number");
		}
	}

}
