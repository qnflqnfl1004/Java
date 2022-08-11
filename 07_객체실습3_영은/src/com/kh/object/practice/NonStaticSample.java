package com.kh.object.practice;

import java.util.Arrays;

public class NonStaticSample {
	
	public void printLottoNumbers() {
		int[] array = new int [6];
		
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
		
		System.out.println();
	}
	
	public void outputChar(int num, char c) {
		for (int i = 0; i < num; i++) {
			System.out.print(c + " ");
		}
		
		System.out.println();
	}
	
	public char alpahbette() {
		int num = 0;
		
		while(true) {
			num = (int)(Math.random() * 58 + 65);
			
			if(num >= 'a' && num <= 'z' || num >= 'A' && num <= 'Z' ) {
				
				break;
			}
		}
		
		return (char)num;
		
	}
	
	public String mySubstring(String str, int index1, int index2) {
		String result = null;
		
		if(!str.equals("")) {
			/*
			 * 방법 1)
			 * for(int i = index1; i < index2; i++) {
			 * 		result += str.charAt(i);
			 * }
			 * 
			 * 방법 2)
			 * String 클래스에서 제공하는 substring(시작 인덱스, 끝 인덱스)) 시작 인덱스 ~ 끝 인덱스 사이 범위의 문자열을 추출한다. 
			 */
			result = str.substring(index1, index2);
		}
		
		return result;
	}
	
	
}
