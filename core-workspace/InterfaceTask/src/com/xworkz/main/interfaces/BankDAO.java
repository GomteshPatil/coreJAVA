package com.xworkz.main.interfaces;

import com.xworkz.main.constants.BankDTO;

public interface BankDAO {

	public boolean save(BankDTO dto);

	public boolean delete(int dex);

	public boolean update(BankDTO dto, int dex);

	public void displayDetails();
}
