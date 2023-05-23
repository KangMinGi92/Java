package bs.student.dao;

import bs.student.dto.Student;

public class StudentDao {
	private static StudentDao dao;

	public static StudentDao getStudentDao() {
		if (dao == null)
			dao = new StudentDao();
		return dao;
	}

	private Student s1;
	private Student s2;
	private Student s3;
	private Student s4;

	private StudentDao() {
	}

	// 학생을 저장소에 저장하는 기능
	public boolean insertStudent(Student s) {
		boolean result = true;
		if (s1 == null) {
			// s1은 비었다~!!
			s1 = s;
		} else if (s2 == null) {
			s2 = s;
		} else if (s3 == null) {
			s3 = s;
		} else if (s4 == null) {
			s4 = s;
		} else {
			// 입력실패
			result = false;
		}
		return result;
	}// insertStudent()

	// 학생전체정보를 제공해주는 기능
	public String infoStudentAll() {
		// s1,s2,s3,s4에 저장된 학생정보 종합
		// 1.각 s들에 저장이 되어있는지->sn!=null
		String totalStudent = "";
		if (s1 != null) {
			totalStudent += s1.infoStudent() + "\n";
		}
		if (s2 != null) {
			totalStudent += s2.infoStudent() + "\n";
		}
		if (s3 != null) {
			totalStudent += s3.infoStudent() + "\n";
		}
		if (s4 != null) {
			totalStudent += s4.infoStudent() + "\n";
		}
		return totalStudent;
	}// infoStudentAll()

	public String searchByName(String name) {
		// 이름으로 학생을 조회하는 기능
		// 1.사용자가 작성한 이름을 기준으로 조회
		// 화면에 사용자가 이름을 입력할 수 있게 해야한다.
		// 2.dao저장소에 저장된 객체 중 입력한 값이랑 일치하는 이름이 있는지 확인
		// dto에 저장되어있는 이름값을 호출하기(getName)메서드 이용하기
		// getName메서드는 String을 반환하니 equals로 비교하기

		String result = "";
		if (s1 != null && s1.getName().equals(name)) { // s1!=null 이 들어가지 않을경우 sn에 정보가 없을경우 null포인트 에러가 발생한다.
			result += s1.infoStudent() + "\n"; // . 접근연산자를 이용했을때 앞에 값이 null일 경우 접근을 할 수가 없기 때문이다.
		} // else if를 사용 할 경우는 중복값이 없을 경우 사용함. 지금같은 경우는 이름의 경우 동명이인이 있을수 있기 때문에 if를 사용
		if (s2 != null && s2.getName().equals(name)) {
			result += s2.infoStudent() + "\n";
		}
		if (s3 != null && s3.getName().equals(name)) {
			result += s3.infoStudent() + "\n";
		}
		if (s4 != null && s4.getName().equals(name)) {
			result += s4.infoStudent() + "\n";
		}
		return result;
	}// searchByName()

	public boolean updateStudent(Student s) {
		if (s1 != null && s1.getStudentNo().equals(s.getStudentNo())) {
			s1.setGrade(s.getGrade());
			s1.setMajor(s.getMajor());
			s1.setAddress(s.getAddress());
		} else if (s2 != null && s2.getStudentNo().equals(s.getStudentNo())) {
			s2.setGrade(s.getGrade());
			s2.setMajor(s.getMajor());
			s2.setAddress(s.getAddress());
		} else if (s3 != null && s3.getStudentNo().equals(s.getStudentNo())) {
			s3.setGrade(s.getGrade());
			s3.setMajor(s.getMajor());
			s3.setAddress(s.getAddress());
		} else if (s4 != null && s4.getStudentNo().equals(s.getStudentNo())) {
			s4.setGrade(s.getGrade());
			s4.setMajor(s.getMajor());
			s4.setAddress(s.getAddress());
		} else {
			return false;
		}
		return true;
	}
}
