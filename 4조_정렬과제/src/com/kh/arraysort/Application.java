package com.kh.arraysort;

import java.util.Scanner;

import com.kh.arraysort.practice.ArraySort;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int menu;
		ArraySort arraysort = new ArraySort();	// ArraySort객체의 인스턴스 생성
		
		
		while(true) {
			System.out.println("======4조 정렬과제 시작메뉴======");
			System.out.println("1. 정렬 알고리즘 실행");
			System.out.println("2. 정렬 알고리즘 복잡도 출력");
			System.out.println("0. 프로그램 종료");
			System.out.println("============================");
			System.out.print("메뉴 선택 >> ");
			menu = scanner.nextInt();
			
			switch(menu) {
				case 1:
					arraysort.displaySortMenu();				// ArraySort객체의 displayMenu함수 호출
					break;
				case 2:
					arraysort.displeyComplexity();
					break;
				case 0:
					System.out.println("프로그램 종료");
					scanner.close();
					arraysort.close();						// ArraySort객체의 close함수 호출
					return;
				default:
					System.out.println("잘못 입력하셨습니다.");	
					
			}
		}

	}

}
