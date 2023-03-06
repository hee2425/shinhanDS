package com.shinhan.day09;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadPoolTest {
	public static void main(String[] args) {
		f2();
	}

	//Callable 인터페이스 구현하여 thread사용...return 있음
	private static void f2() {
		String[][] mails = new String[1000][3];
		for(int i=0; i<mails.length; i++) {
			mails[i][0] = "admin@my.com";
			mails[i][1] = "member"+i+"@my.com";
			mails[i][2] = "신상품 입고.....";
		}
		ExecutorService service= Executors.newFixedThreadPool(5);
		for(int i=1; i<=100; i++) {
			
			int index = i;
			Future<Integer> future =  service.submit(new Callable<Integer>() {

				@Override
				public Integer call() throws Exception {
					int sum=0;
					for(int j=1; j<=index; j++) {
						sum += j;
					}
					return sum;
				}
			});
			int result;
			try {
				result = future.get();
				System.out.println("future.get() : "+index +"까지 합계는 "+result);
			} catch (InterruptedException | ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		service.shutdown();
	}

	//Runnable인터페이스 구현하여 thread사용...return 없음
	private static void f1() {
		String[][] mails = new String[1000][3];
		for(int i=0; i<mails.length; i++) {
			mails[i][0] = "admin@my.com";
			mails[i][1] = "member"+i+"@my.com";
			mails[i][2] = "신상품 입고.....";
		}
		ExecutorService service= Executors.newFixedThreadPool(5);
		for(int i=0; i<1000; i++) {
			final int index = i;
			service.execute(new Runnable() {  //runnable이라는 내부 클래스를 이용한 구현 클래스,  내부클래스에서는 final변수만 사용가능
				@Override
				public void run() {
					String tname = Thread.currentThread().getName();
					System.out.println(tname+" from "+mails[index][0] + 
							" to "+mails[index][1]+
							"content :"+mails[index][2]);
				}
			});
		}
		
	}
}
