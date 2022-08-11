package com.kh.lambda.standard;

import java.util.function.BooleanSupplier;
import java.util.function.LongSupplier;
import java.util.function.Supplier;

public class B_Supplier {
	/*
	 * Supplier
	 * 	- Supplier 함수적 인터페이스는 매개 변수가 없고 리턴 값이 있는 getXXX() 추상 메소드를 가지고 있다.
	 * 	- getXXX() 추상 메소드는 실행 후 호출한 곳으로 데이터를 리턴(공급)하는 역할을 한다.
	 */

	public void method1() {
		Supplier<String> supplier = () ->  "Supplier : 객체(제네릭으로 지정된 타입의 객체)를 리턴한다.";
		
		System.out.println(supplier.get());
		
//		BooleanSupplier booleanSupplier = () -> {
//			return true;
//		};
		
		BooleanSupplier booleanSupplier = () -> true;
		
		System.out.println(booleanSupplier.getAsBoolean());
		
		
		LongSupplier longSupplier = () -> {
			return  654654654465L;
		};
		
		System.out.println(longSupplier.getAsLong());
	}
}
