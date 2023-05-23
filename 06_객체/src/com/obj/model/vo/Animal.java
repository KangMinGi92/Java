package com.obj.model.vo;

public class Animal {
	//매개변수있는 생성자 이용하기
	//동물정보를 저장할 수 있는 클래스 만들기 com.obj.model.vo.Anial
	//종류, 이름, 몸무게, 길이, 서식지
	//개 뽀삐 5kg 50cm 우리집
	//고양이 야옹이 3kg 40cm 짬통
	//거북이 꼬북이 1.2kg 5cm 어항속
	//객체를 생성할때 모든값이 세팅되어서 생성될 수 있게 하고
	//해당내용 출력하기
	public String type;
	public String name;
	public double weight;
	public int length;
	public String habitat;
	
	public Animal() {
		
	}
	public Animal(String type,String name,double weight, int length,String habitat) {
		this.type=type;
		this.name=name;
		this.weight=weight;
		this.length=length;
		this.habitat=habitat;
	}
	
	
	


}
