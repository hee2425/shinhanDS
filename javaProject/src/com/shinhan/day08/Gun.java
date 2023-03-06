package com.shinhan.day08;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Gun {
	 static int AnswerN;
		public static void main(String[] args) throws FileNotFoundException {
			System.setIn(new FileInputStream("input4.txt"));
			
			Scanner sc = new Scanner(System.in);
			int testCase = sc.nextInt();
			
			for(int k=0; k<testCase; k++) {
				int row = sc.nextInt();  
				int col = sc.nextInt(); 
				char[][] arr = new char[row][col];
				for(int i=0; i<row; i++){
					for(int j=0; j<col; j++){
						arr[i][j] = sc.next().charAt(0);
						System.out.print(arr[i][j]);
					}
//					System.out.println();
				}
				//구현하시오  
				int count = 0;
				//맨위 행 검사
				
				//맨 아래 행 검사
				//맨 왼쪽 열 검사
				//맨 오른쪽 열 검사
				//가운데 검사
				for(int i=1; i<row-1; i++) {
					for(int j=1; j<col-1; j++) {
						
						}
					}
				}
				
				
				
				System.out.println("#" + k + ":" + AnswerN);
			}
			
		}
}
