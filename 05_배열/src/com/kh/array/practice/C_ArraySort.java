
package com.kh.array.practice;

import java.util.Arrays;
import java.util.Collections;

public class C_ArraySort {
	public void method1() {
		int arr[] = {2, 7, 5, 1, 3};
		
		System.out.println(arr.hashCode());
		System.out.println(Arrays.toString(arr));
		
		// 오름차순으로 정렬
		Arrays.sort(arr);
		
		System.out.println(arr.hashCode());
		System.out.println(Arrays.toString(arr));
		
		// 내림차순으로 정렬
		// 1. for 문을 사용해서 원본 배열을 오름차순으로 정렬한 다음 값을 반대로 새로운 배열에 대입한다.
		int[] copy = new int[5];
		
		for (int i = 0; i < arr.length; i++) {
			copy[4-i] = arr[i];
		}
		
		System.out.println(Arrays.toString(copy));
		
		//2. 아래와 같이 작성하는 방법이 있다.(추후에 다시 설명드릴게요(_ _))
		Integer[] iArray = {2, 7, 5, 1, 3};
		
		Arrays.sort(iArray, Collections.reverseOrder());
		
		System.out.println();
		System.out.println(Arrays.toString(iArray));
	}
	
	public void method2() {
		String[] array = {"메론", "orange", "apeach", "banana", "apple", "레몬"};
		
		// 오름차순 정렬
		Arrays.sort(array);
		System.out.println(Arrays.toString(array));
		
		// 내림차순 정렬
		Arrays.sort(array, Collections.reverseOrder());
		System.out.println(Arrays.toString(array));
	}
	
	/*
	 * 조별 과제
	 * 
	 * 1. 개별로 정렬 알고리즘을 하나씩 선택해서 정리해 주세요.
	 * 	- 삽입 정렬, 버블 정렬, 선택 정렬, 퀵 정렬, ...
	 * 
	 * 2. 시간 복잡도와 공간 복잡도를 정리해 주세요.
	 * 
	 * 3. 반드시 정리된 내용은 조원들끼리 공유 및 코드 리뷰 진행해 주세요.
	 * 
	 * 4. 4/17(일)까지 프로젝트 하나로 만들어서 내용 정리 후 메일로 보내주세요.
	 */
}
