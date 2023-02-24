package com.shinhan.day02;

import java.util.Scanner;

public class 채희 {

	public static void main(String[] args) {
//		method3_1();
//		method3_2();
//		method3_3();
//		method3_4();
//		method3_5();
//		method3_6();	
//		method3_7();
//		method4_1();
//		method4_2();
//		method4_3();
//		method4_4();
//		method4_5();
//		method4_6();
		method4_7();
		
	}

	private static void method4_7() {
		int sum = 0;
		while(true) {
			Scanner sc=new Scanner(System.in);
			System.out.println("------------------------------");
			System.out.println("1. 예금 | 2.출근 | 3.잔고  |4.종료 ");
			System.out.println("------------------------------");
			System.out.print("선택>");
			int choose=sc.nextInt();
			
			if(choose==1) {
				System.out.print("예금액>");
				int a=sc.nextInt();
				sum+=a;
			}else if(choose==2) {
				System.out.print("출금액>");
				int a=sc.nextInt();
				if(a>sum) System.out.println("잔액부족");
				else sum-=a;
			}else if(choose==3) {
				System.out.print("잔고>");
				System.out.println(sum);
			}else {
				System.out.println("프로그램 종료");
				break;
			}
			System.out.println();
		}
	}
		

	private static void method4_6() {
		for(int i =1; i<6; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	private static void method4_5() {
		for(int x=1; x<=10; x++) {
			for(int y=1; y<=10; y++) {
				if(4*x+5*y == 60) {
					System.out.printf("(%d, %d)", x, y);
				}
			}
		}
	}

	private static void method4_4() {
		// TODO Auto-generated method stub
				while(true) {
					int a=(int) (Math.floor(Math.random()*5)+1);
					int b=(int)(Math.floor(Math.random()*5)+1);
					if(a+b==5) {
						System.out.println("a: "+a+" b: "+b);
						break;
					}
					
					
				}
	}

	private static void method4_3() {
		int sum = 0;
		for(int i =3; i<=100; i+=3) {
			sum+=i;
		}
		System.out.println("3의 배수의 총합:"+sum);
	}

	private static void method4_2() {
			String grade = "B";
			int score = switch(grade) {
			case "A"->100;
			case "B"-> {
				int result = 100-20;
				yield result;
			}
			default->60;
			};
			System.out.println(score);
			
			//-------------------------
			int score1 = 0;
			switch(grade) {
			case "A":
				score1 = 100;
				break;
			case "B":
				int result = 100-20;
				score1 = result;
				break;
			default:
				score1 = 60;
			}
	}

	private static void method4_1() {
		//조건문과 반복문에 대해 잘못 설명?
		//2. switch문에서 사용할 수 있는 변수의 타입은 int, double이 될 수 있다.
		//정수타입(byte, char, short, int, long), 문자열 타입(String)가능
	}

	private static void method3_7() {
		double x = 5.0;
		double y = 0.0;
		double z = 5%y;
		
		if(Double.isNaN(z)) {
			System.out.println("0.0으로 나눌 수 없습니다.");
		}else {
			double result = z+10;
			System.out.println("결과: "+ result);
		}
	}

	private static void method3_6() {
		int x = 10;
		int y = 5;
		System.out.println((x>7) && (y<=5));
		System.out.println((x%3 == 2) || (y%2 != 1));
	}

	private static void method3_5() {
		int lengthTop = 5;
		int lengthBottom = 10;
		int height = 7;
//		double area = (lengthTop+lengthBottom)*height/2.0;
//		double area = (lengthTop+lengthBottom)*height*1.0/2;
//		double area = (double)(lengthTop+lengthBottom)*height/2;
		
		//정확한 숫자 아님
		double area = (double)((lengthTop+lengthBottom)*height/2);
		System.out.println(area);
	}

	private static void method3_4() {
		int value = 356;
		System.out.println(value/100*100);
	}

	private static void method3_3() {
		int pencils = 534;
		int students = 30;
		
		int pencilsPerStudent = pencils/students;
		System.out.println(pencilsPerStudent);
		
		int pencilsLeft = pencils%students;
		System.out.println(pencilsLeft);
		
	}

	private static void method3_2() {
		int score = 85;
		String result = (!(score>90))?"가":"나";
		System.out.println(result);
	}

	private static void method3_1() {
		int x = 10;
		int y = 20;
		int z = (++x)+(y--);
		System.out.println(z);
	}
	

}
