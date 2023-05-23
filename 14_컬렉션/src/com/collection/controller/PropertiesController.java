package com.collection.controller;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesController {
	public static void main(String[] args) {
		//Properties : Map형식으로 데이터를 저장하는 클래스
		//파일과 연동해서 데이터를 저장 및 출력 : properties, xml
		//문자열데이터를 저장하고 출력하는 기능
		//key=value형식으로 저장된다.
		Properties prop=new Properties();
		
		//properties객체에 값저장하기
		//put()메소드를 이용한다.
		prop.put("name","유병승");
		prop.put("age","19");
		System.out.println(prop);
		//setProperty()메소드를 문자열을 저장할때 사용
		prop.setProperty("userId","admin");
		prop.setProperty("password","1234");
		System.out.println(prop);
		
		//파일과 연동해서 처리함
		//지정된 파일에 properties객체에 저장된 내용을 저장시킬 수 있음
		//store(FileOutputStream)메소드 이용
		//storeToXML()
		try {
			prop.store(new FileOutputStream("first.properties"),"first properties(comment)");
			prop.storeToXML(new FileOutputStream("first.xml"),"");
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		//파일로 저장한 내용 가져오기
		//load(FileInputStream)메소드 이용
		Properties prop2=new Properties();
		System.out.println("불러오기 전 : "+prop2);
		System.out.println();
		try {
			prop2.load(new FileInputStream("first.properties"));
			prop.loadFromXML(new FileInputStream("mydata.xml"));
		}catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("불러온 후 : "+prop2);
		
		//properties에 저장된 데이터 불러오기
		//getProperty("key")메소드 이용
		System.out.println(prop2.getProperty("userId"));
		System.out.println(prop.getProperty("driver"));
		

		try {
			prop.load(new FileInputStream("dataaccess.properties"));
		}catch(IOException e) {
			e.printStackTrace();
		}
		String driver=prop.getProperty("driver");
		System.out.println(driver);
		
		System.out.println(PropertiesController.class.getResource("./"));
	}

}
