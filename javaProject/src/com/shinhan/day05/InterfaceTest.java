package com.shinhan.day05;

import java.util.ArrayList;
import java.util.List;

public class InterfaceTest {
	public static void main(String[] args) {
		f5();
	}

	private static void f5() {
		String[] arr = new String[] {"자바", "SQL", "WEB", "Spring"};
		//List, Set, Map
		//List interface : 순서있고 중복 허용  ArrayList, Vector, LinkedList
		//Set : 순서 없고 중복 불가  
		
		//배열은 정해진 타입만 넣어야하지만, ArrayList는 아무거나 넣어도됨
		ArrayList<String> data = new ArrayList();   //<>안에 데이터 타입 선언
		data.add("SQL");
		data.add("자바");
		data.add("WEB");
		data.add("자바");
		data.add("Spring");
		
		print(data);
	}
	
	
	static void print(List<String> data) {
		for(String s:data) {
			System.out.println(s);
		}
	}

	private static void f3() {
		f4(new Television());
		f4(new Audio());
	}

	//자동형변환 + override==>다형성
	//사용법은 같고, 결과는 다양하다....
	private static void f4(RemoteControl remote) {
		remote.powerOn();
		remote.powerOff();
		remote.display();
		RemoteControl.display2();  //static호출
		
		if(remote instanceof Audio audio) {
			audio.display2();
			audio.wifiTurnOn();
		}
		
		if(remote instanceof WIFI wf){
			wf.wifiTurnOn();
		}
		
	}

	private static void f1() {
		//1.객체생성
		OracleDB db = new OracleDB();
		SybaseDB db2 = new SybaseDB();
		//OracleDB사용
		//SybaseDB사용
		use(db2);
	}

	private static void use(JDBCInterface db) {
		db.dbConnect("데이터베이스!!!");
	}
}
