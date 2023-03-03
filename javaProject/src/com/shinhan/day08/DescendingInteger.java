
package com.shinhan.day08;

import java.util.Comparator;

public class DescendingInteger implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {
		return o2-o1;  //뒤에서 앞에꺼 빼면 descending, 앞에서 뒤에 빼면 ascending
	}
	
}
