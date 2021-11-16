package com.xworkz.dp;

import com.xworkz.dp.dao.WalletDAO;
import com.xworkz.dp.dto.WalletDTO;

public class WalletStarter {

	public static void main(String[] args) {

		WalletDTO walletDto = new WalletDTO();

		walletDto.setCompanyName("Woodland");
		walletDto.setCoinCompartment(true);
		walletDto.setMaterial("Leather");
		walletDto.setNoOfCompartment(6);
		walletDto.setPrice(1250.60F);

		WalletDAO walletDAO = new WalletDAO();

		walletDAO.insert(walletDto);
		walletDAO.insert(new WalletDTO("fox leather", "PUMA", 6, 1090F, false));
		walletDAO.insert(new WalletDTO("Leathuer", "NIKE", 6, 1200F, true));
		walletDAO.insert(new WalletDTO("Cloth", "PUMA", 6, 650.50F, true), 12);

		System.out.println("total no of filled occupied  is : ".concat(String.valueOf(walletDAO.occupideIndex())));
		boolean wallet = walletDAO.findCompany("PUMA");
		System.out.println(wallet);
		System.out.println(walletDAO.findCompany("Wildkraft"));

		WalletDTO[] walletArray = walletDAO.getWalletDTOs();

		for (int lathe = 0; lathe < walletArray.length; lathe++) {
			WalletDTO ref = walletArray[lathe];

			if (ref != null) {
				System.out.println(ref.getCompanyName());
				System.out.println(ref.getMaterial());
				System.out.println(ref.getMaterial());
				System.out.println(ref.getPrice());
				System.out.println(ref.isCoinCompartment());
				System.out.println(ref.getNoOfCompartment());

				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			} else {
				System.err.println(String.valueOf(lathe).concat(" still not have any referance or pointing to null"));
			}

		}

	}

}
