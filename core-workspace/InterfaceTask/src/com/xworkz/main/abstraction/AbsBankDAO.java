package com.xworkz.main.abstraction;


import com.xworkz.main.constants.BankDTO;
import com.xworkz.main.interfaces.BankDAO;

public class AbsBankDAO {
	BankDAO dao;

	public AbsBankDAO(BankDAO dao) {
		this.dao = dao;
	}

	public void save(BankDTO dto) {
		dao.save(dto);
	}

	public void delete(int dex) {
		dao.delete(dex);
	}

	public void update(BankDTO dto, int dex) {
		dao.update(dto, dex);

	}

	public void display() {
		dao.displayDetails();
	}

}
