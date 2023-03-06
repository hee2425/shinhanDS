package com.shinhan.day09;

public class MyThread2 extends Thread{
	public MyThread2() {}
	public MyThread2(String threadName) {
		super(threadName);
	}
	@Override
	public void run() {
		for(char i='A'; i<='Z'; i++) {
			System.out.println("["+getName()+"] i: "+i);
		}
	}
}
