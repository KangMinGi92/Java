package com.bs.practice.snack.model.vo;

import com.bs.practice.snack.common.MinusArgumentException;

public class Snack {
	private String kind; //종류
	private String name; //이름
	private String flavor; //맛
	private int numOf; //개수
	private int price; //가격

	public Snack() {}//기본생성자
	public Snack(String kind, String name, String flavor, int numOf, int price) {
		this.kind=kind;
		this.name=name;
		this.flavor=flavor;
		this.numOf=numOf;
		this.price=price;
	}//매개변수있는 생성자
	
	public String getKind() {
		return this.kind;
	}
	public void setKind(String kind) {
		this.kind=kind;
	}
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getFlavor() {
		return this.flavor;
	}
	public void setFlavor(String flavor) {
		this.flavor=flavor;
	}
	public int getNumOf()  {
		
		return this.numOf;
	}
	public void setNumOf(int numOf) throws MinusArgumentException{
		if(numOf<0) {
			throw new MinusArgumentException();
		}
		this.numOf=numOf;
	}
	public int getPrice() {
		return this.price;
	}
	public void setPrice(int price) throws MinusArgumentException{
		if(price<0) {
			throw new MinusArgumentException();
		}
		this.price=price;
	}
	public String information() {
		String msg="";
		msg=kind+"("+name+" - "+flavor+") "+
		numOf+"개 "+price+"원";
		return msg;
	}
	
}
