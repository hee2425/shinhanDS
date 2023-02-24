package com.shinhan.day03;

//JavaBeans기술 규격서 : field는 private(정보은닉)
public class Computer {
	private String model;
	private String os;
	private int price;
	static int count;  //변수: instance변수, static변수(class변수) : object 공유 변수
	
	//Overloading : 이름은 같고, 매개변수 다르게!
	//하나의 생성자가 다른모양의 생성자를 호출할 수 있다.
	public Computer(){  //다른 패키지에서 new 가능
		this("AA모델", "MAC", 500);  //디폴트 값
		
	}
	public Computer(String model){  
		this(model, null, 0);
		
	}
	public Computer(String os, int price){  
		this(null, os, price);
		
	}
	public Computer(String model, String os, int price){  
		System.out.println("****arg3개 생성자로 생성****");
		this.model = model;
		this.os = os;
		this.price = price;
		count++;
		
	}
	
	//일반메소드 - 기능
	public void computerInfoPrint() {
		System.out.println("model : "+model);
		System.out.println("os : " + os);
		System.out.println("price : " + price);
		
	}
	
	public String getModel() {
		return model;
	}
	
	public String getOs() {
		return os;
	}
	
	public int getPrice() {
		return price;
	}
}
