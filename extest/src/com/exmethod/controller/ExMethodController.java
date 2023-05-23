package com.exmethod.controller;

public class ExMethodController {
	private int sum;
	private String str;

	public ExMethodController() {
	}

//	com.exmethod.controller.ExMethodController
//	1. 전달된 메세지를 출력하는 메소드 구현
//	2. 1~100까지 합을 반환하는 메소드구현
//	3. 전달된 정수가 홀수인지 짝수인지 반환하는 메소드구현
//	4. 전달된 문자열에 영문자가 있는지 확인하는 결과를 반환하는 메소드 구현
//	5. 문자열, 문자를 전달받아  문자열에 문자가 몇개있는지 출력하는 메소드구현
//	6. 전달된 정수의 구구단을 출력하는 메소드 구현
//
//	com.exmethod.run.Main
//	main 메소드에서 각 메소드 호출
	public void method1(String msg) {
		System.out.println("전달된 " + msg + " 메시지 출력");
	}

	public int method2() {
		for (int i = 1; i <= 100; i++) {
			this.sum += i;
		}
		return this.sum;
	}

	public String method3(int num) {
		String msg = "";
		if (num % 2 == 0) {
			msg = "짝수";
		} else {
			msg = "홀수";
		}
		return msg;
	}

	public String method4(String str) {
		String msg = "없다";
		for (int i = 0; i < str.length(); i++) {
			if ('a' <= str.charAt(i) && str.charAt(i) <= 'z' || 'A' <= str.charAt(i) && str.charAt(i) <= 'Z') {
				msg = "있다";
			}
		}
		return msg;
	}
	
	public void method5(String str) {
		int count=0;
		for(int i=0;i<str.length();i++) {
			count++;
		}
		System.out.println(count);
	}
	
	public void method6(int num) {
		for(int i=num;i<=num;i++) {
			for(int j=1;j<=9;j++) {
				System.out.println(num+" x "+j);
			}
		}
	}

}
