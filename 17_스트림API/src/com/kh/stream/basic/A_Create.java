package com.kh.stream.basic;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import com.kh.stream.model.vo.Student;

public class A_Create {
	/*
	 * 스트림의 종류
	 * 	- java.util.stream 패키지에 존재하고 BaseStream 인터페이스를 부모로 해서 자식 인터페이스들이 상속 관계를 이루고 있다.
	 * 	- Stream, IntStream, LongStream, DoubleStream이 있다.
	 * 
	 * 스트림 생성
	 * 	- 숫자 범위로 스트림을 생성하는 방법
	 * 		- IntStream의 range(), rangeClosed() 메소드를 이용해서 생성한다.
	 * 	- 배열로부터 스트림을 생성하는 방법
	 * 		- Arrays.stream(배열) 메소드로 스트림을 생성한다.
	 * 		- 각 스트림(Stream, IntStream, ...)의 of(배열) 메소드로 스트림을 생성한다.
	 * 	- 컬렉션으로부터 스트림을 생성하는 방법
	 * 		- 컬렉션의 stream() 메소드를 이용해서 생성한다. (java.util.Collection.stream())
	 */
	
	
	// 숫자 범위로 스트림을 생성하는 방법
	public void method1() {
		// 첫 번째 매개 값 ~ 두 번째 매개값 이전까지의 값을 요소로 가지는 스트림 객체를 생성한다.
		IntStream stream = IntStream.range(1, 10);
//		int sum = stream.peek((int value) -> {System.out.print(value + " ");}).sum();
		int sum = stream.peek(value -> System.out.print(value + " ")).sum();

		System.out.println("> sum : " + sum);
		
		// 첫 번째 매개 값 ~ 두 번째 매개 값까지 값을 요소로 가지는 스트림 객체를 생성한다.
		stream = IntStream.rangeClosed(1, 10);
		sum = stream.peek(value -> System.out.print(value + " ")).sum();
		
		System.out.println("> Sum : " + sum);
	}
	
//	배열로부터 스트림을 생성하는 방법
	public void method2() {
		String[] names = {"신영은", "홍길동", "이몽룡", "성춘향", "신영은"};
		
		// for 문을 사용하여 출력
		for (String name : names) {
			System.out.print(name + " ");
			
		}
		
		System.out.println();
		
		// 스트림을 사용하여 출력
//		Stream<String> stream = Arrays.stream(names);
//		Stream<String> stream = Stream.of(names);
		Stream<String> stream = Stream.of("신영은", "홍길동", "이몽룡", "성춘향", "신영은");
		
		stream.distinct().forEach(name -> System.out.print(name + " "));
	}
	
	// 컬렉션으로부터 스트림을 생성하는 방법
	public void method3() {
		List<Student> list = Arrays.asList(
			new Student("신영은", 20, "여자", 80, 50),	
			new Student("홍길동", 30, "남자", 80, 80),	
			new Student("성춘향", 20, "여자", 100, 100)	
		);
		
		// for 문을 사용하여 출력
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
			
		}
		
		System.out.println();
		
		// 스트림을 사용하여 출력
		Stream<Student> stream = list.stream();
//		stream.forEach((Student student) -> {System.out.println(student);});
//		stream.forEach(student -> System.out.println(student));
		
		list.stream().forEach(System.out::println);
		
		List<Student> list2 = list.stream()
										.filter(student -> student.getGender().equals("남자"))
										.collect(Collectors.toList());
		
		System.out.println(list2);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
