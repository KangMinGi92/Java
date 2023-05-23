package com.bs.practice.chap02_abstractNInterface.controller;

import com.bs.practice.chap02_abstractNInterface.model.vo.GalaxyNote9;
import com.bs.practice.chap02_abstractNInterface.model.vo.V40;

public class PhoneController {
	private String[] result=new String[2];
	GalaxyNote9 gn=new GalaxyNote9();
	V40 v40=new V40();
	public String[] method() {
		result[0]=gn.makeCall()+"\n"+gn.takeCall()+"\n"+gn.picture()+"\n"+gn.charge()+"\n"+gn.touch()+"\n"+"블루투스 펜 탑재 여부 : "+gn.bluetoothPen();
		result[1]=v40.makeCall()+"\n"+v40.takeCall()+"\n"+v40.picture()+"\n"+v40.charge()+"\n"+v40.touch()+"\n"+"블루투스 펜 탑재 여부 : "+v40.bluetoothPen();			
	
		return  result;
	}
}
