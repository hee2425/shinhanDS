package com.shinhan.day02;

public class Review {

	public static void main(String[] args) {
		System.out.println("main start");
		f1();
		f2();
		System.out.println("main end");
		
	}

	private static void f2() {
		
	}

	private static void f1() {
		System.out.println("f1 function");
		//기본형 datatype : 값저장, 연산, 비교 기능
		//byte, short, char, int, long, float, double
		//boolean
		
		byte v1 = 100;
		int v2;
		//1.자동 형 변환
		v2 = v1;
		//2. 강제형 변환 ...casting
		v1 = (byte)v2;
		
		//단, String은 기본형이 아님... java.lang.String class에서 제공
		//***
		//Wrapper class : 기본형 datatype + 기능추가
		String s = "100";
		int v3 = Integer.parseInt(s);
		System.out.println(v3+300);
		
		
	}

}
