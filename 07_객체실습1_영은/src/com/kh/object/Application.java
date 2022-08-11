package com.kh.object;

import com.kh.object.practice.Product;

public class Application {

	public static void main(String[] args) {
		// 1. 매개변수 생성자를 이용하여 3개의 객체 생성
		Product s = new Product("ssgnote9", "갤럭시노트9", "경기도 수원", 960000, 10.0);
		Product l = new Product("lgxnote5", "LG스마트폰5", "경기도 평택", 780000, 0.7);
		Product k = new Product("ktsnote3", "KT스마트폰3", "서울시 강남", 250000, 0.3);
		
		System.out.println(s.information());
		System.out.println(l.information());
		System.out.println(k.information());
		System.out.println("============================================================");
		
		// 2. setter메소드를 이용하여 가격을 모두 120만원으로 수정, 부가세율도 모두 0.05로 수정 후 출력
		s.setPrice(1200000);
		l.setPrice(1200000);
		k.setPrice(1200000);
		s.setTax(0.05);
		l.setTax(0.05);
		k.setTax(0.05);
		
		System.out.println(s.information());
		System.out.println(l.information());
		System.out.println(k.information());
		System.out.println("============================================================");
		
		// 3. getter 메소드를 이용하여 각 객체의 가격에 부가세율을 적용한 실제 가격을 계산해서 출력
				// 부가세 포함 가격 = 가격 + (가격 * 부가세율)
		System.out.println("상품명 = " + s.getName());
		System.out.println("부가세 포함 가격 = " + (int)(s.getPrice() + (s.getPrice() * s.getTax())) + "원");
		
		System.out.println("상품명 = " + l.getName());
		System.out.println("부가세 포함 가격 = " + (int)(l.getPrice() + (l.getPrice() * l.getTax())) + "원");
		
		System.out.println("상품명 = " + k.getName());
		System.out.println("부가세 포함 가격 = " + (int)(k.getPrice() + (k.getPrice() * k.getTax())) + "원");
		
	}

}
