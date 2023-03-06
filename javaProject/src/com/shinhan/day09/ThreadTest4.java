package com.shinhan.day09;

import com.shinhan.day05.Account;

public class ThreadTest4 {

	public static void main(String[] args) throws InterruptedException {
		f10();
		
	}
	
	private static void f10() {
		AutoSaveThread t1 = new AutoSaveThread();
		t1.setDaemon(true);
		t1.start();
		
		try {
			Thread.sleep(5000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("main end");
	}
	
	private static void f9() {
		SafeThread t1 = new SafeThread();
		t1.start();
		
		try {
			Thread.sleep(3000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		t1.interrupt();
	}
	
	private static void f8() {
		SafeThread t1 = new SafeThread();
		t1.start();
		
		try {
			Thread.sleep(3000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		t1.interrupt();
	}
	
	private static void f7() {
		SafeThread t1 = new SafeThread();
		t1.start();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		t1.stop(); //위험해서 사용하지 않는 것이 좋다.
		t1.setStop(true);
	}
	//Thread에서 다른 쓰레드에 신호 보내기 : wait(), notify()
	private static void f6() {
		WorkObject obj = new WorkObject();
		ThreadA t1 = new ThreadA(obj);
		ThreadB t2 = new ThreadB(obj);
		t1.start();
		t2.start();
	}
	
	private static void f5() {
		ShareArea share = new ShareArea();
		share.sung = new Account("12345", "성춘향", 20000);
		share.lee = new Account("67896", "이몽룡", 10000);		
		TranseferThread t1 = new TranseferThread(share);
		PrintThread t2 = new PrintThread(share);
		t1.start();
		t2.start();
		
	}
	
	
	//동기화
	private static void f4() {
		
		User1Thread t1 = new User1Thread();
		User2Thread t2 = new User2Thread();
		//Calculator는 2개의 Thread가 공유하는 공유 영역
		Calculator cal = new Calculator();
		t1.setCalculator(cal);
		t2.setCalculator(cal);
		t1.start();
		t2.start();
		
	}

	//동기화(공유영역을 하나의 쓰레드가 사용중일때 다른 쓰레드가 접근 금지)
	private static void f3() {
		BathRoom bathRoom = new BathRoom();
		BathThread t1 = new BathThread(bathRoom, "김씨");
		BathThread t2 = new BathThread(bathRoom, "이씨");
		BathThread t3 = new BathThread(bathRoom, "박씨");
		BathThread t4 = new BathThread(bathRoom, "최씨");
		t1.start(); t2.start(); t3.start(); t4.start();
		
	}

	//Join Test
	private static void f2() {
		SumThread t1 = new SumThread(1,50);
		SumThread t2 = new SumThread(51,100);
		t1.start();
		t2.start();
		
		try {
//			Thread.sleep(3000);  //시간을 명확하게 정하기 어려울 경우 조인 사용 -> 끝나면 실행
			t1.join(); t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(t1.getSum() + t2.getSum());
		System.out.println("main end.............");
	}

	
	//yield Test
	private static void f1() throws InterruptedException {
		WorkThread t1 = new WorkThread("[쓰레드 A]");
		WorkThread t2 = new WorkThread("[쓰레드 B]");
		
		t1.start();
		t2.start();
		//5초간 일시정지
		Thread.sleep(5000);
		//t1의 work를 false...t1쓰레드가 다른쓰레드에 양보
		t1.work = false;
		//10초후
		Thread.sleep(5000);
		//t1의 work를 true
		t1.work = true;
		
	}

}
