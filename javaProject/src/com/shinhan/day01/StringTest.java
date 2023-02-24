package com.shinhan.day01;

public class StringTest {

	public static void main(String[] args) {
		f8();
	}

	private static void f8() {
		int a=10;
		float b=20.12345f;
		System.out.println("a="+a+", b=" +b);
		System.out.println("----------------------");
		//%-d : -는 왼쪽정렬, d:decimal
		//%3.1f: 전체자리수.소수아래자리수 float
		System.out.printf("!a=%-5d, !!b =%3.1f", a, b);
		
	}

	private static void f7() {
		int a=100;
		{
			int b = 200;  //block안에서만 사용가능
			System.out.println(a+b);  
		}
//		System.out.println(a+b);  //b 사용 불가
	}

	private static void f6() {
		//자바 기본타입 : data저장, 연산, 비교
		//byte, short, char, int, long, float, double, boolean
		//[Wrapper Class] : 자바기본타입 + 기능(함수)
		//Byte, Short, Character, Integer, Long, Float, Double, Boolean
		String score = "90";
		int i = 100;
		Integer i2 = 100;
		String str = String.valueOf(i);  //문자로 바꿈
		String str2 = i+ "";  //문자로 바꿈
		System.out.println(Integer.parseInt(score) + 10);  //문자 + 숫자 => 문자
		
		
	}

	private static void f5() {
		byte v1 = 10;
		byte v2 = 20;
		//사직연산식에서 byte가 int로 자동변환
		byte v3 = (byte)(v1+v2);
		int v4 = v1 + v2;
		System.out.println(v3);
		System.out.println(v4);
	}

	private static void f4() {
		//강제형변환  -> data손실 가능성
		// 작은방 = (작은방타입)큰값
		byte v1 = 9;
		int v3 = 100;
		v1 = (byte)v3;
		System.out.println(v1);
	}

	private static void f3() {
		//**자동 형변환
		//큰방= 작은값 
		//byte < short < int < long < float < double
		//       char
		//boolean
		
		byte v1 = 127;
		short v2 = v1;
		int v3 = v1;
		long v4 = v1;
		float v5 = v1;
		double v6 = v1;
		
		System.out.println(v2);
		System.out.println(v3);
		System.out.println(v4);
		System.out.println(v5);
		System.out.println(v6);
		v3 = 10000;
		v4 = v3;
		v5 = v3;
		v6 = v3;
		System.out.println(v4);
		System.out.println(v5);
		System.out.println(v6);
	}

	private static void f2() {
		//\n: new line
		//\t: tab
		//\" :"
		String str1 = "자바 '프로그램' 완성";
		String str2 = "자바 \"프로그램\" 완성";
		String str3 = "{\"name\":\"홍\", \"age\":20}";  //json 자바스크립트형태의 문자열
		String str4 = """
				{"name":"홍", "age":20}
				""";
		System.out.println(str3);
		System.out.println(str4);
	}

	private static void f1() {
		//java.base모듈 java.lang패키지 String.class
		//기본형이 아님.
		//String : 고정문자열
		
		String s1 = "자바";  //컴파일시점에 .class의 상수pool
		String s2 = "자바";
		String s3 = new String("자바");  //heap영역에 만들어짐  //실행시 만들어짐
		String s4 = new String("자바");
		
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		System.out.println(s1==s2);
		
		System.out.println(System.identityHashCode(s3));
		System.out.println(System.identityHashCode(s4));
		
		s1 = s1+ "프로그램";
		s2 = s2 + "프로그램";
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		System.out.println(s1==s2);
	}

}
