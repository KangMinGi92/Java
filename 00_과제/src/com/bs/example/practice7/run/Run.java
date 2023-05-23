package com.bs.example.practice7.run;

import com.bs.example.practice7.model.vo.Employee;

public class Run {

	public static void main(String[] args) {
		Employee e = new Employee();
		e.setEmpNo(1);
		e.setEmpName("강민기");
		e.setDept("몰라");
		e.setAge(32);
		e.setGender('남');
		e.setSalary(300);
		e.setBonusPoint(0.5);
		e.setPhone("010-5711-1106");
		e.setAddress("경기도 안산시");
		System.out.println(e.getEmpNo()+" "+e.getEmpName()+" "+
							e.getDept()+" "+e.getAge()+" "+
							e.getGender()+" "+e.getSalary()+" "+
							e.getBonusPoint()+" "+e.getPhone()+" "+
							e.getAddress());

	}

}
