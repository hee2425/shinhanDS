package com.shinhan.day04;


//업무 로직은 없다.
//VO (Value Object) : data를 저장하는 가방이다.
//DTO(Data Transfer Object) : data를 저장해서 전송하려는 목적으로 만든 클래스다.
//JavaBeans기술에서 사용한다.
//멤버변수는 private으로 설정, 멤버메소드는 public으로 설정한다.
//JspServlet, Spring, Mybatis framework에서 사용됨.

//final : 변수(값 수정불가), 메서드(오버라이드 불가), 클래스(상속 불가)
public class BookVO {
	//static안붙어서 instance변수
	private String title;  
	private int price;
	//class변수
	static int count;
	//final : 수정불가, instance변수(static없음), 선언시 or 생성시 초기화
	final String isbn =  "12345";
	final String isbn2;
	//static final : 수정불가, 상수, class변수, 선언시 초기화만 가능
	//관례상 상수는 대문자로 쓴다.
	static final String PUBLISHER = "한빛";
	
	BookVO(String title, int price){
		super();
		this.title = title;
		this.price = price;
		isbn2 =  title+"678910";
		count++;
	}

	public String getTitle() {
		return title;
	}

	public int getPrice() {
		return price;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "BookVO [title=" + title + ", price=" + price + "]";
	}

	
}
