package com.kh.object;

import com.kh.object.practice.NonStaticSample;
import com.kh.object.practice.StaticSample;

public class Application {

	public static void main(String[] args) {
		NonStaticSample nss = new NonStaticSample();
		
		// 1~45까지의 임의의 정수 6개가 중복되지 않게 발생시켜 출력하는 메소드
		// 응용 --> 오름차순 정렬로 출력
		System.out.print("1. 랜덤 값 : ");
		nss.printLottoNumbers();
		
		// 매개변수로 전달받은 문자 c를 전달받은 num 갯수 만큼 출력하는 메소드
		System.out.print("2. a문자 5개 출력 : ");
		nss.outputChar(5, 'a');
		
		// 알파벳 범위의 임의의 영문자를 하나 발생시켜 리턴하는 메소드
		// 주의! 소문자 대문자 모두 포함
		System.out.print("3. 랜덤 영문자 출력 : " + nss.alpahbette());
		System.out.println();
		
		// 매개 변수로 문자열과 시작 인덱스, 끝 인덱스를 전달 받고
		// 해당 인덱스 범위의 문자열을 추출하여 리턴
		// 단, 전달받은 문자열은 반드시 값이 있어야 한다. --> 없으면 null 리턴
		System.out.print("4. apple의 2번 4번 인덱스 사이의 값 출력 : " + nss.mySubstring("apple", 2, 4));
		System.out.println();
		
		
		// StaticSample 클래스 변수인 value를 "Java"로 초기화 후 출력
		StaticSample.setValue("Java");
		System.out.println("value : " + StaticSample.getValue());
		
		// toUpper 메소드 실행을 통해 대문자로 변경 후 출력
		StaticSample.toUpper();
		System.out.println("대문자로 : " + StaticSample.getValue());
		
		// valueLength 메소드 실행을 통해 길이 출력
		System.out.println("길이 : " + StaticSample.valueLength());
		
		
		// valueConcat 메소드 실행을 통해 "PROGRAMMING" 문자열 합친 후 출력
		System.out.println("PROGRAMMING 붙여서 : " + StaticSample.valueConcat("PROGRAMMING"));
		
		// setChar 메소드 실행을 통해 "J"를 "C"로 변경 후 출력
		StaticSample.setChar(0, 'C');
		System.out.println("J => C : " + StaticSample.getValue());
		
	}

}
