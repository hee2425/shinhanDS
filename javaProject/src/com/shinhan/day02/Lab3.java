package com.shinhan.day02;

public class Lab3 {
	//public : 모든 패키지에서 접근 가능
	//static : >java Lab3 실행하면 실행하기 전에
	//Lab3 class의 byte code가 method영역에 올라간다.
	//static 붙은 method, variable들도 올라간다.
	//void: return 값이 없다. 함수 수행 후 돌아갈때 값을 가지고 가지 않는다.
	public static void main(String[] args) {
		double result = sum(1,100);
		System.out.println(result);
	}
	private static double sum(int i, int j) {
		int total = 0;
		for(int loop = i;loop<=j; loop++) {
			total += loop;
		}
		return total;
	}

}
