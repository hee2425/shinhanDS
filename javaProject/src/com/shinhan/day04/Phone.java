package com.shinhan.day04;

//class: public 또는 생략

//------접근제한자-------------
//public : 모든 패키지에서 접근가능
//protected : 같은 채키지 접근 가능, 다른 패키지는 상속 받으면 가능
//생략(default): 같은 패키지에서만 접근가능
//private : 같은 class에서만 접근 가능
//---------------------------------

public class Phone {
	//1. field // public/protected/생략/private
	protected String model;
	//2. 생성자 : public/생략/private
	public Phone(){
		System.out.println("default 생성자 정의함");
	}
	
	public void f1() {
		
	}
	
	protected void f2() {
		
	}

	void f3() {
	
}

	private void f4() {
	
}
}
