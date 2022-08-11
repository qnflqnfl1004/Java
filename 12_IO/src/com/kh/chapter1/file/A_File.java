package com.kh.chapter1.file;

import java.io.File;
import java.io.IOException;

public class A_File {
	public void method1() {
		try {
			// 경로를 지정하지 않으면 현재 프로젝트 폴더에 파일이 생성된다.
			File file = new File("test.txt"); // 메모리상에만 존재하는 객체
//			File file2 = new File("C:/Users/user1/test2.txt");
			// 만약에 존재하지 않는 경로를 제시하면 IOException이 발생한다.
			File file2 = new File("C:/Users/kh/temp/test2.txt");
			
			System.out.println(file.getName()); // 파일 이름
			System.out.println(file.getAbsolutePath()); // 절대 경로
			System.out.println(file.getPath()); // 상대 경로
			System.out.println(file.length()); // 파일 용량
			System.out.println(file.exists()); // 파일 존재 여부
		
			file.createNewFile(); // 실제 파일이 생성된다.
			file.delete();
			
			
//			file2.mkdirs(); // 텍스트 파일도 폴더로 만들어 버린다ㅠㅠ
			
			File tempDir = new File("C:/Users/kh/temp"); // 존재하지 않는 폴더 만들기
			
			tempDir.mkdirs();
			
			file2.createNewFile();
			
			System.out.println(file2.exists());
			System.out.println(file2.isFile());
			System.out.println(file2.isDirectory());
			System.out.println(tempDir.isFile());
			System.out.println(tempDir.isDirectory());
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}