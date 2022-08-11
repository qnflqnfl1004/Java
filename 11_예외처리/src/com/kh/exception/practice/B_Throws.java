package com.kh.exception.practice;

import java.io.IOException;

public class B_Throws {

	public void method1() {
		try {
			
			System.out.println("method2() 호출 전");
		
			method2();
		
			System.out.println("method2() 호출 후");
		} catch(ClassNotFoundException | IOException e) {
			System.out.println("ClassNotFoundException, IOException 예외가 발생했습니다.");
		}
//		  catch (ClassNotFoundException e) {
//			System.out.println("ClassNotFoundException 예외가 발생했습니다.");
//		} catch (IOException e) {
//			System.out.println("IOException 예외가 발생했습니다.");
//		} 
		catch (Exception e) {
			System.out.println("예외가 발생했습니다.");
		}
	}
	
	public void method2() throws ClassNotFoundException, IOException {
		System.out.println("method2() 호출 전");
		
		method3();
		
		System.out.println("method2() 호출 후");
	}
	
	public void method3() throws ClassNotFoundException, IOException {
//	public void method3() throws Exception {
		int random = (int)(Math.random() * 4 + 1);
		  
		/*
		 * CheckedException
		 *    - Exception 클래스를 상속하고 있는 예외들을 CheckedException이라 한다.
		 *    - 컴파일 시 예외 처리 코드가 있는 검사하고 예외 처리 코드가 없으면 컴파일 에러를 발생시킨다.
		 *    	(try-catch, throws)
		 *    
		 *  UnCheckedException
		 *    - RuntimeException 클래스를 상속하고 있는 예외들을 UnCheckedException이라 한다.
		 *    - 컴파일 시 예외 처리 코드가 있는지 검사하지 않는다.
		 */
		if(random == 1) {
			throw new ClassNotFoundException();
		} else if(random == 2 ) {
			throw new IOException();
		} else if(random == 3 ) {
			throw new ClassCastException();
		}
		
	}
}
