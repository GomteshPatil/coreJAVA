package com.xworkz.dp.dao;

import com.xworkz.dp.dto.ApplicationDTO;
import com.xworkz.dp.dto.FacebookApplicationDTO;
import com.xworkz.dp.dto.InstagramApplicatinDTO;

public class ApplicationDAO {

	private ApplicationDTO[] applicationDTO = new ApplicationDTO[2];
	private FacebookApplicationDTO[] facebook = new FacebookApplicationDTO[2];
	private InstagramApplicatinDTO[] instagram = new InstagramApplicatinDTO[2];
	private int dex = 0;

	public void save(FacebookApplicationDTO faceBook1) {
		System.out.println("Invoked save method to save facebook");
		if (this.dex < this.facebook.length && faceBook1 != null) {
			this.facebook[this.dex++] = faceBook1;
		} else {
			System.err.println("either you passing null or the array is full");
		}

	}

	public void save(InstagramApplicatinDTO insta) {
		System.out.println("Invoked save method to save instagram");
		if (this.dex < this.instagram.length && insta != null) {
			this.instagram[this.dex++] = insta;
		} else {
			System.err.println("either you passing null or the array is full");
		}

	}

	public void findApplicationByName(String givenName) {
		System.out.println("Finding the application with the name : ".concat(givenName));
		if (givenName != null) {
			for (int bin = 0; bin < facebook.length; bin++) {
				ApplicationDTO array = applicationDTO[bin];
				if (array != null) {
					String compairingWith = array.getName();
					if (givenName.equals(compairingWith)) {
						System.out.println(givenName.concat(" application is fount in list"));
					} else {
						System.err.println("The application with name ".concat(givenName).concat(" is not found"));
					}

				}

			}
		}

	}

	public void displayDetails() {
		for (int rocket = 0; rocket < this.facebook.length; rocket++) {
			FacebookApplicationDTO array1 = this.facebook[rocket];

			if (array1 != null) {

				System.out.println("Application name : ".concat(array1.getName()));
				System.out.println("Application version : ".concat(array1.getVersion()));
				System.out.println("Application parentcompany : ".concat(array1.getCompany()));
				System.out.println("Application founder : ".concat(array1.getFounder()));
				System.out.println("Facebook CEO : ".concat(array1.getCeoName()));
				System.out.println("Facebook Headquarter : ".concat(array1.getHeadQuarter()));
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

			} else {
				System.err.println("may be index is full or you passed null");
			}
		}

	}

	public void displayDetailsOfInstagram() {
		for (int rock = 0; rock < instagram.length; rock++) {
			InstagramApplicatinDTO array2 = instagram[rock];

			if (array2 != null) {
				System.out.println("Application name : ".concat(array2.getName()));
				System.out.println("Application version : ".concat(array2.getVersion()));
				System.out.println("Application parentcompany : ".concat(array2.getCompany()));
				System.out.println("Application founder : ".concat(array2.getFounder()));
				System.out.println("Instagram server location : ".concat(array2.getServerLocation()));
				System.out.println("Instagram total users : ".concat(String.valueOf(array2.getTotalUsers())));

			} else {
				System.err.println("may be index is full or you passed null");
			}
		}

	}
}
