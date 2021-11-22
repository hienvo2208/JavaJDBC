package com.vietjack;

public class BankAccount {
	private String accountNumber;
	private double balance;
	private String customerName;
	private String email;
	private String phone;

	public void transfer(BankAccount anotherAccount,double amount){
		if (this.balance < amount) {
			System.out.println("Khong the chuyen duoc " + amount);
			System.out.println("Ban chi co the chuyen toi da:" + this.balance);
		} else {
			this.balance -= amount;
			System.out.println("Chuyen thanh cong " + amount);
			System.out.println("So du hien tai :" + this.balance);
			System.out.println("Tai khoan "+anotherAccount.getAccountNumber()+ " da nhan duoc " + amount+" tu tai khoan "+this.getAccountNumber());
			anotherAccount.setBalance(anotherAccount.getBalance()+amount);
			System.out.println("So du hien tai: "+anotherAccount.getBalance());
			
		}		
	}
	// so tien gui, so thang
	public void savingMoney(int day){
		System.out.println("So tien truoc khi gui:"+this.balance);
		this.balance+=this.balance*BankUtils.getInterestRatePerYear(day)*day/365/100f; 
		System.out.println("So tien sau khi gui:"+this.balance);
	}
	public void withdrawn(double amount) {
		if (this.balance < amount) {
			System.out.println("Khong the rut duoc " + amount);
			System.out.println("Ban chi co the rut toi da:" + this.balance);
		} else {
			this.balance -= amount;
			System.out.println(this.getAccountNumber()+" Rut thanh cong " + amount);
			System.out.println("So du hien tai :" + this.balance);
		}
	}
	//nap tien
	public void deposit(double amount){
		this.balance+=amount;
		System.out.println(this.getAccountNumber()+" da nap thanh cong "+amount);
		System.out.println("So du hien tai "+this.balance);
	}

	// Ctr+shift+F
	public BankAccount(String accountNumber, double balance, String customerName, String email, String phone) {
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.customerName = customerName;
		this.email = email;
		this.phone = phone;
	}

	public BankAccount() {
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	private void setBalance(double balance) {
		this.balance = balance;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

}
