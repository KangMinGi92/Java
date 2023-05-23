package com.bs.hw.person.controller;

import com.bs.hw.person.model.vo.Employee;
import com.bs.hw.person.model.vo.Student;

public class PersonController {
	private Student[] s=new Student[3];
	private Employee[] e=new Employee[10];
	
	public int[] personCount() {
		int count=0;
		int count2=0;
		int count3=0;
		int[] result=new int[count];
		int[] result2=new int[count2];
		int[] result3=new int[count3];
		Student[] s1=printStudent();
		Employee[] e1=printEmployee();
		if(s1==null&&e1==null) {
			return result; 
		}else if(s1!=null&&e1==null){
			for(int i=0;i<s1.length;i++) {
				if(s1[i]!=null) {
					++count2;
				}
			}return result2;
		}else if(s1!=null&&e1!=null) {
			for(int i=0;i<e1.length;i++) {
				if(e1[i]!=null) {
					++count3;
				}
			}return result3;
		}return result;
	}
	public void insertStudent(String name, int age, double height, double weight, int grade, String major) {
		for(int i=0;i<s.length;i++) {
			if(s[i]==null) {
			s[i]=new Student(name, age, height, weight, grade, major);
			return;
			}
		}
	}
	
	public Student[] printStudent() {
		Student[] result=new Student[s.length];
		for(int i=0;i<s.length;i++) {
			if(s[i]!=null)
			result[i]=s[i];
		}
		
		return result;
	}
	
	public void insertEmployee(String name, int age, double height, double weight, int salary, String dept) {
		for(int i=0;i<e.length;i++) {
			e[i]=new Employee(name, age, height, weight, salary, dept);
		}
	}
	
	public Employee[] printEmployee() {
		Employee[] result=new Employee[e.length];
		for(int i=0;i<e.length;i++) {
			if(e[i]!=null)
			result[i]=e[i];
		}
		
		return result;
	}
}
