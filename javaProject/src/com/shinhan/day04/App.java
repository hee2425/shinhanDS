package com.shinhan.day04;

public class App {

	public static void main(String[] args) {
		
//		Integer a = new Integer(100);
//		Integer a2  = 100;
//		System.out.println(a.MAX_VALUE);
//		System.out.println(Integer.MAX_VALUE);
		
//		f1();
		sum(1,2);
		sum(1,2,3);
		sum(1.5,2.5);
	}
	
	static void sum(double a, double b){
		System.out.println("합계2 :"+ (a+b));
	}
	static void sum(int... arr){//가변길이  //int[] arr와 같다.
		int total = 0;
		for(int su:arr) {
			total+=su;
		}
		if(total == 0) return;  //return : 함수 나가기
		System.out.println("가변 길이 매개변수합 : "+total);
		
	}
	//메서드 오버로딩 : 메서드 이름은 같은데 매개변수 사양이 다름
	//파라미터 자동형 변환이 된다.
	
	

	private static void f1() {
		Calculator[] arr = new Calculator[4];
		Calculator.powerOn();
		
		arr[0] = new Calculator("red");  //힙 영역에 만들어짐
		arr[0].setModel("A모델");
		arr[1]= new Calculator("black");
		arr[2] = new Calculator("B모델", "blue");
		arr[3]= new Calculator("C모델", "Green", 2000);
		
		for(Calculator cc:arr) {
			print(cc);
		}
		 
		
	}

	private static void print(Calculator cal) {
		System.out.println(cal.getModel());
		System.out.println(cal.getColor());
		System.out.println(cal.getPrice());
		cal.powerOn();0
		cal.powerOff();
		System.out.println(cal.add(1,2));
		System.out.println(cal.add(1, 2));
	}

}
