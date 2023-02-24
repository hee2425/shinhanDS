package com.shinhan.day02;

public class OperatorTest {

	public static void main(String[] args) {
//		method1();
//		method2();
//		method3();
//		method4();
//		method5();
//		method6();
		method7();
	}

	private static void method7() {
		int a=70;
		if(a>=70) {
			System.out.println("합격");
		}else {
			System.out.println("불합격");
		}
		//삼항연산자
		System.out.println(a>=70?"합격":"불합격");
		String result = a>=70?"합격":"불합격";
		System.out.println(result);
		
		System.out.println(20+a>10 && ++a<=20);
	}

	private static void method6() {
		int a=10;
		a++;
		++a;
		a = a + 1;
		a += 1;
		
	}

	private static void method5() {
		int a = 10;
		int b = 20;
		System.out.println(a==b);
		System.out.println(a!=b);
		System.out.println(!(a==b));
	}

	private static void method4() {
		int a = 10;
		int b = 20;
		//||(단축): 앞의 결과가 거짓이면 뒤 계산 안함
		//|: 앞의 결과가 거짓이어도 무조건 뒤까지 계산
		boolean result1 = a>10 || ++b==20; 
		boolean result2 = a>10 | ++b==20; 
		System.out.println(result1);
		System.out.println(result2);
		System.out.println("b="+b);
	}
	
	private static void method3() {
		int a = 10;
		int b = 20;
		//&&(단축): 앞의 결과가 거짓이면 뒤 계산 안함
		//&: 앞의 결과가 거짓이어도 무조건 뒤까지 계산
		boolean result1 = a>10 && ++b==20; 
		boolean result2 = a>10 & ++b==20; 
		System.out.println(result1);
		System.out.println(result2);
		System.out.println("b="+b);
	}

	private static void method2() {
		int a = 10;
		int b = 0;  //정수는 0으로 나눌 수 없음
		double d = 0.0;
		
		//컴파일시에는 오류 없으나 실행시에 오류 
		// RuntimeException(ArithmeticException)
//		System.out.println(a/b);
		System.out.println(a%d);
		if(Double.isNaN(a%d)) {
			System.out.println("계산 불가");
		}else {
			System.out.println(a%d);
		}
		
		
		System.out.println(Double.isInfinite(a/d));
		if(Double.isInfinite(a/d)) {
			System.out.println("계산 불가");
		}else {
			System.out.println(a/d);
		}
//		System.out.println(a/d);
		System.out.println("method end");
	}

	private static void method1() {
		int a = 10;
		int b = 5;
		a++;  //11
		++a;  //12
		System.out.println(++a);//증가 후 사용  //13
		System.out.println(a++);//사용 후 증가  //13
		System.out.println(a);  //14
		
		System.out.println("--------------");
		
		System.out.println("더하기:"+(a+b));
		System.out.println("빼기:"+(a-b));
		System.out.println("곱하기:"+(a*b));
		System.out.println("나누기(몫):"+(a/b));
		System.out.println("나머지:"+(a%b));
		
	}

}
