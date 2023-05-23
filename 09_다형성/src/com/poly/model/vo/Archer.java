package com.poly.model.vo;

public class Archer extends Character {
	private int area;
		
	public Archer() {
		// TODO Auto-generated constructor stub
	}
	public Archer(int hp, int level, String name, int area) {
		super(hp, level, name);
		this.area = area;
	}
	public int getArea() {
		return area;
	}
	public void setArea(int area) {
		this.area = area;
	}
	@Override
	public String toString() {
		return super.toString()+"Archer [area=" + area + "]";
	}
	
	public void archerAttack() {
		System.out.println(area+"이동 후 활로 공격");
	}
	
	public void archerDefence() {
		System.out.println("활로 막기!");
	}
	
	
	@Override
	public void attack() {
		archerAttack();
	}
	
	@Override
	public void defence() {
		archerDefence();
	}

}
