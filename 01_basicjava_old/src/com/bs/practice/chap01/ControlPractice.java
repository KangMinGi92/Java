package com.bs.practice.chap01;

import java.util.Scanner;

public class ControlPractice {
	public void practice1() {
		System.out.println("1. 입력");
		System.out.println("2. 수정");
		System.out.println("3. 조회");
		System.out.println("4. 삭제");
		System.out.println("7. 종료");
		System.out.print("메뉴 번호를 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		switch (num) {
		case 1:
			System.out.println("입력 메뉴입니다.");
			break;
		case 2:
			System.out.println("수정 메뉴입니다.");
			break;
		case 3:
			System.out.println("조희 메뉴입니다.");
			break;
		case 4:
			System.out.println("삭제 메뉴입니다.");
			break;
		case 7:
			System.out.println("종료 메뉴입니다.");
			break;
		}
	}// pracice1()

	public void practice2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 한 개 입력하세요 : ");
		int num = sc.nextInt();
		if (num > 0 && num % 2 == 0) {
			System.out.println("짝수다");
		} else if (num % 2 == 1) {
			System.out.println("홀수다");
		} else {
			System.out.println("양수만 입력해주세요.");
		}
	}// practice2()

	public void practice3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("국어점수 : ");
		int korea = sc.nextInt();
		System.out.print("수학점수 : ");
		int math = sc.nextInt();
		System.out.print("영어점수 : ");
		int english = sc.nextInt();
		int sum = korea + math + english;
		double average = sum / 3;
		if (korea >= 40 && math >= 40 && english >= 40 && average >= 60) {
			System.out.println("국어 : " + korea);
			System.out.println("수학 : " + math);
			System.out.println("영어 : " + english);
			System.out.println("합계 : " + sum);
			System.out.println("평균 : " + average);
			System.out.println("축하합니다, 합격입니다!");
		} else {
			System.out.println("불합격입니다.");
		}
	}// practice3()

	public void practice4() {
		Scanner sc = new Scanner(System.in);
		System.out.print("1~12 사이의 정수 입력 : ");
		int month = sc.nextInt();
		switch (month) {
		case 12:
			System.out.println(month + "월은 겨울입니다.");
			break;
		case 1:
			System.out.println(month + "월은 겨울입니다.");
			break;
		case 2:
			System.out.println(month + "월은 겨울입니다.");
			break;
		case 3:
			System.out.println(month + "월은 봄입니다.");
			break;
		case 4:
			System.out.println(month + "월은 봄입니다.");
			break;
		case 5:
			System.out.println(month + "월은 봄입니다.");
			break;
		case 6:
			System.out.println(month + "월은 여름입니다.");
			break;
		case 7:
			System.out.println(month + "월은 여름입니다.");
			break;
		case 8:
			System.out.println(month + "월은 여름입니다.");
			break;
		case 9:
			System.out.println(month + "월은 가을입니다.");
			break;
		case 10:
			System.out.println(month + "월은 가을입니다.");
			break;
		case 11:
			System.out.println(month + "월은 가을입니다.");
			break;
		default:
			System.out.println(month + "월은 잘못 입력된 달입니다.");
			break;
		}
	}// practice4()

	public void practice5() {
		Scanner sc = new Scanner(System.in);
		System.out.print("아이디 : ");
		String userId = sc.next();
		System.out.print("비밀번호 : ");
		String password = sc.next();
		if (userId.equals("myId") && password.equals("myPassword12")) {
			System.out.println("로그인 성공");
		} else if (userId.equals("myId") && !password.equals("myPassword12")) {
			System.out.println("비밀번호가 틀렸습니다.");
		} else if (!userId.equals("myId") && password.equals("myPassword12")) {
			System.out.println("아이디가 틀렸습니다.");
		}
	}// practice5()

	public void practice6() {
		Scanner sc = new Scanner(System.in);
		System.out.print("권한을 확인하고자 하는 회원 등급 : ");
		String grade = sc.next();
		switch (grade) {
		case "관리자":
			System.out.println("회원관리, 게시글 관리, 게시글 작성, 게시글 조회, 댓글 작성");
			break;
		case "회원":
			System.out.println("게시글 작성, 게시글 조회, 댓글 작성");
			break;
		case "비회원":
			System.out.println("게시글 조회");
			break;

		}
	}// pracice6()

	public void practice7() {
		Scanner sc = new Scanner(System.in);
		System.out.print("키(m)를 입력해 주세요 : ");
		double height = sc.nextDouble();
		System.out.print("몸무게(kg)를 입력해 주세요 : ");
		double weight = sc.nextDouble();
		double bmi = weight / (height * height);
		System.out.println("BMI 지수 : " + bmi);
		int check = 0;
		if (bmi < 18.5) {
			check = 1;
		} else if (bmi >= 18.5 && bmi < 23) {
			check = 2;
		} else if (bmi >= 23 && bmi < 25) {
			check = 3;
		} else if (bmi >= 25 && bmi < 30) {
			check = 4;
		} else if (bmi >= 30) {
			check = 5;
		}
		switch (check) {
		case 1:
			System.out.println("저체중");
			break;
		case 2:
			System.out.println("정상체중");
			break;
		case 3:
			System.out.println("과체중");
			break;
		case 4:
			System.out.println("비만");
			break;
		case 5:
			System.out.println("고도 비만");
			break;
		}
	}// practice7()

	public void practice8() {
		Scanner sc = new Scanner(System.in);
		System.out.print("피연산자1 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("피연산자2 입력 : ");
		int num2 = sc.nextInt();
		System.out.print("연산자를 입력(+,-,*,/,%) : ");
		String str = sc.next();
		if (num1 > 0 && num2 > 0) {
			switch (str) {
			case "+":
				System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
				break;
			case "-":
				System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
				break;
			case "*":
				System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
				break;
			case "/":
				System.out.println(num1 + " / " + num2 + " = " + ((double) num1 / num2));
				break;
			case "%":
				System.out.println(num1 + " % " + num2 + " = " + (num1 % num2));
				break;
			default:
				System.out.println("잘못 입력하셨습니다. 프로그램을 종료합니다.");
				break;
			}
		} else {
			System.out.println("잘못 입력하셨습니다. 프로그램을 종료합니다.");
		}
	}// practice8()

	public void practice9() {
		Scanner sc = new Scanner(System.in);
		System.out.print("중간 고사 점수 : ");
		int middleScore = sc.nextInt();
		System.out.print("기말 고사 점수 : ");
		int finalScore = sc.nextInt();
		System.out.print("과제 점수 : ");
		int homework = sc.nextInt();
		System.out.print("출석 회수 : ");
		double check = sc.nextDouble();
		double total = middleScore * 0.2 + finalScore * 0.3 + homework * 0.3 + check / 20 * 100 * 0.2;
		if (total >= 70 && check > 14) {
			System.out.println("======== 결과 ========");
			System.out.println("중간 고사 점수(20) : " + middleScore * 0.2);
			System.out.println("기말 고사 점수(30) : " + finalScore * 0.3);
			System.out.println("과제 점수(30) : " + homework * 0.3);
			System.out.println("출석 점수(20) : " + check / 20 * 100 * 0.2);
			System.out.println("총점 : " + total);
			System.out.println("Pass");

		} else if (total < 70 && check > 14) {
			System.out.println("======== 결과 ========");
			System.out.println("중간 고사 점수(20) : " + middleScore * 0.2);
			System.out.println("기말 고사 점수(30) : " + finalScore * 0.3);
			System.out.println("과제 점수(30) : " + homework * 0.3);
			System.out.println("출석 점수(20) : " + check / 20 * 100 * 0.2);
			System.out.println("총점 : " + total);
			System.out.println("Fail[점수 미달]");
		} else if (check <= 14) {
			System.out.println("Fail[출석 회수 부족" + ("(" + check + "/" + 20 + ")") + "]");
		}
	}// practice9()

	public void practice10() {
		Scanner sc = new Scanner(System.in);
		System.out.println("실행할 기능을 선택하세요.");
		System.out.println("1. 메뉴 출력");
		System.out.println("2. 짝수/홀수");
		System.out.println("3. 합격/불합격");
		System.out.println("4. 계절");
		System.out.println("5. 로그인");
		System.out.println("6. 권한 확인");
		System.out.println("7. BMI");
		System.out.println("8. 계산기");
		System.out.println("9. P/F");
		System.out.print("선택 : ");
		int op = sc.nextInt();
		switch (op) {
		case 1:
			practice1();
			break;
		case 2:
			practice2();
			break;
		case 3:
			practice3();
			break;
		case 4:
			practice4();
			break;
		case 5:
			practice5();
			break;
		case 6:
			practice6();
			break;
		case 7:
			practice7();
			break;
		case 8:
			practice8();
			break;
		case 9:
			practice9();
			break;
		default:
			System.out.println("1~9 숫자를 입력해주세요");
		}
	}// practice10()

	public void practice11() {
		Scanner sc = new Scanner(System.in);
		System.out.print("비밀번호 입력(1000~9999) : ");
		String msg = sc.next();
		boolean flag = true;
		if (msg.length() == 4) {
			t: 
			for (int i = 0; i < msg.length(); i++){
				for (int j = 0; j < msg.length(); j++){
					if (i!=j&&msg.charAt(i)==msg.charAt(j)){
						System.out.println("중복 값 있음");
						flag = false;
						break t;
					}
				}
			}
			if (flag) {
				System.out.println("성공");
			}
		} else {
			System.out.println("자리수 안맞음");

		}
	}//practice11()

}
