package com.shinhan.day05;


//ch = new Child(): Object 생성 - Parent생성 - Child생성
//ch.a
//ch.method1()

class Parent2{  //final class : 절대 상속 불가
	int a = 10;  //final field : 값 수정 불가
	Parent2(){
		//super();
		System.out.println("부모 생성자");
	}
	
	void method1() {
		System.out.println("부모 method");
	}
}

class Child2 extends Parent2{  
//	String a = "자바"; //덮어쓰기(Overriding)
	int b = 20;
	Child2(){
		//super();
		System.out.println("자식생성자");
	}
	/*
	void method1() {  //추가(Overloading)  //final method :재정의 불가
		System.out.println("자식 method");
	}
	*/
	void method2() {
		System.out.println("자식 method2");
	}




public class Inheritence2 {

	public static void main(String[] args) {
		f3();
	}

	private static void f3() {
		
		
		Parent2 ch = new Child2();
		System.out.println(ch.a );
		ch.method1();
//		ch.method2();
	}

	private static void f2() {
		Child2 ch = new Child2();
		System.out.println(ch.a + ch.b);
		ch.method1();
		ch.method2();
	}

	private static void f1() {
		Student st1 = new Student("123", "홍길동");
		Student st2 = new Student("124", "임길동", "컴공");
		Student st3 = new Student("125", "최길동", "화학", 99);
		
		ExchangeStudent st4 = new ExchangeStudent("126", "은빈", new String[] {"영어", "프랑스어"});
		
		System.out.println(st1);  //.toString() 기본으로 불러줌 -> 주소 헥사값, 부모에서 toString 오버라이딩해서 재정의함
		System.out.println(st2);
		System.out.println(st3);
		System.out.println(st4);
		System.out.println(Student.count+"명");
	}

}
