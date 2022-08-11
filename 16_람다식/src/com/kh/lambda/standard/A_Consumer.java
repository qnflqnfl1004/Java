package com.kh.lambda.standard;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.ObjIntConsumer;

public class A_Consumer {
	/*
	 * Consumer
	 * 	- Consumer 함수적 인터페이스는 리턴값이 없는 accept() 추상 메소드를 가지고 있다.
	 * 	- accept() 추상 메소드는 매개값을 소비하는 역할을 한다.
	 */
	
	public void method1() {
//		Consumer<String> consumer = new Consumer<String>() {
//
//			@Override
//			public void accept(String t) {
//				
//			}
//			
//		};
		
		Consumer<String> consumer = (String str) -> {
			System.out.println(str);
		};
		
		consumer.accept("Consumer : 한 개의 매개값(제네릭으로 지정된 타입의 객체)을 받아서 소비한다.");
		
		BiConsumer<String, String> biConsumer = (str1, str2) -> System.out.println(str1 + str2);
		
		
		biConsumer.accept("BiConsumer : ", "두 개의 매개값(제네릭으로 지정된 타입의 객체)을 받아서 소비한다.");
		
		DoubleConsumer dConsumer = (value) -> System.out.println("DoubleConsumer : 하나의 double 타입의 값을 받아서 소비한다. \tvalue : " + value);
//		DoubleConsumer dConsumer = System.out::println;
		
		
		dConsumer.accept(3.14);
		
		ObjIntConsumer<String> objIntConsumer = (String str, int value) -> {
			System.out.println("ObjIntConsumer : 두 개의 매개값(제네릭으로 지정된 타입의 객체, int 타입의 값)을 받아서 소비한다.");
			System.out.println(str + value);
		};
		
		objIntConsumer.accept("Java", 11);
		
		
	}
}
