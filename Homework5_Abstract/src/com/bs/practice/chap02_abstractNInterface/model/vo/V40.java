package com.bs.practice.chap02_abstractNInterface.model.vo;

public class V40 extends SmartPhone implements NotePen{
	public V40() {
		super.setMaker("LG");
	}
	
	public String makeCall() {
		return"번호를 누르고 통화버튼을 누름";
	}
	public String takeCall() {
		return"수신 버튼을 누름";
	}
	public String picture() {
		return"1200, 1600만 트리플 카메라";
	}
	@Override
	public String charge() {
		return "고속 충전, 고속 무선 충전";
	}
	@Override
	public String touch() {
		return "정전식";
	}
	@Override
	public boolean bluetoothPen() {
		return false;
	}
	@Override
	public String printInformation() {
		return "";
	}
}
