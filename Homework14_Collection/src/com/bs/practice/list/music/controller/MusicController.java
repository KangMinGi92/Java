package com.bs.practice.list.music.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.bs.practice.list.music.model.compare.AscTitle;
import com.bs.practice.list.music.model.vo.Music;

public class MusicController {
	private List list=new ArrayList();
	
	public MusicController() {
		// TODO Auto-generated constructor stub
	}
	
	public int addList(Music music) {
		list.add(music);
		return 1;
	}
	public int addAtZero(Music music) {
		list.add(0,music);
		return 1;
	}
	public List printAll() {
		return list;
	}
	public Music searchMusic(String title) {
		for(int i=0;i<list.size();i++) {
			Music m=(Music)list.get(i);
			if(m.getTitle().equals(title)) {
				return m; 
			}
		}
		return null;
	}
	public Music removeMusic(String title) {
		for(int i=0;i<list.size();i++) {
			Music m=(Music)list.get(i);
			if(m.getTitle().equals(title)) {
				list.remove(i);
				return m; 
			}
		}
		return null;
	}
	public Music setMusic(String title, Music music) {
		Music result=new Music();
		for(int i=0;i<list.size();i++) {
			Music m=(Music)list.get(i);
			if(m.getTitle().equals(title)) {
				result=(Music)list.set(i,music);
				return result; 
			}
		}
		return null;
	}
	public int ascTitle() {
		Collections.sort(list);
		return 1;
	}
	public int descSinger() {
		list.sort(new AscTitle());
		return 1;
	}
	
	
	
	
	
	
}
