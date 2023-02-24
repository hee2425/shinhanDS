package com.shinhan.day03;


/*
078-3762-293 계좌가 개설되었습니다.
078-3762-293 계좌의 잔고는 1000000원입니다.
078-3762-293 계좌에 2000000원이 입금되었습니다.
078-3762-293 계좌의 잔고는 3000000원입니다.
078-3762-293 계좌에 500000원이 출금되었습니다.
078-3762-293 계좌의 잔고는 3500000원입니다.
*/
public class Account {
	private String accNo;  //계좌번호
	private int balance; //잔고
	
	//생성자
	public Account(String accNo, int balance){
		this.accNo = accNo;
		this.balance = balance;
	}
	
	//함수
	public void deposite(int amount) { //입금
		balance +=amount;
		print("계좌에"
				+ amount
				+ "원이 입금되었습니다.");
		
	}
	public void withdraw(int amount) { //출금
		balance -= amount;
		print("계좌에"
				+ amount
				+ "원이 출금되었습니다.");
	}
	
	//getter
	public int getBalance() { //잔고
		return balance;
	}
	public String getAccNo() { //계좌번호
		return accNo;
	}
	
	private void print(String message) {
		System.out.println(accNo + message);
		System.out.println(accNo + "계좌의 잔고는"
				+ balance
				+ "원입니다.");
	}

	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", balance=" + balance + "]";
	}

	public static void main(String[] args) {
		Account acc = new Account("078-3762-293", 1000000);
		acc.deposite(2000000);
		acc.withdraw(500000);
		
		System.out.println(acc);


	}
}
