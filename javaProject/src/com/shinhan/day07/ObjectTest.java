package com.shinhan.day07;

import java.util.Date;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;


class Car{
	private String model;
	private int price;
	public Car(String model, int price) {
		super();
		this.model = model;
		this.price = price;
	}
	
	
	//재정의
//	@Override
//	public String toString() {
//		return "Car [model=" + model + ", price=" + price + "]";
//	}

	//동등비교(예, HashSet은 중복불가) : hashCode(), equals()가 같아야 같은 객체로 판별
//	@Override
//	public int hashCode() {
//		return Objects.hash(model, price);
//	}
//
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Car other = (Car) obj;
//		return Objects.equals(model, other.model) && price == other.price;
//	}
	
	public boolean equals(Object obj) {
		if(obj instanceof Car car) {
			//Car car = (Car)obj;
			return price == car.price && model.equals(car.model);
		}
		return false;
	}

	@Override
	public int hashCode() {
		return model.hashCode()+price;
	}

	@Override
	public String toString() {
		return "모델 : "+model+" ========= 가격 :"+price;
	}
	
	
	
	
}

public class ObjectTest {

	public static void main(String[] args) {
		f5();
	}

	private static void f5() {
		Set<Car> data = new HashSet<Car>();
		data.add(new Car("A",100));
		data.add(new Car("B",100));
		data.add(new Car("C",100));
		data.add(new Car("A",100));
		data.add(new Car("A",100));
		data.add(new Car("F",100));
		for(Car s : data) {
			System.out.println(s);
			System.out.println(s.hashCode());
		}
	}

	private static void f6() {
		//Set : 순서 없음, 중복 안됨
		Set<String> data = new HashSet<String>();  //<>:제네릭스, Set은 모든 데이터 타입 가능하니까 데이터 타입 제한 
		data.add("월");
		data.add("화");
		data.add("수");
		data.add("월");
		data.add("월");
		
		for(String s:data) {
			System.out.println(s);
		}
		
	}
//
//	private static void f5() {
//		Car obj1 = new Car("A",100);  
//		Car obj2 = new Car("B",100);
//		Car obj3 = new Car("C",100);  
//		Car obj4 = new Car("D",100);
//		Car obj5 = new Car("E",100);  
//		Car obj6 = new Car("F",100);
//	}

	private static void f4() {
		Car obj1 = new Car("A",100);  
		Car obj2 = new Car("B",200);
		
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj1.equals(obj2)? "내용같다":"내용다르다");  //Car equals():내용 비교로 재정의됨
		}
	
	private static void f3() {
		Date obj1 = new Date();  
		Date obj2 = new Date();
		
		System.out.println(System.identityHashCode(obj1));
		System.out.println(System.identityHashCode(obj2));
		System.out.println(obj1 == obj2 ? "주소같다":"주소다르다"); //객체니까 주소 비교, 기본형은 값 비교
		System.out.println(obj1.equals(obj2)? "내용같다":"내용다르다");  //Date equals():내용 비교로 재정의됨
		}
	
	private static void f2() {
		String obj1 = new String("자바");  //자바 -> 내용
		String obj2 = new String("자바1");
		
		System.out.println(System.identityHashCode(obj1));
		System.out.println(System.identityHashCode(obj2));
		System.out.println(obj1 == obj2 ? "주소같다":"주소다르다"); //객체니까 주소 비교, 기본형은 값 비교
		System.out.println(obj1.equals(obj2)? "내용같다":"내용다르다");  //String equals():내용 비교로 재정의됨
		}

	
	private static void f1() {
		Object obj1 = new Object();
		Object obj2 = new Object();
		
		System.out.println(System.identityHashCode(obj1));
		System.out.println(System.identityHashCode(obj2));
		System.out.println(obj1 == obj2 ? "주소같다":"주소다르다"); //객체니까 주소 비교, 기본형은 값 비교
		System.out.println(obj1.equals(obj2)? "주소같다":"주소다르다");  //Object equals():주소비교	
		}

}
