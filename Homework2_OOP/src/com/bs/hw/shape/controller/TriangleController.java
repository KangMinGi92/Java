package com.bs.hw.shape.controller;

import com.bs.hw.shape.model.vo.Shape;

public class TriangleController {
	Shape s1 = new Shape(0,0,0);
	
	
	public TriangleController() {}
	
	
	public double calcArea(double height, double width) {
		s1.setHeight(height);
		s1.setWidth(width);
		double result=width*height/2;
		return result;
	}
	public void paintColor(String color) {
		s1.setColor(color);
	}
	public String print() {
		String result="";
		result="삼각형"+s1.information();
		return result;
	}
}
