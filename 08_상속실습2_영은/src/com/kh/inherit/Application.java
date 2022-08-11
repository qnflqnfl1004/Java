package com.kh.inherit;

import com.kh.inherit.practice.Circle;
import com.kh.inherit.practice.Rectangle;

public class Application {

	public static void main(String[] args) {
		// 크기가 2인 Circle, Rectangle 각각 객체 배열 할당
		Circle[] cc = new Circle[2];
		Rectangle[] rt = new Rectangle[2];
		
		// 위의 사용 데이터를 참고하여 각각 초기화.
		cc[0] = new Circle(1, 2, 3);
		cc[1] = new Circle(3, 3, 4);
		
		rt[0] = new Rectangle(-1, -2, 5, 2);
		rt[1] = new Rectangle(-2, 5, 2, 8);
		// 각 도형의 draw 메소드 실행  --> 향상된 for문 이용해서
		
		
		System.out.println("==== circle ====");
		for (Circle circle : cc) {
			
			circle.draw();			//부모의 draw 메소드가 아닌 자식의 draw 메소드가 실행 (Circle에서 프린트 메소드를 실행해서 여기서는 안해도됨.)
		}
		
		
		System.out.println("==== rectangle ====");
		for (Rectangle rectangle : rt) {
			
			rectangle.draw();		//부모의 draw 메소드가 아닌 자식의 draw 메소드가 실행 (rectangle에서 프린트 메소드를 실행해서 여기서는 안해도됨.)
		}
	}

}
