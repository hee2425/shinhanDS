package com.shinhan.day03;

public class PersonTest {

	public static void main(String[] args) {
		System.out.println(Person.getPopulation());
		
		Person[] persons = new Person[100];
		
		persons[0] = new Person();
		persons[1] = new Person(30,"홍길동");
		persons[2] = new Person(40,"김길동");
		
		for(Person p:persons) {
			p.selfIntroduce();
		}
		System.out.println(Person.getPopulation());
		
	}

}
