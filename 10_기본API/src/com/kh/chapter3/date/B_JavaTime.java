package com.kh.chapter3.date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class B_JavaTime {
	public void method1() {
		LocalDateTime now = LocalDateTime.now();
		LocalDateTime when = LocalDateTime.of(2022, 5, 25, 22, 42, 59);
		
		System.out.println(now);
		System.out.println(when);
		System.out.println(ZonedDateTime.now());
		System.out.println();
		
		System.out.println(now.getYear());
		System.out.println(now.getMonth());
		System.out.println(now.getMonthValue());
		System.out.println(now.getDayOfMonth());
		System.out.println(now.getDayOfWeek());
		System.out.println(now.getDayOfYear());
		System.out.println(now.getHour());
		System.out.println(now.getMinute());
		System.out.println(now.getSecond());
		System.out.println(now.getNano());
		
//		LocalDateTime plusDays = now.plusDays(1);
		LocalDateTime plusDays = now.plusDays(1).plusMonths(1).plusYears(1);
		LocalDateTime minusMonths = now.minusMonths(2);
		
		System.out.println(now);
		System.out.println(when);
		System.out.println(plusDays);
		System.out.println(minusMonths);
		System.out.println();
		
		System.out.println(now.isAfter(plusDays));
		System.out.println(now.isBefore(plusDays));
		System.out.println(now.isAfter(minusMonths));
		System.out.println(now.isBefore(minusMonths));
		System.out.println();
		
//		LocalDate localDate = LocalDate.now();
//		LocalDate localDate = LocalDate.of(2022, 7, 23);
		LocalDate localDate = now.toLocalDate();
		
//		LocalTime localTime = LocalTime.now();
//		LocalTime localTime = LocalTime.of(9, 27, 34);
		LocalTime localTime = now.toLocalTime();
		
		
		System.out.println(localDate);
		System.out.println(localTime);
		System.out.println();
		
		// 문자열을 LocalDAte 객체로 파싱
//		localDate = LocalDate.parse("2022-09-09");
//		localDate = LocalDate.parse("20220909", DateTimeFormatter.ofPattern("yyyyMMdd"));
		localDate = LocalDate.parse("20220909", DateTimeFormatter.BASIC_ISO_DATE);
		
		System.out.println(localDate);
		System.out.println();
		
		// LocalDateTime 객체를 문자열로 변환
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 hh시 mm분 ss초");
		
		System.out.println(now.toString());
		System.out.println(now.format(formatter));
		
		formatter = DateTimeFormatter.ISO_ORDINAL_DATE;
		System.out.println(now.format(formatter));
		System.out.println(now.format(DateTimeFormatter.ISO_WEEK_DATE));
		System.out.println((ZonedDateTime.now().format(DateTimeFormatter.ISO_OFFSET_DATE_TIME)));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
