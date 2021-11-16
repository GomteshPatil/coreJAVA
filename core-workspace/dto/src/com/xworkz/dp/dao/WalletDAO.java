package com.xworkz.dp.dao;

import com.xworkz.dp.dto.WalletDTO;

public class WalletDAO {

	private WalletDTO[] walletDTOs = new WalletDTO[45];
	private int dex = 0;

	public WalletDTO[] getWalletDTOs() {
		return walletDTOs;
	}

	public void insert(WalletDTO wallet) {

		if (dex < walletDTOs.length && wallet != null) {
			System.out.println("Invoked Insert method");
			this.walletDTOs[this.dex++] = wallet;
			System.out.println("added wallet  of company : ".concat(wallet.getCompanyName()).concat("\n"));

		} else {
			System.err.println("either array is full or you passing null");
		}
	}

	public void insert(WalletDTO wallet, int no) {
		System.out.println("Invoked parameterised Insert method");
		if (no < walletDTOs.length && wallet != null && no >= 0) {
			walletDTOs[no] = wallet;
			dex++;
		} else {
			System.err.println("either inedx given is wrong or you passed null");
		}
	}

	public int occupideIndex() {
		System.out.println("invoked method to count occupied index".concat("\n"));
		return dex;
	}

	public boolean findCompany(String walletComoany) {

		System.out.println("Invoked Find WAllet method");
		System.out.println("Finding wallet of company : ".concat(walletComoany).concat("\n"));

		for (int dilux = 0; dilux < this.walletDTOs.length; dilux++) {
			WalletDTO ref = walletDTOs[dilux];
			if (ref != null) {
				System.out.println("index ".concat(String.valueOf(dilux).concat(" is not null")));
				String comp = ref.getCompanyName();
				if (walletComoany.equals(comp)) {
					System.out.println(comp.concat("  company wallet found"));
					return true;
				}
			}
		}

		return false;
	}

}
