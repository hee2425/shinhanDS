package com.shinhan.day08;

import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class Car implements Comparable<Car>{
	String model;
	int price;
	@Override
	public int compareTo(Car obj) {
		int result = price-obj.price;
		if(result == 0) obj.model.compareTo(model);
		return price-obj.price;
	}
	
}
