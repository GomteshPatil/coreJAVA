package com.xworkz.dp;

import com.xworkz.dp.dao.DressCodeDAO;
import com.xworkz.dp.dto.DressCodeDTO;

public class DressCodeStarter {

	public static void main(String[] args) {

		DressCodeDTO dressCodeDTO = new DressCodeDTO();

		DressCodeDTO dressCodeDTO1 = new DressCodeDTO("cotton", "M", "White", 350, 'M');
		DressCodeDTO dressCodeDTO2 = new DressCodeDTO("polyester", "XL", "Black", 425, 'F');
		DressCodeDTO dressCodeDTO3 = new DressCodeDTO("lykra", "S", "blue", 425, 'M');
		DressCodeDTO dressCodeDTO4 = new DressCodeDTO("silk", "XS", "red", 1201, 'F');
		DressCodeDTO dressCodeDTO5 = new DressCodeDTO("polyester", "L", "green", 425, 'F');
		DressCodeDTO dressCodeDTO6 = new DressCodeDTO("polyester", "XXL", "pista", 425, 'F');

		DressCodeDAO dressCodeDAO = new DressCodeDAO();
		dressCodeDAO.save(dressCodeDTO1);
		dressCodeDAO.save(dressCodeDTO2);
		dressCodeDAO.save(dressCodeDTO3);
		dressCodeDAO.save(dressCodeDTO4);
		dressCodeDAO.save(dressCodeDTO5);
		dressCodeDAO.save(dressCodeDTO6);
		dressCodeDAO.save(dressCodeDTO2);

		dressCodeDAO.delete(5);
		dressCodeDAO.update(9, dressCodeDTO4);

		DressCodeDTO[] dressArray = dressCodeDAO.getDressDTO();

		for (int no = 0; no < dressArray.length; no++) {

			DressCodeDTO ref = dressArray[no];

			if (ref != null) {
				System.out.println("Dress Colour : " + ref.getColour());
				System.out.println("Dress Material : " + ref.getMaterial());
				System.out.println("Gender : " + ref.getGender());
				System.out.println("Dress Price : " + ref.getPrice());
				System.out.println("Size of Dress" + ref.getSize());

				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			} else {
				System.err.println("Index " + no + " is pointing to null or no value is assigned");
			}

		}

	}

}
