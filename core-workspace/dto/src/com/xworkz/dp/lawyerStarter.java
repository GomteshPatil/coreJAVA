package com.xworkz.dp;

import com.xworkz.dp.dao.LawyerDAO;
import com.xworkz.dp.dto.LawyerDTO;

public class lawyerStarter {

	public static void main(String[] args) {

		LawyerDTO lawDto1 = new LawyerDTO();
		lawDto1.setCasesLost(35);
		lawDto1.setCasesOwn(60);
		lawDto1.setCourtType("High court");
		lawDto1.setExperience(5.5F);
		lawDto1.setGender('M');
		lawDto1.setName("Ankit");
		lawDto1.setQualification("BBLLB");

		LawyerDTO lawDto2 = new LawyerDTO("Rajesh", "LLB", 20F, 'M', "Suprime Court", 164, 270);
		LawyerDTO lawDto3 = new LawyerDTO("Manjunath", "Diploma", 13F, 'M', "local Court", 300, 450);
		LawyerDTO lawDto4 = new LawyerDTO("Abhishek", "Diploma", 13F, 'M', "local Court", 300, 450);
		LawyerDTO lawDto5 = new LawyerDTO("aliya", "BA LLB", 3F, 'F', "taluka Court", 24, 244);

		LawyerDAO lawDao = new LawyerDAO();
		lawDao.save(new LawyerDTO("alisha", "BA LLB", 5F, 'F', "Dist Court", 17, 68));
		lawDao.save(new LawyerDTO("Sarika", "BA LLB", 1.4F, 'F', "local Court", 3, 8));
		lawDao.save(lawDto1);
		lawDao.save(lawDto2, 12);
		lawDao.save(lawDto3);
		lawDao.save(lawDto4);
		lawDao.save(lawDto5, 8);

		lawDao.delete(8);
		lawDao.searchByName("Rajesh");
		lawDao.searchByCasesWon(164);
		lawDao.searchQualificationByName("alisha");
		lawDao.searchExpByName("Sarika");
		// lawDao.lawyerWithMaxExp();

		LawyerDTO[] LawyerDTOarray = lawDao.getLawyerDTOs();

		for (int chair = 0; chair < LawyerDTOarray.length; chair++) {

			LawyerDTO ref = LawyerDTOarray[chair];
			if (ref != null) {
				System.out.println("name of lawyer : ".concat(ref.getName()));
				System.out.println("Qualification of lawyer : ".concat(ref.getQualification()));
				System.out.println("Total Experience : ".concat(String.valueOf(ref.getExperience())));
				System.out.println("No of cases Own : ".concat(String.valueOf(ref.getCasesOwn())));
				System.out.println("No of cases lost : ".concat(String.valueOf(ref.getCasesLost())));
				System.out.println("Court he currenty working in : ".concat(ref.getCourtType()));
				System.out.println("Gender of lawyer : ".concat(String.valueOf(ref.getGender())));
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			}
		}

	}

}
