package com.kh.chapter1.polymorphism;

public class Product {
	private String pCode; // 상품 코드

	private String name; // 상품명

	private String brand; // 브랜드

	private int price; // 가격

	public Product() {
	}

	public Product(String pCode, String name, String brand, int price) {
		this.pCode = pCode;
		this.name = name;
		this.brand = brand;
		this.price = price;
	}

	public String getpCode() {
		return pCode;
	}

	public String getName() {
		return name;
	}

	public String getBrand() {
		return brand;
	}

	public int getPrice() {
		return price;
	}

	public void setpCode(String pCode) {
		this.pCode = pCode;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "pCode=" + pCode + ", name=" + name + ", brand=" + brand + ", price=" + price;
	}
}
