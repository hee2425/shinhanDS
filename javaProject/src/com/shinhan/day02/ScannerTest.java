package com.shinhan.day02;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;



public class ScannerTest {

	public static void main(String[] args) throws IOException {
		f1();
//		f2();
		
	}



	private static void f2() {
		//사용자 입력 : System.in이다. Scanner아님
		Scanner sc = new Scanner(System.in);
				
		System.out.println("점수>>");
		int score = sc.nextInt();
				
		System.out.println("이름>>");
		String name = sc.next();
				
		sc.nextLine();
		String memo = sc.nextLine();
				
		System.out.println(name +"==>"+score);
		System.out.println(memo);
	}



	private static void f1() throws IOException {
		//사용자 입력 받기
		System.out.println("f1 function");
		System.out.print("score input>>");
		InputStream is = System.in;
		
		int i;
		while((i = is.read())!=13) {
			System.out.print((char)i);
		}
				
	}

}
