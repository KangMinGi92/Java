package com.bs.practice.point.controller;

import com.bs.practice.point.model.vo.Circle;

public class CircleController {
	private Circle c=new Circle();
	
	public CircleController() {
		// TODO Auto-generated constructor stub
	}
	
	public String calcArea(int x, int y, int radius) {
		String result=""+c.getPi()*radius*radius;
		return result;
	}
	
	public String calcCircum(int x, int y, int radius) {
		String result=""+c.getPi()*radius*2;
		return result;
	}

}
