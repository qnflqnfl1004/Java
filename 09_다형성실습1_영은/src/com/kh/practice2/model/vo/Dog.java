package com.kh.practice2.model.vo;

public class Dog {
	
	public String PLACE;
	
	private int weight;
	
	public Dog() {
	}

	public Dog(String name, String kinds, String pLACE, int weight) {
		super();
		this.PLACE = pLACE;
		this.weight = weight;
	}

	public String getPLACE() {
		return PLACE;
	}

	public void setPLACE(String pLACE) {
		PLACE = pLACE;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	public void speak() {
		
	}
}