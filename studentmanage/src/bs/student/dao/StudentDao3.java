package bs.student.dao;



import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;


import bs.student.common.StudentFilter;
import bs.student.dto.Student;

public class StudentDao3 {
//컬렉션 프레임워크를 이용해서 구현하시오!
	private static StudentDao3 dao;
	ArrayList<Student> students=new ArrayList<Student>();
	
	public StudentDao3() {
		// TODO Auto-generated constructor stub
	}
	
	public static StudentDao3 getStudentDao2() {
		if (dao == null)
			dao = new StudentDao3();
		return dao;
	}
	
	public boolean insertStudent(Student s) {
//		boolean duplicateResult = false;
//		if(students.isEmpty()) {
//			students.add(s);
//			return true;
//		}
//		for(Student st : students) {
//			if(st!=null&&st.equals(s)) {
//				duplicateResult=true;
//				break;
//			}
//		}
//		if(!duplicateResult) {
//					students.add(s);
//					return true;
//		}
//		return false;
		if(students.contains(s)) {
			return false;
		}else {
			students.add(s);
			return true;
		}
	}

	public ArrayList<Student> infoStudentAll() {
		
		return students;
	}
	
	public ArrayList<Student> searchByName(String name) {
		ArrayList<Student> result=new ArrayList<Student>();
		for(Student st : students) {
			if(st!=null&&st.getName().equals(name)) {
				result.add(st);
			}
		}
		return result;
	}
	
	public ArrayList<Student> searchStudent(Object data, StudentFilter sf) {
		ArrayList<Student> resultStudent = new ArrayList<Student>();
		for(Student st : students) {
				if (st!=null&& sf.check(st, data)) {
					resultStudent.add(st);
				}
			}
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
			this.students = (ArrayList)ois.readObject();
		} catch (ClassNotFoundException | IOException e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

}