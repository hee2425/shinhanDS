package com.shinhan.day05;

class A{}
class B extends A{}
class C extends A{}
class D extends B{ int max = 100; }
class E extends B{}
class F extends C{}

public class Inheritence3 {

	public static void main(String[] args) {
		f5();
	}

	//P336_9번
	private static void f5() {
		//자동형변환 : 부모타입 = 자식객체
		D v1 = new  D();
		B v2 = new  D();
		A v3 = new  D();
		System.out.println(v1.max);
		//강제형변환 : 자식타입 = (자식타입)부모타입 객체
		D v4 = (D)v2;
		System.out.println(v4.max);
		
		D v5 = (D)v3;
		System.out.println(v5.max);
		
//		E v6 = (E)v2;  //컴파일시에 오류 없음, 실행시 ClassCastException
		//본래생성된 Instance로만 형변환이 가능
		
//		E v7 = (E)v3;
		
		//형변환 가능한지 체크하자
		System.out.println(v3 instanceof D?"OK":"NO 형변환 불가");
		System.out.println(v3 instanceof E?"OK":"NO 형변환 불가");
		if(v3 instanceof D dd) {  //12버전부터 형변환 변수 타입 가능
//			D dd =  (D) v3;
			System.out.println(dd.max);
		}
	}

	private static void f4() {
		CarTest car = new CarTest();
		HankookTire a = new HankookTire();
		car.go(a);
		car.go(new KumhoTire());
	}

	private static void call(Animal ani) {
		ani.method1();
		if(ani instanceof Dog) {
			Dog d2 = (Dog) ani;
			d2.method3();
			System.out.println(d2.a + d2.c);
		}else if(ani instanceof Cat) {
			Cat c2 = (Cat) ani;
			c2.method2();
			System.out.println(c2.a + c2.b);
		}
		
	}
	
	private static void f3() {
		Cat c1 = new Cat();
		Dog d1 = new Dog();
//		c1.method1();
//		d1.method1();
		call(c1);
		call(d1);
	}

	private static void f2() {
		//field, method는 타입을 따른다.
		Animal c1 = new Cat();  //인스턴스를 따르지 않고 타입을 따르기 때문에 Animal만 읽음
		System.out.println(c1.a);
//		System.out.println(c1.b);
		c1.method1();
//		c1.method2();
	}

	private static void f1() {
		Cat c1 = new Cat();
		System.out.println(c1.a);
		c1.method1();
	}

}
