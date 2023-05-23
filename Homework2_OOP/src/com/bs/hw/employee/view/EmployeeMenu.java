package com.bs.hw.employee.view;

import java.util.Scanner;

import com.bs.hw.employee.controller.EmployeeController;

public class EmployeeMenu {
	private Scanner sc=new Scanner(System.in);
	private EmployeeController ec = new EmployeeController();
	
	public EmployeeMenu() {
		boolean flag =true;
		do {
			System.out.println("1. 사원 추가");
			System.out.println("2. 사원 수정");
			System.out.println("3. 사원 삭제");
			System.out.println("4. 사원 출력");
			System.out.println("9. 프로그램 종료");
			System.out.print("메뉴 번호를 누르세요 : ");
			int num = sc.nextInt();
			
			switch(num) {
				case 1 : insertEmp();break;
				case 2 : updateEmp();break;
				case 3 : deleteEmp();break;
				case 4 : printEmp();break;
				case 9 : System.out.println("프로그램을 종료합니다.");return;
				default : System.out.println("번호를 잘못 입력했습니다.");break;
			}
		} while(flag);
	}
	
	public void insertEmp() {
		boolean flang=true;
		do {
			System.out.print("사원 번호 : ");
			int empNo=sc.nextInt();
			System.out.print("사원 이름 : ");
			String name=sc.next();
			System.out.print("사원 성별 : ");
			char gender=sc.next().charAt(0);
			System.out.print("전화 번호 : ");
			String phone=sc.next();
			ec.add(empNo,name,gender,phone);
			System.out.print("추가 정보를 더 입력하시겠습니까?(y/n) : ");
			char check=sc.next().charAt(0);
			if(check=='y'||check=='Y') {
				System.out.print("사원 부서: ");
				String dept=sc.next();
				System.out.print("사원 연봉: ");
				int salary=sc.nextInt();
				System.out.print("보너스 율: ");
				double bonus=sc.nextDouble();
				ec.add(empNo, name, gender, phone, dept, salary, bonus);
				return;
			}else {
				return;
			}
		}while(true);
	}//insertEmp()
	public void updateEmp() {
		System.out.println("가장 최신의 사원 정보를 수정하게 됩니다.");
		System.out.println("사원의 어떤 정보를 수정하시겠습니까?");
		System.out.println("1. 전화번호");
		System.out.println("2. 사원 연봉");
		System.out.println("3. 보너스 율");
		System.out.println("9. 프로그램 종료");
		System.out.print("메뉴 번호를 누르세요 : ");
		int num = sc.nextInt();
		
		switch(num) {
			case 1 : System.out.print("수정할 전화번호 : ");
						String phone = sc.next();
						ec.modify(phone);break;
			case 2 : System.out.print("수정할 사원 연봉 : ");
						int salary = sc.nextInt();
						ec.modify(salary);break;
			case 3 : System.out.print("수정할 보너스 율 : ");
						double bonus = sc.nextDouble();
						ec.modify(bonus);break;
			case 9 : System.out.println("메인메뉴로 돌아갑니다.");return;
			default : System.out.println("잘못 입력하셨습니다.");return;
		}
	}//updateEmp()
	public void deleteEmp() {
		System.out.print("정말 삭제하시겠습니까?(y/n) : ");
		char check=sc.next().charAt(0);
		if(check=='y') {
			ec.remove();
			System.out.println("데이터 삭제에 성공하였습니다.");
		}else {
		System.out.println("데이터 삭제에 실패하였습니다.");
		}
		
	}
	public void printEmp() {
		if(ec.inform()!="") {
		System.out.println(ec.inform());
		}else {
		System.out.println("사원 데이터가 없습니다.");
		}
	}

}
