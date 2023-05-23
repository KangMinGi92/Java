package com.objarr.run;

import com.objarr.controller.Animal;
import com.objarr.controller.Fruit;
import com.objarr.controller.Person;

public class Main {

	public static void main(String[] args) {
		// 객체배열 이용하기
		// 객체배열 생성하기
		// Animal a,a1,a2,a3;
		Animal[] animals;// 객체배열변수를 선언
		animals = new Animal[4];// 배열 저장공간을 생성해서 대입
		animals[0] = new Animal();
		animals[1] = new Animal("고양이", "베리", 3, 6, '여');

		// 배열에 저장된 객체데이터 활용하기
		// 0번 인덱스에 저장된 동물의 이름 가져오기
		System.out.println(animals[0]);
		String name = animals[0].getName();
		System.out.println(name);
		animals[0].setName("햄찌");
		System.out.println(animals[0].getName());
		System.out.println(animals[1].getName());

		// Animal을 3개 저장할 수 있는 저장소를 만들고
		// 원숭이 몽키 3 9 남
		// 돼지 꿀꿀이 1 30 여
		// 토끼 깡총이 2 2 여
		// 저장 후 출력하기
		Animal[] animal = new Animal[3];
		animal[0] = new Animal();
		animal[0].setType("원숭이");
		animal[0].setName("몽키");
		animal[0].setAge(3);
		animal[0].setWeight(9);
		animal[0].setGender('남');
		animal[1] = new Animal();
		animal[1].setType("돼지");
		animal[1].setName("꿀꿀이");
		animal[1].setAge(1);
		animal[1].setWeight(30);
		animal[1].setGender('여');
		animal[2] = new Animal();
		animal[2].setType("토끼");
		animal[2].setName("깡총이");
		animal[2].setAge(2);
		animal[2].setWeight(2);
		animal[2].setGender('여');
//		System.out.println(animal[0].infoAnimal());
//		System.out.println(animal[1].infoAnimal());
//		System.out.println(animal[2].infoAnimal());
		for (int i = 0; i < animal.length; i++) {
			System.out.println(animal[i].infoAnimal());
		}
		// com.objarr.controller.Person만들기
		// 이름, 나이, 주소, 전화번호
		// Person을 5명 저장할 수 있는 공간을 확보하고 -> 생성자는 기본생성자만 생성
		// 사용자가 입력한 값으로 Person을 생성 및 저장소에 저장 후
		// 저장된 사용자 모두를 출력하기
		// *getter와 setter이용할것
//		Person[] person = new Person[5];
//		Scanner sc = new Scanner(System.in);
//		for (int i = 0; i < person.length; i++) {
//			person[i] = new Person();
//			System.out.print("이름 : ");
//			person[i].setName(sc.next());
//			System.out.print("나이 : ");
//			person[i].setAge(sc.nextInt());
//			sc.nextLine();
//			System.out.print("주소 : ");
//			person[i].setAddress(sc.nextLine());
//			System.out.print("전화번호 : ");
//			person[i].setPhoneNumber(sc.nextLine());
//		}
//		for (Person p : person) {
//			System.out.println(p.getName() + " " + p.getAge() + " " + p.getAddress() + " " + p.getPhoneNumber());
//		}
//		
		//객체배열 선언과 동시에 초기화하기
		Person[] ps2= {
				new Person("유병승",19,"경기도 시흥시","010444"),
				new Person("이성진",25,"서울시 노원구","010123"),
				new Person("이동제",25,"경기도 군포시","010555"),
				new Person("이다영",25,"경기도 광명시","010666"),
				};
		//다수의 데이터를 저장하고 활용할때 객체배열
		//저장된 사람중 25살인 사람 조회하기
		for(Person p:ps2) {
			if(p.getAge()==25) {
				System.out.println(p.getName()+" "+p.getAge());
			}
		}
		Fruit[] fruits= {
				new Fruit("사과",5,"빨강",10000),
				new Fruit("바나나",3,"노랑",8000),
				new Fruit("딸기",1.5,"빨강",2500),
				new Fruit("키위",2,"초록",2800),
				new Fruit("샤인머스켓",1.3,"초록",40000)
				};
		
		for(Fruit f: fruits) {
			System.out.println(f.infoFruit());
		}
		for(Fruit f: fruits) {
			if(f.getWeight()>=3) {
				System.out.println(f.infoFruit());	
			}
		}
//		for(int i=0;i<fruits.length;i++) {
//			if(fruits[i].getWeight()>=3) {
//				System.out.println(fruits[i].infoFruit());
//			}
//		}
		for(int i=0;i<fruits.length;i++) {
			if(fruits[i].getPrice()>=3000) {
				System.out.println(fruits[i].infoFruit());
			}
		}
	}
}
