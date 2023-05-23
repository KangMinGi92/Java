package com.obj.run;

import com.obj.basiccontroller.BaseBallPlayer;
import com.obj.basiccontroller.BasicTestClass;
import com.obj.basiccontroller.FieldTestClass;
//import com.obj.basiccontroller.DefaultTestClass; //DefaultTestClass는 default클래스라서 패키지가 다르면 외부접근 차단
import com.obj.model.vo.Student;

public class Main {
	public static void main(String[] args) {
		//프로젝트 내부에 선언된 클래스는 반드시 생성해야지만 이용이 가능
		//클래스를 생성하는 방법
		//new연산자를 이용해서 생성한다.
		//new 클래스명() <--기본클래스 생성하는 방법(default 생성)
		
		//클래스선언부에 있는 접근제한자에 따라 생성해서 이용할 수 있는
		//범위가 달라진다.
		//BasicTestClass 생성하기
		new BasicTestClass();
		//defaultTestClass 생성하기
//		new DefaultTestClass(); //defaultTestClass는 default클래스라 다른 패키지에서는 객체를 생성해서 사용할 수 없다.
		
		//프로젝트내에 선언되 클래스명은 하나의 자료형으로 사용한다.
		//참조형자료형(Reference type)
		//클래스를 저장하는 변수를 만들수도 있다.
		BasicTestClass btc;//클래스로 생성한 객체를 저장하는 변수를 선언
		btc=new BasicTestClass();
		//btc.
		
		//클래스에 선언된 필드(멤버변수)이용하기
		//클래스에 선언된 필드를 이용하려면 클래스를 객체화(생성)해야한다.
		FieldTestClass ftc;
		ftc= new FieldTestClass();
		
		//필드(멤버변수)에 접근하기
		System.out.println(ftc.age);
		//필드에 값 대입하기
		ftc.age=19;
		System.out.println(ftc.age);
		//default접근제한자를 사용한 필드접근
		//System.out.println(ftc.name); 패키지가 달라서 객체를 생성할 수 없다.
		//private접근제한자를 사용한 필드접근
		//System.out.println(ftc.gender);
		
		//final 필드 접근하기
		System.out.println(ftc.HEIGHT);
		//final필드는 수정이 불가능함
		//ftc.HEIGHT=190.5;
		
		//베이스볼플레이어 만들기
		//선수 3명을 만들기
		BaseBallPlayer p1,p2,p3;
		p1=new BaseBallPlayer();//선수 1명생성
		p1.name="박찬호";
		p1.age=49;
		p1.mainHand="오른손";
		p1.number=61;
		p1.position="P";
		p1.accuracy=70;
		p1.power=100;
		//p1 야구플레이어 -> 박찬호
		p2=new BaseBallPlayer();
		p2.name="이승엽";
		p2.age=46;
		p2.mainHand="왼손";
		p2.number=36;
		p2.position="1B";
		p2.accuracy=90;
		p2.power=100;
		//p2 야구플레이어 -> 이승엽
		
		
		//박잔호 정보출력하기
		System.out.println(p1.name+" "+
				p1.age+" "+p1.mainHand+" "+
				p1.number+" "+p1.position+" "+
				p1.accuracy+" "+p1.power);
		p1.number=100;
		System.out.println(p1.name+" "+
				p1.age+" "+p1.mainHand+" "+
				p1.number+" "+p1.position+" "+
				p1.accuracy+" "+p1.power);
		System.out.println();
		
		//학생정보를 저장하는 클래스를 선언하고 
		//-> com.obj.model.vo.Student
		//이름,나이,학년,반,키,주소
		//모든필드는 어디서든 접근할 수 있게 설정
		//아래 학생을 등록 후 출력하기
		//유병승 19 1 3 180.5 경기도시흥시
		//홍길동 33 3 2 174.2 강원도 산골
		//이순시 54 3 3 167.3 전라남도
		//신사임당 45 2 1 152.3 강원도
		
		Student s1,s2,s3,s4;
		//필드로 선언된 변수는 new연산자로 생성을 하면
		//기본값으로 초기화 된다. 초기부터 값을 대입하려면???필드에 대입연산자를 사용
		s1=new Student();
		System.out.println(s1.name+" "+s1.age+" "+s1.grade+" "+s1.classNumber+" "+s1.height+" "+s1.address);
		s1.name="유병승";
		s1.age=19;
		s1.grade=1;
		s1.classNumber=3;
		s1.height=180.5;
		s1.address="경기도시흥시";
		s2=new Student();
		s2.name="홍길동";
		s2.age=33;
		s2.grade=3;
		s2.classNumber=2;
		s2.height=174.2;
		s2.address="강원도 산골";
		s3=new Student();
		s3.name="이순시";
		s3.age=54;
		s3.grade=3;
		s3.classNumber=3;
		s3.height=167.3;
		s3.address="전라남도";
		s4=new Student();
		s4.name="신사임당";
		s4.age=45;
		s4.grade=2;
		s4.classNumber=1;
		s4.height=152.3;
		s4.address="강원도";
		System.out.println(s1.name+" "+s1.age+" "+s1.grade+" "+s1.classNumber+" "+s1.height+" "+s1.address);
		System.out.println(s2.name+" "+s2.age+" "+s2.grade+" "+s2.classNumber+" "+s2.height+" "+s2.address);
		System.out.println(s3.name+" "+s3.age+" "+s3.grade+" "+s3.classNumber+" "+s3.height+" "+s3.address);
		System.out.println(s4.name+" "+s4.age+" "+s4.grade+" "+s4.classNumber+" "+s4.height+" "+s4.address);
		
		//final double height;
		//2. 초기화블록을 이용해서 필드를 초기화할 수 있다.
		// 인스턴스 초기화블록 -> 클래스를 생성(객체화)할때마다 실행
		// static초기화블록 -> 최초 생성할때 한번만 실행!

	}
}
