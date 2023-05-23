package com.bs.practice.func;

import java.util.Scanner;

public class OperatorPractice {
	public void practice1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int num1 = sc.nextInt();
		System.out.println(num1 > 0 ? "양수다" : "양수가 아니다");
		}
	public void practice2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int num1 = sc.nextInt();
		System.out.println( num1 <= 0 ? num1 == 0 ? "0이다" : "음수다" : "양수다");
		}
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int num1 = sc.nextInt();
		System.out.println(num1%2 == 0 ? "짝수다" : "홀수다");
		}
	public void practice4() {
		Scanner sc = new Scanner(System.in);
		System.out.print("인원 수 : ");
		int person = sc.nextInt();
		System.out.print("사탕 개수 : ");
		int candy = sc.nextInt();
		int result1 = candy / person;
		int result2 = candy % person;
		System.out.println("1인당 사탕 개수 : " + result1);
		System.out.println("남는 사탕 개수 : " + result2);
		}
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 : ");
		String name = sc.next(); 
		System.out.print("학년(숫자만) : ");
		int grade = sc.nextInt();
		System.out.print("반(숫자만) : ");
		int classNum = sc.nextInt();
		System.out.print("번호(숫자만) : ");
		int number = sc.nextInt();
		System.out.print("성별(M/F) : ");
		char gender = sc.next().charAt(0);
		System.out.print("성적(소수점 아래 둘째자리까지) : ");
		double score = sc.nextDouble();
		String result = gender == 'M' ? "남학생" : "여학생";
		System.out.println(grade + "학년 " + classNum + "반 " + number + "번 " + name+ " "
				+ result+"의" + " 성적은 " + score + "이다.");
		}
	public void practice6() {
		Scanner sc = new Scanner(System.in);
		System.out.print("나이 : ");
		int age = sc.nextInt();
		System.out.println(age > 13 ? age > 19? "성인" : "청소년" : "어린이");
		}
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		System.out.print("국어 : ");
		int korea = sc.nextInt();
		System.out.print("영어 : ");
		int english = sc.nextInt();
		System.out.print("수학 : ");
		int math = sc.nextInt();
	
		int sum = korea + english + math;
		double average = sum / 3.0;
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + average);
		System.out.println(korea >= 40 && english >= 40 && math >= 40 && average >= 60 ? "합격" : "불합격");
		}
	public void practice8() {
		Scanner sc = new Scanner(System.in);
		System.out.print("주민번호를 입력하세요(- 포함) : ");
		char number = sc.next().charAt(8);
		System.out.println(number == '1' ? "남자" : "여자");
		}
	public void practice9() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수1 : ");
		int num1 = sc.nextInt();
		System.out.print("정수2 : ");
		int num2 = sc.nextInt();
		System.out.print("입력 : ");
		int num3 = sc.nextInt();
		System.out.println(num1 < num2 ? num1 < num3 && num3 <= num2 ? "false ": "true" : "조건불만족");
		}
	public void practice10() {
		Scanner sc = new Scanner(System.in);
		System.out.print("입력1 : ");
		int num1 = sc.nextInt();
		System.out.print("입력2 : ");
		int num2 = sc.nextInt();
		System.out.print("입력3 : ");
		int num3 = sc.nextInt();
		System.out.println(num1 == num2 && num2 == num3 ? "true" : "false");
		}
	public void practice11() {
		Scanner sc = new Scanner(System.in);
		System.out.print("A사원의 연봉 : ");
		int money1 = sc.nextInt();
		System.out.print("B사원의 연봉 : ");
		int money2 = sc.nextInt();
		System.out.print("C사원의 연봉 : ");
		int money3 = sc.nextInt();
		double aIncen = money1 + money1 * 0.4;
		double bIncen = money2;
		double cIncen = money3 + money3 * 0.15;
		double aTotal = money1 + aIncen - money1;
		double bTotal = money2 + bIncen - money2;
		double cTotal = money3 + cIncen - money3;
		System.out.println("A사원 연봉/연봉+a : " + money1 + "/" + aIncen + " = " + aTotal);
		System.out.println(aTotal > 3000 ? "3000 이상" : "3000 미만");
		System.out.println("B사원 연봉/연봉+a : " + money2 + "/" + bIncen + " = " + bTotal);
		System.out.println(bTotal > 3000 ? "3000 이상" : "3000 미만");
		System.out.println("C사원 연봉/연봉+a : " + money3 + "/" + cIncen + " = " + cTotal);
		System.out.println(cTotal > 3000 ? "3000 이상" : "3000 미만");
	}
}
