package com.xworkz.dp;

import com.xworkz.dp.dao.BucketDAO;
import com.xworkz.dp.dto.BucketDTO;

public class BucketStarter {

	public static void main(String[] args) {

		BucketDTO bucketDTO1 = new BucketDTO("black", 12, 1200F, 14F, "Asian paints");
		BucketDTO bucketDTO2 = new BucketDTO("green", 13, 1200F, 14F, "Asian paints");
		BucketDTO bucketDTO3 = new BucketDTO("red", 5, 1200F, 14F, "Asian paints");
		BucketDTO bucketDTO4 = new BucketDTO("paint bucket", 20, 1200F, 14F, "Asian paints");
		BucketDTO bucketDTO5 = new BucketDTO("blue", 20, 600.5F, 14F, "Asian paints");

		BucketDAO bucketDAO = new BucketDAO();

		bucketDAO.save(bucketDTO1);
		bucketDAO.save(bucketDTO2);
		bucketDAO.save(bucketDTO3);
		bucketDAO.save(bucketDTO4);
		bucketDAO.save(bucketDTO5);

		bucketDAO.delete(12);
		bucketDAO.update(14, bucketDTO4);

		BucketDTO[] bucketArray = bucketDAO.getBucketDTOs();

		for (int i = 0; i < bucketArray.length; i++) {
			BucketDTO ref = bucketArray[i];

			if (ref != null) {

				System.out.println("Bucket colour : " + ref.getColour());
				System.out.println(ref.getCompany());
				System.out.println(ref.getCompany());
				System.out.println(ref.getMaxWeight());
				System.out.println(ref.getPrice());
				System.out.println(ref.getSize());
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			} else {
				System.err.println(i + " is still pointing to null");
			}
		}

	}

}
