package com.shinhan.day03;

//class:설계도, object를 만드는 틀
//Object는 class를 이용해서 만든 개체(실체 instance)
public class Car {
	//1. field(속성, 변수)
	String model;
	String color;
	int price;
	
	//2. 생성자메소드(생성시 초기화가 목적)
	//컴파일시에 자동으로 .class에 파라미터없는 default생성자가 만들어진다.
	//즉, 생성자를 정의하는 것은 필수가 아니다.
	//생성자정의하면 default생성자가 자동으로 만들어지지는 않는다.
	//생성자는 리턴 정의가 없다 => void 안씀 쓰면 일반메소드
	//반드시 class이름과 같아야함
	public  Car(){  // public - 다른 패키지에서 접근가능
		System.out.println("3.Car의 default생성자");
	}
	
	//3. 일반메소드(method, 기능, 동작)
	void go() {
		System.out.println("자동차가간다.");
	}
	
	//4. block(instance block, static block)
	{
		System.out.println("2.instance block....생성시마다 실행");
	}
	static{
		System.out.println("1.static block ...load시 실행");
	}
	
	//5. inner class
	
	
}
