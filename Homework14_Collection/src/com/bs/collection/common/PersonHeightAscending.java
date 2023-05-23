package com.bs.collection.common;

import java.util.Comparator;

import com.bs.collection.model.vo.Person;



public class PersonHeightAscending implements Comparator{
	
	@Override
	public int compare(Object o1, Object o2) {
		//오름차순정렬
		Person prev=(Person)o1;
		Person next=(Person)o2;
		return (int)prev.getHeight()-(int)next.getHeight();
	}

}

