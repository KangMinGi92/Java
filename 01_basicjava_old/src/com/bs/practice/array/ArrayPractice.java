package com.bs.practice.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {
	public void practice1() {
		int[] num = new int[10];
		for(int i=0;i<num.length;i++) {
			num[i]=i+1;
		}
		for(int i=0;i<num.length;i++) {
			System.out.print(num[i]+" ");
		}
	}//practice1()
	
	public void practice2() {
		int[] num = new int[10];
		for(int i=0;i<num.length;i++) {
			num[i]=i+1;
			for(int j=0;j<i;j++) {
				if(num[i]>num[j]) {
					int t=num[i];
					num[i]=num[j];
					num[j]=t;
				}
			}
		}
		for(int i=0;i<num.length;i++) {
			System.out.print(num[i]+" ");
		}
	}//practice2()
	
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("양의 정수 : ");
		int su = sc.nextInt();
		int[] num = new int[su];
		for(int i=0;i<num.length;i++) {
			num[i]=i+1;
		}
		for(int i=0;i<num.length;i++) {
			System.out.print(num[i]+" ");
		}
	}//practice3()
	
	public void practice4() {
		String[] str = {"사과","귤","포도","복숭아","참외"};
		System.out.println(str[1]);
	}//practice4()

	public void practice5() {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 : ");
		String str = sc.next();
		System.out.print("문자 : ");
		char moon = sc.next().charAt(0);
		String num = "";
		int count =0;
		
		char[]msg= new char[str.length()];
		for(int i=0;i<msg.length;i++) {
			msg[i]=str.charAt(i);
			if(msg[i]==moon) {
				num+=i+" ";
				count++;
			}
		}
		System.out.println(str+"에 "+moon+"가 존재하는 위치(인덱스) : "+num);
		System.out.println("i 개수 : " + count);	
			
	}//practice5()
	
	public void practice6() {
		Scanner sc = new Scanner(System.in);
		System.out.print("0~6사이 숫자 입력 : ");
		int num = sc.nextInt();
		String[] day = {"월요일","화요일","수요일","목요일","금요일","토요일","일요일"};
		if(0<=num &&num<=6) {
			System.out.println(day[num]);	
		} else
			System.out.println("잘못 입력하셨습니다.");
	}//practice6()
	
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int num = sc.nextInt();
		int[] numbers = new int[num];
		int sum = 0;
		System.out.print("배열 0번째 인덱스에 넣을 값 : ");
		numbers[0] = sc.nextInt();
		System.out.print("배열 1번째 인덱스에 넣을 값 : ");
		numbers[1] = sc.nextInt();
		System.out.print("배열 2번째 인덱스에 넣을 값 : ");
		numbers[2] = sc.nextInt();
		System.out.print("배열 3번째 인덱스에 넣을 값 : ");
		numbers[3] = sc.nextInt();
		System.out.print("배열 4번째 인덱스에 넣을 값 : ");
		numbers[4] = sc.nextInt();
		for(int i=0;i<numbers.length;i++) {
			sum += numbers[i];
			System.out.print(numbers[i]+" ");	
		}System.out.println();
		System.out.println("총 합 : "+sum);
	}//practice7()
	public void practice8() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int su = sc.nextInt();
		int[] num = new int[su];
		for(int i=0;i<num.length;i++) {
			if(i<=num.length/2) {
				num[i]=i+1;
			}
				
		}
		for(int i=0;i<num.length;i++) {
			System.out.print(num[i]+" ");
		}
		
	}//practice8()
	public void practice9() {
		Scanner sc = new Scanner(System.in);
		System.out.print("치킨 이름을 입력하세요 : ");
		String name = sc.next();
		String[] chicken = {"양념","후라이드","간장","허니콤보"};
		String msg = "치킨은 없는 메뉴입니다.";
		for(int i=0;i<chicken.length;i++) {
			if(chicken[i].equals(name)) {
				msg = "치킨 배달 가능";
				break;
			}
		}System.out.println(name+msg);
	}//practice9()
	
	public void practice10() {
//		//깊은복사 -> 값자체를 복사해서 새로운 저장소에 저장
//		int[] deepcopy=new int[num.length];
//		for(int i=0;i<num.length;i++) {
//			deepcopy[i]=num[i];
		Scanner sc = new Scanner(System.in);
		System.out.print("주민등록번호(-포함) : ");
		String str = sc.next();
		char[] number = new char[str.length()];
		char[] deepcopy = new char[number.length];
		for(int i=0;i<number.length;i++) {
			number[i]=str.charAt(i);
			deepcopy[i]=str.charAt(i);
			if(i>=8) {
				deepcopy[i]='*';
			}
		}for(int i=0;i<number.length;i++) {
			System.out.print(deepcopy[i]);
		}
	}//practice10()
	
	public void practice11() {
		int[] num = new int[10];
		for(int i=0;i<10;i++) {
			int random =(int)(Math.random()*10)+1;
			num[i]=random;
		}
		for(int i=0;i<10;i++) {
			System.out.print(num[i]+" ");
		}
	}//practice11()
	
	public void practice12() {
		int[] num = new int[10];
		int t = 0;
		int z = 100;
		for(int i=0;i<10;i++) {
			int random = (int)(Math.random()*10)+1;
			num[i]=random;
		}
		for(int i=0;i<10;i++) {
			for(int j=0;j<i;j++) {
				if(t<=num[j]&&num[j]<num[i]) {
					t=num[i];
				}
				if(t<=num[j]&&num[j]>num[i]) {
					t=num[j];
				}	
			}
		}
		for(int i=0;i<10;i++) {
			for(int j=0;j<i;j++) {
				if(z>=num[j]&&num[j]>num[i]) {
					z=num[i];
				}
				if(z>=num[j]&&num[j]<num[i]) {
					z=num[j];
				}
			}
		}
		for(int i=0;i<10;i++) {
			System.out.print(num[i]+" ");
		}System.out.println();
		System.out.println("최대값 : "+t);
		System.out.println("최소값 : "+z);
	}//practice12()
	public void practice13() {
		int[] num = new int[10];
		
		for(int i=0;i<num.length;i++) {
			num[i]=(int)(Math.random()*10)+1;
			for(int j=0;j<i;j++) {
				if(num[j]==num[i]) {
					i--;
				}
			}
		}
		for(int z:num) {
			System.out.print(z+" ");
		}
	}//practice13()
	public void practice14() {
		int[] lotto = new int[6];
		for(int i=0;i<lotto.length;i++) {
			lotto[i]=(int)(Math.random()*45)+1;
			for(int j=0;j<i;j++) {
				if(lotto[j]>lotto[i]) {
					int t=lotto[j];
					lotto[j]=lotto[i];
					lotto[i]=t;
				} else if(lotto[j]==lotto[i]) {
					i--;
				}
			}
		}
		for(int z:lotto) {
			System.out.print(z+" ");
		}
	}//practice14()
	public void practice15() {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 : ");
		String str = sc.next();
		int count = 0;
		char[] ch1=new char[str.length()];
		char[] ch2=new char[str.length()];
		for(int i=0;i<str.length();i++) {
			 ch1[i] = str.charAt(i);
			 for(int j=0;j<i;j++) {
				 if(ch1[j]==ch1[i]) {
					 char t=ch1[j];
					 ch2[j]=t;
					 count++;
				 }
			}
		} 
		for(char z:ch2) {
			System.out.print(z+", ");
		}System.out.println();
		System.out.println("문자 개수 : "+count);
	}//practice15()
	
	public void practice16() {
		Scanner sc=new Scanner(System.in);
		System.out.print("배열의 크기를 입력하세요 : ");
		int num1=sc.nextInt();
		sc.nextLine();
		int num2=0;
		boolean flag=false;
		do {
			System.out.println(num2);
			String[] arr=new String[num1+num2];
			for(int i=0;i<num1+num2;i++) {			
					System.out.print(i+num2+1+"번째 문자열 : ");
					arr[i]=sc.nextLine();	
			}
			System.out.print("더 값을 입력하시겠습니까?(Y/N) : ");
			char check=sc.next().charAt(0);
			if(check=='Y') {
				flag=true;
				System.out.print("더 입력하고 싶은 개수 : ");
				num2+=sc.nextInt();
				sc.nextLine();
			}else {
				flag=false;
			}	
			for(String t:arr) {
				System.out.print(t+" ");
			}
		}while(flag);
	}
	
}

