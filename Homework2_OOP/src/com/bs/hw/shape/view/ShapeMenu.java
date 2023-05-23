package com.bs.hw.shape.view;

import java.util.Scanner;

import com.bs.hw.shape.controller.SquareController;
import com.bs.hw.shape.controller.TriangleController;

public class ShapeMenu {
	Scanner sc = new Scanner(System.in);
	SquareController scr = new SquareController();
	TriangleController tc = new TriangleController();

	public ShapeMenu() {}
	
	public void inputMenu() {

		boolean flag = true;
		do {
			System.out.println("===== 도형 프로그램 =====");
			System.out.println("3.삼각형");
			System.out.println("4.사각형");
			System.out.println("9.프로그램 종료");
			System.out.print("메뉴 번호 : ");
			String number = sc.next();
		
			switch(number) {
			case "3" : triangleMenu();break;
			case "4" : squareMenu();break;
			case "9" : System.out.println("프로그램 종료"); return;
			default : System.out.println("잘못된 번호입니다. 다시 입력해주세요.");break;
			}
		} while(flag);
	}//inputMenu()
	
	public void triangleMenu() {
		boolean flag=true;
		do {
			System.out.println("===== 삼각형 =====");
			System.out.println("1.삼각형 면적");
			System.out.println("2.삼각형 색칠");
			System.out.println("3.삼각형 정보");
			System.out.println("9.메인으로");
			System.out.print("메뉴 번호 : ");
			String number = sc.next();
			switch(number) {
				case "1" : inputSize(3,1);break;
				case "2" : inputSize(3,2);break;
				case "3" : inputSize(3,3);break;
				case "9" : return;
				default : System.out.println("잘못된 번호입니다. 다시 입력해주세요.");break;
			}
		}while(flag);

	}
	public void squareMenu() {
		boolean flag=true;
		do {		
			System.out.println("===== 사각형 =====");
			System.out.println("1.삼각형 둘레");
			System.out.println("2.사각형 면적");
			System.out.println("3.사각형 색칠");
			System.out.println("4.사각형 정보");
			System.out.println("9.메인으로");
			System.out.print("메뉴 번호 : ");
			String number = sc.next();
			switch(number) {
				case "1" : inputSize(4,1);break;
				case "2" : inputSize(4,2);break;
				case "3" : inputSize(4,3);break;
				case "4" : inputSize(4,4);break;
				case "9" : return;
				default : System.out.println("잘못된 번호입니다. 다시 입력해주세요.");break;
			}
		}while(flag);
		
	}
	public void inputSize(int type, int menuNum) {
		do {
			if(type==3&&menuNum==1) {
				System.out.print("높이 : ");
				double height = sc.nextInt();
				System.out.print("너비 : ");
				double width = sc.nextInt();
				System.out.println("삼각형 면적 : "+tc.calcArea(height, width));
			}
			if(type==3&&menuNum==2) {
				System.out.print("색깔을 입력하세요 : ");
				String color = sc.next();
				tc.paintColor(color);
				System.out.println("색이 수정되었습니다.");
			}
			if(type==3&&menuNum==3) {
				printlnformation(3);
			}
			if(type==4&&menuNum==1) {
				System.out.print("높이 : ");
				double height = sc.nextDouble();
				System.out.print("너비 : ");
				double width = sc.nextDouble();
				System.out.println("사각형 둘레 : "+scr.calcPerimeter(height, width));
			}
			if(type==4&&menuNum==2) {
				System.out.print("높이 : ");
				double height = sc.nextDouble();
				System.out.print("너비 : ");
				double width = sc.nextDouble();
				System.out.println("사각형 면적 : "+scr.calcArea(height, width));
			}
			if(type==4&&menuNum==3) {
				System.out.print("색깔을 입력하세요 : ");
				String color = sc.next();
				scr.paintColor(color);
				System.out.println("색이 수정되었습니다.");
			}

			if(type==4&&menuNum==4) {
				printlnformation(4);
			}
		} while(false);
	}//inputMenu()
	public void printlnformation(int type) {
		if(type==3) {
			System.out.println(tc.print());
		}
		if(type==4) {
			System.out.println(scr.print());
		}
	}
}
