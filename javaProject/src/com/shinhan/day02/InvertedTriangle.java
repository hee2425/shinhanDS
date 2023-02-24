package com.shinhan.day02;

import java.util.Scanner;

public class InvertedTriangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int rowCount = sc.nextInt();
		
		for(int row=1; row<=rowCount; row++) {
			for(int col=1; col<=rowCount+1-row; col++) {
				System.out.print("*"); 
			}
			System.out.println();
		}
	}

}
