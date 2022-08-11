package com.kh.chapter2._class;

/*
 * 클래스
 * 
 * 	[표현법]
 * 		[접근 제한자] [예약어] class 클래스명 {
 * 			// 1. 필드부 (객체의 속성을 정의)
 * 				[접근 제한자] [예약어] 자료형 필드명 [= 초기값];
 * 				...
 * 				}
 * 			// 2. 생성자부
 *  			[접근 제한자] 클래스명 ([매개변수, ...]) {
 * 				...
 * 				}
 * 			// 3. 메소드부 (객체의 기능을 정의)
 * 			[접근 제한자] [예약어] 반환형 필드명 ([= 초기값]) {
 * 				...
 * 
 * 			 [return] [반환값];
 * 				}
 * 			}
 * 
 * 클래스에서 사용 가능한 접근 제한자
 * 
 * 1. public
 * 		- 클래스를 선언할 때 접근 제한자를 public 붙였다면 public 접근 제한을 갖는다.
 * 		- public으로 선언된 클래스를 아무런 제약없이 사용할 수 있다.
 * 
 * 2. default
 *		- 클래스를 선언할 때 접근 제한자를 생략했다면 default 접근 제한을 갖는다.
 *		- 동일한 패키지에는 아무런 제약없이 사용할 수 있지만 다른 패키지에서는 사용할 수 없도록 접근이 제한된다. 
 * 
 */
public class Person {
	private String name;
	
	private int age;

	private Phone phone;
	
	public Person() {
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	
	
	public void setPhone(String name, String color, String brand) {
		this.phone = new Phone();
		
		this.phone.setName(name);
		this.phone.setColor(color);
		this.phone.setBrand(brand);
		
	}
	
	public void whoAreYou() {
		System.out.println("안녕하세요. 저는 " + this.name + "입니다. 나이는" + this.age + "세 입니다.");
		System.out.println("저는 " + this.phone.getBrand() + "의 " + this.phone.getName() + "을 가지고 있습니다.");
	}
}
