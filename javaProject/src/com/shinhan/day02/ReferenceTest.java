package com.shinhan.day02;

import java.util.Arrays;

import javax.security.auth.Subject;

public class ReferenceTest {

	public static void main(String[] args) {
//		f1();
//		f2();
//		f3();
		f4();
	}

	private static void f4() {
		String subjects = "자바,DB#HTML CSS,JavaScript,React,Spring";
		String[] arr = subjects.split(",|#| ");  //정규표현식 or : |
		System.out.println(Arrays.toString(arr));
		System.out.println(arr[6]);
		for(String s:arr) {
			System.out.println(s);
		}
	}

	private static void f3() {
		String subject = "이것이 자바다";
		for(int index=0; index<subject.length() ;index++){
			System.out.println(subject.charAt(index));
			System.out.println(subject.substring(index, index+1));
			
		}
		System.out.println(subject.replace("자바", "C언어"));  //원본 바뀌지 않음
		System.out.println(subject);
		subject = subject.replace("자바","C언어"); //대체, 원본 바꾸기
		System.out.println(subject);
		System.out.println(subject.indexOf("C"));  //위치 출력
	}

	private static void f2() {
		String name = null;  //null은 힙에 생성된 객체는 없다.
		System.out.println(name);
		System.out.println(name.length());
	}

	private static void f1() {//프레임
		int a = 10;  //스택에 만들어짐
		String s1 = "자바"; //컴파일시에 class영역에 상수 pool애 들어감
		String s2 = "자바";//load시에 method영역에 상수 pool애 들어감
		String s3 = new String("자바");
		String s4 = new String("자바");
		System.out.println(s1==s2);  //주소 같다
		System.out.println(s3==s4);  //주소 다르다
		
		s1 = s1 + "aa";
		s2 = s2 + "aa";
		System.out.println(s1==s2);  //주소 다르다
		System.out.println(s3.equals(s4));  //내용이 같다
		
	}

}
