package com.shinhan.day02;

import java.util.Scanner;

public class Lab1 {

	public static void main(String[] args) {
//		method1();
//		method2();
//		method3();
		
	}

	private static void method3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int su = sc.nextInt();
		
		int start = su%2==0?2:1;
		
		int sum = 0;
		for(int i = start; i<=su; i+=2) {
			sum +=i;
		}
		System.out.println("결과값 : "+sum);
	}

	private static void method2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열을 입력하세요.");
		String inputString = sc.nextLine();
		int len = inputString.length();
		
		inputString = inputString.toUpperCase();
		
		for(int i=0; i+1<=len; i++) {
			System.out.println(inputString.substring(0, i+1));
		}
		
	}

	private static void method1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("초기값 입력>>");
		int start = sc.nextInt();
		
		System.out.print("마지막값 입력>>");
		int end = sc.nextInt();
		
		System.out.print("증가분 입력>>");
		int d = sc.nextInt();
		
		int total = 0;
		for(int i=start; i<=end; i+=d) {
			total += i;
		}
		System.out.printf("총합은 %d 입니다.",total);
	}

}
