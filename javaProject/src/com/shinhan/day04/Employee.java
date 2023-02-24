package com.shinhan.day04;

public class Employee {
	private  String name;
	private  String title;
	private int baseSalary;
	private  int totalSalary;
	
	public Employee(String name, String title, int baseSalary) {
		//3개의 매개변수를 차례대로 같은 이름의 멤버변수 값으로 초기화하는 문장 정의
		this.name = name;
		this.title = title+"님";
		this.baseSalary = baseSalary;
		
	}

//	3-1. public void getTotalSalary() 메소드 :  
//	title 이 “부장” 이면 totalSalary 는 baseSalary + baseSalary 의 25%로 계산
//	title 이 “과장” 이면 totalSalary 는 baseSalary + baseSalary 의 15%로 계산 
//	나머지 totalSalary 는 baseSalary + baseSalary 의 5%로 계산
	
	private void getTotalSalary() {
		if(title.equals("부장님")) {
			totalSalary = (int) ((baseSalary + baseSalary) * 0.25);
		}else if(title.equals("과장님")) {
			totalSalary = (int) ((baseSalary + baseSalary) * 0.15);
		}else {
			totalSalary = (int) ((baseSalary + baseSalary) * 0.05);
		}
	}
	

	public void print() {
		getTotalSalary();
		 System.out.println(title + "직급의 " + name+"씨의 본봉은 "+baseSalary+" 원이고 총급여는 "+totalSalary+" 원입니다.");
	}

}
