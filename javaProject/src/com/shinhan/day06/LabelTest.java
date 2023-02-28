package com.shinhan.day06;

public class LabelTest {

	public static void main(String[] args) {
		Label v1 = new Label("이릅입력",20,5,"black","large");
		Resizable v2 = new Label("이릅입력",20,5,"black","large");
		Colorable v3 = new Label("이릅입력",20,5,"black","large");
		Changable v4 = new Label("이릅입력",20,5,"black","large");
	
		work(v1);
//		work(v2);
//		work(v3);
		work(v4);
	}
	
	
	//자동형변환 : 부모의타입 객체참조변수 = 자식객체
	static void work(Changable aa) {
		//하위가 상위에 들어갈 수 있다..!!
		//상위는 하위에 못들어감
		if(aa instanceof Label label) {
			label.setForeground(null);
			label.setForeground(null);
			label.setFont(null);
			label.size(0,0);
		}
	}

}
