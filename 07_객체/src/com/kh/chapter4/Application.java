package com.kh.chapter4;

import com.kh.chapter4.constructor.User;

public class Application {

	public static void main(String[] args) {
		User user = null;
		
		// 기본 생성자로 객체 생성
		user  = new User();
		
		System.out.println(user.information());
		
		// 매개 변수가 있는 생성자로 객체 생성 (3개의 값을 생성자로 전달)
		user = new User("shin", "1234", "신영은");
		
		System.out.println(user.information());
		
		// 매개 변수가 있는 생성자로 객체 생성(5개의 값을 생성자로 전달)
		user = new User("shin", "1234", "신영은", 20, '여');
		
		System.out.println(user.information());
	}

}
