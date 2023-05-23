package com.bs.hw.member.view;

import java.util.Scanner;

import com.bs.hw.member.controller.MemberController;
import com.bs.hw.member.model.vo.Member;

public class MemberMenu {
	private Scanner sc=new Scanner(System.in);
	private MemberController mc=new MemberController();
	
	public MemberMenu() {
		// TODO Auto-generated constructor stub
	}
	
	public void mainMenu() {

		while(true) {
			System.out.println("최대 등록 가능한 회원 수는 10명입니다.");
			System.out.println("현재 등록된 회원 수는 "+mc.existMemberNum()+"명입니다.");
			if(mc.existMemberNum()<10) {
			System.out.println("1. 새 회원 등록");};
			System.out.println("2. 회원 검색");
			System.out.println("3. 회원 정보 수정");
			System.out.println("4. 회원 삭제");
			System.out.println("5. 모두 출력");
			System.out.println("9. 끝내기");
			System.out.print("메뉴 번호 : ");
			int num = sc.nextInt();
			switch(num) {
			case 1 :if(mc.existMemberNum()<10) { 
				insertMember();break;};
			case 2 : searchMember();break;
			case 3 : updateMember();break;
			case 4 : deleteMember();break;
			case 5 : printAll();break;
			case 9 : return;
			default : System.out.println("잘못 입력하셨습니다. 다시 입력해주세요"); break;
			}
		}
		
	}
	public void insertMember() {
		do {
		System.out.println("새 회원을 등록합니다.");
		System.out.print("아이디 : ");
		String id=sc.next();
		if(mc.existMemberNum()>0) {
		boolean flag=true;
			while(flag) {
				if(mc.checkId(id)) {
				System.out.println("중복된 아이디 입니다. 다시 입력해주세요.");
				}
				flag=false;
			}
		}
		System.out.print("이름 : ");
		String name=sc.next();
		System.out.print("비밀번호 : ");
		String password=sc.next();
		System.out.print("이메일 : ");
		String email=sc.next();
		boolean flag=true;
		char gender=' ';
		while(flag) {
			System.out.print("성별(M/F) : ");
			gender=sc.next().charAt(0);
			if(gender=='M'||gender=='m'||gender=='F'||gender=='f') {
				flag=false;
			}else {
				System.out.println("성별을 다시 입력하세요.");
				flag=true;
			}
		}
		System.out.print("나이 : ");
		int age=sc.nextInt();
		mc.insertMember(id, name, password, email, gender, age);
		
		}while(false);
		
		
	}
	public void searchMember() {
		while(true) {
			System.out.println("1.아이디로 검색하기");
			System.out.println("2.이름으로 검색하기");
			System.out.println("3.이메일로 검색하기");
			System.out.println("9.메인으로 돌아가기");
			System.out.print("메뉴 번호 : ");
			int num=sc.nextInt();
			switch(num) {
			case 1 : searchId();break;
			case 2 : searchName();break;
			case 3 : searchEmail();break;
			case 9 : System.out.println("메인으로 돌아갑니다.");return;
			default : System.out.println("잘못 입력하셨습니다.");return;
			}
		}
	}
	public void searchId() {
		System.out.print("검색할 아이디 : ");
		String id=sc.next();
		System.out.println("찾으신 회원 조회 결과입니다.");
		System.out.println(mc.searchId(id));
		return;
	}
	public void searchName() {
		System.out.print("검색할 이름 : ");
		String name=sc.next();
		System.out.println("찾으신 회원 조회 결과입니다.");
		for(Member p : mc.searchName(name)) {
			System.out.println(p.inform());
		return;
		}
	}
	public void searchEmail() {
		System.out.print("검색할 이메일 : ");
		String email=sc.next();
		System.out.println("찾으신 회원 조회 결과입니다.");
		for(Member p : mc.searchEmail(email)) {
			System.out.println(p.inform());
		return;
		}
	}
	public void updateMember() {
		while(true) {
			System.out.println("1.비밀번호 수정하기");
			System.out.println("2.이름 수정하기");
			System.out.println("3.이메일 수정하기");
			System.out.println("9.메인으로 돌아가기");
			System.out.print("메뉴 번호 : ");
			int num=sc.nextInt();
			switch(num) {
				case 1 : updatePassword();return;
				case 2 : updateName();return;
				case 3 : updateEmail();return;
				case 9 : System.out.println("메인으로 돌아갑니다.");return;
				default : System.out.println("잘못 입력하셨습니다.");return;
			}
		}
	}
	public void updatePassword() {
		System.out.print("수정할 회원의 아이디 : ");
		String id=sc.next();
		System.out.print("수정할 비밀번호 : ");
		String password=sc.next();
		System.out.println(mc.updatePassword(id, password)?"수정이 성공적으로 되었습니다.":"존재하지 않는 아이디입니다.");
		return;
	}
	public void updateName() {
		System.out.print("수정할 회원의 아이디 : ");
		String id=sc.next();
		System.out.print("수정할 이름 : ");
		String name=sc.next();
		System.out.println(mc.updatePassword(id, name)?"수정이 성공적으로 되었습니다.":"존재하지 않는 아이디입니다.");
		return;
		
	}
	public void updateEmail() {
		System.out.print("수정할 회원의 아이디 : ");
		String id=sc.next();
		System.out.print("수정할 이름 : ");
		String email=sc.next();
		System.out.println(mc.updatePassword(id, email)?"수정이 성공적으로 되었습니다.":"존재하지 않는 아이디입니다.");
		return;
		
	}
	public void deleteMember() {
		while(true) {
			System.out.println("1.특정 회원 삭제하기");
			System.out.println("2.모든 회원 삭제하기");
			System.out.println("9.메인으로 돌아가기");
			System.out.print("메뉴 번호 : ");
			int num=sc.nextInt();
			switch(num) {
				case 1 : deleteOne();return;
				case 2 : deleteAll();return;
				case 9 : System.out.println("메인으로 돌아갑니다.");return;
				default : System.out.println("잘못 입력하셨습니다.");return;
			}
		}
		
	}
	public void deleteOne() {
		System.out.print("삭제할 회원의 아이디 : ");
		String id=sc.next();
		System.out.print("정말 삭제하시겠습니까?(y/n) : ");
		char check=sc.next().charAt(0);
		if(check=='y'||check=='Y') {
			System.out.println(mc.delete(id)?"성공적으로 삭제하였습니다.":"존재하지 않는 아이디입니다.");
			return;
		}else {
			System.out.println("잘못 입력하셨습니다.");
			return;
		}
	}
	public void deleteAll() {
		
	}
	public void printAll() {
		for(Member p : mc.printAll()) {
			if(mc.existMemberNum()!=0) {
			System.out.println(p.inform());
			}
		return;
		}
	}
}