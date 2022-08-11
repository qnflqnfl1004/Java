package com.kh.chapter4;

import java.util.List;

import com.kh.chapter4.generics.MyGenerics;

public class Application {

	public static void main(String[] args) {
		String[] strArray = {"신영은", "강래형", "김여울", "엄솔이", "임진호"};
		Integer[] intArray = {11, 22, 33, 44, 55};
		Double[] doubleArray = {11.1, 22.2, 33.3, 44.4, 55.5};
		
//		MyGenerics myGenerics = new MyGenerics(strArray);
//		MyGenerics myGenerics = new MyGenerics(intArray);
//		MyGenerics myGenerics = new MyGenerics(doubleArray);
		
//		MyGenerics<String> myGenerics = new MyGenerics<>(strArray);
		MyGenerics<Integer> myGenerics = new MyGenerics<>(intArray);
//		MyGenerics<Double> myGenerics = new MyGenerics<>(doubleArray);
		
		myGenerics.print();
		
//		List<String> list = myGenerics.toList();
		List<Integer> list = myGenerics.toList();
//		List<Double> list = myGenerics.toList();
		
		System.out.println(list);
	}

}
