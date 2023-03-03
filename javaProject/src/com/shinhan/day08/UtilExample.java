package com.shinhan.day08;


public class UtilExample {

	public static void main(String[] args) {
		Pair<String, Integer> pair = new Pair<>("홍길동",35);
		Integer age = Util.getValue(pair,"홍길동");
		System.out.println("pair나이는 : "+age);
		System.out.println("---------------------------");
		
		
		ChildPair<String, Integer> childPair = new ChildPair<>("홍삼원",20);
		Integer childAge = Util.getValue(childPair,"홍삼순");
		System.out.println("childpair나이는 : "+childAge);
		
		//오류
		/*
		OtherPair<String, Integer> otherPair = new OtherPair<>("홍삼원",20);
		Integer age3 = Util.getValue(otherPair,"홍삼순");
		System.out.println(childAge);
		*/
	}

}
