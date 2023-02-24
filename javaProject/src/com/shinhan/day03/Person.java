package com.shinhan.day03;

public class Person {
	//멤버변수:instance변수, static변수(instance변수공유변수)
	private static int numberOfPersons;  //전체 인구수
						 		//객체 생성될때마다 증가
	int age;
	String name;
	
	public Person() {
		this(12, "Anonymous");
	}
	public Person(int age, String name) {
		this.age = age;
		this.name = name;
		numberOfPersons++;
	}
	
	 void selfIntroduce() {
		System.out.printf("내 이름은 %s이며, 나이는 %d살 입니다.\n", name, age);
	
	}
	
	static int getPopulation() {
		return numberOfPersons;
	}
	
	public static void main(String[] args) {
		System.out.println("전체 인구수 : "+Person.getPopulation());
		Person person1 = new Person();
		Person person2 = new Person(28,"채희");
		display(person1);
		display(person2);
		System.out.println("전체 인구수 : "+Person.getPopulation());
	}

	private static void display(Person person) {
		System.out.println("===================");
		person.selfIntroduce();
		

	}
}
