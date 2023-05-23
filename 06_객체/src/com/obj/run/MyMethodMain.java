package com.obj.run;

import com.obj.basiccontroller.MyMethod;

public class MyMethodMain {

	public static void main(String[] args) {
		MyMethod mmt=new MyMethod(); 
		mmt.method1();
		int sum = mmt.method2();
		System.out.println(sum);
		String summtsg=mmt.method3();
		System.out.println(summtsg);//System.out.println(mmt.method3);와 서로 같은말을 다르게 표현한 코딩
		mmt.method4(1,2,'+');
		double result=mmt.method5(10,20,'*');
		System.out.println(result);
//		if(mmt.method5(10,20,'*')<100) { //메소드 호출해온값은 어디에도 사용할 수 있다.
//			
//		}
		
		String msg=mmt.method6("apple");
		System.out.println(msg);
		

	}

}
