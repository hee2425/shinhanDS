package com.shinhan.day09;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class TranseferThread extends Thread {
	ShareArea share;
	
	@Override
	public void run() {
		for(int i=1; i<=12; i++) {
			
//			synchronized (share) {
//				//출금한다.
//				int amount = share.lee.withdraw(100);
//				System.out.println("lee계좌에서 "+amount+"출금");
//				//입금한다.
//				share.sung.deposit(amount);
//				System.out.println("sung계좌에 "+amount+"입금");
//			}
			share.transfer();
		}
	}
}
