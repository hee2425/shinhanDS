package com.shinhan.day07;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

//어노테이션 : 컴파일러가 해석하는 주석
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = {"model","price"})
@ToString
public class Computer {
	
	private String model;
	private int price;
	private String maker;
	
	
}
