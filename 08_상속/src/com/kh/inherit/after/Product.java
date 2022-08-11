package com.kh.inherit.after;

public class Product {
	private String pCode; // 상품 코드
	
	private String name; // 이름
	
	private String brand;  // 브랜드
	
	private int price;  // 가격
	
	public Product() {
		System.out.println("부모 클래스의 기본 생성자");
	}
	
	public Product(String pCode, String name, String brand, int price) {
		this.pCode = pCode;
		this.name = name;
		this.brand = brand;
		this.price = price;
	}

	@Override
	public String toString() {
		return "pCode=" + pCode + ", name=" + name + ", brand=" + brand + ", price=" + price;
	}
	
	
}
