package com.shinhan.day07;

import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ObjectTest5 {

	public static void main(String[] args) throws ClassNotFoundException, IOException {
		f7();
	}

	private static void f7() throws IOException {
		InputStream is = ObjectTest5.class.getResourceAsStream("CellPhone.class");
		InputStreamReader ir = new InputStreamReader(is);
		int i;
		while((i = ir.read())!=-1) {
			System.out.print((char)i);
		}
		is.close();
		
		URL url2 = ObjectTest5.class.getResource("dog.jfif");
		System.out.println(url2.getPath());
	}

	private static void f6() throws IOException {
		FileReader fr = new FileReader("src/com/shinhan/day07/CellPhone.java");
		int i;
		while((i = fr.read())!=-1) {
			System.out.print((char)i);
		}
		fr.close();
	}

	private static void f5() throws ClassNotFoundException {
		Class cls = CellPhone.class;
		Class cls2 = Class.forName("com.shinhan.day07.CellPhone");
		CellPhone phone = new CellPhone("AA");
		Class cls3 = phone.getClass();
		
//		Constructor[] constructors = cls.getDeclaredConstructors();
//		for(Constructor con:constructors) {
//			System.out.println(con.getModifiers());
//		}
		
//		Field[] fs = cls.getDeclaredFields();
//		System.out.println(fs.length);
//		for(Field f:fs) {
//			System.out.println(f.getName());
//			System.out.println(f.getType().getSimpleName());
//		}
		
		Method[] ms = cls.getDeclaredMethods();
		for(Method m:ms) {
			System.out.println(m.getName());
			System.out.println(m.getParameterCount()+"개 파라메터");
		}
	}

	private static void f4() {
		String p1 = "[A~Za~z0~9]+@(\\w+)\\.\\w+"; // \\d숫자 역슬래시 두개여야 하나로인식
		String data = "zzahee366@gmail.com, aaa@naver.com, bbb@daum.net";
		Pattern pattern = Pattern.compile(p1);
		Matcher matcher = pattern.matcher(data);
		
		
	}
	
	private static void f3() {
		String p1 = "010-[0~9]{3,4}-\\d{4}"; // \\d숫자 역슬래시 두개여야 하나로인식
		String data = "010-1234-5678 이곳으로 연락바람 010-7895-6321 혹은 010-1586-8954";
		Pattern pattern = Pattern.compile(p1);
		Matcher matcher = pattern.matcher(data);
		while(matcher.find()) {
			System.out.println(matcher.group());
		}
	}
	
	private static void f2() {
		String p1 = "[A~Za~z0~9]+@\\w+\\.\\w+"; // \\d숫자 역슬래시 두개여야 하나로인식
		String data = "zzahee366@gmail.com";
		boolean result = Pattern.matches(p1, data);
		System.out.println(result?"OK":"NO");
		
	}
	
	private static void f1() {
		String p1 = "010-[0~9]{3,4}-\\d{4}"; // \\d숫자 역슬래시 두개여야 하나로인식
		String data = "010-1234-5678";
		boolean result = Pattern.matches(p1, data);
		System.out.println(result?"NO":"OK");
		
	}
	

}
