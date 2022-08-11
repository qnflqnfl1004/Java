package com.kh.lambda.basic;

import com.kh.lambda.basic.functional.A_FunctionalInterface;
import com.kh.lambda.basic.functional.B_FunctionalInterface;
import com.kh.lambda.basic.functional.C_FunctionalInterface;

public class B_Functional {
	public void method1() {
		A_FunctionalInterface fi = () -> {
			System.out.println("매개변수와 반환값이 없는 람다식");
		};
		
		fi.method();
		
//		fi = new A_FunctionalInterface() {
//			
//			@Override
//			public void method() {
//				System.out.println("익명 구현 객체를 사용한 인터페이스 구현");
//			}
//		};
//		
//		fi.method();
	}
	
	public void method2() {
//		B_FunctionalInterface fi = new B_FunctionalInterface() {
//			
//			@Override
//			public void method(int a) {
//			}
//		};
		
		B_FunctionalInterface fi = (int x) -> {
			System.out.println(x * x);
		};
		
		fi.method(10);
		
		// 매개변수의 타입 생략 가능
		fi = (a) -> {
			System.out.println(a * 2);
		};
		
		fi.method(20);
		
		fi = a -> System.out.println(a * 3);
		
		fi.method(30);
		
	}
	
	public void method3() {
//		C_FunctionalInterface fi = new C_FunctionalInterface() {
//			
//			@Override
//			public int method(int a, int b) {
//				return 0;
//			}
//		};
		
		int result = 0;
		
		C_FunctionalInterface fi = (int x, int y) -> {
			return x + y;
		};
		
		result = fi.method(10, 20);
		
		System.out.println(result);
		
		// 매개변수의 타입, return 구문과 중괄호{} 생략 가능
		fi = (x, y) -> x * y;
		
		System.out.println(fi.method(10, 20));
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
