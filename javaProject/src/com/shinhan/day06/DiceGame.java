package com.shinhan.day06;

public class DiceGame {
	public static void main(String args[]) {
		DiceGame game = new DiceGame();

		int result1 = game.countSameEye(10);
		System.out.println("면의 개수가 8개인 주사위 2개를  던져서 같은 눈이 나온 횟수 : " + result1);
		
		try {		
			int result2 = game.countSameEye(-10);
			System.out.println("면의 개수가 8개인 주사위 2개를  던져서 같은 눈이 나온 횟수 : " + result2);
		}catch(IllegalArgumentException ex) {
			System.out.println(ex.getMessage());
		}
	}

	int countSameEye(int n)  {
		if(n<0) {
			throw new IllegalArgumentException ("잘못입력, 음수 안됨");
		}
		
		Dice dice1 = new Dice(8);
		Dice dice2 = new Dice(8);
		int count = 0;
		
		for(int i=0; i<n; i++) {
			int d1 = dice1.play();
			int d2 = dice2.play();
			System.out.println(d1+"----"+d2);
			
			if(d1==d2) {
				count++;
			}
			
		}
		return count;
		
	}
}
