package com.inherit.model.vo;

public class OverrideChild extends OverrideParent{
	//override는 메소드 선언부를 부모에 선언된 메소드와 동일하게 
	//선언해야한다.
//	public void printMsg() {
//		System.out.println("Override Child");
//	}
	//메소드 오버라이드를 할때는 어노테이션으로 표시해서 관리를 해줌.
	//어노테이션은 : @어노테이션명
	//Override가 맞는지 확인 -> 선언한 메소드가 부모클래스에 있는지 확인
	public void printMsg(String msg) {
		System.out.println("어노테이션으로 오버라이드");
	}
//	@Override
//	public void printMsg() {
//		System.out.println("자식 클래스에서 재정의"); //Parent 클래스에서 파이널 메소드로 선언해서 오버라이딩 불가능!!
//	}
	

}
