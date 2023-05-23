package com.bs.practice.chap02_abstractNInterface.model.vo;

public abstract class SmartPhone implements CellPhone,TouchDisplay{
	private String maker;
	
	
	public SmartPhone() {
		// TODO Auto-generated constructor stub
	}
	
	public String printInformation() {
		return"";
	}
	public void setMaker(String maker) {
		
	}
	public String getMaker() {
		return this.maker;
	}
	
		
}
	

