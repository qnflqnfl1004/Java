package com.kh.lambda.basic;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntBinaryOperator;
import java.util.function.Supplier;

import com.kh.lambda.standard.model.vo.Student;

public class C_MethodReference {
	public void method1() {
		
		// 정적 메소드를 참조할 경우에는 클래스 이름 뒤에 :: 기호를 붙이고 정적 메소드 이름을 기술하면 된다.
//		IntBinaryOperator binaryOperator = (a, b) ->Math.max(a, b);
		IntBinaryOperator binaryOperator = Math::max;
		
		System.out.println(binaryOperator.applyAsInt(10, 20));
		
		// 객체의 메소드를 참조할 경우에는 참조 변수 뒤에 :: 기호를 붙이고 메소드 이름을 기술하면 된다.
//		Consumer<String> consumer = s -> System.out.println(s);
		Consumer<String> consumer = System.out::println;
		
		consumer.accept("안녕하세요.");
		
//		Function<Student, String> function = s -> s.getName();
		Function<Student, String> function = Student::getName;
		
		System.out.println(function.apply(new Student("홍길동", 20)));
		
//		Supplier<Student> supplier = () -> new Student();
		Supplier<Student> supplier = Student::new;
		
		System.out.println(supplier.get());
		
//		BiFunction<String, Integer, Student> biFunction = (name, age) -> new Student(name, age);
		BiFunction<String, Integer, Student> biFunction = Student::new;
		
		System.out.println(biFunction.apply("이몽룡", 22));
	}
}
