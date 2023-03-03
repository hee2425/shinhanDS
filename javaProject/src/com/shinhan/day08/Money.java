package com.shinhan.day08;

public class Money implements Comparable<Money> {
    int amount;
    public Money(int amount) {
        this.amount = amount;
    }
    public Money add(Money money) {
        //더하기 구현	
    	return new Money(amount+money.amount);
    	
    }
    public Money minus(Money money) {
        //빼기 구현
    	return new Money(amount-money.amount);
    	
    }
    public Money multiply(Money money) {
        //곱하기 구현
    	return new Money(amount*money.amount);
    }
    public Money devide(Money money) {
        //나누기 구현
    	return new Money(amount/money.amount);
    } 
    public boolean equals(Object object) {
        //Object equals 메쏘드 재정의
    	if(this==object) return true;  //주소 같으면 같다
    	if(object==null || getClass()!=object.getClass()) return false;
    	return amount == ((Money)object).amount;
    }
    
    @Override
	public String toString() {
		return amount+"";
	}
    
	public static void main(String[] args){
        Money five  = new Money(5);
        Money two   = new Money(2);
        Money three = new Money(3);
        Money ten   = new Money(10);
        
        System.out.println(five);
        System.out.println(two.add(three));
        
        if( five.equals(two.add(three))
            && three.equals(five.minus(two))
            && ten.equals(five.multiply(two))
            && two.equals(ten.devide(five)) )  {
            System.out.println("Money Class 구현을 완료 하였습니다.");
        }
    }
	@Override
	public int compareTo(Money obj) {
		
		return amount - obj.amount;  //-1,0,1 acending sort
//		return obj.amount - amount;  //decending sort
	}
}
