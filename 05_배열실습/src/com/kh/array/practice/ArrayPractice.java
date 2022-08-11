package com.kh.array.practice;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {
/*
 * 실습문제 1
 * 
 * 길이가 10인 정수형 배열을 만들고 반복문을 이용하여
 * 순서대로 배열 인덱스에 넣은 후 그 값을 다음과 같이 출력하세요.
 * 
 * ex)
 * 1 2 3 4 5 6 7 8 9 10
 */
	public void practice1() {
		int[] iArray = new int[10];
		
		
			for (int i = 0; i < iArray.length; i++) {
					iArray[i] = i + 1;
				System.out.print(iArray[i] + " ");
		}
	}
	
/*
 * 실습문제 2
 * 
 * 길이가 10인 정수형 배열을 만들고 반복문을 이용하여
 * 역순으로 배열 인덱스에 넣은 후 그 값을 다음과 같이 출력하세요.
 * 
 * 
 * 
 * ex)
 * 10 9 8 7 6 5 4 3 2 1
 */
	public void practice2() {
		int[] iArray = new int[10];
		int[] temp = new int[iArray.length];
		
			for (int i = 0; i < iArray.length; i++) {
				iArray[i] = i + 1;
				
			}
			
			for (int i = 0; i < iArray.length; i++) {
				temp[i] = iArray[iArray.length - 1 - i];
				
				System.out.print(temp[i] + " ");
			}	
	
	}
	
/*
 * 실습문제 3
 * 
 * 사용자에게 입력 받은 양의 정수만큼 배열 크기를 할당하고
 * 1부터 입력 받은 값까지 배열에 초기화한 후 출력하세요.
 * 
 * ex.
 * 양의 정수 : 5
 * 1 2 3 4 5
 */
	public void practice3() {
		int num = 0;
		int[] array = null;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("양의 정수 : ");
		num = sc.nextInt();
		
		array = new int[num];
		
		for (int i = 0; i < array.length; i++) {
			array[i] = i + 1;
			
			System.out.print(array[i] + " ");
		}
	}
	
/*
 * 실습문제 4
 * 
 * 길이가 5인 String배열을 선언하고 "사과", "귤", "포도", "복숭아", "참외"로 초기화 한 후 
 * 배열 인덱스를 활용해서 귤을 출력하세요.	
 */
	public void practice4() {
		String[] fruits = {"사과", "귤", "포도", "복숭아", "참외"};
		
		System.out.println(fruits[1]);
	}
	
/*
 * 실습문제5
 * 
 * 문자열을 입력 받아 문자 하나하나를 배열에 넣고 검색할 문자가 문자열에 몇 개 들어가 있는지
 * 개수와 몇 번째 인덱스에 위치하는지 인덱스를 출력하세요.
 * 
 * ex)
 * 문자열 : application
 * 문자 : i
 * application에 i가 존재하는 위치(인덱스) : 4 8                  //array[i]
 * i개수 : 2                                               //array.length   
 */
	
	public void practice5() {
		String str = null;
		char ch = '\u0000';
		char[] array = null;
		int count = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 : ");
		str = sc.nextLine();
		
		System.out.print("문자 : ");
		ch = sc.nextLine().charAt(0);
		
		// 입력한 문자열의 길이만큼 배열의 길이를 가지는 array 배열 생성
		array = new char[str.length()];
		
		// 배열 초기화( 문자열의 charAt 위치 0부터 쭉 array[0]부터 초기화
		for (int i = 0; i < array.length; i++) {
			array[i] = str.charAt(i);
			
		}
		System.out.printf("%s에 %c가 존재하는 위치(인덱스) : ", str, ch);
		// 배열 출력, array[i]배열의 값이 검색할 문자 ch와 같으면 배열 위치인 i값 출력 하고 count++
		for (int i = 0; i < array.length; i++) {
			if(array[i] == ch) {
				System.out.print(i + " ");
				
				count++;
			}
		}
		System.out.println();
		System.out.printf("%c의 개수 : " + count, ch);
		
	}
	
/*
 * 실습문제6
 * "월" ~ "일"(요일)까지 초기화된 문자열 배열을 만들고 0부터 6까지 숫자를 입력 받아
 * 입력한 숫자와 같은 인덱스에 있는 요일을 출력하고
 * 범위에 없는 숫자를 입력 시 "잘못 입력하셨습니다."를 출력하세요.
 * 
 * ex)
 * 0 ~ 6 사이 숫자 입력 : 4
 * 금요일
 * 
 * 0 ~ 6 사이 숫자 입력 : 4
 * 잘못 입력하셨습니다.
 */
	public void practice6() {
		
		int num = 0;
		String[] array = {"월", "화", "수", "목", "금", "토", "일"};
		Scanner sc = new Scanner(System.in);
		
		System.out.print("0 ~ 6 사이 숫자 입력 : ");
		num = sc.nextInt();
		
			if(num >= 0 && num <= array.length) {
				System.out.println(array[num] + "요일");
			} else {
					System.out.println("잘못 입력하셨습니다.");
					}
	}
	
/*
 * 실습문제7
 * 
 * 사용자가 배열의 길이를 직접 입력하여 그 값만큼 정수형 배열을 선언 및 할당하고
 * 배열의 크기만큼 사용자가 직접 값을 입력하여 각각의 인덱스에 값을 초기화 하세요.
 * 그리고 배열 전체 값을 나열하고 각 인덱스에 저장 된 값들의 합을 출력하세요.
 * 
 * ex)
 * 
 * 정수 : 5
 * 배열 0번째 인덱스에 넣을 값 : 4
 * 배열 1번째 인덱스에 넣을 값 : -4
 * 배열 2번째 인덱스에 넣을 값 : 3
 * 배열 3번째 인덱스에 넣을 값 : -3
 * 배열 4번째 인덱스에 넣을 값 : 2
 * 4 -4 3 -3 2
 * 총 합 : 2
 * 
 */
	public void practice7() {
		
		int arraysize = 0;
		int total = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		arraysize = sc.nextInt();
		
		int[] array = new int[arraysize];
		
		for (int i = 0; i < array.length; i++) {
			System.out.printf("배열 %d번째 인덱스에 넣을 값 : ", i);
			
			array[i] = sc.nextInt();
		}
		
		for (int i = 0; i < array.length; i++) {
				System.out.print(array[i] + " ");
				total += array[i];
		}
		System.out.println();
		System.out.print("총 합 : " + total);
			
	}
	
/*
 * 실습문제8
 * 
 * 3이상인 홀수 정수를 입력 받아 배열의 중간까지는 1부터 1씩 증가하여 오름차순으로 값을 넣고,
 * 중간 이후부터 끝까지는 1씩 감소하여 내림차순으로 값을 넣어 출력하세요.
 * 단, 입력한 정수가 홀수가 아니거나 3 미만일 경우 "다시 입력하세요."를 출력하고 
 * 다시 정수를 받도록 하세요.
 * 
 * ex)
 * 정수 : 4
 * 다시입력하세요.
 * 정수 : -6
 * 다시입력하세요.
 * 정수 : 5
 * 1, 2, 3, 2, 1
 */
	public void practice8() {
		int num = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		num = sc.nextInt();
		
		
		if((num >= 3) && (num % 2 == 1)) {
			int[] array = new int[num]; 
			
			for (int i = 0; i < (array.length / 2) + 1; i++) {
				array[i] = i + 1;
			}
			
			for (int i = 0; i < array.length; i++) {
				array[num - 1 - i] = array[i];
				System.out.print(array[i] + " ");
			}
			
		} else {
			System.out.print("다시 입력하세요.");
		}
	}
	
/*
 * 실습문제9
 * 
 * 10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고
 * 1~10 사이의 난수를 발생시켜 배열에 초기화 한 후 출력하세요.
 * 
 * 
 * ex)
 * 9 7 6 2 5 10 7 2 9 6	
 */
	public void practice9() {
		int[] array = new int[10];
		
		for (int i = 0; i < array.length; i++) {
			array[i] = (int)(Math.random() * 10 + 1);
			System.out.print(array[i] + " ");
		}
	}
	
/*
 * 실습문제10
 * 
 * 10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고
 * 1~10 사이의 난수를 발생시켜 초기화 후
 * 배열 전체 값과 그 값 중에서 최대값과 최소값을 출력하세요.
 * 
 * ex)
 * 5 3 2 7 4 8 6 10 9 10
 * 최대값 : 10
 * 최소값 : 2
 */
	public void practice10() {
		int[] array = new int[10];
		
		for (int i = 0; i < array.length; i++) {
			array[i] = (int)(Math.random() * 10 + 1);
			System.out.print(array[i] + " ");
		}
		System.out.println();
		
		Arrays.sort(array);
		
		System.out.println("최대값 : " + array[9]);
		System.out.println("최소값 : " + array[0]);
	}
	
/*
 * 실습문제11
 * 
 * 10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고
 * 1~10 사이의 난수를 발생시켜 중복된 값이 없게 배열에 초기화한 후 출력하세요.
 * 
 * ex)
 * 4 1 3 6 9 5 8 10 7 2
 */
	public void practice11() {
		int[] array = new int[10];
		
		for (int i = 0; i < array.length; i++) {
			array[i] = (int)(Math.random() * 10 + 1);
			for (int j = 0; j < i; j++) {
				if(array[i] == array[j]) {
					i--;
					
					break;
					}
			}
		}
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}
	
/*
 * 실습문제12
 * 
 * 로또 번호 자동 생성기 프로그램을 작성하는데 중복 값 없이 오름차순으로 정렬하여 출력하세요.
 * 
 * ex)
 * 3 4 15 17 28 40
 */
	public void practice12() {
		int[] array = new int[6];
		
		for (int i = 0; i < array.length; i++) {
			array[i] = (int)(Math.random() * 45 + 1);
			
			for (int j = 0; j < i; j++) {
				if(array[i] == array[j]) {
					i--;
					
					break;
				}
			}
		}
		
		Arrays.sort(array);
		
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}
	
/*
 * 실습문제13
 * 
 * 주민등록번호를 String 문자열로 입력 받고 입력 받은 그 문자열을 각 인덱스 별 문자를
 * char[]에 옮겨 담기(단, 성별 자리 이후부터는 *로 담기)
 * 
 * ex)
 * 주민등록번호(-포함) : 123456-1234567
 * 123456-1******
 */
	public void practice13() {
		String number = "";
		char[] array = null;
		char[] copy = null;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("주민등록번호(-포함) : ");
		number = sc.nextLine();
		
		array = new char[number.length()];
		
		for (int i = 0; i < array.length; i++) {
			array[i] = number.charAt(i);
		}
		
		copy = new char[number.length()];
		
		for (int i = 0; i < copy.length; i++) {
			if(i <= 7) {
				copy[i] = array[i];
			} else {
				copy[i] = '*';
			}
			System.out.print(copy[i]);
		}
	}
}
