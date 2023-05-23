package com.objarr.controller;

public class Fruit {
//	과일을 저장할 수 있는 클래스를 만들고
//	이름, 무게, 색상, 가격
//	과일을 5개 저장할 수 있는 저장소를 만들자
//	과일 본인이 좋아하는 과일로 초기화하고
//	1. 초기화한 과일들 전체 출력하기
//	2. 입력된 과일중 무게가 3kg이상인 과일 출력하기
//	3. 가격이 3000이상인 과일 출력하기
//	사과 5 빨강 10000
//	바나나 3 노랑 8000
//	딸기 1.5 빨강 2500
//	키위 2 초록 2800
//	샤인머스켓 1.3 초록 40000
	private String name;
	private double weight;
	private String color;
	private int price;

	public Fruit() {}
	
	public Fruit(String name, double weight, String color, int price) {
		this.name=name;
		this.weight=weight;
		this.color=color;
		this.price=price;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return this.name;
	}
	public void setWeight(double weight) {
		this.weight=weight;
	}
	public double getWeight() {
		return this.weight;
	}
	public void setColor(String color) {
		this.color=color;
	}
	public String getColor() {
		return this.color;
	}
	public void setPrice(int price) {
		this.price=price;
	}
	public int getPrice() {
		return this.price;
	}
	public String infoFruit() {
		return this.name+" "+this.weight+" "+this.color+" "+this.price; 
	}
	
}
