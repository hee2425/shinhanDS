package com.shinhan.day05;

class Parent{
	int a = 10;
	
	Parent(){
		System.out.println("Parent 생성");
	}
	void f1() {
		System.out.println("부모의 f1메서드");
	}
}

class Child extends Parent{
	String a = "자바";  //child에 a있으니까 a ="자바"
	int b = 20;
	
	Child(){
		//super();
		System.out.println("Child 생성");
	}
	void f1() {  //오버라이드
		super.f1();  //부모의 f1수행
		System.out.println("자식의 f1메서드");
	}
	void f2() {
		System.out.println("부모의 f2메서드");
	}
}

public class InheritanceTest {
	public static void main(String[] args) {
		Child ch = new Child();
		System.out.println(ch.a);
		System.out.println(ch.b);
		ch.f1();
		ch.f2();
	}

}
