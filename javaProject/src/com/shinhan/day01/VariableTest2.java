package com.shinhan.day01;

public class VariableTest2 {

	public static void main(String[] args) {
		System.out.println("main 시작");
		f3();  // 함수 호출
		System.out.println("main 끝");
		
		
	}

	private static void f3() {
		short v1 = 32767;
		char v2 = 'A';
		int v3 = Integer.MAX_VALUE; //214748364; 최댓값
		System.out.println(v3);
		long v4 = 2147483648L;  //L or l 뒤에 꼭 입력
		float v5 = 3.14f;  //F or f
		double v6 = 3.14;
		
		char v7 = 65;
		char v8 = 0x0041;
		System.out.println(++v7);
		System.out.println(++v8);
		
		boolean result;
		result = 10 > 20;
		System.out.println(result);
	}

	private static void f2() {
		// 자바의 dataType: 
		// 정수 (byte-1, short-2, char-2, int-4, long-8)
		// 실수 (float-4, double-8)
		// boolean (true-1, false-1)
		//00000000
		//01111111 : 127
		//10000000 : -128
		byte v1=127;
		byte v2=-128;
		System.out.println(Integer.toBinaryString(v1));
		System.out.println(Integer.toBinaryString(v2));
		v1++;
		System.out.println(v1);
		
	}

	private static void f1() {
		int a;
		System.out.println(a=10);
		System.out.println(a==10);
	}

}
