package com.kh.variable.practice;

public class A_Variable<영수증> {
	public void printValue() {
		// 변수를 사용하지 않을 때
		System.out.println(2 * 3.141592 * 10);
		System.out.println(3.141592 * 10 * 10);
		System.out.println(3.141592 * 10 * 10 * 20);
		System.out.println(4 * 3.141592 * 10 * 10);
		
		// 변수를 사용했을 때
		int r = 10;
		int h = 20;
		double pi = 3.141592;
		
		System.out.println(2 * pi * r);
		System.out.println(pi * r * r);
		System.out.println(pi * r * r * h);
		System.out.println(4 * pi * r * r);
	}
	
	
	public void variableTest() {
	
		/*
	    * 변수의선언
		*  [표현법]
		*	자료형 변수명;
		*
		*  - 자료형은 어떤 값을 저장할지, 어떤 크기의 메모리를 할당받을지에 대한 정보이다.
		*  - 변수명은 변수의 이름으로 값을 읽고, 쓰고, 지우고 변경하는 작업을 할 때 사용한다.
		*/
	
		// 논리형
		boolean isTrue; // 1byte의 논리 값을 담을 수 있는 변수를 선언한다.
	
		// 정수형
		byte bNum; // 1byte의 정수를 담을 수 있는 변수를 선언한다.
		short sNum; // 2byte의 정수를 담을 수 있는 변수를 선언한다.
		int iNum; // 4byte의 정수를 담을 수 있는 변수를 선언한다.
		long lNum; // 8byte의 정수를 담을 수 있는 변수를 선언한다.
	
		// 실수형
		float fNum; // 4byte의 실수를 담을 수 있는 변수를 선언한다.
		double dNum; // 8byte의 실수를 담을 수 있는 변수를 선언한다.
	
		// 문자형
		//ctrl + /
//		char ch = 0;
//		char ch = '\u0000';
//		char ch = 90;
//		char ch = -90;
		char ch = 'a'; //2byte의 문자(유니코드)를 담을 수 있는 변수를 선언한다.
	
		// 문자열
//		String name = "";
//		String name = "신영은"; // 문자열을 가리킬 수 있는 참조형 변수를 선언한다.
		String name = new String("신영은");
		/*
		 * 변수의 초기화
		 *  [표현법]
		 * 	  변수명 = 값;
		 * 
		 *   - =는 오른쪽의 데이터를 왼쪽의 변수에 대입(저장)하는 연산자이다.
		 */
		
		isTrue = false;
		bNum = 11;
		sNum = 12;
		iNum = 300;
		// 정수형 리터럴은 기본적으로 int 컴파일 된다.
		// long 타입의 리터럴은 숫자 뒤에 L 또는 l을 입력해야 한다.
		lNum = 3147483647L;
		// 실수형 리터럴은 기본적으로 double로 컴파일 된다.
		fNum = 3.14f;
		// double 타입의 리터럴에서 숫자 뒤에 D 또는 d는 생략이 가능하다.
		dNum = 3.14;
		
		
		// 로컬 변수를 생성 후 초기화가 되지 않은 경우 사용하려고 하면 에러가 발생한다.
		System.out.println("istrue : " + isTrue);
		System.out.println("bNum : " + bNum);
		System.out.println("sNum : " + sNum);
		System.out.println("iNum : " + iNum);
		System.out.println("lNum : " + lNum);
		System.out.println("fNum : " + fNum);
		System.out.println("dNum : " + dNum);
		System.out.println("ch : " + ch);
		System.out.println("name : " + name);
		
		// 변수의 명명 규칙
		// 1) 대소문자 구분
		int number;
//		String number; // 자료형이 달라도 변수명이 같으면 에러 발생
		int NUMBER;
		int NumBer;
		
		// 2) 숫자로 시작하면 안된다.
//		int 1age;
		int a2g3e1;
		
		// 3) 특수 문자는 '_', '$'만 사용이 가능하다.
		int _age;
		int ag_e_;
		int $age;
		int a$ge$;
//		int %age;
//		int age@;
		
		// 4) 예약어를 사용하며 안된다.
//		int void;
//		int double;
//		int class;
//		int public;
		
		
		
	}
	
	public void overflow() {
		// byte 자료형의 저장 범위 : -128 ~ 127
		byte bNum = 127;
		byte result = (byte)(bNum +1);
		
		System.out.println("bNum : " + bNum);
		System.out.println("result : " + result);
	}
	
	public void constant() {
		/*
		 * 상수
		 *  [표현법]
		 *    final 자료형 변수명;
		 *    
		 *  - 변하지 않는 값으로 특정 변수의 값이 변경되는 걸 원하지 않을 때 사용한다.
		 *  - 초기화 이후에는 값을 변경할 수 없다.
		 */
		
		int age;
		final int AGE;
		
		age = 20;
		AGE = 30;
		
		System.out.println(age);
		System.out.println(AGE);
		
		age = 25;
//		AGE = 35;
	}
	
	/*
	 * 실습문제 1.
	 * 영화관의 요금 표는 다음과 같습니다.
	 *   - 성인 : 10000원
	 *   - 청소년 : 7000원
	 * 성인 2명과 청소년 3명이 영화를 보려고 할 때 지불해야 할 금액을 계산 후 출력하세요.
	 * 
	 * 예시)
	 * <영수증>
	 * 성인 2명 : 20000원
	 * 청소년 3명 : 21000원
	 * 총 금액 : 41000원
	 */
	public void practice1() {
		// 변수 선언
		int adultPrice = 10000;
		int teenPrice = 7000;
		int adultCount = 2;
		int teenCount = 3;
		int adultTotal = adultPrice * adultCount;
		int teenTotal = teenPrice * teenCount;
		int total = adultTotal + teenTotal;
		
		System.out.println("<영수증>");
		System.out.println("성인 2명 : " + adultTotal + "원");
		System.out.println("청소년 3명 : "+ adultTotal + "원");
		System.out.println("총 금액 : " + total + "원");
		
		
	}
	
	
	/*
	 * 실습문제 2.
	 * 문인수는 국어 점수 60점 / 영어 점수 70점 / 수학점수 66점을 받았다.
	 * 이 학생의 총점과 평균을 출력하세요.
	 * 
	 * 예시)
	 * 국어 점수 : 60점
	 * 영어 점수 : 70점
	 * 수학 점수 : 66점
	 * 
	 * 총점 : 196점
	 * 평균 : 65.33점
	 */
	public void practice2() {
		int kor = 60;
		int eng = 70;
		int math = 66;
		int total = kor + eng + math;
		double avg = total / 3.0;
		System.out.println("국어 점수 : " + kor + "점");
		System.out.println("영어 점수 : " + eng + "점");
		System.out.println("수학 점수 : " + math + "점");
		System.out.println("총점 : " + total + "점");
//		System.out.println("총점 : " + avg + "점");
//		System.out.printf("평균 : %.2f점\n", avg);	
		System.out.printf("평균 : " + (Math.round(avg * 100) / 100.0) + "점");
	
	}
	
}
	
	