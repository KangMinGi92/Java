package com.game;

import java.util.Scanner;

public class Controller {
	public void practice1() {
//		1. 가위바위보게임
//		 설명 
//		 - 사용자에게 가위, 바위, 보 중 한개를 입력하도록하고(입력방식은 숫자)
//		 - 컴퓨터가 랜덤값으로 세개중 하나의 데이터를 대입
//		 - 컴퓨터의 값과 사용자의 값을 비교하여 다음의 결과출력
//		   같으면 비겼습니다. 출력 후 다시 사용자와 컴퓨터가 선택할 수 있도록 로직구성
//		   컴퓨터가 사용자에게 이기면 컴퓨터가 이겼습니다. 출력
//		   사용자가 컴퓨터에게 이기면 사용자가 있겼습니다. 출력   
	//
//		-  승자가 나왔으면 다시 하겠습니다 출력 
//		    다시하면 위에 로직 다시 실행
//		    종료하면 프로그램 종료
//		- 추가 : 만일 위내용을 쉽게 처리 했으면 프로그램 종료시 지금까지 전적을 출력
//		       컴퓨터 승 00번, 사용자 승 00번
	}//practice1()
	
	public void upDwon() {
		//up&down 게임만들기
		//랜덤으로 1~50까지의 수중 한개를 저장
		//사용자에게 값을 입력받아 랜덤값과 비교하고 랜덤값이 크면 up출력
		//작으면 Down출력 맞추면 정답입니다.!! 짝짝짝! 출력 정답을 맞출때 까지 진행!
		Scanner sc = new Scanner(System.in);
		int random = (int)(Math.random()*50)+1;
		System.out.print("값입력 : ");
		int num = sc.nextInt();
			do{
				if(random>num) {
				System.out.println("Up");
				} 	else if(random<num) {
				System.out.println("Down");	
				} 	else if(random==num) {
				System.out.println("정답입니다.!! 짝짝짝!!");
				}
			} while(random==num);
			System.out.println(num);
			System.out.println(random);
	}//upDown()
}