package com.xworkz.main;

import com.xworkz.main.abstraction.AbsBankDAO;
import com.xworkz.main.constants.BankDTO;
import com.xworkz.main.interfaces.BankDAO;
import com.xworkz.main.interfaces.ImplementedBankDAO;

public class BankScanner {

	public static void main(String[] args) {

		BankDTO bank1 = new BankDTO(99922331942342L, "SBI", "BEG00EQ121", "BTM");
		BankDTO bank2 = new BankDTO(99922331942342L, "BOB", "BEG00EQ1221", "Rajaji Nagar");
		BankDTO bank3 = new BankDTO(99922331942342L, "RBI", "BEG00EQ111", "Yeshvantpur");

		BankDAO dao = new ImplementedBankDAO();

		AbsBankDAO abstraction = new AbsBankDAO(dao);
		abstraction.save(bank3);
		abstraction.save(bank2);
		abstraction.save(bank1);
		abstraction.save(null);

		abstraction.delete(1);
		abstraction.update(bank2, 7);

		abstraction.display();

	}

}
