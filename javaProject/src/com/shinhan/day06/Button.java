package com.shinhan.day06;

public class Button {
	//field
	ClickListener listener;
	
	//method
	void setListener(ClickListener listener) {
		this.listener = listener;
	}
	public void buttonClick() {
		listener.onClick();
	}
	
	
	//내부 interface...규격서
	static interface ClickListener{
		void onClick();
		
	}
}
