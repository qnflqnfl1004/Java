package com.kh.chapter5.method;

public class C_StaticMethod {
	private static int num1 = 10;
	public static int num2 = 10;
	
	// 1. 매개 변수와 반환값이 없는 메소드
	public static void method1() {
		System.out.println(C_StaticMethod.num1 + num2);
		
		C_StaticMethod.num1++;
	}
	
	// 2. 매개 변수가 없고 반환값이 있는 메소드
	public static int method2() {
//		return C_StaticMethod.num1 num1 + C_StaticMethod.num2;
		return num1 + num2;
	}
	
	// 3. 매개 변수가 있고 반환값이 없는 메소드
	public static void method3(int num3) {
		System.out.println(num1 + num2 + num3);
		
	}
	
	// 4. 매개 변수와 반환값이 있는 메소드
	public static int method4(int ... numbers) {
		int sum = 0;
		
		for(int number : numbers) {
			sum += number; // sum = sum + number;
		}
		
		return sum;
	}
	
}
