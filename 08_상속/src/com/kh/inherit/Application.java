package com.kh.inherit;

import com.kh.inherit.after.Desktop;
import com.kh.inherit.after.SmartPhone;
import com.kh.inherit.before.Tv;
import com.kh.inherit.override.Book;

public class Application {

	public static void main(String[] args) {
		// Desktop 객체 생성
		Desktop desktop = new Desktop("a1111", "아이맥24인치", "애플", 2000000, true );
		SmartPhone smartPhone = new SmartPhone("a2222", "아이폰12미니", "애플", 960000, "SK");
		Tv tv = new Tv("t-01", "올레드 벽걸이 TV", "엘지", 2500000, 60);
		
		// 출력
//		System.out.println(desktop.toString());
		System.out.println(desktop);
		System.out.println(smartPhone);
		System.out.println(tv);
		System.out.println();
		
		// 오버라이딩 테스트
		Book book1 = new Book("자바의 정석", "홍길동", 3000);
		Book book2 = new Book("자바의 정석", "홍길동", 3000);
		Book book3 = new Book("자바 너무 어려워", "신영은", 200);
		
		//toString() 테스트
		System.out.println(book1);
//		System.out.println(book.toString());
		System.out.println(book2);
		System.out.println();
		
		// equals 비교
		System.out.println("boo1과 book2가 같은 책 입니까? " + (book1 == book2));
		System.out.println("boo1과 book2가 같은 책 입니까? " + (book1.equals(book2)));
		System.out.println("boo1과 book3가 같은 책 입니까? " + (book1.equals(book3)));
		System.out.println();
		
		// hashCode() 테스트
		System.out.println("book1의 hashCode : " + book1.hashCode());
		System.out.println("book2의 hashCode : " + book2.hashCode());
		System.out.println("book3의 hashCode : " + book3.hashCode());
	}
	
}
