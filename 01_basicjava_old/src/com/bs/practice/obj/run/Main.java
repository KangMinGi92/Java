package com.bs.practice.obj.run;

import com.bs.practice.obj.controller.Employee;

public class Main {
	public static void main(String[] args) {
//		1 유병승 강사부 강사 100 0.5
//		2 은세계 학생부 학생 10 0.2
//		3 황지윤 학생부 학생 10 0.1
		Employee e1 = new Employee();
		e1.setName("유병승");
		e1.setDepartment("강사부");
		e1.setGrade("강사");
		e1.setSalary(100);
		e1.setBonus(0.5);
		Employee e2 = new Employee();
		e2.setName("은세계");
		e2.setDepartment("학생부");
		e2.setGrade("학생");
		e2.setSalary(10);
		e2.setBonus(0.2);
		Employee e3 = new Employee();
		e3.setName("황지윤");
		e3.setDepartment("학생부");
		e3.setGrade("학생");
		e3.setSalary(10);
		e3.setBonus(0.1);
		System.out.println(e1.getNumber()+" "+e1.getName()+" "+e1.getDepartment()+" "+e1.getGrade()+" "+e1.getSalary()+" "+e1.getBonus());
		System.out.println(e2.getNumber()+" "+e2.getName()+" "+e2.getDepartment()+" "+e2.getGrade()+" "+e2.getSalary()+" "+e2.getBonus());
		System.out.println(e3.getNumber()+" "+e3.getName()+" "+e3.getDepartment()+" "+e3.getGrade()+" "+e3.getSalary()+" "+e3.getBonus());
	}
}
