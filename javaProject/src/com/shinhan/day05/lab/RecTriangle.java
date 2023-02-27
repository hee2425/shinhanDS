package com.shinhan.day05.lab;

public class RecTriangle extends Shape {

	int width;
	int height;
	RecTriangle(int width, int height) {
		super(3);
		this.width = width;
		this.height = height;
	}
	
	@Override
	double getArea() {
		return width*height/2;
	}

	@Override
	double getPerimeter() {
		return width + height+ Math.sqrt(width*width + height*height);
	}
}
