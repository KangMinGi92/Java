package com.bs.practice2.func;

import java.util.Scanner;

public class CastingPractice2 {
	
	public void method() {
		Scanner sc = new Scanner(System.in);
		System.out.print("국어 : ");
		double korea = sc.nextDouble();
		System.out.print("영어 : ");
		double english = sc.nextDouble();
		System.out.print("수학 : ");
		double math = sc.nextDouble();
		System.out.println("국어 : " + korea);
		System.out.println("영어 : " + english);
		System.out.println("수학 : " + math);
		System.out.println("총점 : " + (int)(korea + english + math));
		System.out.println("총점 : " + (int)(korea + english + math)/3);
	}
	
}
