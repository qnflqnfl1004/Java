package com.kh.control.practice;

/*
 * break 문
 * 
 * 	[표현법]
 * 		반복문/switch(조건식) {
 * 			[break;] // 해당 구문을 빠져나가는 역할을 한다.
 * 		}
 * 
 * 	- break 문은 반복문들과 switch 문의 실행을 중지하고 빠져나갈 때 사용한다.
 * 	- 반복문이 중첩되어 있는 경우 break 문이 포함되어 있는 반복문만 중지하고 빠져나간다.
 */
public class F_Break {
	public void method1() {
		// 1부터 랜덤값(1 ~ 10)까지의 합계를 반복문을 통해서 출력한다.
		// 단, 랜덤값이 숫자 5가 나오면 프로그램을 종료한다.
		int sum;
		int random = 0;
		
		while(true) {
//			if(random == 5) {
//				break;
//			}
			sum = 0;
			random = (int) (Math.random() * 10 + 1);
			
			if(random == 5) {
				break;
			}
			
			for(int i = 1; i <= random; i++) {
				sum += i;
			}
			
			System.out.printf("1부터 %d까지의 합계 : %d\n", random, sum);
		}
		
		System.out.printf("랜덤값이 %d이므로 프로그램을 종료합니다.", random);
	}
		
}
