package com.vietjack;

public class Main {
	public static void main(String[] args) {
		BankAccount tuyenAccount=new BankAccount("003234343", 0.0, "Nguyen Thanh Tuyen", "tuyen@gmail.com", "0888888");
		tuyenAccount.deposit(2000);
		tuyenAccount.withdrawn(1000);
		//tuyenAccount.setBalance(1000000);
		BankAccount ha=new  BankAccount("0022222", 0.0, "Nguyen Thanh Ha", "ha@gmail.com", "099999");
		tuyenAccount.transfer(ha, 1000);
		ha.savingMoney(364);
		
		
	}
}
