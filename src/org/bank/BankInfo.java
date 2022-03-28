package org.bank;

public class BankInfo extends AxixBank{
	public void savings() {
		System.out.println("Savings Account");
	}
	public void fixed() {
		System.out.println("Fixed Account");
}
	public static void main(String[] args) {
		BankInfo b = new BankInfo();
		b.savings();
		b.fixed();
		b.deposit();
	}
}
