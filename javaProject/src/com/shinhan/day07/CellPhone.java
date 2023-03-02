package com.shinhan.day07;

public class CellPhone {
	String model;
	double battery;
	
	public CellPhone(String model){
		this.model = model;
	}
	
	void call(int time) {
		if(time<0) {
			//강제 Exception발생, 처리는 안함, RuntimeException에 속한 Exception은 자동으로 throws(던져진다.)
			throw new IllegalArgumentException("통화시간입력오류");
		}
		battery -= time*0.5;
		if(battery<0) battery = 0;
		System.out.println("통화 시간 : "+time+"분");
	}
	
	void charge(int time) {
		if(time<0) {
			throw new IllegalArgumentException("충전시간입력오류");
		}
		battery += time*3;
		if(battery>100) battery = 100;
		System.out.println("충전시간 : "+time+"분");
	}

	public void printBattery() {
		System.out.println("남은 배터리 양 : "+ battery);
	}
	
	//오버라이드 : 함수이름, 매개타입과 개수, 
	//return타입이 모두 같아야하고 접근제한자는 같거나 더 넓어져야함
	//오버로딩 : 매개타입과 개수가 다르면 오버로딩
	public boolean equals(Object obj) {
//		CellPhone p = (CellPhone) obj;
//		return this.model == p.model;
		
		if(obj instanceof CellPhone p) {
			return this.model.equals(p.model);
		}
		return false;
	}
	
	
	//== : 기본형비교
	//equals : 객체비교 - 기본적으로 주소값 비교이므로 값 비교하도록 오버라이딩 해야한다.
	//instanceof : 참조변수 형변환 가능 여부 확인
	
	//**데이터 타입에 따른 분류
	//기본자료형(기본변수) : int, double, boolean, char등
	//객체자료형(참조변수) : String, System, ArrayList등
	
	//**선언위치에 따른 분류
	//멤버변수 : 클래스 영역에 선언된 변수 - 클래스 변수, 인스턴스 변수
	//클래스 변수 : static이 붙은 변수
	//인스턴스 변수 : 클래스 영역에 선언되고 인스턴스 생성시 만들어짐(new)
	//지역변수 : 메소드 안에서 선언되고 메소드 안에서만 사용가능
	//매개변수 : 파라미터. 메소드에서 입력값을 받는 변수, 매개변수 또한 지역 변수
}
