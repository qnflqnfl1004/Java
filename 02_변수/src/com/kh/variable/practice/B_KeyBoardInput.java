package com.kh.variable.practice;

import java.util.Scanner;

public class B_KeyBoardInput {
	public void inputByScanner() {
		/*
		 * Scanner 클래스
		 *   - 사용자로부터 입력되는 정수, 실수, 문자열을 처리하는 클래스이다.
		 */
		// Scanner 생성
		String name = null;
		double height = 0.0;
		char gender = '\u0000';
		Scanner scanner = new Scanner(System.in);
		/*
		 * scanner.nextLine() : 사용자가 입력한 값을 모두 읽어온다.(공백 포함)
		 * scanner.next() : 사용자가 입력한 값 중에 공백이 있을 경우 공백 이전까지의 값만 읽어온다.
		 * scanner.nextInt() : 정수를 입력받을 때 사용한다.
		 * scanner.nextDouble() : 실수를 입력받을 때 사용한다.
		 * ...
		 */
		System.out.println("당신의 이름은 무엇입니까?");
		name = scanner.nextLine();
		
		System.out.println("당신의 키는 몇 입니까?(소수점 첫째 자리까지 입력하세요.)");
		height = scanner.nextDouble();
		
		System.out.println("당신의 성별은 무엇입니까? (남/여)");
		// scanner.nextXXX() 메소드 뒤에 scanner.nextLine() 메소드를 사용하게 된다면 버퍼에 남아있는 
		//'엔터를' 빼주기 위해서 scanner.nextLine() 메소드를 한 번더 호출한다.
		scanner.nextLine();
		// scanner.nextLine()을 통해서 문자열을 읽어오고 String 클래스의 charAt() 통해서 원하는 문자를 뽑아낸다.
		// charAt()에 위치를 지정하는 방법은 제일 앞의 문자부터 0으로 시작해서 1씩 증가하면서 원하는 문자를 뽑아낸다.
		gender = scanner.nextLine().charAt(0);
//		gender = "여자".charAt(0); 
//		gender = new String("여자").charAt(0);
		
//		System.out.println("당신의 이름은 " + name + ", 키는 " + height + "cm, 성별은 " + gender + " 입니다.");
		System.out.printf("당신의 이름은 %s, 키는 %.1fcm, 성별은 %c입니다.", name, height, gender);
		
		scanner.close();
	}
}
