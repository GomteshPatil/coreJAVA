package com.xworkz.main.constants;

public class BankDTO {
	private long accNo;
	private String bankName;
	private String ifsc;
	private String branch;
	
	public BankDTO() {
		System.out.println("Invoked no-arg const of bank dto");
	}

	public BankDTO(long accNo, String bankName, String ifsc, String branch) {
		super();
		this.accNo = accNo;
		this.bankName = bankName;
		this.ifsc = ifsc;
		this.branch = branch;
	}

	public long getAccNo() {
		return accNo;
	}

	public void setAccNo(long accNo) {
		this.accNo = accNo;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getIfsc() {
		return ifsc;
	}

	public void setIfsc(String ifsc) {
		this.ifsc = ifsc;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

}
