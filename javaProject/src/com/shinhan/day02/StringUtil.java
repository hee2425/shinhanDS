package com.shinhan.day02;

public class StringUtil {

	public static void hokeyGraphics(char cell, int size, boolean isRect)
    {
		for(int i=1; i<=size; i++) {
			for(int j=0; j<(isRect? size: i); j++) {
				System.out.print(cell);
			}
			System.out.println();
		}
    }
//		if (isRect) {
//			for(int i=0; i<size; i++) {
//				for(int j = 0; j<size; j++) {
//					System.out.print(cell);
//				}
//					System.out.println();
//			}
//		}else {
//			for(int i=0; i<size; i++) {
//				for(int j = 0; j<=i; j++) {
//					System.out.print(cell);
//				}
//					System.out.println();
//			}
//		}
		
			
    public static void main(String args[])  {                 
        hokeyGraphics( '$', 4, false); 
        hokeyGraphics('*', 3, true);
        hokeyGraphics('&', 3, false);
    }

}
