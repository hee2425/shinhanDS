package com.shinhan.day02;

import java.util.Scanner;

public class Lab2 {

	public static void main(String[] args) {
//		method1();
//		method2();
//		method3();
//		method4();
//		method6();
//		numDay(8);
		gcd(2,5);
		gcd(5,15);
		gcd(250,30);
	}


	private static void gcd(int i, int j) {
		int min = i>j?j:i;
		int result = 1;
		for(int su=min;su>0;su--) {
			if(i%su==0 && j%su==0) {
				result = su; break;
			}
		}
		System.out.println(result);
	}



	//void : return이 없다
	//static : class가 메모리에 load될 대 method 영역에 올라간다.
	//public : 모든 패키지에서 이 함수를 호출할 수 있다.
	private static void numDay(int month) {
		
		int lastDay;
		switch (month) {
		case 1,3,5,7,8,10,12:
			lastDay = 31;
			System.out.println(lastDay);
			break;
		case 4,6,9,11:
			lastDay = 30;
			System.out.println(lastDay);
			break;
		case 2:
			lastDay = 28;
			System.out.println(lastDay);
			break;
		default:
			System.out.println(month+"월은 존재하지 않습니다. 다시 입력하세요");
			return;
		
		}
		
		
	}



	private static void method6() {
		Scanner sc = new Scanner(System.in);
		System.out.print("년도를 입력하세요>>");
		int year = sc.nextInt();
		
		System.out.print("월을 입력하세요>>");
		int month = sc.nextInt();
		
		boolean result = false;
		
		if(year%4 == 0) {
			if(year%100 == 0) {
				if(year%400 == 0) {
					result = true;
				}
			}
			result = true;
		}
		
		switch(month) {
		case 1,3,5,7,8,10,12: System.out.printf("%d년 %d월의 말일은 31일입니다.", year, month); break;
		case 4,6,9,11: System.out.printf("%d년 %d월의 말일은 20일입니다.", year, month); break;
		case 2:
			if(result) {
				System.out.printf("%d년 %d월의 말일은 29일입니다.", year, month);
			}else {
				System.out.printf("%d년 %d월의 말일은 28일입니다.", year, month);
			}
		}
		
	}

	private static void method4() {
		Scanner sc = new Scanner(System.in);
		System.out.print("양의 정수 하나 입력 : ");
		
		
		int su = sc.nextInt();
		int count = 0;
		int sum = 0;
		for(int i=su; i<=1000; i+=su) {
			if(i%su == 0) {
				count++;
				sum += i;
			}
		}
		
		System.out.printf("%d의 배수 개수 = %d\n", su, count);
		System.out.printf("%d의 배수 합 = %d", su, sum);
		
	
		
	}

	private static void method3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("2~9 사이 숫자를 입력하세요 :");
		
		int su = sc.nextInt();
		int fac = 1;
		if(su<2 || su>9) {
			System.out.println("잘못된 입력입니다");
			return;
		}
		for(int i=su;i>0;i--) {
			fac *= i;
		}
		System.out.printf("%d!= %d",su,fac);
	}

	private static void method2() {
		//소수 판별
		Scanner sc = new Scanner(System.in);
		System.out.println("2~100사이의 정수를 입력하세요.");
		
		int number = sc.nextInt();
		boolean isPrime = true;
		for(int i=2;i<number/2;i++) {
			if(number%i==0) {
				isPrime = !isPrime;
				break;
			}
		}
		
		System.out.println(number + (isPrime?": 소수":": 소수아님"));
		
		
	}

	private static void method1() {
		//입력받은 숫자의 구구단 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("1보다 크고 10보다 작은 정수를 입력하세요. :");
		int dan = sc.nextInt();
		if(dan<2 || dan >= 10) {
			System.out.println("잘못된 숫자가 입력되었습니다.");
			return;
		}
		
		//함수 빠지기, 호출한 곳으로 돌아간다
		//break : switch, 반복문 빠지기
		
		for(int gop = 1; gop<=9; gop++) {
			System.out.printf("%d * %d = %d \n", dan, gop, dan*gop);
		}
	}

}
