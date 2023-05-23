package com.inherit.model.vo;

public class BasicTest extends Parent{
	
	private int number;
	
	//생성자 활용하기
	public BasicTest() {
//		super("기본",100.5);
		super();
	}
	
	public BasicTest(String title,int number,double weight) {
		//setTitle(title);
		super(title,weight);//super가 제일 먼저 선언되야한다.!!
		this.number=number;
		//super.weight=weight; //부모에 있는 필드변수를 가져옴
		
	}
	
	public void setNumber(int number) {
		this.number=number;
	}
	public int getNumber() {
		return this.number;
	}
	//부모클래스에 선언된 필드,메소드에 접근하기
	//필드, 메소드는 접근제한자의 영향을 받는다.
	//부모클래스 필드에 선언된 변수가 private이면은
	//직접접근은 불가능하고, getter,setter를 이용해서
	//접근해야한다.
	public String infoBasicTest() {
		return getTitle()+number+weight;
	}
}
