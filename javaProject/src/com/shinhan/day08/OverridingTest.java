package com.shinhan.day08;

class MySum {
    int first;
    int second;
    
    MySum (int first, int second){
        this.first = first;
        this.second = second;
    }

	

    /* 조건1 
     * Object의 toString은 주소를 문자로 return
     */
    @Override
	public String toString() {
//		return first+second+"";  //방법 1
		return String.valueOf(first+second);  //방법2
	}




    /* 조건2 
     * Object의 equals는 주소비교
     */
    @Override
	public boolean equals(Object obj) {
    	if(!(obj instanceof MySum)) return false;
    	MySum my = (MySum)obj;
//		return first+second == (my.first+my.second);  //방법1
    	return toString().equals(my.toString());  //방법2
	}

    
    //Source>HashCode로 들어가서 생성해도 가능
    
    

}



class OverridingTest {
    public static void main(String args[]){
        int i = 10;
        int j = 20;
        
        MySum ms1 = new MySum(i, j);
        MySum ms2 = new MySum(i, j);
        String s1="30";

        System.out.println(ms1);  //30
        System.out.println(ms2.toString());  //30

        if(ms1.equals(ms2))
            System.out.println("ms1과 ms2의 합계는 동일합니다.");
        
        if(ms1.equals(s1)) {
        	System.out.println("ms1과 s1의 합계는 동일합니다.");
        }else {
        	System.out.println("ms1과 s1의 합계는 동일하지 않습니다.");
        }
        	
    }
}

