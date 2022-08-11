package com.kh.chapter1.list.vo;

public class Music implements Comparable<Music> {
	private String title;
	
	private String artist;
	
	private int ranking;
	
	public Music(){
		
	}

	public Music(String title, String artist, int ranking) {
		this.title = title;
		this.artist = artist;
		this.ranking = ranking;
	}
	
	
	public String getTitle() {
		return title;
	}

	public String getArtist() {
		return artist;
	}

	public int getRanking() {
		return ranking;
	}

	/*
	 * 반환되는 정수값을 가지고 정렬의 기준을 잡는다.
	 * 	- 자신과 매개값으로 전달된 객체를 비교한다.
	 * 	- 비교해서 같으면 0을 반환하고, 자신이 뒤에 있어야 하면 양의 정수를 반환하고, 자신 앞에 있어야 하면 음의 정수를 반환한다.
	 */
	@Override
	public int compareTo(Music music) {
		System.out.println(this.ranking + ", " + music.ranking); // 비교대상 찾기
		// 랭킹 순서대로 정렬하는 코드
		return (this.ranking > music.ranking) ? 1 : (this.ranking == music.ranking) ? 0 : -1;
		
	}

	@Override
	public String toString() {
		return "Music [title=" + title + ", artist=" + artist + ", ranking=" + ranking + "]";
	}

	
	
}
