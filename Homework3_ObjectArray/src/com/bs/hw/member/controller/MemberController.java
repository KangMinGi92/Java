package com.bs.hw.member.controller;

import com.bs.hw.member.model.vo.Member;

public class MemberController {
	private Member[] m=new Member[SIZE];
	public static int SIZE = 10;
	
	public MemberController() {
		// TODO Auto-generated constructor stub
	}
	
	public int existMemberNum() {
		int num=SIZE-10;
		return num;
	}
	public boolean checkId(String inputId) {
		for(int i=0;i<m.length;i++) {
			if(!m[i].getId().equals(null)&&m[i+1].getId().equals(inputId)) {
				return true;
			}
		}
		return false;
	}
	public void insertMember(String id, String name, String password, String email,char gender, int age) {
		for(int i=0;i<m.length;i++) {
			m[i]=new Member(id,name,password,email,gender,age);	
			}SIZE++;
	}
	public String searchId(String id) {
		String result="";
		for(int i=0;i<m.length;i++) {
			if(!m[i].getId().equals(null)&&m[i].getId().equals(id)) {
				result=m[i].inform();
			}else {
				result="검색 결과가 없습니다.";
			}
		}
		return result;
	}
	public Member[] searchName(String name) {
		Member[] result=new Member[m.length];
		for(int i=0;i<m.length;i++) {
			if(!m[i].getName().equals(null)&&m[i].getName().equals(name)) {
				result[i]=m[i];
			}else {
				System.out.println("검색 결과가 없습니다.");
			}
		}
		return result;
	}
	public Member[] searchEmail(String email) {
		Member[] result=new Member[m.length];
		for(int i=0;i<m.length;i++) {
			if(!m[i].getEmail().equals(null)&&m[i].getEmail().equals(email)) {
				result[i]=m[i];
			}else {
				System.out.println("검색 결과가 없습니다.");
			}
		}
		return result;
	}
	public boolean updatePassword(String id, String password) {
		for(int i=0;i<m.length;i++) {
			if(!m[i].getId().equals(null)&&m[i].getId().equals(id)) {
				m[i].setPassword(password);
				return true;
			}
		}
		return false;
	}
	public boolean updateName(String id, String name) {
		for(int i=0;i<m.length;i++) {
			if(!m[i].getId().equals(null)&&m[i].getId().equals(id)) {
				m[i].setName(name);
				return true;
			}
		}
		return false;
	}
	public boolean updateEmail(String id, String email) {
		for(int i=0;i<m.length;i++) {
			if(!m[i].getId().equals(null)&&m[i].getId().equals(id)) {
				m[i].setEmail(email);
				return true;
			}
		}
		return false;
	}
	public boolean delete(String id) {
		for(int i=0;i<m.length;i++) {
			if(!m[i].getId().equals(null)&&m[i].getId().equals(id)) {
		
				return true;
			}
		}

		return false;
	}
	public void delete() {
		
	}
	public Member[] printAll() {
		Member[] result=new Member[m.length];
		if(existMemberNum()==0) {
			System.out.println("저장된 회원이 없습니다.");
		}
		if(existMemberNum()!=0) {
			for(int i=0;i<m.length;i++) {
				if(existMemberNum()!=0) {
					result[i]=m[i];
				}
			}
		}
		return result;
	}
}
