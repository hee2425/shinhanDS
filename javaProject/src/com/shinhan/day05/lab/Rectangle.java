package com.shinhan.day05.lab;

public class Rectangle extends Shape implements Resizable{

	double width;
	double height;
	
	Rectangle(double width, double height) {
		super(4);
		this.width = width;
		this.height = height;
	}
	
	@Override
	double getArea() {
		return width*height;
	}

	@Override
	double getPerimeter() {
		return (width + height)*2;
	}

	@Override
	public void resize(double s) {
		width=  width * s;
		height =  height * s;
	}
}
