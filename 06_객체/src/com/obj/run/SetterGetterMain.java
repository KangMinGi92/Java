package com.obj.run;

import com.obj.basiccontroller.MyMethod;
import com.obj.model.vo.Employee;

public class SetterGetterMain {

	public static void main(String[] args) {
		//Employee
//		Employee e=new Employee("유병승","강사부",500,0.5);
//		System.out.println(e.infoEmp());
//		e.name="최주영";
//		System.out.println(e.name);
		//필드를 수정, 출력하기 위한 메소드를 선언한다.!
		//수정 : setter()
		//출력 : getter()
		//setter/getter메소드는 public 으로 선언하고 각필드당 한개씩 선언
		//setter/getter는 명명규칙이 있음
		//set필드명()/get필드명() -> camelcase를 준비
		//예)setName / getName
		//setter메소드는 대입할 데이터가 필요하기 때문에 매개변수가 필드에 대입할 값을 받는다.
		//getter메소드는 데이터를 출력하는 것으로 반환형이 있다.
//		System.out.println(e.getName());
//		e.setName("최주영");
//		System.out.println(e.infoEmp());
//		System.out.println(e.getName());

		//Employee클래스에 EmpNo필드를 제외한 모든 필드에
		//setter/getter메소드를 추가하고
		//기본생성자로 사원 5명을 생성하고 setter로 대입 후 getter 출력하기
		//유병승 강사부 500 0.5
		//홍길동 강사부 200 0.2
		//이순신 인사부 300 0.3
		//최주영 인턴 10 0
		//김중근 인턴 10 0.2
		MyMethod mmt= new MyMethod();
		Employee e1=new Employee();
		mmt.makeEmployee(e1,"유병승","강사부",500,0.5);
//		e1.setName("유병승");
//		e1.setDepartment("강사부");
//		e1.setSalary(500);
//		e1.setBonus(0.5);
		System.out.println(e1.getEmpNo()+" "+e1.getName()+" "+e1.getDepartment()+" "+e1.getSalary()+" "+e1.getBonus());
		Employee e2=new Employee();
		mmt.makeEmployee(e2,"홍길동","강사부",200,0.2);
//		e2.setName("홍길동");
//		e2.setDepartment("강사부");
//		e2.setSalary(200);
//		e2.setBonus(0.2);
		System.out.println(e2.getEmpNo()+" "+e2.getName()+" "+e2.getDepartment()+" "+e2.getSalary()+" "+e2.getBonus());
		Employee e3 = new Employee();
		mmt.makeEmployee(e3,"이순신","인사부",300,0.3);
//		e3.setName("이순신");
//		e3.setDepartment("인사부");
//		e3.setSalary(300);
//		e3.setBonus(0.3);
		System.out.println(e3.getEmpNo()+" "+e3.getName()+" "+e3.getDepartment()+" "+e3.getSalary()+" "+e3.getBonus());
		Employee e4 = new Employee();
		e4=mmt.makeEmployee2("최주영","인턴",10,0);
//		e4.setName("최주영");
//		e4.setDepartment("인턴");
//		e4.setSalary(10);
//		e4.setBonus(0);
		System.out.println(e4.getEmpNo()+" "+e4.getName()+" "+e4.getDepartment()+" "+e4.getSalary()+" "+e4.getBonus());
		Employee e5 = new Employee();
		e5=mmt.makeEmployee2("김중근","인턴",10,0.2);
//		e5.setName("김중근");
//		e5.setDepartment("인턴");
//		e5.setSalary(10);
//		e5.setBonus(0.2);
		System.out.println(e5.getEmpNo()+" "+e5.getName()+" "+e5.getDepartment()+" "+e5.getSalary()+" "+e5.getBonus());
		
	}

}
