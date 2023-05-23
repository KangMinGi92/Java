package com.bs.practice.student.view;

import com.bs.practice.student.controller.StudentController;
import com.bs.practice.student.model.vo.Student;

public class StudentMenu {
	private StudentController ssm=new StudentController();
	
	public StudentMenu() {
		System.out.println("========= 학생 정보 출력 =========");
		for(Student p:ssm.PrintStudent()) {
			System.out.println(p.inform());
		}
		System.out.println();
		System.out.println("========= 학생 성적 출력 =========");
		System.out.println("학생 점수 합계 : "+ssm.sumScore());
		System.out.println("학생 점수 평균 : "+ssm.avgScore());
		System.out.println();
		System.out.println("========= 성적 결과 출력 =========");
		for(int i=0;i<ssm.PrintStudent().length;i++) {
			if(ssm.PrintStudent()[i].getScore()<StudentController.CUT_LINE) {
				System.out.println(ssm.PrintStudent()[i].getName()+"학생은 재시험 대상입니다.");
			}else {
				System.out.println(ssm.PrintStudent()[i].getName()+"학생은 통과입니다.");
			}
		}
	}
}
