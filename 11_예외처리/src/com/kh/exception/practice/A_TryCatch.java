package com.kh.exception.practice;

/*
 * try - catch
 * 
 * 		[표현법]
 * 			try {
 * 				// 예외가 발생할 가능성이 있는 코드가 위치한다.
 * 			} catch(Exception e) {
 * 				// try 블럭에서 예외가 발생하면 실행을 멈추고 catch 블록으로 이동하여 예외 처리 코드를 실행한다.
 * 			} [finally {
 * 				// 예외가 발생하지 않거나 예외가 발생해 catch 블록을 실행한 후 무조건 실행되는 코드 블록이다.
 *				// finally 블록은 생략이 가능하다.
 * 			}]
 */
public class A_TryCatch {
	public void method1() {
		try {
			// 예외가 발생할 가능성이 있는 코드
			System.out.println("method2() 호출 전");
			
//			int result = 10 / 0;
			
//			System.out.println("%d");
			
			
			method2();
			
			System.out.println("method2() 호출 후");
		} catch (Exception e) {
			System.out.println("에러 발생 : " + e.getMessage());
//			e.printStackTrace();
		} finally {
			System.out.println("예외 발생 여부와 상관없이 무조건 수행된다.");
			
		}
		
	}
	
	public void method2() throws Exception {
		throw new Exception("강제로 예외를 발생");
	}
}
