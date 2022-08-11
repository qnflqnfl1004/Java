package com.kh.chapter3.map;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map.Entry;
import java.util.Properties;

public class B_Properties {
// Properties를 생성하고 저장, 출력(파일) 테스트
	public void method1() {
		Properties prop = new Properties();
		
		// 순서 유지 X, 키값 중복 X
		prop.setProperty("List", "LinkedList");
		prop.setProperty("List", "ArrayList");
		prop.setProperty("Set", "HashSet");
		prop.setProperty("Map", "HashSet");
		
		System.out.println(prop);
		System.out.println();
		
		// value 값 읽어오기
		System.out.println(prop.getProperty("List"));
		System.out.println(prop.getProperty("Stack", "값이 없습니다."));
		
		
		for (Entry<Object, Object> entry : prop.entrySet()) {
			String key = (String) entry.getKey();
			String value = (String) entry.getValue();
			
			System.out.printf("key : %s, value : %s\n", key, value);
			
			
			try {
//				prop.store(new FileOutputStream("test1.properties"), "Properties Test 1");
//				prop.store(new FileWriter("test2.properties"), "Properties Test 2");
				prop.storeToXML(new FileOutputStream("test3.xml"), "XML Test");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
// Properties를 생성하고 저장(파일), 출력 테스트
	public void method2() {
		Properties prop = new Properties();
		
		try {
//			prop.load(new FileInputStream("test1.properties"));
//			prop.load(new FileReader("test2.properties"));
			prop.loadFromXML(new FileInputStream("test3.xml"));
			
			System.out.println(prop);
			System.out.println(prop.getProperty("List"));
			System.out.println(prop.getProperty("Set"));
			System.out.println(prop.getProperty("Map"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
