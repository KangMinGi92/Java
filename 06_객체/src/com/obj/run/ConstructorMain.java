package com.obj.run;

import com.obj.model.vo.Animal;
import com.obj.model.vo.Person;

public class ConstructorMain {

	public static void main(String[] args) {
		//클래스의 생성자 활용하기
		//클래스는 생성해서 이용을 해야한다.
		//클래스를 생성할때 이용하는것이 생성자다!
		//모든 클래스선언에는 반드시 생성자선언 코드가 있어야한다.!
		Person p=new Person();//기본생성자를 호출한 구문
		System.out.println(p.name+" "+p.age+" "+p.address+" "+p.gender);
		
		//매겨변수 있는 생성자 호출하기
		Person p1 = new Person("최주영",26,178.4,'여');
		Person p2 = new Person("김중근",28,177.3,'여');
		
		System.out.println(p1.name+p1.age+p1.address+p1.gender);
		System.out.println(p2.name+p2.age+p2.address+p2.gender);
		
		Person p3 = new Person("윤지환",'남');
		Person p4 = new Person("윤준호",26);

		Animal dog=new Animal("개","뽀삐",5,50,"우리집");
		Animal cat=new Animal("고양이","야옹이",3,40,"짬통");
		Animal turtle=new Animal("거북이","꼬북이",1.2,4,"어항속");
		
		System.out.println(dog.type+" "+dog.name+" "+dog.weight+"kg "+dog.length+"cm "+dog.habitat);
		System.out.println(cat.type+" "+cat.name+" "+cat.weight+"kg "+cat.length+"cm "+cat.habitat);
		System.out.println(turtle.type+" "+turtle.name+" "+turtle.weight+"kg "+turtle.length+"cm "+turtle.habitat);
		
		
	}
}
		

