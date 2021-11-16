package com.xworkz.dp.dao;

import com.xworkz.dp.dto.LawyerDTO;

public class LawyerDAO {

	private LawyerDTO[] lawyerDTOs = new LawyerDTO[15];
	private Integer no = 0;
	static Float[] maxExp = new Float[1];

	public LawyerDTO[] getLawyerDTOs() {
		return lawyerDTOs;
	}

	public void save(LawyerDTO name) {

		if (this.no < this.lawyerDTOs.length && name != null) {

			lawyerDTOs[this.no++] = name;
			// System.out.println("Invoked save method and lawyer details saved by name :
			// ".concat(name.getName()));
		} else {
			System.err.println("Either the array is full or you passing null");
		}
	}

	public void save(LawyerDTO name, Integer index) {

		if (index >= 0 && index < lawyerDTOs.length && name != null) {

			lawyerDTOs[index] = name;
			this.no++;
			// System.out.println("Invoked overloaded save method to save lawyer details at
			// index : ".concat(String.valueOf(index)));
		} else {
			System.out.println("either array is full or you passing null");

		}
	}

	public void delete(Integer dex) {
		System.out.println("Invoked delete method and delete the lawyer details ");
		this.lawyerDTOs[dex] = null;
	}

	public void searchByName(String findName) {

		System.out.println("Invoked search name and finding lawyer with name : ".concat(findName));
		Boolean error = false;
		for (int bell = 0; bell < lawyerDTOs.length; bell++) {

			LawyerDTO ref = lawyerDTOs[bell];
			if (ref != null) {
				String comparename = ref.getName();
				if (findName.equals(comparename)) {
					System.out.println("found the lawyer with the name : ".concat(findName).concat("\n"));
					return;
				}

			}

		}
		if (error != true) {
			System.err.println("there is a no lawyer present with name :".concat(findName).concat("\n"));
		}

	}

	public void searchByCasesWon(Integer findByWonCases) {
		System.out.println("Invoked method to search lawyer. Passed no of cases he/she own : "
				.concat(String.valueOf(findByWonCases)).concat(" cases"));
	//	Boolean rock = false;
		for (int lock = 0; lock < lawyerDTOs.length; lock++) {
			LawyerDTO array = lawyerDTOs[lock];
			if (array != null) {
				Integer caseOwn = array.getCasesOwn();
				if (findByWonCases.equals(caseOwn)) {
					System.out.println(array.getName().concat(" is the lawyer who own "
							.concat(String.valueOf(findByWonCases)).concat(" cases own").concat("\n")));
				}
			}

		}
		/*if (rock != true) {
			System.err.println(
					"There is a no lowyer present who own ".concat(String.valueOf(findByWonCases)).concat("\n"));
		}*/
	}

	public void searchQualificationByName(String lawyer) {
		System.out.println("Invoked method to search lawyer qualification. & name of Lawyer that given : "
				.concat(String.valueOf(lawyer)));
		Boolean error = false;
		for (int star = 0; star < lawyerDTOs.length; star++) {
			LawyerDTO array1 = lawyerDTOs[star];
			if (array1 != null) {
				String lawyerName = array1.getName();
				if (lawyer.equals(lawyerName)) {
					System.out.println(array1.getName().concat(
							" is the lawyer whos Qualification is  ".concat(array1.getQualification()).concat("\n")));
					return;
				}

			}
		}
		if (error != true) {
			System.err.println("The lawyer with name ".concat(lawyer).concat(" is not there in list ").concat("\n"));

		}
	}

	public void searchExpByName(String lawyer) {
		System.out.println("Invoked method to search lawyer Experience. & name of Lawyer that given : ".concat(lawyer));
		Boolean error = false;
		for (int star = 0; star < lawyerDTOs.length; star++) {
			LawyerDTO array1 = lawyerDTOs[star];
			if (array1 != null) {
				String lawyerName = array1.getName();
				if (lawyer.equals(lawyerName)) {
					System.out.println(array1.getName()
							.concat(" has Expericence of   ".concat(String.valueOf(array1.getExperience())))
							.concat(" years").concat("\n"));
					return;
				}

			}
		}
		if (error != true) {
			System.err.println("The lowyer with name ".concat(lawyer).concat(" is not there in list ").concat("\n"));

		}
	}

	public Float lawyerWithMaxExp(Float[] lawyerDTOs, Float total) {
		Float temp;

		System.out.println("Invoked method to find lawyer with max experience");

		for (Integer x = 0; x < lawyerDTOs.length; x++) {

			for (Integer y = 0; y < lawyerDTOs.length; y++) {

				if (lawyerDTOs[x] > lawyerDTOs[y]) {
					temp = lawyerDTOs[y];
					lawyerDTOs[x] = lawyerDTOs[y];
					lawyerDTOs[y] = temp;

					return lawyerDTOs[(int) (total - 1F)];
				}
			}

		}

		return null;
	}

	/*LawyerDTO array=lawyerDTOs[x]; if(array!=null) { Float
	 * compareExp=array.getExperience(); //maxExp=array.getExperience();
	 * if(maxExp<=compareExp ); maxExp=compareExp; if(maxExp<compareExp) { return
	 * maxExp;
	 */

}
