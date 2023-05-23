package com.bs.practice.list.library.controller;

import java.util.ArrayList;
import java.util.List;

import com.bs.practice.list.library.model.vo.Book;

public class BookController {
	
	private List<Book> bookList=new ArrayList();


		
	
	public BookController() {
		bookList.add(new Book("자바의 정석","남궁 성","기타",20000));
		bookList.add(new Book("쉽게 배우는 알고리즘","문병로","기타",15000));
		bookList.add(new Book("대화의 기술","강보람","인문",17500));
		bookList.add(new Book("암 정복기","박신우","의료",21000));
	}
	
	public void insertBook(Book bk) {
		bookList.add(bk);

	}
	
	public ArrayList<Book> selectList() {
		return (ArrayList<Book>)bookList;
	}
	
	public ArrayList<Book> searchBook(String keyword) {
		ArrayList<Book> searchList=new ArrayList();
		for(Book b : bookList) {
			if(b.getTitle().contains(keyword)) {
				searchList.add(b);
			}
		}
		return (ArrayList<Book>)searchList;
	}
	
	public Book deleteBook(String title,String author) {
		Book removeBook=new Book();
		for(int i=0;i<bookList.size();i++) {
			Book b = bookList.get(i);
		if(b.getTitle().equals(title)&&b.getAuthor().equals(author)) {
			removeBook.setTitle(title);
			removeBook.setAuthor(author);
			bookList.remove(i);
		}
		}
		return removeBook; 
	}
	public int ascBook() {
		bookList.sort((b,b1)->((Book)b).getTitle().compareTo(((Book)b1).getTitle()));
		return 1;
	}

}
