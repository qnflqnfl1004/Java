package com.kh.operator.practice;

import java.util.Scanner;

public class OperatorPractice {
			/*
			 * 실습문제 1
			 * 
			 * 키보드로 입력 받은 하나의 정수가 양수이면 "양수다", 양수가 아니면
			 * "양수가 아니다"를 출력하세요.
			 * 
			 * ex)
			 * 정수 : -9
			 * 
			 * 양수가 아니다
			 */
	
			public void method1() {
				int num = 0;
				String result = "";
				Scanner sc = new Scanner(System.in);
				
				System.out.print("정수값 입력 > ");
				num = sc.nextInt();
				
				System.out.println();
				result = (num > 0 ) ? "양수다" : "양수가 아니다";
				
				System.out.println(result);
				
				sc.close();
		}
			/*
			 * 실습문제 2
			 * 
			 * 키보드로 입력 받은 하나의 정수가 양수이면 "양수다"
			 * 양수가 아닌 경우 중에서 0이면 "0이다", 0이아니면 "음수다"를 출력하세요.
			 * 
			 * ex)
			 * 정수 : -9
			 * 
			 * 음수다
			 */
			public void method2() {
				int num = 0;
				String result ="";
				Scanner sc = new Scanner(System.in);
				
				System.out.print("정수값 입력 > ");
				num = sc.nextInt();
				
				System.out.println();
				result = (num > 0) ? "양수다" : (num < 0) ? "음수다" : "0이다";
				
				System.out.println(result);
				
				sc.close();
			}
			/*
			 * 실습문제 3
			 * 
			 * 키보드로 입력 받은 하나의 정수가 짝수이면 "짝수다", 짝수가 아니면 "홀수다"를 출력하세요
			 * 
			 * ex)
			 * 정수 : 5
			 * 
			 * 홀수다
			 */
			public void method3() {
				int num = 0;
				String result = "";
				Scanner sc = new Scanner(System.in);
				
				System.out.print("정수값 입력 > ");
				num = sc.nextInt();
				
				System.out.println();
				result = (num == 0) ? "0이다" : (num % 2 == 0) ? "짝수다" : "홀수다";
				
				System.out.println(result);
			}
			/*
			 * 실습문제 4
			 * 
			 * 모든 사람이 사탕을 골고루 나눠가지려고 한다.
			 * 인원 수와 사탕 개수를 키보드로 입력 받고
			 * 1인당 동일하게 나눠가진 사탕 개수와 나눠주고 남은 사탕의 개수를 출력하세요.
			 * 
			 * ex)
			 * 인원 수 : 29
			 * 사탕 개수 : 100
			 * 
			 * 1인당 사탕 개수 : 3
			 * 남는 사탕 개수 : 13
			 */
			
			public void method4() {
				int people = 0;
				int candy = 0;
				int result1 = 0;
				int result2 = 0;
				Scanner sc = new Scanner(System.in);
				
				System.out.print("인원 수 : ");
				people = sc.nextInt();
				
				System.out.print("사탕 개수 : ");
				candy = sc.nextInt();
				
				System.out.println();
				
				result1 = ( candy / people );
				result2 = ( candy % people );
				
				System.out.print("1인당 사탕 개수 : " + result1);
				System.out.print("\n남는 사탕 개수 : " + result2);
			}
			/*
			 * 실습문제 5
			 * 
			 * 나이를 키보드로 입력 받아 어린이(13세 이하)인지, 청소년(13세 초과 ~ 19세 이하)인지,
			 * 성인(19세 초과)인지 출력하세요.
			 * 
			 * ex)
			 * 나이 : 19
			 * 
			 * 청소년
			 */
			public void method5() {
				int age = 0;
				String result = "";
				Scanner sc = new Scanner(System.in);
				
				System.out.print("나이 : ");
				age = sc.nextInt();
				
				System.out.println();
				
				result = (age < 13) ? "어린이" : (13 < age) && (age <= 19)? "청소년" : "성인";
				System.out.println(result);
			}
			
			/*
			 * 실습문제 6
			 * 
			 * 3개의 수를 키보드로 입력 받아 입력 받은 수가 모두 같으면 true, 아니면 false를 출력하세요
			 * 
			 * ex)
			 * 입력1 : 5
			 * 입력2 : -8
			 * 입력3 : 5
			 * 
			 * false
			 */
			public void method6() {
				int num1, num2, num3 = 0;
				String result = "";
				Scanner sc = new Scanner(System.in);
						
				System.out.print("입력1 : ");
				num1 = sc.nextInt();
				
				System.out.print("입력2 : ");
				num2 = sc.nextInt();
						
				System.out.print("입력3 : ");
				num3 = sc.nextInt();
				
				System.out.println();
				
				result = ( num1 == num2 ) && (num2 == num3) ? "true" : "false";
				System.out.println(result);
				
//				방법 2
//				boolean result = ( num1 == num2 ) && (num2 == num3);
//				System.out.println(result);
			}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
}
