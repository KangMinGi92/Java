package com.inter.common;

public interface ParentInterface {
	
	int add(int su, int su2);
	
	String addstr(String str, String str2);
	
	default public void test() {//Interface내에서도 디폴트생성자를 이용해서 기본 메소드를 생성할 수 있다.!!
		System.out.println("default메소드 추가");
	}

}
