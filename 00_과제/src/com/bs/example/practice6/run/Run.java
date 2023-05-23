package com.bs.example.practice6.run;

import com.bs.example.practice6.model.vo.Book;

public class Run {

	public static void main(String[] args) {
		Book b = new Book();
		b.inform();
		Book b1 = new Book("자기개발서","밥뜨랑","사장");
		b1.inform();
		Book b2 = new Book("정보처리기사","큐넷","유병승",100,0.5);
		b2.inform();
		

	}

}
