package com.kh.practice2.model.vo;

public abstract class Animal {
	private String name;
	
	private String kinds;
	
	protected Animal() {
		
	}
	
	protected Animal(String name, String Kind) {
		
	}
	
	public String toString() {
		return null;
	}
	
	public abstract void speak();
}
