package com.shinhan.day08;

import java.util.Arrays;
import java.util.Comparator;

public class SortTest {
	public static void main(String[] args) {
		f4();
	}
	
	private static void f4() {
		Car[] car = {new Car("A",1000), new Car("B",500), new Car("C",450),new Car("D",830),new Car("E",830)};
//		System.out.println("before : "+Arrays.toString(car));
//				
//		Arrays.sort(car);  // Comparable인터페이스를 구현하지 않으면 비교 불가
//		System.out.println("after : "+Arrays.toString(car));
		print("before",car);
		Arrays.sort(car);//Comparable인터페이스를 구현하지 않으면비교 불가
		print("가격 asc, 모델 asc after",car);
		
		Arrays.sort(car, new Comparator<Car>() {

			public int compare(Car o1, Car o2) {
				int result = o1.price - o2.price;
				if(result == 0) return o2.model.compareTo(o1.model);
				return result;
			}
		
		});
		print("가격asc, 가격 desc after",car);
	}
	private static void print(String title, Car[] arr) {
		System.out.println("======"+title+"======");
		for(Car car:arr) {
			System.out.println(car);
		}
	}

	private static void f3() {
		Money[] arr = {new Money(10), new Money(5), new Money(4),new Money(9),new Money(8)};
		System.out.println("before : "+Arrays.toString(arr));
		Arrays.sort(arr);		
		  // Comparable인터페이스를 구현하지 않으면 비교 불가
		System.out.println("asc after : "+Arrays.toString(arr));
		
		Arrays.sort(arr, new Comparator<Money>() {

			public int compare(Money o1, Money o2) {
				return o2.amount - o1.amount;
			}
			
		});  // Comparator인터페이스를 익명구현
		System.out.println("desc after : "+Arrays.toString(arr));
	}

	private static void f2() {
		//ASCII code : 'A':65, 'a':97
		String[] arr = {"Spring","Java","Jsp", "CSS","HTML","React"};
		System.out.println("before : "+Arrays.toString(arr));
		
		Arrays.sort(arr);
		System.out.println("after : "+Arrays.toString(arr));
		Arrays.sort(arr, new Comparator<String>() {
			public int compare(String o1, String o2) {
				return o2.compareTo(o1);
			}	
		});
		System.out.println("desc after : " + Arrays.toString(arr));
	}
	
	private static void f1() {
		Integer[] arr = new Integer[] {100,80,90,20,99};
		System.out.println("before : "+Arrays.toString(arr));
		
		Arrays.sort(arr);
		System.out.println("after : "+Arrays.toString(arr));
		
		Arrays.sort(arr, new DescendingInteger());;
		System.out.println("desc : "+Arrays.toString(arr));
	}
}
