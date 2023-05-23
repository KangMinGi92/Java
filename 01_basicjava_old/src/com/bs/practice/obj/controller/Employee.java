package com.bs.practice.obj.controller;

public class Employee {
//	사원 클래스를 만들자
//	사원번호, 사원명, 부서, 직책, 월급, 보너스
//
//	멤버변수는 모두 직접접근이 불가능하게 설정할 것
//	사원번호는 자동으로 부여되고 출력은 되나 수정은 금지
//	그외 다른 멤버변수는 다 수정, 출력이 가능하게 설계
//
//	1 유병승 강사부 강사 100 0.5
//	2 은세계 학생부 학생 10 0.2
//	3 황지윤 학생부 학생 10 0.1
	private static int count;
	private int number;
	private String name;
	private String department;
	private String grade;
	private int salary;
	private double bonus;
	{
		number=++count;
	}
	public Employee() {

	}

	public int getNumber() {
		return number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

}
	


	

