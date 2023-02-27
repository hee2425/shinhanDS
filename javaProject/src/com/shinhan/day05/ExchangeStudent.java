package com.shinhan.day05;

import java.util.Arrays;

public class ExchangeStudent extends Student {
	String[] language;
	public ExchangeStudent(String stdId, String name, String[] language) {
		//1.부모에서 default 생성자 정의
		//2. 명시적으로 부모생성자 호출
		super(stdId, name);  
		//super안했다면 직접 접근 아래 방식으로
		//this.setStdId(stdId);
		//this.name = name;
		this.language = language;
		
	}

	void display() {
		System.out.println(getClass().getSimpleName() + "에서 추가된 메서드");
	}

	@Override
	public String toString() {
		return "ExchangeStudent [language=" + Arrays.toString(language) + ", name=" + name + ", major=" + major
				+ ", score=" + score + ", schoolName=" + schoolName + "]";
	}

	
	
	
	
}
