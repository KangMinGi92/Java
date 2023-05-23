package com.bs.practice.point.view;

import java.util.Scanner;

import com.bs.practice.point.controller.CircleController;
import com.bs.practice.point.controller.RectangleController;

public class PointMenu {
	private Scanner sc=new Scanner(System.in);
	private CircleController cc=new CircleController();
	private RectangleController rc=new RectangleController();
	
	public PointMenu() {
		// TODO Auto-generated constructor stub
	}
	
	public void mainMenu() {

		do {
			System.out.println("===== 메뉴 =====");
			System.out.println("1. 원");
			System.out.println("2. 사각형");
			System.out.println("9. 끝내기");
			System.out.print("메뉴 번호: ");
			int num = sc.nextInt();
			switch(num) {
			case 1 : circleMenu();break;
			case 2 : rectangleMenu();break;
			case 9 : return;
			default :break;
			}
		}while(true);
	}
	public void circleMenu() {
		do {
			System.out.println("===== 원 메뉴 =====");
			System.out.println("1. 원 둘레");
			System.out.println("2. 원 넓이");
			System.out.println("9. 메인으로");
			System.out.print("메뉴 번호: ");
			int num=sc.nextInt();
			switch(num) {
			case 1 : calcCircum(); break;
			case 2 : calcCircleArea(); break;
			case 9 : return;
			default : return;
			}
		}while(true);
	}
	public void rectangleMenu() {
		do {
			System.out.println("===== 사각형 메뉴 =====");
			System.out.println("1. 사각형 둘레");
			System.out.println("2. 사각형 넓이");
			System.out.println("3. 메인으로");
			System.out.print("메뉴 번호: ");
			int num=sc.nextInt();
			switch(num) {
			case 1 : calcPerimeter();break;
			case 2 : calcRectArea();break;
			case 3 : return;
			default : return;
			}
		}while(true);
		
				
		
	}
	public void calcCircum() {
		System.out.print("x좌표 : ");
		int x=sc.nextInt();
		System.out.print("y좌표 : ");
		int y=sc.nextInt();
		System.out.print("반지름 : ");
		int radius=sc.nextInt();
		cc.calcCircum(x, y, radius);
		System.out.println("둘레 : "+x+", "+y+", "+radius+" / "+cc.calcCircum(x, y, radius));
	}
	public void calcCircleArea() {
		System.out.print("x좌표 : ");
		int x=sc.nextInt();
		System.out.print("y좌표 : ");
		int y=sc.nextInt();
		System.out.print("반지름 : ");
		int radius=sc.nextInt();
		cc.calcArea(x, y, radius);
		System.out.println("면적 : "+x+", "+y+", "+radius+" / "+cc.calcArea(x, y, radius));
	}
	public void calcPerimeter() {
		System.out.print("x좌표 : ");
		int x=sc.nextInt();
		System.out.print("y좌표 : ");
		int y=sc.nextInt();
		System.out.print("높이 : ");
		int height=sc.nextInt();
		System.out.print("너비 : ");
		int width=sc.nextInt();
		rc.calcPerimeter(x, y, height, width);
		System.out.println("둘레 : "+x+", "+y+", "+height+" "+width+" / "+rc.calcPerimeter(x, y, height, width));
	}
	public void calcRectArea() {
		System.out.print("x좌표 : ");
		int x=sc.nextInt();
		System.out.print("y좌표 : ");
		int y=sc.nextInt();
		System.out.print("높이 : ");
		int height=sc.nextInt();
		System.out.print("너비 : ");
		int width=sc.nextInt();
		rc.calcArea(x, y, height, width);
		System.out.println("면적 : "+x+", "+y+", "+height+" "+width+" / "+rc.calcArea(x, y, height, width));
	}
}

