package com.shinhan.day04;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SDS_기지국 {

	static int N;
	static int AnswerN;
	public static void main(String[] args) throws FileNotFoundException {		
		System.setIn(new FileInputStream("src/swExam/sample_input1.txt"));
		char[][] map=null; 
		Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();
        for(int n=1; n<=testCase; n++){
        	N = sc.nextInt();
        	map = new char[N][N];
        	for(int i=0; i<N; i++){
        		for(int j=0; j<N; j++){
        			map[i][j] = sc.next().charAt(0);
        			System.out.print(map[i][j]);
        		}
        		System.out.println();
        	}
        	//구현

        	///////////////// 
        	AnswerN=0;
            for(int i=0; i<N; i++){
        		for(int j=0; j<N; j++){
        			if(map[i][j]=='H') AnswerN++;
        			System.out.print(map[i][j]);
        		}
        		System.out.println();
            }
            System.out.println(n+"...결과=>"+AnswerN);

        }  	 
	}  

}
