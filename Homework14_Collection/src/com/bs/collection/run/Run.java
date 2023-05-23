package com.bs.collection.run;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

import com.bs.collection.model.vo.Person;


public class Run {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<Person> persons=new ArrayList();
//		사람클래스는 생성해서 리스트로 관리하기
//		// 이름, 나이, 성별, 키, 몸무게
//		//유병승, 19, 남, 180.5, 65.5
//		//홍길동, 44, 여, 155.5, 45.5
//		//고길동, 20, 남, 175.5, 70.5
//		//선덕여왕, 35, 여, 150.2, 50.5
//		//김두환, 42, 남, 188.2, 95.5

//		1. 위 데이터를 사용자에게 입력받아 리스트에 저장 후 전체 데이터 출력하기
//		for(int i=0;i<5;i++) {
//			System.out.print("이름 : ");
//			String name=sc.next();
//			System.out.print("나이 : ");
//			int age=sc.nextInt();
//			System.out.print("성별 : ");
//			char gender=sc.next().charAt(0);
//			System.out.print("키 : ");
//			double height=sc.nextDouble();
//			System.out.print("몸무게 : ");
//			double weight=sc.nextDouble();
//			persons.add(new Person(name,age,gender,height,weight));
//		}

		persons.add(new Person("유병승",19,'남',180.5,65.5));
		persons.add(new Person("홍길동",44,'여',155.5,45.5));
		persons.add(new Person("고길동",20,'남',175.5,70.5));
		persons.add(new Person("선덕여왕",35,'여',150.2,50.5));
		persons.add(new Person("김두환",42,'남',188.2,95.5));
		
		System.out.println("1.저장 후 전체 데이터 출력하기");
		for(int i=0;i<persons.size();i++) {
			System.out.println(persons.get(i));
		}


//		//1.처리 후에는 저장하여 사용할것 * 계속입력하지말고 코드로 작성해서 2번 부터는 해결
		System.out.println("2.키가 180이상인 사람의 나이를 1씩 증가 시킨 후 모든 데이터 출력하기");
//		2. 저장한 데이터 중 키가 180이상인 사람의 나이를 1씩 증가 시킨 후 모든 데이터 출력하기
		for(int i=0;i<persons.size();i++) {
			Person p=(Person)persons.get(i);
			if(p.getHeight()>=180) {
				p.setAge(p.getAge()+1);
			}
			System.out.println(persons.get(i));
		}
		System.out.println("3.나이가 40세 이상인 사람만 출력하기");
//		3. 나이가 40세 이상인 사람만 출력하기
		for(int i=0;i<persons.size();i++) {
			Person p=(Person)persons.get(i);
			if(p.getAge()>=40) {
				System.out.println(persons.get(i));
			}
		}
		System.out.println("4. 사원을 이름(내림차순)순으로 정렬하기");
//		4. 사원을 이름(내림차순)순으로 정렬하기
//		persons.sort(new Comparator() {
//			@Override
//			public int compare(Object o, Object o1) {
//				Person p=(Person)o;
//				Person p2=(Person)o1;
//				return p2.getName().compareTo(p.getName());
//			}
//		});
		persons.sort((p,p2)->((Person)p2).getName().compareTo(((Person)p).getName()));
		persons.forEach((p)->System.out.println(p));
		System.out.println("5. 사원을 키(오름차순)순으로 정렬하기");
//		5. 사원을 키(오름차순)순으로 정렬하기
		persons.sort(new Comparator<Object>() {
			@Override
			public int compare(Object o, Object o1) {
				Person p=(Person)o;
				Person p2=(Person)o1;
				return (int)p.getHeight()-(int)p2.getHeight();
			}
		});
		persons.forEach((p)->System.out.println(p));
		System.out.println("6. 2번 인덱스에 최주영,26,남,177.3,70.5 저장하기(추가)");
//		6. 2번 인덱스에 최주영,26,남,177.3,70.5 저장하기(추가)
		persons.add(2, new Person("최주영",26,'남',177.3,70.5));
		for(Object o:persons) {
			System.out.println(o);
		}
		System.out.println("7.3번 인덱스 값을 이동제,25,175.3,68.3 으로 변경하기");
//		7. 3번 인덱스 값을 이동제,25,'남',175.3,68.3 으로 변경하기
		persons.set(3, new Person("이동제",25,'남',175.3,68.3));
		for(Object o:persons) {
			System.out.println(o);
		}
		System.out.println("8. 고길동, 20, 남, 175.5, 70.5이 리스트에 있는지 확인하고 없으면 추가하기");
//		8. 고길동, 20, 남, 175.5, 70.5이 리스트에 있는지 확인하고 없으면 추가하기
		boolean check=persons.contains(new Person("고길동", 20, '남', 175.5, 70.5));
		if(!check) {
			persons.add(new Person("고길동", 20, '남', 175.5, 70.5));
		}
		for(Person p:persons) {
			System.out.println(p);
		}
		System.out.println("9. 이름이 선덕여왕인 사람의 위치를 찾아서 그 위치에 주몽,58,남,189.4,90.3을 추가하기");
//		9. 이름이 선덕여왕인 사람의 위치를 찾아서 그 위치에 주몽,58,남,189.4,90.3을 추가하기
		for(int i=0;i<persons.size();i++) {
			Person p=(Person)persons.get(i);
			if(p.getName().equals("선덕여왕")) {
				persons.set(i,new Person("주몽",58,'남',189.4,90.3));
				break;
			}
		}
		persons.forEach((o)->{System.out.println(o);});
		System.out.println("10. 4번 인덱스의 사람 삭제하기");
//		10. 4번 인덱스의 사람 삭제하기
		persons.remove(4);
	
		persons.forEach((o)->{System.out.println(o);});
		System.out.println("11. 김두환, 42, 남, 188.2, 95.5 사람 삭제하기");
//		11. 김두환, 42, 남, 188.2, 95.5 사람 삭제하기
		persons.remove(new Person("김두환", 43, '남', 188.2, 95.5));
		
		persons.forEach((o)->{System.out.println(o);});

		System.out.println("12. 리스트에 값이 있는지 없는지 확인하고 값이 있으면 사람있어요~~ 출력 없으면 사람없어요~~ 출력");
//		12. 리스트에 값이 있는지 없는지 확인하고 값이 있으면 사람있어요~~ 출력 없으면 사람없어요~~ 출력
		if(!persons.isEmpty()) {
			System.out.println("사람있어요~~");
		}else {
			System.out.println("사람없어요~~");
		}
		System.out.println("13. 리스트에 있는 모든데이터 삭제하기");
//		13. 리스트에 있는 모든데이터 삭제하기
		persons.clear();
		persons.forEach((o)->{System.out.println(o);});
		if(!persons.isEmpty()) {
			System.out.println("사람있어요~~");
		}else {
			System.out.println("사람없어요~~");
		}
		
		

	}

}
