package com.kh.inherit.after;

public class Desktop extends Product{
	private boolean allInone; // 일체 여부
	
	public Desktop() {
		
//		super();
		System.out.println("자식 클래스의 기본 생성자");
	}
	
	public Desktop(String pCode, String name, String brand, int price, boolean allInone) {
//		super.setpCode(pCode);
//		super.setName(name);
//		super.setBrand(brand);
//		super.setPrice(price);
		super(pCode, name, brand, price);
		
		
		this.allInone = allInone;
	}

	@Override
	public String toString() {
		return "Desktop [" + super.toString() + ", allInone=" + allInone + "]";
	}
	
}

