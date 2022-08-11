package com.kh.variable.practice2;

import java.util.Scanner;

public class CastingPractice {
		/*
		 * 실습문제 1.
		 * 키보드로 문자 하나를 입력 받아 그 문자와 그 문자의 유니코드 값을 출력하세요.
		 * 
		 * ex)
		 * 문자 : A
		 * 
		 * 
		 * A Unicode : 65
		 */
		public void method1() {
			Scanner sc = new Scanner(System.in);
			
			System.out.print("문자 : ");
			char ch = sc.nextLine().charAt(0);
			int i = ch;
			
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println(ch + " Unicode : " + i);
//			System.out.println(ch + " Unicode : " + (int)ch);
	}
		/*
		 * 실습문제2
		 * 
		 * 실수형으로 국어, 영어, 수학 세 과목의 점수를 입력 받아 총점과 평균을 출력하세요.
		 * 이 때 총점과 평균은 정수형으로 처리하세요.
		 * 
		 * ex)
		 * 국어 : 90.0
		 * 영어 : 90.0
		 * 수학 : 90.0
		 * 
		 * 총점 : 270
		 * 평균 : 90
		 */
		public void method2() {
			Scanner sc = new Scanner(System.in);
			
			System.out.print("국어 : ");
			double kor = sc.nextDouble();
			
			System.out.print("영어 : ");
			double eng = sc.nextDouble();
			
			System.out.print("수학 : ");
			double math = sc.nextDouble();
					
			int total = (int)(kor + eng + math);
			
			System.out.println();
			System.out.print("총점 : " + total);
			
			int avg = total / 3;	
			
			System.out.println();
			System.out.print("평균 : " + avg);			
		}
		/*
		 * 실습문제 3
		 * 
		 * 선언 및 초기화된 5개의 변수를 가지고 알맞은 사칙연산(+,_,*,/)과 형변환을 이용하여
		 * 주석에 적힌 값과 같은 값이 나오도록 코드를 작성하세요.
		 */
		public void method3() {
			int iNum1 = 10;
			int iNum2 = 4;
			
			float fNum = 3.0f;
			double dNum = 2.5;
			
			char ch = 'A';
			
			System.out.println( iNum1 % iNum2 ); // 2
			System.out.println( (int)dNum ); // 2
			
			System.out.println( iNum2 * dNum ); // 10.0
			System.out.println( iNum1 / 1.0 ); // 10.0 (*, / 둘다 가능)
			
			System.out.println( iNum1 / (iNum2 * 1.0) ); // 2.5 (double로 강제변환도 가능)
			System.out.println( dNum + ""); // 2.5
			
			System.out.println( (int)fNum ); // 3
			System.out.println( iNum1 / (int)fNum ); // 3
			
			System.out.println( iNum1 / fNum ); // 3.3333333
			System.out.println( iNum1 / (double)fNum ); // 3.333333333333335
			
			System.out.println( ch ); // 'A'
			System.out.println( ch + 0 ); // 65 (int로 강제변환 가능)
			System.out.println( ch + iNum1 ); // 75
			System.out.println( (char)(ch + iNum1) ); // 'K'
			
		}
}
