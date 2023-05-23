package com.bs.practice.point.model.vo;

public class Circle extends Point{
	private int radius;
	private final double PI=3.14169;
	
	public Circle() {
		// TODO Auto-generated constructor stub
	}
	
	public double getPi() {
		return PI;
	}

	public Circle(int x, int y, int radius) {
		super(x,y);
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}
	
	
	

}
