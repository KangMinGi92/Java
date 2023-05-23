package com.inter.model.vo;

import com.inter.common.PrinterDriver;

public class Cannon implements PrinterDriver{
	
	public void canonPrint() {
		System.out.println("캐논프린터 인쇄중....");
	}
	
	@Override
	public void print() {
		canonPrint();
	}
}
