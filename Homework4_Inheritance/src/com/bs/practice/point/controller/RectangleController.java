package com.bs.practice.point.controller;

import com.bs.practice.point.model.vo.Rectangle;

public class RectangleController {
	private Rectangle r=new Rectangle();
	
	public String calcArea(int x, int y, int height, int width) {
		String result="면적 : "+width*height;
		return result;
	}
	
	public String calcPerimeter(int x, int y, int height, int width) {
		String result="둘레 : "+2*(width+height);
		return result;
	}

}
