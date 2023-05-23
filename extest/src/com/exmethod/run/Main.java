package com.exmethod.run;

import com.exmethod.controller.ExMethodController;

public class Main {

	public static void main(String[] args) {
		ExMethodController e = new ExMethodController();
		e.method1("바보");
		System.out.println(e.method2());
		System.out.println(e.method3(100));
		String msg=e.method4("123A");
		System.out.println(msg);
		e.method5("abcde");
		e.method6(2);
	}

}
