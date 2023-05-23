package com.bs.variable;

import java.util.Scanner;

		//학생정보를 입력받고 출력하는 기능 구현하기
		//이름, 나이, 성별(남,여), 학년, 반, 번호, 키, 주소, 이메일 입력받고
		//입력받은 내용을 출력하기
		//com.bs.variable.StudentInfo클래스를 생성해서 구현할것.
		//1. 입력받은 값을 출력 바로출력
		//2. 한번에 출력
		// 유병승 19 남 1 3 3 180.5 경기도 시흥시 teacherdev09@gmail.com

public class StudentInfo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요 : ");
		String name = sc.next();
		System.out.println("이름은 : " + name);
		
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();
		System.out.println("나이는 : " + age);
		
		System.out.print("성별(남/여)를 입력하세요 : ");
		char gender = sc.next().charAt(0);
		System.out.println("성별은 : " + gender);
		
		System.out.print("학년을 입력하세요 : ");
		int grade = sc.nextInt();
		System.out.println("학년은 : " + grade);
		
		System.out.print("반을 입력하세요 : ");
		int classNumber = sc.nextInt();
		System.out.println("반은 : " + classNumber);
		
		System.out.print("번호를 입력하세요 : ");
		int number = sc.nextInt();
		System.out.println("번호는 : " + number);
		
		System.out.print("키를 입력하세요 : ");
		double height = sc.nextDouble();
		System.out.println("키는 : " + height);
		
		sc.nextLine();
		System.out.print("주소를 입력하세요 : ");
		String address = sc.nextLine();
		System.out.println("주소는 : " + address);
		
		System.out.print("이메일을 입력하세요 : ");
		String email = sc.nextLine();
		System.out.println("이메일은 : " + email);
		
		String studentInfo = name + " " + age + " " + gender + " " + grade +
				" " + classNumber + " " + number + " " + height + " " + address + " " + email;
		System.out.println(studentInfo);
	
		
				
		
		

	}

}
