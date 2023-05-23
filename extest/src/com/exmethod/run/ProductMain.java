package com.exmethod.run;

import com.exmethod.controller.Product;

public class ProductMain {

	public static void main(String[] args) {
		Product p1 = new Product("컴퓨터","maxbook",200);
		Product p2 = new Product("핸드폰","갤럭시노트",120,0.2);
		Product p3 = new Product("마스크",10,0.5,100);
		
		System.out.println(p1.number+" "+p1.type+" "+p1.name+" "+p1.price);
		System.out.println(p2.number+" "+p2.type+" "+p2.name+" "+p2.price+" "+p2.nego);
		System.out.println(p3.number+" "+p3.type+" "+p3.price+" "+p3.nego+" "+p3.quantity);


	}

}
