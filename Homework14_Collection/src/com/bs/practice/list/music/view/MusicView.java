package com.bs.practice.list.music.view;

import java.util.Scanner;

import com.bs.practice.list.music.controller.MusicController;
import com.bs.practice.list.music.model.vo.Music;

public class MusicView {
	private Scanner sc=new Scanner(System.in);
	private MusicController mc=new MusicController();
	
	public MusicView() {
		// TODO Auto-generated constructor stub
	}
	
	public void mainMenu() {
		while(true) {
		System.out.println("******** 메인 메뉴 ********");
		System.out.println("1.마지막 위치에 곡 추가");
		System.out.println("2.첫 위치에 곡 추가");
		System.out.println("3.전체 곡 목록 출력");
		System.out.println("4.특정 곡 검색");
		System.out.println("5.특정 곡 삭제");
		System.out.println("6.특정 곡 정보 수정");
		System.out.println("7.곡명 오름차순 정렬");
		System.out.println("8.가수명 내림차순 정렬");
		System.out.println("9.종료");
		System.out.print("메뉴 번호 선택 : ");
		int num=sc.nextInt();
			switch(num) {
				case 1 : addList();break;
				case 2 : addAtZero();break;
				case 3 : printAll();break;
				case 4 : searchMusic();break;
				case 5 : removeMusic();break;
				case 6 : setMusic();break;
				case 7 : ascTitle();break;
				case 8 : descSinger();break;
				case 9 : System.out.println("종료"); return;
				default : System.out.println("잘못입력하셨습니다. 다시입력해주세요");break;
			}
		}
	}
	public void addList() {
		System.out.println("***** 마지막 위치에 곡 추가 *****");
		System.out.print("곡 명 : ");
		sc.nextLine();
		String title=sc.nextLine();
		System.out.print("가수 명 : ");
		String singer=sc.next();
		Music m=new Music(title,singer);
		System.out.println(mc.addList(m)==1?"추가 성공":"추가 실패");
	}
	public void addAtZero() {
		System.out.println("***** 첫 위치에 곡 추가 *****");
		System.out.print("곡 명 : ");
		sc.nextLine();
		String title=sc.nextLine();
		System.out.print("가수 명 : ");
		String singer=sc.next();
		Music m=new Music(title,singer);
		System.out.println(mc.addList(m)==1?"추가 성공":"추가 실패");
		
	}
	public void printAll() {
		System.out.println("***** 전체 곡 목록 출력 *****");
		mc.printAll().forEach((m)->System.out.print("["+m+"]"));
		System.out.println();
	}
	public void searchMusic() {
		System.out.println("***** 특정 곡 검색 *****");
		System.out.print("곡 명 : ");
		sc.nextLine();
		String title=sc.nextLine();
		Music m=mc.searchMusic(title);
		if(m!=null) {
			System.out.println("검색한 곡은 "+title+"("+m.getTitle()+" , "+m.getSinger()+")"+"입니다.");
		}else {
			System.out.println("검색한 곡이 없습니다.");
		}
	}
	public void removeMusic() {
		System.out.println("***** 특정 곡 삭제 *****");
		System.out.print("곡 명 : ");
		sc.nextLine();
		String title=sc.nextLine();
		Music m=mc.removeMusic(title);
		if(m==null) {
			System.out.println("삭제할 곡이 없습니다.");
		}else {
			System.out.println(title+"("+m.getTitle()+" , "+m.getSinger()+")"+"을 삭제 했습니다.");
		}	
	}
	public void setMusic() {
		System.out.println("***** 특정 곡 삭제 *****");
		System.out.print("검색할 곡 명 : ");
		sc.nextLine();
		String title=sc.nextLine();
		System.out.print("수정할 곡 명 : ");
		String editTitle=sc.nextLine();
		System.out.print("가수 명 : ");
		String singer=sc.next();
		Music m=new Music(editTitle, singer);
		Music result=mc.setMusic(title, m);
		if(result==null) {
			System.out.println("수정할 곡이 없습니다.");
		}else {
			System.out.println(title+"("+result.getTitle()+" , "+result.getSinger()+")"+"의 값이 변경되었습니다.");
		}	
	}
	public void ascTitle() {
		System.out.println(mc.ascTitle()==1?"정렬 성공":"정렬 실패");
	}
	public void descSinger() {
		System.out.println(mc.descSinger()==1?"정렬 성공":"정렬 실패");
		
	}
	
	
	
}
