package com.kh.exception.practice;

import java.io.EOFException;

public class C_SubClass extends C_SuperClass {
	
//	@Override
//	public void method() {
//		 오버라이딩 시 throws를 작성하지 않아도 된다.
//	}

//	@Override
//	public void method() throws IOException {
//		// 같은 예외를 던져주는 구문으로 작성이 가능하다.
//	}
	
//	@Override
//	public void method() throws Exception {
//		// 상위 타입의 예외를 throws 하는 것은불가능하다.
//	}
	
	@Override
	public void method() throws  EOFException {
		// 하위 타입의 예외를 throws 하는 것은 가능하다.
	}


}
