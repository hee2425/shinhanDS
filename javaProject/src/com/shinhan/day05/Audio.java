package com.shinhan.day05;

//interface 구현 class
public class Audio implements RemoteControl, WIFI{

	@Override
	public void powerOn() {
		System.out.println(getClass().getSimpleName()+" 전원을 켠다.");
	}

	@Override
	public void powerOff() {
		System.out.println(getClass().getSimpleName()+" 전원을 끈다.");
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		RemoteControl.super.display();
		System.out.println("default 메서드 재정의");
	}
	
//	@Override가 아님 그냥 기능 추가된것
	void display2() {
		System.out.println("!!!!!!!");
	}

	@Override
	public void wifiTurnOn() {
		System.out.println("wifi turn on!!!");
	}
	
	

}
