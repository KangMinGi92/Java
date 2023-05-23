package com.bs.hw.employee.controller;

import com.bs.hw.employee.model.vo.Employee;

public class EmployeeController {
	Employee e = new Employee();
	
	
	public void add(int empNo, String name, char gender, String phone) {
		e.setEmpNo(empNo);
		e.setName(name);
		e.setGender(gender);
		e.setPhone(phone);
	}
	public void add(int empNo, String name, char gender, String phone, 
			String dept, int salary, double bonus) {
		e.setEmpNo(empNo);
		e.setName(name);
		e.setGender(gender);
		e.setPhone(phone);
		e.setDept(dept);
		e.setSalary(salary);
		e.setBonus(bonus);
		
	}
	public void modify(String phone) {
		e.setName(phone);
		
	}
	public void modify(int salary) {
		e.setSalary(salary);
		
	}
	public void modify(double bonus) {
		e.setBonus(bonus);
		
	}
	public Employee remove() {
		e.setEmpNo(0);
		return e;
	}
	public String inform() {
		return e.pirntEmployee();
	}
}
