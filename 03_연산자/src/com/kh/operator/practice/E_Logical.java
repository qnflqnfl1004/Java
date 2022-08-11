package com.kh.operator.practice;

import java.util.Scanner;

public class E_Logical {
	/*
	 * 논리 연산자
	 * 	- 두 개의 논리값을 연산하는 연산자이다.
	 *  - &&(AND, 논리곱) : 왼쪽, 오른쪽 피연산자 모두 true 경우 참(true)
	 *  			      true && true   => true
	 *  			      true && false  => false
	 *  			      false && true  => false
	 *  			      false && false => false
	 *  - ||(OR, 논리합) : 왼쪽, 오른쪽 피연산자 중에 하나라도 true 경우 참(true)
	 *  			      true || true  => true
	 *  			      true || false => true
	 *  			      false || true => true
	 *  			      false || true => false
	 */
	
	
	// 사용자가 입력한 정수값이 1 ~ 100 사이의 값인지 확인하기
	public void method1() {
		int num = 0;
		boolean result;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("임의의 정수를 입력해주세요 > ");
		num = scanner.nextInt();
		
		// 1 <= num <= 100
//		result = 1 <= num <= 100;
		
		result = (1 <= num) && (num <= 100);
		
		System.out.println("사용자가 입력한 값이 1 이상 100 이하의 값인가요? " + result);
		
		scanner.close();
	}
	
	// 사용자가 입력한 값이 y 또는 Y 인지 확인하기
	public void method2() {
		char ch = '\u0000';
		String line = null;
		boolean result = false;
		Scanner scanner = new Scanner(System.in);

		System.out.print("계속 진행하시려면 y 혹은 Y를 입력하세요. > ");
		line =scanner.nextLine();

		// 조건문 ()안에 조건식이 true일 때 중괄호 블록{}이 실행된다.
		if(line.length() > 0) {
			ch = line.charAt(0);					
			result = (ch == 'y') || (ch == 'Y');
		}

		System.out.println("사용자가 입력한 값이 y 또는 Y입니까? : " + result);


		scanner.close();


	}
	
	// Short Cut 연산 테스트
	public void method3( ) {
		int num = 10;
		boolean result = false;

		System.out.println("&& 연산 전의 num의 값 : " + num);

		// && 연산자를 기준으로 앞에서 이미 false가 나왔기 때문에 굳이 뒤쪽의 연산을 수행하지 않는다.
		result = (num < 5) && (++num > 0);

		System.out.println("result : " + result);
		System.out.println("&& 연산 후의 num의 값 : " + num);
		System.out.println();

		System.out.println("|| 연산 전의 num의 값 : " + num);

		// || 연산자를 기준으로 앞에서 이미 true가 나왔기 때문에 굳이 뒤쪽의 연산을 수행하지 않는다.
		result = (num < 20) || (++num > 0);

		System.out.println("result : " + result);
		System.out.println("|| 연산 후의 num의 값 : " + num);		
	}

	/*
	 * 실습 문제
	 * 
	 * 사용자가 입력한 문자 값이 알파벳 대문자인지 확인하기
	 * 'A' ~ 'Z' 까지가 코드값으로 65 ~ 90까지의 숫자로 나열되어 있다.
	 */
//	public void practice() {
//		
//		Scanner scanner = new Scanner(System.in);
//
//		System.out.print("영문자 하나 입력 : ");
//		char ch = scanner.nextLine().charAt(0);
//		boolean result = (ch >= 'A') && (ch <= 'Z'); // 'A'보다 크거나 같고, 'Z'보다 작거나 같은 값
//		
//		System.out.println("입력한 값이 대문자 입니까? : " + result);
//		
//		
//		scanner.close();
//	}
	public void practice( ) {
		char ch = '\u0000';
		boolean result = false;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("문자 하나 입력 > ");
		ch = scanner.nextLine().charAt(0);
		
		// 'A' <= ch <='Z'
		result = (ch >= 'A') && (ch <='Z');
		 
		System.out.println("사용자가 입력한 값이 대문자입니까? : " + result);
		
		scanner.close( );
				
	}
}
