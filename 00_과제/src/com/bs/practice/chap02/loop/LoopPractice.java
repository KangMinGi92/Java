package com.bs.practice.chap02.loop;

import java.util.Scanner;

public class LoopPractice {
	public void practice1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();

		if (num < 1) {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		}

		for (int i = 1; i <= num; i++) {
			System.out.print(i + " ");

		}
	}// practice1()

	public void practice2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();

		while (num < 1) {
			System.out.println("1 이상의 숫자를 입력해주세요.");
			System.out.print("1이상의 숫자를 입력하세요 : ");
			num = sc.nextInt();

		}

		for (int i = 1; i <= num; i++) {
			System.out.print(i + " ");

		}

	}// practice2()

	public void practice3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();

		if (num <= 0) {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		}
		for (int i = num; i >= 1; i--) {
			System.out.print(i + " ");
		}
	}// practice3()

	public void practice4() {
		Scanner sc = new Scanner(System.in);
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();

		while (num < 1) {
			System.out.println("1 이상의 숫자를 입력해주세요.");
			System.out.print("1이상의 숫자를 입력하세요 : ");
			num = sc.nextInt();
		}
		for (int i = num; i >= 1; i--) {
			System.out.print(i + " ");
		}
	}// practice4()

	public void practice5() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 하나 입력하세요 : ");
		int num = sc.nextInt();
		int sum = 0;

		for (int i = 1; i <= num; i++) {
			sum += i;
			if (i != num) {
				System.out.print(i + " + ");
			} else if (i == num) {
				System.out.print(i);
			}
		}
		System.out.print(" = " + sum);

	}// practice5()

	public void practice6() {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 숫자 : ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 숫자 : ");
		int num2 = sc.nextInt();

		if (num1 < 1 || num2 < 1) {
			System.out.println("1이상의 숫자를 입력해주세요.");

		} else if (num1 > num2) {
			for (int i = num2; i <= num1; i++) {
				System.out.print(i + " ");
			}
		} else if (num1 < num2) {
			for (int i = num1; i <= num2; i++) {
				System.out.print(i + " ");
			}
		}
	}// practice6()

	public void practice7() {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 숫자 : ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 숫자 : ");
		int num2 = sc.nextInt();

		while (num1 < 1 || num2 < 1) {
			System.out.println("1이상의 숫자를 입력해주세요.");
			System.out.print("첫 번째 숫자 : ");
			num1 = sc.nextInt();
			System.out.print("두 번째 숫자 : ");
			num2 = sc.nextInt();

		}
		if (num1 > num2) {
			for (int i = num2; i <= num1; i++) {
				System.out.print(i + " ");
			}
		} else if (num1 < num2) {
			for (int i = num1; i <= num2; i++) {
				System.out.print(i + " ");
			}
		}
	}// practice7()

	public void practice8() {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 : ");
		int num = sc.nextInt();
		for (int i = num; i == num; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.println(i + " X " + j + " = " + i * j);
			}
		}
	}// practice8()

	public void practice9() {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 : ");
		int num = sc.nextInt();
		if (num <= 9) {
			for (int i = num; i <= 9; i++) {
				for (int j = 1; j < 10; j++) {
					System.out.println(i + " X " + j + " = " + i * j);
				}
			}
		} else {
			System.out.println("9이하의 숫자만 입력해주세요.");
		}

	}// practice9()

	public void practice10() {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 : ");
		int num = sc.nextInt();
		while (num > 9) {
			System.out.println("9이하의 숫자만 입력해주세요.");
			System.out.print("숫자 : ");
			num = sc.nextInt();
		}

		for (int i = num; i <= 9; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.println(i + " X " + j + " = " + i * j);
			}
		}
	}// practice10()

	public void practice11() {
		Scanner sc = new Scanner(System.in);
		System.out.print("시작 숫자 : ");
		int num1 = sc.nextInt();
		System.out.print("공차 : ");
		int num2 = sc.nextInt();
		int count = 0;
		int sum = 0;
		while (count != 10) {
			sum = num1 + num2 * count;
			count += 1;
			System.out.print(sum + " ");
		}
	}// practice11()

	public void practice12() {
		Scanner sc = new Scanner(System.in);
		String op = "";

		do {
			System.out.print("연산자(+, -, *, /, %) : ");
			op = sc.next();

			if (op.equals("exit")) {
				System.out.println("프로그램을 종료합니다.");
			} else {
				System.out.print("정수1 : ");
				int num1 = sc.nextInt();
				System.out.print("정수2 : ");
				int num2 = sc.nextInt();

				if (op.equals("/") && num2 == 0) {
					System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요");
				} else if (!op.equals("+") && !op.equals("-") && !op.equals("*") && !op.equals("/")
						&& !op.equals("exit")) {
					System.out.println("없는 연산자 입니다. 다시 입력해주세요.");
				} else
					switch (op) {
					case "+":
						System.out.println(num1 + op + num2 + "=" + (num1 + num2));
						break;
					case "-":
						System.out.println(num1 + op + num2 + "=" + (num1 - num2));
						break;
					case "*":
						System.out.println(num1 + op + num2 + "=" + (num1 * num2));
						break;
					case "/":
						System.out.println(num1 + op + num2 + "=" + (num1 / num2));
						break;
					case "%":
						System.out.println(num1 + op + num2 + "=" + (num1 % num2));
						break;
					}
			}
		} while (!op.equals("exit"));
	}// practice12()

	public void practice13() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();

		for (int i = 0; i < num; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}// practice13()

	public void practice14() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();

		for (int i = num; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}// practice14()

	public void practice15() {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 : ");
		int num = sc.nextInt();
		int count = 0;
		if (num > 2) {
			for (int i=1;i<=num;i++) {
				if (num%i==0) {
					count++;
				}
			} // for문
			if (count==2) {
				System.out.println("소수입니다.");
			} else {
				System.out.println("소수가 아닙니다.");
			}

		} else {
			System.out.println("잘못 입력하셨습니다.");
		}
	}// practice15()

	public void practice16() {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 : ");
		int num = sc.nextInt();
		int count = 0;
		while (num < 2) {
			System.out.println("잘못 입력하셨습니다.");
			System.out.print("숫자 : ");
			num = sc.nextInt();
		}

		for (int i=1;i<=num;i++) {
			if (num%i==0) {
				count++;
			}
		}
		if (count==2) {
			System.out.println("소수입니다.");
		} else {
			System.out.println("소수가 아닙니다.");
		}
	}//pracice16()
	public void practice17() {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 : ");
		int num = sc.nextInt();
		int count = 0;//count값이 2개 소수, 아니면 소수아니다
		int countsosu = 0;
		while (num < 2) {
			System.out.println("잘못 입력하셨습니다.");
			System.out.print("숫자 : ");
			num = sc.nextInt();
		}
		for (int i=2;i<=num;i++) {
			count=0;
			for(int j=1;j<=i;j++) {
				if(i%j==0) {//1, i면 소수
					count++;
				}
			}
			if (count==2) {
				System.out.print(i+" ");
				countsosu++;
			}
		}System.out.println();
		System.out.println("2부터 "+num+"까지 소수의 개수는 "+countsosu+"개입니다.");

}//practice17()
}
