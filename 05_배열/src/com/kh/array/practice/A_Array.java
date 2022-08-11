package com.kh.array.practice;

import java.util.Scanner;

/*
 *  배열
 *  
 *  1. 배열의 선언
 *    [표현법]
 *    	자료형[] 배열명;
 *    	자료형 배열명[];
 *    
 *  2. 배열의 생성 
 *    [표현법]
 *    	배열명 = new 자료형[배열 크기];
 *    
 *  3. 배열의 선언과 생성을 동시에 진행
 *    [표현법]
 *    	자료형[] 배열명 = new 자료형[배열 크기];
 *    	자료형 배열명[] = new 자료형[배열 크기];
 *    
 *  4. 배열의 초기화
 *    1) 배열 변수와 인덱스를 이용한 초기화
 *    	배열명[0] = 값;
 *    	배열명[1] = 값;
 *    	...
 *    
 *    2) 선언과 동시에 초기화
 *     	자료형[] 배열명 = new 자료형[배열 크기] {값, 값, 값, ...};
 *    	자료형 배열명[] = new 자료형[배열 크기] {값, 값, 값, ...};
 *     	자료형[] 배열명 = {값, 값, 값, ...};
 *    	자료형 배열명[] = {값, 값, 값, ...};
 *    
 *    3) 반복문을 이용한 초기화
 */
public class A_Array {
	// 배열을 사용하지 않을 때
	public void method1() {
		// 다량의 데이터를 기록하고자 할 때
//		int score1 = 90;
//		int score2 = 80;
//		int score3 = 88;
//		int score4 = 78;
//		int score5 = 97;
		int[] score = {90, 80, 88, 78, 97};
		
		// 출력문도 마찬가지로 ...
//		System.out.println(score1);
//		System.out.println(score2);
//		System.out.println(score3);
//		System.out.println(score4);
//		System.out.println(score5);
		for (int i = 0; i < score.length; i++) {
			System.out.println(score[i]);
		}
		
		// 합계를 구하는 것도 마찬가지로..
//		int sum = score1 + score2 + score3 + score4 + score5;
		int sum = 0;
		
		for (int i = 0; i < score.length; i++) {
			sum += score[i];
		}
		
		System.out.println(sum);
	}
	
	// 배열의 선언, 생성, 초기화
	public void method2() {
		// 변수 선언
		int num; // 메모리(Stack)에 자료형 만큼의 크기로 값을 담을 수 있는 공간이 할당된다.
		
		// 배열 선언
		int[] iArray1; // 메모리(Stack)에 정수형 배열의 주소를 보관할 공간이 할당된다. (참조 변수)
		int iArray2[]; // 메모리(Stack)에 정수형 배열의 주소를 보관할 공간이 할당된다. (참조 변수)
		double[] dArray1; // 메모리(Stack)에 실수형 배열의 주소를 보관할 공간이 할당된다. (참조변수)
		double dArray2[]; // 메모리(Stack)에 실수형 배열의 주소를 보관할 공간이 할당된다. (참조변수)
		
		// 배열 생성
//		iArray1 = new int[]; // 배열의 크기를 지정하지 않으면 에러가 발생한다.
		iArray1 = new int[5]; // 메모리(Heap)에 5개 정수형 데이터를 저장할 수 있는 배열을 생성한다. -> 배열의 시작 주소를 참조 변수에 대입한다.
		iArray2 = new int[10]; // 메모리(Heap)에 10개 정수형 데이터를 저장할 수 있는 배열을 생성한다. -> 배열의 시작 주소를 참조 변수에 대입한다.
		dArray1 = new double[5]; // 메모리(Heap)에 5개 실수형 데이터를 저장할 수 있는 배열을 생성한다. -> 배열의 시작 주소를 참조 변수에 대입한다.
		dArray2 = new double[10]; // 메모리(Heap)에 10개 실수형 데이터를 저장할 수 있는 배열을 생성한다. -> 배열의 시작 주소를 참조 변수에 대입한다.
		
		System.out.println(iArray1);
		System.out.println(iArray2);
		System.out.println(dArray1);
		System.out.println(dArray2);
		
//		System.out.println(num);
		
		// 배열 초기화
		/*
		 * 배열은 따로 초기화하지 않는다면, JVM이 지정한 기본 값으로 배열을 초기화한다.
		 * (정수형 : 0, 실수형 : 0.0, 문자형 : '\n0000', 논리형 : flase, 참조형 : null) 
		 */
		for(int i = 0; i < iArray1.length; i++) {
			System.out.printf("iArray[%d] : %d\n", i, iArray1[i]);
		}
		
		for(int i = 0; i < dArray1.length; i++) {
			System.out.printf("dArray[%d] : %f\n", i, dArray1[i]);
		}		
		
		// 배열을 초기화하는 for 문
		/*
		 * 배열에서 배열의 길이를 확인하는 방법은 lenth 필드(변수)를 통해서 제공하는 것이고
		 * 문자열에서 문자열의 길이를 확인하는 방법은 length() 메소드를 통해서 제공한다.
		 */
		for (int i = 0; i < iArray2.length; i++) {
			iArray2[i] = i + 2;
		}
		
		// 배열의 값을 출력하는 for 문
		for (int i = 0; i < iArray2.length; i++) {
			System.out.printf("iArray2[%d] : %d\n", i, iArray2[i]);
		}
			
	}
	
