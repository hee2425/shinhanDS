package com.shinhan.day06;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//Exception(예외):프로그래머의 노력으로 프로그램이 중단되지 않고 계속 진행하도록 할 수 있다.
public class ExceptionTest {

	public static void main(String[] args) throws IOException {
		System.out.println("main start~");
		try {
			f6();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("main end~");
	}

	private static void f6() throws ClassNotFoundException {
		Class cls = Class.forName("com.shinhan.day06.Book");
		System.out.println(cls.getSimpleName());
	}

	private static void f5() throws IOException {
		//일반 Exception : 컴파일시점에 반드시 해결해야한다.
		//2.이 함수를 호출한 곳에 떠넘긴다.
		FileReader fr = new FileReader("src/com/shinhan/day06/Book.java");
		int i;
		while((i = fr.read()) != -1) {
			System.out.print((char)i);
		}
	}

	private static void f4() {
		
		//일반 Exception : 컴파일시점에 반드시 해결해야한다.
		//1. 내가한다. 
		int i;
		//try(){} : try 종료 후 자원자동반납된다. 
		try (FileReader fr = new FileReader("src/com/shinhan/day06/Book.java")){
			while((i = fr.read()) != -1) {
				System.out.print((char)i);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			
		}
		
	}
	
	private static void f3() {
		
		//일반 Exception : 컴파일시점에 반드시 해결해야한다.
		//1. 내가한다. 2.떠넘긴다.
		FileReader fr=null;
		try {
			fr = new FileReader("src/com/shinhan/day06/Book.java");
			System.out.println("파일 존재한다...파일이 열림");
			int i;
			while((i = fr.read()) != -1) {
				System.out.print((char)i);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}catch (NullPointerException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

	private static void f2() {
		try {  //업무로직과 오류 처리 로직을 분리하기 위해 작성, 유지보수 편의를 위해
			int a=10;
			int b=0;
//			System.out.println(a/b);
			
//			int[] arr = new int[5];
//			System.out.println(arr[0]);
//			System.out.println(arr[5]);
			
//			Object obj = new String("자바");
//			System.out.println(obj.toString());
//			String s = (String) obj;
//			System.out.println(s.length());
			
//			String su = "100점";
//			int total = Integer.parseInt(su) + 200;
//			System.out.println(total);
			
			String s2 = null;
			System.out.println(s2.length());
			
			System.out.println("여기는 안옴");
		}catch(ArithmeticException ex) {
//			ex.printStackTrace();  //오류 과정 출력
			System.out.println(ex.getMessage());  //프로그램이 중단되지 않음
		}catch(ArrayIndexOutOfBoundsException ex) {
//			ex.printStackTrace();  //오류 과정 출력
			System.out.println(ex.getMessage());  //프로그램이 중단되지 않음
		}catch(ClassCastException|NumberFormatException ex) { //|는 OR를 의미
//			ex.printStackTrace();  //오류 과정 출력
			System.out.println(ex.getMessage());  //프로그램이 중단되지 않음
		}catch(Exception ex) {  //catch는 하위 먼저, 상위 나중에 작성
//			ex.printStackTrace();  //오류 과정 출력
			System.out.println(ex.getMessage());  //프로그램이 중단되지 않음
		} finally {
			System.out.println("이 부분은 반드시 처리한다...자원반납코드를 쓴다. dbdisconnect, fileClose");
		}
	}

	private static void f1() {
		//실행예외 : 컴파일시에 오류 없음, 실행시 오류
		//기타예외 : 컴파일시에 반드시 처리해야함
		
		//1.ArithmeticException
		int a=10;
		int b=0;
//		System.out.println(a/b);
		
		//2.ArrayIndexOutOfBoundsException
		int[] arr = new int[5];
		System.out.println(arr[0]);
//		System.out.println(arr[5]);
		
		//3.ClassCastException
		Object obj = new String("자바");
		System.out.println(obj.toString());
//		String s = (String) obj;
//		System.out.println(s.length());
		
		//4.NumberFormatException
		String su = "100점";
		int total = Integer.parseInt(su) + 200;
		System.out.println(total);
	}
	
	

}
