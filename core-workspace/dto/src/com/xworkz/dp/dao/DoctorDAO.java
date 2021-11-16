package com.xworkz.dp.dao;

import com.xworkz.dp.dto.DoctorDTO;

public class DoctorDAO {

	private DoctorDTO[] doctorDTOs = new DoctorDTO[30];
	private int count = 0;

	public DoctorDTO[] getDoctorDTOs() {
		return doctorDTOs;
	}

	public void save(DoctorDTO name) {
		System.out.println("Invoked save method & saved doctor name : ".concat(name.getName()));
		if (this.count < this.doctorDTOs.length && name != null) {
			this.doctorDTOs[this.count++] = name;

		} else {
			System.err.println("either you passed null or the array is full ");
		}

	}

	public void save(DoctorDTO name, int no) {
		System.out.println("Invoked overloaded save method & saved doctor name : ".concat(name.getName()));
		if (no < doctorDTOs.length && name != null && no <= 0) {
			doctorDTOs[no] = name;
			count++;

		} else {
			System.err.println("either you passed null or the array is full ");
		}

	}
	public int occupied() {
		return count;
	}
	

	public boolean findDoctor(String name) {
		System.out.println("Finding the doctor of name : ".concat(name));

		for (int pen = 0; pen < doctorDTOs.length; pen++) {

			DoctorDTO ref = doctorDTOs[pen];
			if (ref != null) {
				String doc = ref.getName();
				if (name.equals(doc)) {
					System.out.println(name.concat(" doctor is found in list"));
					return true;
				}
			}
		}

		return false;
	}

}
