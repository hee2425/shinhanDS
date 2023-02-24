package com.shinhan.day03;

import java.util.Scanner;

public class 채희 {

	public static void main(String[] args) {
		//1. 4번
		//2. 3번
		//3. 2번
		//4. 2번
		//5. 3번
		//method5_6();
		//method5_7();
		//method5_8();
		method5_9();
	}

	private static void method5_9() {
		int[] scores = null; 
		while(true) {
		Scanner sc = new Scanner(System.in);
		System.out.println("-----------------------------------------------");
		System.out.println("1. 학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료 ");
		System.out.println("-----------------------------------------------");
		
		
		System.out.print("선택>");
		
		int choose=sc.nextInt();
		if(choose==1) {
			System.out.print("학생수>");
			int a=sc.nextInt();
			scores = new int[a];
		}else if(choose==2){
			for(int i=0; i<scores.length; i++) {
				System.out.print("scores["+i+"]> ");
				int score = sc.nextInt();
				scores[i] = score;
			}
		}else if(choose==3) {
			for(int i=0; i<scores.length; i++) {
				System.out.print("scores["+i+"]> " + scores[i]);
				System.out.println();
			}
		}else if(choose==4) {
			int max = 0;
			int sum = 0;
			for(int i=0; i<scores.length; i++) {
				if(max<scores[i]) max = scores[i];
				sum += scores[i];
			}
			System.out.println("최고 점수 : " + max);
			System.out.println("평균 점수 : " + (float)sum/scores.length);
		}else {
			System.out.println("프로그램 종료");
			break;
		}
		System.out.println();
		}
	}

	private static void method5_8() {
		int[][] array= {
				{96, 86},
				{83, 92, 96},
				{78, 83, 93, 87, 88}
		};
		
		int sum = 0;
		int count = 0;
		for(int i = 0; i<array.length; i++) {
			for(int j=0; j<array[i].length; j++) {
				sum += array[i][j];
				count++;
			}
		}
		System.out.println("전체합 : "+sum);
		System.out.println("평균:"+ sum/count);
		
	}

	private static void method5_7() {
		int[] array = {1,5,3,8,2};
		int max = 0;
		for(int i=0; i<array.length; i++) {
			if(max<array[i]) {
				max = array[i];
			}
		}
		System.out.println(max);
	}

	private static void method5_6() {
		int[][] array= {
				{96, 86},
				{83, 92, 96},
				{78, 83, 93, 87, 88}
		};
		
		System.out.println(array.length);  //3
		System.out.println(array[2].length);  //5
	}

}
