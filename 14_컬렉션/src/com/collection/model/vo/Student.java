package com.collection.model.vo;

import java.util.Objects;

public class Student implements Comparable{
	
	private String name;
	private int grade;
	private int ClassNumber;
	private char gender;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(String name, int grade, int classNumber, char gender) {
		super();
		this.name = name;
		this.grade = grade;
		ClassNumber = classNumber;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public int getClassNumber() {
		return ClassNumber;
	}

	public void setClassNumber(int classNumber) {
		ClassNumber = classNumber;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", grade=" + grade + ", ClassNumber=" + ClassNumber + ", gender=" + gender
				+ "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(ClassNumber, gender, grade, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return ClassNumber == other.ClassNumber && gender == other.gender && grade == other.grade
				&& Objects.equals(name, other.name);
	}
	
	@Override
	public int compareTo(Object o) {
		return this.name.compareTo(((Student)o).name);
	}
	
	

}
