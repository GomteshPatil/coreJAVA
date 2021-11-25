package com.xworkz.main.interfaces;

import com.xworkz.main.constants.BankDTO;

public class ImplementedBankDAO implements BankDAO{

	BankDTO[] bank = new BankDTO[10];
	int counter = 0;

	@Override
	public boolean save(BankDTO dto) {
		System.out.println("Invoked save method ");
		if (dto != null) {
			this.bank[counter++] = dto;
			System.out.println("DTO is saved at index : ".concat(String.valueOf(counter)));
			return true;
		} else {
			System.err.println("May be array is full or you passing null");
		}
		return false;
	}

	@Override
	public boolean delete(int dex) {
		if (dex <= 0 && dex < bank.length) {
			this.bank[dex] = null;
			System.out.println("Index " + dex + " is deleted");
			return true;

		}

		return false;
	}

	@Override
	public boolean update(BankDTO dto, int dex) {
		System.out.println("Invoked update method");
		if (dex >= 0 && dex < bank.length && dto != null) {
			this.bank[dex] = dto;
			System.out.println("DTO is updated in the index : "+dex);
			return true;
		} else {
			System.err.println("you are not allowed to pass null ");
		}
		return false;
	}

	@Override
	public void displayDetails() {
		for (int j = 0; j < bank.length; j++) {
			if (bank[j] != null) {
				System.out.println("Airport name : " + bank[j].getBankName());
				System.out.println(" Airport location : " + bank[j].getAccNo());
				System.out.println("Plane name : " + bank[j].getIfsc());
				System.out.println("plane Type : " + bank[j].getBranch());
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			}
		}

	}
}
