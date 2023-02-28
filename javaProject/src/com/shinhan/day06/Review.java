package com.shinhan.day06;

/*
 1. 변수 : data를 저장하기 위한 기억장소, 값 수정 가능
 2. 상수 : data를 저장하기 위한 기억장소, 값 수정 불가능
 3. enum : 관련 있는 상수 묶음
 4. method : 로직 문장들의 묶음
 5. class : object를 만드는 틀/ 변수+상수+메소드
 6. object : class로 new한 실체
 7. interface : 규격서 / 상수+추상메서드+default method+static method
 */

abstract class ParentClass{
	abstract void method1();
}

interface MyInterface{
	//규격
	void method2();
}

interface MyInterface2{
	//규격
	void method2_1();
}

interface MyInterface3 extends MyInterface, MyInterface2{  //인터페이스는 다중 상속 가능
	//규격
	void method3_1();
}

class MyClass1 extends ParentClass implements MyInterface3{
	void method1() {
		//추상 클래스 상속이므로 반드시 구현해야함
		
	}
	public void method2() {
		//interface 구현할때는 public 필수
		//질문*** 왜 public이어야하는지?
	}
	public void method2_1() {}
	public void method3_1() {}
}

class MyClass2 extends ParentClass implements MyInterface3{
	void method1() {
		//추상 클래스 상속이므로 반드시 구현해야함
	}
	public void method2() {
		//interface 구현할때는 public 필수
	}
	public void method2_1() {}
	public void method3_1() {}
}


public class Review {
	public static void main(String[] args) {
		ParentClass v1 = new MyClass1();
		//질문*** parentclass로 바꾸는것???
		work(v1);
	}
	static void work(ParentClass aa) {
		aa.method1();
		System.out.println(aa instanceof MyClass1);
		System.out.println(aa instanceof ParentClass);
		System.out.println(aa instanceof MyInterface);
		System.out.println(aa instanceof MyInterface2);
		System.out.println(aa instanceof MyInterface3);
//		aa.method2();
//		aa.method2_1();
//		aa.method3_1();
		
		if(aa instanceof MyInterface3 my) {
			my.method2();
			my.method2_1();
			my.method3_1();
		}
	}
}
