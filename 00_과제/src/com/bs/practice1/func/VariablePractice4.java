package com.bs.practice1.func;

import java.util.Scanner;


public class VariablePractice4 {

	public void method() {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열을 입력하세요 : ");
		String str = sc.next();
		char ch1 = str.charAt(0);
		char ch2 = str.charAt(1);
		char ch3 = str.charAt(2);
		System.out.print("첫 번째 문자 : " + ch1 + "\n");
		System.out.print("두 번째 문자 : " + ch2 + "\n");
		System.out.print("세 번째 문자 : " + ch3 + "\n");
	}

}
