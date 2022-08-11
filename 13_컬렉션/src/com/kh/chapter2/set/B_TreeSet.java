package com.kh.chapter2.set;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

import com.kh.chapter1.list.compare.ArtistAcending;
import com.kh.chapter2.set.vo.Music;

public class B_TreeSet {
	// TreeSet을 생성하고 저장, 출력 테스트
	public void method1() {
		TreeSet<String> ts = new TreeSet<>();
		
		// 중복제거, 객체를 오름차순(compareTo)으로 정렬, null 저장 안됨
		ts.add("하하하");
//		ts.add(null);
		ts.add("나나나");
		ts.add("가가가");
//		ts.add(null);
		ts.add("다다다");
		ts.add("다다다");
//		ts.add(null);
		ts.add("하하하");
		
		System.out.println(ts);
		System.out.println(ts.first());
		System.out.println(ts.last());
	}
	
	// TreeSet Music 객체를 저장, 출력 테스트
	public void method2() {
		Set<Music> set = new TreeSet<>(new Comparator<Music>() {

			@Override
			public int compare(Music o1, Music o2) {
				
				return o1.getTitle().compareTo(o2.getTitle());
			}
			
		});
		
		set.add(new Music("Love Dive", "IVE", 1));
		set.add(new Music("Love Dive", "IVE", 1));
		set.add(new Music("나는 트로트가 싫어요", "임창정", 5));
		set.add(new Music("봄여름가을겨울", "빅뱅", 2));
		set.add(new Music("봄여름가을겨울", "빅뱅", 2));
		
		for (Music music : set) {
			System.out.println(music);
		}
	}
}
