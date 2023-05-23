package com.bs.example.practice5.model.vo;

public class Lotto {
	private int[] lotto;
	
	{//초기화블록
		lotto=new int[6];
	for(int i=0;i<6;i++) {
		lotto[i]=(int)(Math.random()*45)+1;
		for(int j=0;j<i;j++) {
			if(lotto[j]==lotto[i]) {
				i--;
				break;
			}
		}
	}
	}//초기화 블록
	
	public Lotto() {}

	public void setLotto(int[] num) {
		this.lotto=num;
	}

	public int[] getLotto() {
		return lotto;
	}
	public void information() {
		for(int z:this.lotto) {
			System.out.print(z+" ");
		}
	}
}
