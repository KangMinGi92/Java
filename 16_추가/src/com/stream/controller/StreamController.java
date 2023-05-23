package com.stream.controller;

import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.stream.common.Gender;
import com.stream.dao.StudentDao;
import com.stream.vo.Student;

public class StreamController {
	public static void main(String[] args) {
		//Builder패턴으로 객체 생성하기
//		Student s=new Student();
//		s=Student.builder().stdNo(1).name("유병승").age(19).height(180.5).gender(Gender.M).address("경기도 시흥시").build();
//		System.out.println(s);
//		s=Student.builder().stdNo(2).name("최주영").build();
//		System.out.println(s);
//		
		
		//Student.Builder builder=new Student.Builder();
		//Stream에 대해 알아보자
		List<Student> student=StudentDao.getStudents();
		System.out.println(student.size());
		for(Student s :student) {
			System.out.println(s);
		}
		
		//student에 저장된 데이터 중 20살이상인 남학생을 오름차순으로 정렬 menList에 저장하기
		List<Student> menList=new ArrayList();
//		for(Student s: student) {
//			if(s.getGender()==Gender.M&&s.getAge()>=20) {
//				menList.add(s);	
//				}
//		}
//		System.out.println(" 20살이상인 남학생을 오름차순으로 정렬 후 출력하기");
//		menList.sort(((s,s1)->s.getAge()-s1.getAge()));
//		menList.forEach((s)->System.out.println(s));
//		
//		menList.forEach((s)->{System.out.println(s);});
		menList=student.stream()
				.filter((s)->s.getGender()==Gender.M)
				.filter((s)->s.getAge()>=50)
				.sorted((s,s1)->s.getAge()-s1.getAge())
				.limit(5)
				.collect(Collectors.toList());
		System.out.println("20세 이상인 남자를 오름차순으로 정렬 후 출력하기");
		menList.forEach((s)->System.out.println(s));
//		java.util.function.Predicate
		
		
		//여학생 중 나이가 30세이상인 학생 조회
		//womenList에 저장 출력
		List<Student> womenList=student.stream()
								.filter((s)->s.getGender()==Gender.F)
								.filter((s)->s.getAge()>=30)
								.sorted((s,s1)->s.getAge()-s1.getAge())
								.collect(Collectors.toList());
		System.out.println("30세 이상인 여자를 오름차순으로 정렬 후 출력하기");
		womenList.forEach((s)->System.out.println(s));
		
		//학생나이 평균구하기
//		double avgAge=0;
//		for(Student s:student) {
//			avgAge+=s.getAge();
//		}
//		System.out.println("학생의 평균나이 : "+avgAge/student.size());
		double avgAge=student.stream().collect(Collectors.averagingDouble((s)->s.getAge()));
		System.out.println("학생의 평균나이 : "+avgAge);
		//학생 키 평균 구하기
		
		avgAge=student.stream().collect(Collectors.averagingDouble(Student::getHeight));
		System.out.println("학생의 평균키 : "+avgAge);
		
		//원하는 값만 출력하기
		//여학생 중 나이가 20대인 학생이름만 출력하기
		List<String>names=student.stream()
								.filter((s)->s.getGender()==Gender.F&&s.getAge()>=20&&s.getAge()<30)
								.map((s)->s.getName())
								.collect(Collectors.toList());
		System.out.println(names);
		
		//나이에 대한 개수, 합계, 평균 을 한번에 구하기
		IntSummaryStatistics iss=student.stream().collect(Collectors.summarizingInt(Student::getAge));
		
		System.out.println(iss.getCount());
		System.out.println(iss.getSum());
		System.out.println(iss.getAverage());
		
		//데이터를 그룹별로 집계하기
		//10대, 20대, 30대, 40대, 50대까지 연령별 분리하기
		Map<String,List<Student>> studentGroup=student.stream().collect(Collectors.groupingBy(s->{
			if(s.getAge()>=20&&s.getAge()<30) return "20대";
			else if(s.getAge()>=30&&s.getAge()<40) return "30대";
			else if(s.getAge()>=40&&s.getAge()<50) return "40대";
			else if(s.getAge()>=50&&s.getAge()<60) return "50대";
			else return "10대";
		}));
		System.out.println(studentGroup.get("20대").size());
		System.out.println(studentGroup.get("30대").size());
		System.out.println(studentGroup.get("40대").size());
		System.out.println(studentGroup.get("50대").size());
		System.out.println(studentGroup.get("10대").size());
		
	}
		
}

