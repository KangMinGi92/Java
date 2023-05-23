package com.bs.example.practice4.model.vo;

public class Student {
	private static int grade;
	private int classroom;
	private String name;
	private double height;
	private char gender;
	
	{
		Student.grade=1;
		this.classroom=5;
		this.name="김현영";
		this.height=168.5;
		this.gender='여';
	}
	public Student() {

		
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		Student.grade = grade;
	}

	public int getClassroom() {
		return classroom;
	}

	public void setClassroom(int classroom) {
		this.classroom = classroom;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}
	
	public void information() {
		System.out.println(Student.grade+" "+this.classroom+" "+this.name+" "+this.height+" "+this.gender);
		
	}

}
