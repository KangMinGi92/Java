package com.bs.hw.shape.controller;

import com.bs.hw.shape.model.vo.Shape;

public class SquareController {
	Shape s2 = new Shape(0,0,0);
	
	public SquareController() {}
	
	public double calcPerimeter(double height, double width) {
		s2.setHeight(height);
		s2.setWidth(width);
		double result=width*2+height*2;
		return result;
	}
	public double calcArea(double height, double width) {
		s2.setHeight(height);
		s2.setWidth(width);
		double result=width*height;
		return result;
	}
	public void paintColor(String color) {
		s2.setColor(color);
	}
	public String print() {
		String result="";
		result="사각형"+s2.information();
		return result;
	}
}