	public void method3() {
		int[] iArray = new int[5];
		
		iArray[0] = 2;
		iArray[1] = 4;
		iArray[2] = 6;
		iArray[3] = 8;
		iArray[4] = 10;
//		iArray[5] = 12; // ArrayIndexOutOfBoundsException이 발생한다.
		
		for (int i = 0; i < iArray.length; i++) {
			System.out.println(iArray[i]);
		}
		
		// hashCode() : 자바에서 해시 코드는 객체(클래스, 배열)를 식별하는 하나의 정수값을 말한다.
		//				(기본적으로 객체의 주소값(10진수)을 리턴한다.)
		System.out.println();
		System.out.println(iArray.length);
		System.out.println(iArray);
		System.out.println(iArray.hashCode());
		
		// 배열에서 한번 지정한 크기는 변경이 불가능하다.
		// 따라서 크기를 변경하려면 다시 배열 크기를 지정해서 새로 생성해야 한다.
		iArray = new int[6];
		
		System.out.println();
		System.out.println(iArray.length);
		System.out.println(iArray);
		System.out.println(iArray.hashCode());
		
		// 참조 변수는 힙 영역의 객체(클래스, 배열)를 참조하지 않는다는 뜻으로 null 값을 가질 수있다.
		
		
		iArray = null;
		
		// null 값을 가지고 있는 참조 변수를 사용하면 NullPointerException이 발생한다.
		System.out.println(iArray.length);
		System.out.println(iArray.hashCode());
	}
	
	public void method4() {
		// 배열 선언, 생성, 초기화를 동시에 진행하기
		int[] iArray1 = new int[] {5, 4, 3, 2, 1}; // 값의 개수만큼 자동으로 크기가 할당된다.
		int[] iArray2 = {1, 2, 3, 4, 5, 6, 7}; // new 연산자를 사용하지 않아도 값의 개수만큼 자동으로 크기가 할당된다.
//		int[] iArray2;
//		iArray2 = {1, 2, 3, 4};
//		iArray2 = new int[] {1, 2, 3, 4};
		String[] fruits = new String[5];
		Scanner scanner = new Scanner(System.in);
		
		System.out.println(iArray1.length);
		System.out.println(iArray2.length);
		
		for (int i = 0; i < fruits.length; i++) {
			// JVM이 null로 초기화한다.
			System.out.println(fruits[i]);
		}
		
		// 0번 인덱스부터 4번 인덱스까지 반복하면서 사용자에게 문자열을 입력받아 해당 인덱스에 문자열을 저장한다.
		for (int i = 0; i < fruits.length; i++) {
			System.out.print("과일 입력 > ");
			
			fruits[i] = scanner.nextLine();
		}
		
		for (int i = 0; i < fruits.length; i++) {
			System.out.println(fruits[i]);
		}
	}
	
	/*
	 * 실습 문제 1
	 * 사용자가 입력하는 정수값으로 배열의 길이를 지정하여 배열을 생성하고
	 * 생성된 배열의 크기만큼 반복문을 실행하여 랜덤값을 (1 ~ 100) 배열의 저장하고 출력한다.
	 * 
	 * 예시)
	 * 정수값을 입력해 주세요. > 3
	 * 
	 * numbers[0] : 77
	 * numbers[1] : 88
	 * numbers[2] : 6
	 */
	public void practice1() {
		int size = 0;
		int[] numbers = null;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("정수값을 입력해 주세요. > ");
		size = scanner.nextInt();
		
		numbers = new int[size];
		
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = (int) (Math.random() * 100 + 1);
		}
		
		System.out.println();
		
		for (int i = 0; i < numbers.length; i++) {
			System.out.printf("numbers[%d] : %d\n", i, numbers[i]);
			
		}
		
		scanner.close();
	}
	/*
	 * 실습 문제 2
	 * 
	 * 사용자에게 3명의 키를 입력받아 배열에 저장하고
	 * 반복문을 통해 3명의 키의 총합, 평균값을 구하시오.
	 * 
	 * 예시)
	 * 키 입력 > 180.0
	 * 키 입력 > 177.3
	 * 키 입력 > 168.2
	 * 
	 * 총합 : 525.5
	 * 평균 : 175.2
	 * 
	 */
//	public void practice2() {
//		double []height = new double[3];
//		double sum = 0;
//		double avg = 0;
//		Scanner sc = new Scanner(System.in);
//		
//		
//		for (int i = 0; i < height.length; i++) { // 0, 1, 2 총 키입력값(3개)까지 
//			System.out.print("키 입력 > ");
//			height[i] = sc.nextDouble();
//			
//			sum += height[i]; // 입력값 다 더한 것 
//		}
//		avg = sum / height.length; // 평균값
//		System.out.println();
//		System.out.printf("총합 : %.1f\n", sum);
//		System.out.printf("평균 : %.1f\n", avg);
//	}
	public void practice2() {
		double sum = 0;
		double avg = 0;
		double [] array = new double[3];
		Scanner sc = new Scanner(System.in);
		
		
		for (int i = 0; i < array.length; i++) { // 0, 1, 2 총 키입력값(3개)까지 
			System.out.print("키 입력 > ");
			array[i] = sc.nextDouble();
		}
		
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		avg = sum / array.length; // 평균값
		
		System.out.println();
		System.out.println("총합 : "+ sum);
		System.out.printf("평균 : %.1f\n", avg);
		
		sc.close();
	}
}