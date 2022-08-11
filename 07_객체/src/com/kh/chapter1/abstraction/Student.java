package com.kh.chapter1.abstraction;


// 학생을 추상화해서 클래스 만들기
public class Student {
	// 필드(속성)
	public int sNum; // 학번
	public String name; // 이름
	public int age; // 나이
	public int math; // 수학점수
	public int eng; // 영어점수
	
	// 메소드 (기능)
	public int sum() {
		return math + eng;
	}
	
	public double avg() {
		return sum() / 2.0;
	}
	
}
