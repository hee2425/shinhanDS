package com.shinhan.day08;

import java.util.ArrayList;

public class GenericTest {



	public static void main(String[] args) {
		wildcardTest4();
	}

	private static void wildcardTest4() {
//		HappyBox<String> box = new HappyBox<String>("A",10);
//		f1(box);
//		HappyBox<Integer> box2 = new HappyBox<Integer>(5,10);
//		f2(box2);
		HappyBox<ChildA> box3 = new HappyBox<ChildA>(new ChildA(),10);
		f3(box3);
	}

	private static void f3(HappyBox<? super ChildA> param) {
		System.out.println("f3...<? super ChildA>");
	}
	
	private static void f2(HappyBox<? extends Number> param) {
		System.out.println("f2...<? extends Number>");
	}
	
	private static void f1(HappyBox<?> param) {
		System.out.println("f1...<?>");
	}
	
	
	private static void wildcardTest3() {
		//<? super Worker>: Worker포함 상위
		Course.registerCourse3(new Applicant<Person> (new Person()));
//		Course.registerCourse3(new Applicant<Student> (new Student()));
		Course.registerCourse3(new Applicant<Worker> (new Worker()));
//		Course.registerCourse3(new Applicant<HighStudent> (new HighStudent()));
//		Course.registerCourse3(new Applicant<MiddleStudent> (new MiddleStudent()));
	}

	private static void wildcardTest2() {
		//<? extends Student> : Student포함 하위
//		Course.registerCourse2(new Applicant<Person> (new Person()));
		Course.registerCourse2(new Applicant<Student> (new Student()));
//		Course.registerCourse2(new Applicant<Worker> (new Worker()));
		Course.registerCourse2(new Applicant<HighStudent> (new HighStudent()));
		Course.registerCourse2(new Applicant<MiddleStudent> (new MiddleStudent()));
	}

	private static void wildcardTest() {
		//<?>  :모두
		Course.registerCourse1(new Applicant<Person> (new Person()));
		Course.registerCourse1(new Applicant<Student> (new Student()));
		Course.registerCourse1(new Applicant<Worker> (new Worker()));
		Course.registerCourse1(new Applicant<HighStudent> (new HighStudent()));
		Course.registerCourse1(new Applicant<MiddleStudent> (new MiddleStudent()));
	}

	private static void method3() {
		genericExtendMethod(new ChildA());
		genericExtendMethod(new ChildB());
//		genericExtendMethod(new Money());//제한 걸어서 안됨
		
		
		genericExtendMethod2(new HappyBox<>("사과",0));
		genericExtendMethod3(new HappyBox<>(500,0));
		genericExtendMethod4(new HappyBox<>(new ChildB(),0));
		
	}

	private static void genericExtendMethod4(HappyBox<? super ChildA> param) {
		System.out.println("? super Number : Number의 자신과 상위만 가능 ");
	}
	
	private static void genericExtendMethod3(HappyBox<? extends Number> param) {
		System.out.println("? extends Number : Number의 자식만 가능");
	}
	
	private static void genericExtendMethod2(HappyBox<?> param) {
		System.out.println("?는 제한이 없다");
	}
	
	private static <T extends Parent> void genericExtendMethod(T param) {
		System.out.println("genericExtendMethod.........");
	}

	private static void method2() {
		Integer a = 10;
		Integer b = 20;
		boolean result = compare(a,b);
		System.out.println(result);
		
		String s1 = new String("자바");  //새로 만들어서 주소 다름
		String s2 = "자바";
//		result = compare(s1,s2);  //타입에 제한을 걸어서 불가
		System.out.println(result);
	}

	//타입에 제한 걸기 : Number를 상속받은 하위클래스만 가능
	public static <T extends Number> boolean compare(T a, T b) {
//		return a==b;  //주소값 비교인데 오토 박싱되어서 값 비교가됨
		return a.equals(b);  //값 비교
	}
	
	private static void megthod1() {
		HappyBox<String> box1 = Boxing("해피박스kind");
		HappyBox<String> box2 = Boxing("500");
		System.out.println(box1);
		System.out.println(box2);
	}
	
	//제네릭메서드
	private static<T,A,B> int Boxing2(T kind, A a, B b) {
		return 100;
		
	}
	
	private static<T> HappyBox<T> Boxing(T kind) {
		return new HappyBox<>(kind, 1000);
		
	}

	private static void f5() {
		Product<String, Integer> p1 = new Product<>("책", 1000);
		Product<String, Integer> p2 = new Product<>("책", 1000);
		System.out.println(p1);
		System.out.println(p1.equals(p2));
		
		
	}

	private static void f4() {
		ArrayList<Money> data = new ArrayList<>();
		data.add(new Money(1));
		data.add(new Money(10));
		data.add(new Money(12));
		data.add(new Money(6));
		
		for(Money s:data) {
			System.out.println(s);
		}
		
	}

	private static void f3() {
		ArrayList<String> data = new ArrayList<>();
		data.add("월");
		data.add("목");
		data.add("토");
		data.add("월");
		
		for(String s:data) {
			System.out.println(s);
		}
	}

	private static void f2() {
		
		//제네릭스 사용하지 않은 예제
		HappyBox<String> b1 = new HappyBox<String>("바나나", 100);
		HappyBox<String> b2 = new HappyBox<String>("컴퓨터", 100);
		HappyBox<String> b3 = new HappyBox<String>("책", 100);
		
		String s1 = b1.kind;
		String s2 = b2.kind;
		String s3 = b3.kind;
		
		HappyBox<Money> b4 = new HappyBox<Money>(new Money(10), 100);
		HappyBox<Money> b5 = new HappyBox<Money>(new Money(2), 100);
		HappyBox<Money> b6 = new HappyBox<Money>(new Money(3), 100);
		Money m1 = b4.kind;
		Money m2 = b5.kind;
		Money m3 = b6.kind;
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(m1);
		System.out.println(m2);
		System.out.println(m3);
		

	}
	
	private static void f1() {
		
		//제네릭스 사용하지 않은 예제
		Box b1 = new Box("바나나", 100);
		Box b2 = new Box(500, 100);
		Box b3 = new Box(new Money(300), 100);
		
		String s1 = (String)b1.kind;
		int s2 = (Integer)b2.kind;
		Money m = (Money)b3.kind;
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(m);
	}

}
