package com.kh.object.practice;

public class StaticSample {
	
	private static String value;

	public static String getValue() {
		return value;
	}

	public static void setValue(String value) {
		StaticSample.value = value;
	}
	
	public static void toUpper() {
		value = value.toUpperCase();
	}
	
	public static void setChar(int index, char c) {
		char[] arr = value.toCharArray();
		
		arr[index] = c;
		
		value = String.valueOf(arr);
	}
	
	public static int valueLength() {
		return value.length();
	}
	
	public static String valueConcat(String str) {
		
		return value + str;
	}
	
}
