package com.shinhan.day03;

public class ComputerTest {

	public static void main(String[] args) {
		f1();
	}

	private static void f1() {
		System.out.println("생성된 컴퓨터 개수 : "+Computer.count);
		
		Computer com1 = new Computer();
		System.out.println("생성된 컴퓨터 개수 : "+Computer.count);
		Computer com2 = new Computer("Samsung");
		System.out.println("생성된 컴퓨터 개수 : "+Computer.count);
		Computer com3 = new Computer("Window",100);
		System.out.println("생성된 컴퓨터 개수 : "+Computer.count);
		Computer com4 = new Computer("LG", "Linux", 300);
//		System.out.println("생성된 컴퓨터 개수 : "+com1.count);
//		System.out.println("생성된 컴퓨터 개수 : "+com2.count);
//		System.out.println("생성된 컴퓨터 개수 : "+com3.count);
//		System.out.println("생성된 컴퓨터 개수 : "+com4.count);
		System.out.println("생성된 컴퓨터 개수 : "+Computer.count);
		
		display(com1);
		display(com2);
		display(com3);
		display(com4);
	}

	private static void display(Computer com) {
		System.out.println("===================");
		System.out.println(com.getModel());
		com.computerInfoPrint();
	}

}
