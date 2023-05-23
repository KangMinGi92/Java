package com.obj.run;

import com.obj.model.vo.StaticTest;

public class Staticmain {

	public static void main(String[] args) {
		//static예약어에 대해 알아보자
		//필드, 메소드, 초기화블록에 사용할 수 있다.
		//static으로 선언된 필드에 접근하려면
		//선언된 클래스명을 이용해서 접근을 해야한다.
		//static필드는 프로젝트내에서 공용으로 사용하는 저장공간
		StaticTest.test="접근되니?";
		System.out.println(StaticTest.test);
		StaticTest st = new StaticTest();
//		st.test="생성된 객체로 접근"; //컴파일 에러는 뜨지 않지만 static필드에 선언된 변수를 사용할때는 위의방식으로 사용하라고 문구 띄어줌!!
		StaticTest.test="생성된 객체로 접근";
		
		//static으로 선언된 메소드 실행하기
		StaticTest.testMethod();

		//Math.random();//static으로 선언된 메소드의 예
		
		//static으로 선언된 필드, 메소드도 접근제한자의 영향을 받는다.
		//static필드는 접근제한자를 private으로 선언한다.
		//StaticTest.count=100;
		StaticTest.setCount(100);
		//System.out.println(new StaticTest().getCount()); //new로 생성해서 사용했지만, static영역에 저장한 값을 공유하기 때문에 문제 없이 출력가능
		System.out.println(StaticTest.getCount());
		
		
		
	}

}
