package com.bs.example.practice3.model.vo;

public class Circle {
	private static final double PI = 3.14;
	private static int radius = 1;

	public Circle() {}//기본생성자
	
	public double getPI() {
		return Circle.PI;
	}
	public int getRadius() {
		return Circle.radius;
	}
	public void setRadius(int num) {
		Circle.radius=num;
	}
	
	public void incrementRadius() {
		radius++;
	}
	public void getAreaOfCircle() {
		double area;
		area=Circle.radius*Circle.radius*Circle.PI;
		System.out.println(area);
	}
	public void getSizeOfCircle() {
		double size;
		size=2*Circle.PI*Circle.radius;
		System.out.println(size);
	}
}
