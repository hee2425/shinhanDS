package com.shinhan.day05.lab;

public class ShapTest {
	public static void main(String[] args) {
		Shape[] arr = new Shape[2];
		arr[0] = new Rectangle(5,6);
		arr[1] = new RecTriangle(6,2);
		
		for(Shape aa:arr) {
			System.out.println("area : "+aa.getArea());
			System.out.println("perimeter : "+aa.getPerimeter());
			
			if(aa instanceof Resizable re) {
				re.resize(0.5);
				System.out.println("area : "+aa.getArea());
				System.out.println("perimeter : "+aa.getPerimeter());
			}
		}
	}
}
