package com.obj.run;

import java.util.Arrays;

import com.obj.basiccontroller.MethodTest;
import com.obj.model.vo.Animal;


public class MethodMain {

	public static void main(String[] args) {
		//클래스에 선언된 메소드 호출하기
		//클래스의 멤버메소드를 호출하려면 클래스를 객체로 생성해야한다.
		MethodTest mt = new MethodTest();
		mt.printMsg();
		//반환형이 있는 메소드 호출하기
		int result=mt.plus();
		System.out.println(result);
		mt.printSendMsg("중근씨 힘내요! 커피살 수 있다!");
		mt.printSendMsg("여러분 월요병은 안되요!!");
		String data="안녕";
		mt.printSendMsg(data);
		result=mt.complexNumber(20, 30);
		System.out.println(result);
//		mt.numberTest();
//		mt.numberTest();
//		mt.numberTest();
//		new MethodTest().numberTest(); //new numberTest를 불러오면 새로운걸 계속 만들어서 
//		new MethodTest().numberTest(); //필드에 선언한 멤버변수가 각각 새롭게 heap영역에 생성되므로 count+=1이 누적되지 않는다.!!!
//		new MethodTest().numberTest();
		
		int[] intArr=mt.testReturn();//배열을 반환받자!
		System.out.println(Arrays.toString(intArr));
		Animal a=mt.makeAnimal();
		System.out.println(a);
		System.out.println(a.type+a.name+a.weight);
		mt.paramArr(intArr);
		mt.paramObj(a,"강아지");
		System.out.println(a.type+a.name+a.weight);
		
		//매개변수, 반환형으로 배열이나 객체를 선언했을때는 heap영역의
		//주소를 공유하게됨, -> 원본값을 수정할 수 있게 됨.
		
		int su =10; 
		mt.changeInt(su);
		int[] numbers= {1,2,3,4};
		mt.changeIntArr(numbers);
		System.out.println(su);
		System.out.println(numbers[0]);
//		su=mt.changeInt(su);
//		System.out.println(su);
		//main메소드 매개변수 넣기!!
		System.out.println(args);
		for(String arg : args)
		System.out.println(arg);
	}

}

