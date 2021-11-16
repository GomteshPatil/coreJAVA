package com.xworkz.dp;

import com.xworkz.dp.dao.CameraDAO;
import com.xworkz.dp.dto.CameraDTO;

public class CameraStarter {

	public static void main(String[] args) {

		CameraDTO cameDto1 = new CameraDTO("Sony", "DSLR", 1200.50F, 890F, 45, 38000.50F);
		CameraDTO cameDto2 = new CameraDTO("Nickon", "DSLR", 1200.50F, 890F, 45, 38000.50F);
		CameraDTO cameDto3 = new CameraDTO("Samsung", "DSLR", 1200.50F, 890F, 45, 38000.50F);
		CameraDTO cameDto4 = new CameraDTO("LG", "DSLR", 1200.50F, 890F, 45, 38000.50F);
		CameraDTO cameDto5 = new CameraDTO("Sony", "DSLR", 1200.50F, 890F, 45, 38000.50F);

		CameraDAO camDao = new CameraDAO();
		camDao.save(cameDto1);
		camDao.save(cameDto2);
		camDao.save(cameDto3);
		camDao.save(cameDto4);
		camDao.save(cameDto5);
		// camDao.save(null);
		camDao.save(cameDto2);

		camDao.delete(3);
		// camDao.delete(15);
		camDao.update(3, cameDto1);
		// camDao.update(12, cameDto5);

		CameraDTO[] cameraArray = camDao.getcameraDTOs();

		for (int i = 0; i < cameraArray.length; i++) {
			CameraDTO ref = cameraArray[i];
			if (ref != null) {

				System.out.println("Camera Company : " + ref.getCompany());
				System.out.println("Camera cost : " + ref.getCost());
				System.out.println("Camera pixel : " + ref.getPixel());
				System.out.println("Camera Type : " + ref.getType());
				System.out.println("Battery Capacity : " + ref.getBatteryCapacity());
				System.out.println("Camera Total Weight : " + ref.getWaight());
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

			} else {
				System.err.println("index" + i + " is pointing tull or not saved anything");
			}
		}

	}

}
