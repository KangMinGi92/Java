package com.bs.practice.map.controller;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import com.bs.practice.map.model.vo.Member;

public class MemberController {
	private HashMap map=new HashMap();
	
	public MemberController() {
		// TODO Auto-generated constructor stub
	}
	
	public boolean joinMembership(String id, Member m) {
		Set keys=map.keySet();
		Iterator it=keys.iterator();
		while(it.hasNext()) {
			String s=(String)it.next();
			if(s.equals(id)) {
				return false;
			}
		}
		map.put(id, m);
		return true;
	}
	public String logIn(String id, String password) {
		Set setEntry=map.entrySet();
		Iterator it=setEntry.iterator();
		while(it.hasNext()) {
			Map.Entry all=(Map.Entry) it.next();
			String s=(String)all.getKey();
			Member m=(Member)all.getValue();
			if(s.contains(id)) {
				if(m.getPassword().equals(password)) {
					return m.getName();
				}
			}
		}
		return null;
	}
	public boolean changePassword(String id, String oldPw,String newPw) {
		Set setEntry=map.entrySet();
		Iterator it=setEntry.iterator();
		while(it.hasNext()) {
			Map.Entry all=(Map.Entry)it.next();
			String s=(String)all.getKey();
			Member m=(Member)all.getValue();
			if(s.contains(id)&&m.getPassword().equals(oldPw)) {
				m.setPassword(newPw);
				return true;
			}
		}
		return false;
	}
	public void changeName(String id, String newName) {
		Set setEntry=map.entrySet();
		Iterator it=setEntry.iterator();
		while(it.hasNext()) {
			Map.Entry all=(Map.Entry)it.next();
			String s=(String)all.getKey();
			Member m=(Member)all.getValue();
			if(s.equals(id)) {
				m.setName(newName);
			}
		}
	}
	public TreeMap sameName(String name) {
		TreeMap tree=new TreeMap();
		Set keys=map.keySet();
		Iterator it=keys.iterator();
		while(it.hasNext()) {
			Object i=it.next();
				if(((Member)map.get(i)).getName().equals(name)) {
					tree.put(i,map.get(i));
				}
			}
		return tree;
	}
	

}
