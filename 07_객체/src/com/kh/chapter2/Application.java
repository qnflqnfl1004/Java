package com.kh.chapter2;

import com.kh.chapter2._class.Person;

public class Application {

	public static void main(String[] args) {
		Person person = new Person();
		
		
		person.setName("홍길동");
		person.setAge(28);
		person.setPhone("아이폰 12 미니", "화이트", "애플");
		
		person.whoAreYou();
	}

}
