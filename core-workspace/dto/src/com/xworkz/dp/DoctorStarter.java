package com.xworkz.dp;

import com.xworkz.dp.dao.DoctorDAO;
import com.xworkz.dp.dto.DoctorDTO;

public class DoctorStarter {

	public static void main(String[] args) {

		DoctorDTO doctDto1 = new DoctorDTO("Abhi", "Surgrn", "Abhi surgens", 'M', 30000F, 25);
		DoctorDTO doctDto2 = new DoctorDTO("Gomtesh", "BDS", "Patil hospital", 'M', 44000F, 22);

		DoctorDAO docDao = new DoctorDAO();
		docDao.save(doctDto1);
		docDao.save(new DoctorDTO("Dr rajesh ", "Arto", "Hospital Rajesh", 'M', 60000F, 45));
		docDao.save(doctDto2, 8);
		docDao.save(new DoctorDTO("Vandana", "Nurosergion", "One Hospital", 'F', 25500.50F, 35));

		System.out.println("index filled is " + docDao.occupied());

		DoctorDTO[] docArray = docDao.getDoctorDTOs();

		for (int board = 0; board < docArray.length; board++) {

			DoctorDTO ref = docArray[board];
			if (ref != null) {
				System.out.println("Doctor name : ".concat(ref.getName()));
				System.out.println("Hospital name : ".concat(ref.getHospotalName()));
				System.out.println("Specalized in : ".concat(ref.getSpecilization()));
				System.out.println("Doctor Age : ".concat(String.valueOf(ref.getAge())));
				System.out.println("Doctor Sallary : ".concat(String.valueOf(ref.getSalary())));
				System.out.println("Gender : ".concat(String.valueOf(ref.getGender())));
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

			} else {
				System.err.println("index ".concat(String.valueOf(board)).concat(" is still not have any value"));
			}

		}

	}

}
