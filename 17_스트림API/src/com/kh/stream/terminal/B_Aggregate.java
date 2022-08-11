package com.kh.stream.terminal;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class B_Aggregate {
	/*
	 * 기본 집계
	 * 	- 최종 처리 기능으로 요소들을 처리해서 카운팅, 합계, 평균값, 최대값, 최소값 등과 같이 하나의 값으로 산출하는 역할을 한다.
	 * 		- count() : 요소의 개수를 리턴한다.
	 * 		- sum() : 요소들의 합계를 리턴한다.
	 * 		- average() : 요소들의 평균을 리턴한다.
	 * 		- max() : 최대 요소를 리턴한다.
	 * 		- min() : 최소 요소를 리턴한다.
	 * 		- findFirst() : 첫 번째 요소를 리턴한다.
	 * 
	 * 커스텀 집계
	 * 	- 스트림은 기본 집계 메소드를 제공하지만 다양한 집계 결과물을 만들 수 있도록 reduce() 메소드를 제공한다.
	 * 
	 * Optional 객체
	 * 	- 스트림의 최종 결과값을 저장하는 객체이다.
	 * 	- 값만 저장하는 것이 아니라 , 값의 존재 여부를 확인하고 값이 존재하지 않을 경우 디폴트 값을 설정할 수 있는 객체이다.
	 * 	
	 */
	
	public void method1() {
		int[] values = {1, 2, 3, 4, 5, 6};
//		int[] values = {1, 3, 5};
		
		// 2의 배수의 개수
		long count = Arrays.stream(values).filter(value -> value % 2 == 0).count();
		
		System.out.println(count);
		
		// 2의 배수의 합
		int sum = Arrays.stream(values).filter(value -> value % 2 == 0).sum();
		
		System.out.println(sum);
		
		// 2의 배수의 평균
		OptionalDouble average = IntStream.of(values).filter(value -> value % 2 == 0).average();
		
		// 값의 존재 여부를 확인하고 Optional 객체로부터 값을 얻어온다.
//		if(average.isPresent()) {
//			System.out.println(average.getAsDouble());
//		}
		
		// 집계값을 처리하는 Consumer를 등록한다. (Consumer는 값이 존재해야 실행된다.)
//		average.ifPresent((value) -> System.out.println(value));
		
		// 값이 없을 경우 디폴트값을 설정하고 Optional 객체로부터 값을 얻어온다.
		System.out.println(average.orElse(0.0));
		
		// 2의 배수의 최대값
		OptionalInt max = IntStream.of(values).filter(value -> value % 2 == 0).max();
		
		System.out.println(max.getAsInt());
		
		// 2의 배수의 최소값
		OptionalInt min = IntStream.of(values).filter(value -> value % 2 == 0).min();
		
		System.out.println(min.getAsInt());
		
		// 2의 배수의 첫 번째 요소
		OptionalInt findFirst = IntStream.of(values).filter(value -> value % 2 == 0). findFirst();
		
		System.out.println(findFirst.getAsInt());
		
		// 2의 배수의 곱 (커스텀 집계)
		Arrays.stream(values)
			  .filter(value -> value % 2 == 0)
			  .reduce((left, right) -> left * right)
			  .ifPresent(System.out::println);
		
		int result = Arrays.stream(values)
						.filter(value -> value % 2 == 0)
						.reduce(1, (left, right) -> left * right);
		
		System.out.println(result);
	}

}
