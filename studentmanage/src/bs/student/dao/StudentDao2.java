package bs.student.dao;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import bs.student.common.StudentFilter;
import bs.student.dto.Student;

public class StudentDao2 {
	private static StudentDao2 dao;

	private Student[] students = new Student[10];

	public StudentDao2() {
	}

	public static StudentDao2 getStudentDao() {
		if (dao == null)
			dao = new StudentDao2();
		return dao;
	}

	public boolean insertStudent(Student s) {
		boolean duplicateResult = false;
//		boolean result=false;
		// 중복값 확인하기
		for (Student temp : this.students) {
			if (temp != null && temp.equals(s)) {
				duplicateResult = true;
				break;
			}
		}
		if (!duplicateResult) {
			//for (int i = 0; i < students.length; i++) {
			int i=0;
			while(true) {	
				try {
				if (students[i] == null) {
					students[i] = s;
					return true;
//				result=true;
//				break;
				}
				i++;
				}catch(ArrayIndexOutOfBoundsException e) {
					Student[] temp=new Student[students.length+5];
					System.arraycopy(students,0,temp,0,students.length);
					temp[students.length]=s;
					students=temp;
					return true;
				}
			}
		}
		return false;
//		return result;
	}

	public Student[] infoStudentAll() {
//		String info = "";
		Student[] searchStudent;
		int searchdata = 0;
		for (Student s : students) {
			if (s != null)
				searchdata++;
		}
		searchStudent = new Student[searchdata];
		int index = 0;
		for (Student s : students) {
			if (s != null)
				searchStudent[index++] = s;
		}
		return searchStudent;
//		for (Student s : students) {
//			if (s != null)
//				info += s.infoStudent() + "\n";
//		}
//		return info;
	}

	public String searchByName(String name) {
		String result = "";
		for (Student s : students) {
			if (s != null && s.getName().contains(name)) {
				result += s.infoStudent() + "\n";
			}
		}
		return result;
	}

	public Student[] searchStudent(Object data, StudentFilter sf) {
		Student[] resultStudent = new Student[students.length];
		int index = 0;
		for (int i = 0; i < students.length; i++) {
			if (students[i] != null && sf.check(students[i], data)) {
				resultStudent[index++] = students[i];
			}
		}
		Student[] temp = new Student[index];
		System.arraycopy(resultStudent, 0, temp, 0, index);
		resultStudent = temp;
		return resultStudent;
	}

	public boolean updateStudent(Student s) {
		for (Student saveStudent : students) {
			if (saveStudent != null && saveStudent.getStudentNo().equals(s.getStudentNo())) {

				saveStudent.setGrade(s.getGrade());
				saveStudent.setAddress(s.getAddress());
				saveStudent.setMajor(s.getMajor());
				return true;
			}
		}
		return false;
	}

	public boolean saveStudent() {
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("student.bs"))) {
			oos.writeObject(this.students);
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	public boolean loadStudent() {
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("student.bs"))) {
			this.students = (Student[]) ois.readObject();
		} catch (ClassNotFoundException | IOException e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
}
