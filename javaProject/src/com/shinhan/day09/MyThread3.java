package com.shinhan.day09;


//멀티쓰레드 만드는 방법
//1. extends Thread........run() 메서드 재정의하여 구현
//2.dlal부모class를 상속받은 경우는 Runnable interface구현
public class MyThread3 extends Object implements Runnable{  //다중상속 안되므로 인터페이스 implements
	public MyThread3() {}

	@Override
	public void run() {
		for(char i='a'; i<='z'; i++) {
			System.out.println("["+Thread.currentThread().getName()+"] i: "+i);
		}
	}
}
