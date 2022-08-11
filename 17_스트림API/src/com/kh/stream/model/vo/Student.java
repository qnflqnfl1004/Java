package com.kh.stream.model.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Student implements Comparable<Student>{
	private int idx;
	
	private String name;
	
	private int age;
	
	private String gender;
	
	private int math;
	
	private int english;

	
	public Student(String name, int age, String gender, int math, int english) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.math = math;
		this.english = english;
	}
	
	@Override
	public int compareTo(Student student) {
		return Integer.compare(this.age, student.age);
	}
	


	
	
}
