package com.kh.chapter3.date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class A_Date {
	public void method1() {
		// 현재 시간과 날짜에 대한 정보를 가지고 Date 객체를 생성한다.
		Date now = new Date();
		Date when = new Date(1);
		
		System.out.println(now); // now.toString()
		
		// 1970년 1월 1일 00시를 기준으로 밀리 세컨드 단위로 표기된다.
		// 한국 표준 시간(KST)으로 출력될 땐 그리니치 평균시(GMT) 보다 + 9 증가된 시간으로 표시된다.
		System.out.println(when);
		
		when = new Date(1000L);
		
		System.out.println(when);
		
		// Deprecated 된 생성자를 사용한 Date 객체 생성
		when = new Date((2022 - 1900), (4 - 1), 18);
		
		System.out.println(when);
		System.out.println(when.getYear() + 1900);
		System.out.println(when.getMonth() + 1);
		System.out.println(when.getDate());
		System.out.println(when.getTime());
		System.out.println(new Date(1650207600000L));
		
		// SimpleDateFormat 클래스 사용
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일(E) a hh시 mm분 ss:SSS초 ");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd(E) a hh:mm:ss:SSS");
		String formatDate = sdf.format(now);
		
		System.out.println(formatDate);
	}

}
