package com.inherit.model.vo;

public class OverrideParent { //extends FianlTestClass {파이널 클래스는 상속불가능하다

	public final void printMsg() {
		System.out.println("Override Parent");
	}
}
