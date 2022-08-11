package com.kh.inherit.after;

public class SmartPhone extends Product {
	private String mobileAgency; // 통신사 
	
	public SmartPhone() {
	}

	public SmartPhone(String pCode, String name, String brand, int price, String movileAgency) {
		super(pCode, name, brand, price);
		
		this.mobileAgency = mobileAgency;
	}
	
	public void setMobileAgency(String mobileAgency) {
		this.mobileAgency = mobileAgency;
	}

	@Override
	public String toString() {
		return "SmartPhone [" + super.toString() + ", mobileAgency=" + mobileAgency + "]";
	}
	
}
