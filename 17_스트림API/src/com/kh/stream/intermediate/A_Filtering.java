package com.kh.stream.intermediate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import com.kh.stream.model.vo.Student;

public class A_Filtering {
	/*
	 * 필터링
	 * 	- 중간 처리 기능으로 요소를 걸러내는 역할을 한다.
	 * 		- distinct() : 중복을 제거하는 메소드이다. equals() 메소드가 true를 리턴하면 동일한 객체로 판단한다.
	 * 		- filter(Predicate) : 매개 값으로 전달되는 Predicate가 false를 리턴하는 요소를 제거한다.
	 */
	
	// 중복제거
	public void method1() {
		List<String> names = Arrays.asList("신영은", "홍길동", "이몽룡", "성춘향", "신영은", "성춘향");

		Stream<String> stream = names.stream();
		
		stream.forEach((String name) -> {System.out.print(name + " ");});
//		stream.forEach(name -> System.out.print(name + " "));
		
		
		// 이미 최종 처리까지 호출된 스트림은 다시 사용할 수 없다. (컬렉션으로부터 다시 스트림을 얻어와야 한다.)
//		stream.distinct().forEach(name -> System.out.println(name));
		
		System.out.println();
		
		names.stream().distinct().forEach(name -> System.out.print(name + " "));
		
		System.out.println();
		
		List<Student> students = Arrays.asList(
				new Student("신영은", 20, "여자", 80, 50),	
				new Student("신영은", 20, "여자", 80, 50),	
				new Student("신영은", 20, "여자", 80, 50),	
				new Student("홍길동", 30, "남자", 80, 80),	
				new Student("성춘향", 20, "여자", 100, 100)	
			);
		
		students.stream().distinct().forEach(student -> System.out.println(student));
	}
	
	// 필터 메소드
	public void method2() {
		List<String> names = Arrays.asList("신영은", "홍길동", "이몽룡", "성춘향", "신영은", "성춘향", "변사또", "이순신");
		
		names.stream()
			 .filter((String name) -> {return name.startsWith("이");})
			 .filter(name -> name.startsWith("이"))
			 .forEach(name -> System.out.print(name + " "));
		
		System.out.println();
		
		names.stream()
//			 .distinct() // filter() 앞 뒤로 순서 상관없음 
			 .filter(name -> name.startsWith("성"))
			 .distinct()
			 .forEach(name -> System.out.print(name + " "));
		
	System.out.println();
	
	List<Student> students = Arrays.asList(
			new Student("신영은", 20, "여자", 80, 50),	
			new Student("신영은", 20, "여자", 80, 50),	
			new Student("신영은", 20, "여자", 80, 50),	
			new Student("홍길동", 30, "남자", 80, 80),	
			new Student("성춘향", 20, "여자", 100, 100)	
		);
	
	// 성별이 여자인 요소만 출력
	students.stream()
			.filter((Student student) -> {
				return student.getGender().equals("여자");
			})
			.forEach((Student student) -> {
				System.out.println(student);
			});
	
	System.out.println();
	
	// 수학 점수, 영어 점수가 둘다 60점 이상인 요소만 출력
	students.stream()
			.filter(student -> student.getMath() >= 60 && student.getEnglish() >= 60)
			.forEach (System.out::println);
	
	}

	
}
