package com.shinhan.day06;

public class Chap11 {
	public static void main(String[] args) {
		f2();
	}

	public static void f2() {
		
		class NotExistIDException extends Exception{
			NotExistIDException(){}
			NotExistIDException(String message) throws NotExistIDException{
				throw new NotExistIDException(message+"login()메소드에 존재하지 않는 ID입니다.");
			}
			public static void NotExistIDException() {
				// TODO Auto-generated method stub
				
			}
		}
		
		class WrongPasswordException extends Exception{
			WrongPasswordException(){}
			WrongPasswordException(String message) throws WrongPasswordException{
				throw new WrongPasswordException(message+"login()메소드에 존재하지 않는 ID입니다.");
			}
			public static void WrongPasswordException() {
				// TODO Auto-generated method stub
				
			}
		}
		
		class LoginExample{
			public static void main(String[] args) {
				try {
					login("whilte","12345");
				}catch(Exception e) {
					System.out.println(e.getMessage());
				}
				
				try {
					login("blue","54321");
					
				}catch(Exception e) {
					System.out.println(e.getMessage());
				}
			}
			
			public static void login(String id, String password) throws NotExistIDException, WrongPasswordException{
				if(!id.equals("blue")) {
					NotExistIDException.NotExistIDException();
				}
				if(!password.equals("12345")) {
					WrongPasswordException.WrongPasswordException();
				}
			}
		}
	}

	private static void f1() {
		String[] strArray= {"10","2a"};
		int value = 0;
		for(int i=0; i<=2; i++) {
			try {
				value = Integer.parseInt(strArray[i]);
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("인덱스를 초과했음");
			}catch(NumberFormatException e) {
				System.out.println("숫자로 변환할 수 없음");
			}finally {
				System.out.println(value);
			}
		}
	}
}
