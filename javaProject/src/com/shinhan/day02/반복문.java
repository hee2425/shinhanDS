package com.shinhan.day02;

public class 반복문 {

	public static void main(String[] args) {
//		forTest();
//		forTest2();
//		whileTest1();
//		whileTest2();
//		whileTest3();
		forTest4();
	}

	private static void forTest4() {
	//1~10 합계
		int su = 1;
		int total = 0;
		/*
		for(;su<=10;su++) {
			if(su%2!=0) continue;  //반복문을 빠지지 않고 아래문장들 무시. 계속 진행
			
			total +=su;
			System.out.print(su);
			System.out.print(su ==10?"":"+");
			
			
		}*/
		
		for(;su<=10;su++) {
			if(su%2==0) {  //짝수일때만 계산
				total +=su;
				System.out.print(su);
				System.out.print(su ==10?"":"+");
			}
			
		}
		System.out.println("="+total);
	}

	private static void whileTest3() {
		//1~10 출력
		int i=1;
		do{
			if(i>10) break;
			System.out.println(i);
			System.out.println("------");
			i++;
		}while(i<=10);

		
	}

	private static void whileTest2() {
		//1~10 출력
		int i=1;
		while(i<=10) {
			if(i>10) break;
			System.out.println(i);
			System.out.println("------");
			i++;
		}

	}

	private static void whileTest1() {
		//1~10 출력
		int i=1;
		while(true) {
			if(i>10) break;
			System.out.println(i);
			System.out.println("------");
			i++;
		}
	}

	private static void forTest2() {
		//1~10까지 출력
		int i=1;
		for(;;) {  //무한loop
			if(i>10) break;
			System.out.println(i);
			System.out.println("----------");
			i++;
		}
		
	}

	private static void forTest() {
		//1~10 출력
		for(int i=1; i<=10; i++) {
			System.out.println(i);
		}
	}

}
