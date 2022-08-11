package com.kh.control.chap01;

import java.util.Scanner;

public class ConditionPractice {
		/*
		 * 실습문제1
		 * 
		 * 아래 예시와 같이 메뉴를 출력하고 메뉴 번호를 누르면"ㅇㅇ메뉴입니다"를,
		 * 종료 번호를 누르면 "프로그램이 종료됩니다."를 출력하세요.
		 * 
		 * ex)
		 * 1. 입력
		 * 2. 수정
		 * 3. 조회
		 * 4. 삭제
		 * 9. 종료
		 * 메뉴 번호를 입력하세요 : 3
		 * 조회 메뉴입니다.
		 */
		public void practice1() {
			int num = 0;
			String str = "";			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("1. 입력 ");
			System.out.println("2. 수정 ");
			System.out.println("3. 조회 ");
			System.out.println("4. 삭제 ");
			System.out.println("9. 종료 ");
			System.out.print("메뉴 번호를 입력하세요 : ");
			num = sc.nextInt();
			
			switch(num) {
				case 1 :
						str = "입력";
					
						break;
				case 2 :
						str = "수정";
					
						break;
				case 3 :
						str = "조회";
					
						break;
				case 4 :
						str = "삭제";
					
						break;
				case 9 :
						System.out.println("프로그램이 종료됩니다.");
					
						return;
				default :
						System.out.println("잘못입력하셨습니다.");
					
						return;
			}
			
			System.out.printf("%s메뉴입니다",str);
			sc.close();
		}
		/*
		 * 실습문제2
		 * 
		 * 키보드로 정수를 입력 받은 정수가 양수이면서 짝수일 때만 "짝수다"를 출력하고
		 * 짝수가 아니면 "홀수다"를 출력하세요.
		 * 양수가 아니면 "양수만 입력해주세요."를 출력하세요.
		 * 
		 * ex)
		 * 숫자를 한 개 입력하세요 : -8
		 * 양수만 입력해주세요.
		 */
		public void practice2() {
			int num = 0;
			Scanner sc = new Scanner(System.in);
			
			System.out.print("숫자 한 개 입력하세요 : ");
			num = sc.nextInt();
			
			if(num > 0) {
					if (num % 2 == 0) {
							System.out.println("짝수다");
					} else {
							System.out.println("홀수다");
					} 
			} else {
							System.out.println("양수만 입력하세요");
			}
			sc.close();
		}
		/*
		 * 실습문제3
		 * 국어, 영어, 수학 세 과목의 점수를 키보드로 입력 받고 합계와 평균을 계산하고
		 * 합계와 평균을 이용하여 합격 / 불합격 처리하는 기능을 구현하세요.
		 * (합격 조건 : 세과목의 점수가 각각 40점 이상이면서 평균이 60점 이상일 경우)
		 * 합격 했을 경우 과목 별 점수와 합계, 평균, "축하합니다, 합격입니다!"를 출력하고
		 * 불합격인 경우에는 "불합격입니다."를 출력하세요.
		 * 
		 * ex1)
		 * 국어점수 : 88
		 * 수학점수 : 50
		 * 영어점수 : 48
		 * 불합격입니다.
		 * 
		 * ex2)
		 * 국어점수 : 88
		 * 수학점수 : 50
		 * 영어점수 : 45
		 * 국어 : 88
		 * 수학 : 50
		 * 영어 : 45
		 * 합계 : 183
		 * 평균 : 61.0
		 * 축하합니다, 합격입니다!
		 * 
		 */
		public void practice3() {
			int kor, math, eng = 0;
			Scanner sc = new Scanner(System.in);
			
			System.out.print("국어점수 : ");
			kor = sc.nextInt();
			System.out.print("수학점수 : ");
			math = sc.nextInt();
			System.out.print("영어점수 : ");
			eng = sc.nextInt();
			
			int total = kor + math + eng;
			double avg = total / 3.0;
			
			if(kor >=40 && math >= 40 && eng>= 40 && avg >= 60 ) {
				System.out.println("국어 : " + kor);
				System.out.println("수학 : " + math);
				System.out.println("영어 : " + eng);
				System.out.println("합계 : " + total);
				System.out.println("평균 : " + avg);
				System.out.println("축하합니다. 합격입니다!");
			} else {
				System.out.println("불합격입니다.");
			}
			sc.close();
		}
		/*
		 * 실습문제4
		 * 수업 자료(7page)에서 if문으로 되어있는 봄, 여름, 가을, 겨울 예제를 switch문으로 바꿔서 출력하세요.
		 * 
		 * 
		 * ex1)
		 * 1~12 사이의 정수 입력 : 8
		 * 8월은 여름입니다.
		 * 
		 * ex2)
		 * 1~12 사이의 정수입력 : 99
		 * 99월은 잘못 입력된 달입니다.
		 */
		public void practice4() {
			int num = 0;
			String season = "";
			Scanner sc = new Scanner(System.in);
			
			System.out.print("1~12 사이의 정수 입력 : ");
			num = sc.nextInt();
			
			switch(num) {
							case 12 :
							case 1 :
							case 2 :
									season = "겨울";
								
									break;
							case 3 :
							case 4 :
							case 5 :
									season = "봄";
								
									break;
							case 6 :
							case 7 :
							case 8 :
									season = "여름";
								
									break;
							case 9 :
							case 10 :
							case 11 :
									season = "가을";
								
									break;
							default :
									season = "잘못 입력된 달";
									
									break;
									
			}
			System.out.printf("%d월은 %s입니다.", num, season);
			sc.close();
		}
		/*
		 * 실습문제5
		 * 
		 * 아이디, 비밀번호를 정해두고 로그인 기능을 작성하세요.
		 * 로그인 성공 시 "로그인 성공",
		 * 아이디가 틀렸을 시 "아이디가 틀렸습니다.",
		 * 비밀번호가 틀렸을 시 "비밀번호가 틀렸습니다."를 출력하세요.
		 * 
		 * ex1)
		 * 아이디 : ismoon
		 * 비밀번호 : 1234
		 * 로그인 성공
		 * 
		 * ex2)
		 * 아이디 : ismoon
		 * 비밀번호 : 23467
		 * 비밀번호가 틀렸습니다.
		 * 
		 * ex3)
		 * 아이디 : ismoom
		 * 비밀번호 : 1234
		 * 아이디가 틀렸습니다.
		 */
		public void practice5() {
			String inputId = "";
			String inputPwd = "";
			String userId = "sye";
			String userPwd = "1004";
			Scanner sc = new Scanner(System.in);
			
			System.out.print("아이디 : ");
			inputId = sc.nextLine();
			
			System.out.print("비밀번호 : ");
			inputPwd = sc.nextLine();
			
			if(userId.equals(inputId) && userPwd.equals(inputPwd)) {
					System.out.println("로그인 성공");
			} else if(userId.equals(inputId)) {
					System.out.println("비밀번호가 틀렸습니다.");
			} else if(userPwd.equals(inputPwd)){
					System.out.println("아이디가 틀렸습니다.");
			} else {
					System.out.println("모두 틀렸습니다.");
			}
			sc.close();
		}
		/*
		 * 실습문제6
		 * 
		 * 사용자에게 관리자, 회원, 비회원 중 하나를 입력 받아 각 등급이 행할 수 있는 권한을 출력하세요.
		 * 단, 관리자는 회원관리, 게시글 관리, 게시글 작성, 게시글 조회, 댓글 작성이 가능하고
		 * 회원은 게시글 작성, 게시글 조회, 댓글 작성이 가능하고
		 * 비회원은 게시글 조회만 가능합니다.
		 * (단, 잘못 입력하였을 경우 "잘못입력했습니다."라는 출력문이 출력되도록)
		 * 
		 * ex)
		 * 권한을 확인하고자 하는 회원 등급 : 관리자
		 * 회원관리, 게시글 관리
		 * 게시글 작성, 댓글 작성
		 * 게시글 조회
		 */
		public void practice6() {
			Scanner sc = new Scanner(System.in);
			
			System.out.print("권한을 확인하고자 하는 회원 등급 : ");
			
			switch(sc.nextLine()) {
						case "관리자" :
									System.out.println("회원관리, 게시글 관리");
						case "회원" :
									System.out.println("게시글 작성, 댓글 작성");
						case "비회원" :
									System.out.println("게시글 조회");
									
									break;
						default :
									System.out.println("잘못입력했습니다.");
									
									break;
			}
			sc.close();
		}
		/*
		 * 실습문제7
		 * 
		 * 키, 몸무게를 double로 입력 받고 BMI지수를 계산하여 계산 결과에 따라
		 * 저체중 / 정상체중 / 과체중 / 비만을 출력하세요.
		 * BMI = 몸무게 / (키(m) * 키(m))
		 * BMI가 18.5미만일 경우 저체중 / 18.5이상 23미만일 경우 정상체중
		 * BMI가 23이상 25미만일 경우 과체중 / 25이상 30미만일 경우 비만
		 * BMI가 30이상일 경우 고도 비만
		 * 
		 * ex)
		 * 키(m)를 입력해 주세요 : 1.62
		 * 몸무게(kg)를 입력해 주세요 : 46
		 * BMI 지수 : 17.527815881725342
		 * 저체중
		 */
		public void practice7() {
			double height = 0;
			double weight = 0;
			Scanner sc = new Scanner(System.in);
			
			System.out.print("키(m)를 입력해 주세요 : ");
			height = sc.nextDouble();
			
			System.out.print("몸무게(kg)를 입력해 주세요 : ");
			weight = sc.nextDouble();
			
			double bmi = (weight / (height * height));
			
			System.out.print("BMI 지수 : " + bmi);
			System.out.println();
			
			if(bmi < 18.5) {
							System.out.println("저체중");	
			} else if(bmi >= 18.5 && bmi < 23) {
							System.out.println("정상체중");
			} else if(bmi >= 23 && bmi < 25) {
							System.out.println("과체중");
			} else if(bmi >= 25 && bmi < 30) {
							System.out.println("비만");
			} else {
							System.out.println("고도 비만");
			}
			sc.close();
		}
		/*
		 * 실습문제8
		 * 
		 * 키보드로 두 개의 양수와 연산 기호를 입력 받아 연산 기호에 맞춰 연산 결과를 출력하세요.
		 * (단, 양수가 아닌 값을 입력하거나 제시되어 있지 않은 연산 기호를 입력 했을 시 
		 * "잘못 입력하셨습니다. 프로그램을 종료합니다." 출력)
		 * 
		 * (printf()문을 이용하여 마지막 출력문을 작성해보시오.)
		 * 
		 * ex)
		 * 피연산자1 입력 : 15
		 * 피연산자2 입력 : 4
		 * 연산자를 입력(+,-,*,/,%) : /
		 * 15 / 4 = 3
		 */
		public void practice8() {
			int num1 = 0;
			int num2 = 0;
			char op = '\u0000';
			int result = 0;
			Scanner sc = new Scanner(System.in);
			
			System.out.print("피연산자1 입력 : ");
			num1 = sc.nextInt();
			
			System.out.print("피연산자2 입력 : ");
			num2 = sc.nextInt();
			sc.nextLine();
			
			System.out.print("연산자를 입력(+,-,*,/,%) : ");
			op = sc.nextLine().charAt(0);
			
			if(num1 > 0 && num2 > 0) {
				switch(op) {
							case '+' :
										result = num1 + num2;

										break;
							case '-' :
										result = num1 - num2;

										break;
							case '*' :
										result = num1 * num2;

										break;
							case '/' :
										result = num1 / num2;

										break;
							case '%' :
										result = num1 % num2;

										break;
							default :
										System.out.println("연산자를 잘못 입력하셨습니다. 프로그램을 종료합니다.");

										return;
							}						
				} else {
						System.out.println("양수가 아닙니다. 프로그램을 종료합니다."); return;
				}
					System.out.printf("%d %c %d = %d", num1, op, num2, result);
			}

		/*
		 * 실습문제9
		 * 
		 * 중간고사, 기말고사, 과제점수, 출석회수를 입력하고 Pass 또는 Fail을 출력하세요.
		 * 총 점 100점 중 배점으로는 다음과 같다.
		 * 중간고사 (20%), 기말고사 (30%), 과제 (30%), 출석 (20%)
		 * 이 때, 출석 회수는 총 강의 회수 20회 중에서 출석한 날만 입력
		 * 총 점이 70점 이상이면서 전체 강의의 70%이상 출석을 했을 경우 Pass,
		 * 아니면 Fail을 출력하세요.
		 * 
		 * ex1)
		 * 중간 고사 점수 : 80
		 * 기말 고사 점수 : 90
		 * 과제 점수 : 50
		 * 출석 회수 : 15
		 * =========결과=========
		 * 중간 고사 점수(20) : 16.0
		 * 기말 고사 점수(30) : 27.0
		 * 과제 점수(30) : 15.0
		 * 출석 점수(20) : 15.0
		 * 총점 : 73.0
		 * PASS
		 * 
		 * ex2)
		 * 중간 고사 점수 : 80
		 * 기말 고사 점수 : 30
		 * 과제 점수 : 60
		 * 출석 회수 : 18
		 * =========결과=========
		 * FAIL [점수 미달] (총점 61.0)
		 * 
		 * ex3)
		 * 중간 고사 점수 : 90
		 * 기말 고사 점수 : 100
		 * 과제 점수 : 80
		 * 출석 회수 : 13
		 * =========결과=========
		 * FAIL [출석 횟수 부족] (13/20)
		 * 
		 * ex4)
		 * 중간 고사 점수 : 100
		 * 기말 고사 점수 : 80
		 * 과제 점수 : 40
		 * 출석 회수 : 10
		 * =========결과=========
		 * FAIL [출석 횟수 부족] (10/20)
		 * FAIL [점수 미달] (총점 66.0)
		 */
		public void practice9() {
			double mid = 0; // 중간
			double fin = 0; // 기말
			double assign = 0; // 과제
			double attend =0; // 출석
			double sum =0; // 총점
			Scanner sc = new Scanner(System.in);
			
			System.out.print("중간 고사 점수 : ");
			mid = sc.nextInt() * 0.2 ;
			
			System.out.print("기말 고사 점수 : ");
			fin = sc.nextInt() * 0.3;
			
			System.out.print("과제 점수 : ");
			assign = sc.nextInt() * 0.3;
			
			System.out.print("출석 회수 : ");
			attend = sc.nextInt();
			System.out.println("========결과========");
			
			sum = mid + fin + assign + attend;
			
			if(sum >= 70 && attend >= 20 * 0.7) {
				System.out.println("중간 고사 점수(20) : " +	mid);
				System.out.println("기말 고사 점수(30) : " + fin);
				System.out.println("과제 점수    (30) : " + assign);
				System.out.println("출석 점수    (20) : " + attend);
				System.out.println("총점 : " + sum);
				System.out.println("PASS");
				
		} else {
			
					if(attend < 20 * 0.7) {
					System.out.println("FAIL [출석 횟수 부족] ("+ (int)attend +"/20)");
					if(sum < 70){
					System.out.println("FAIL [점수 미달] (총점 " + sum +")");
				}
		}
	}
			sc.close();
}

		/*
		 * 실습문제10
		 * 
		 * 앞에 구현한 실습문제를 선택하여 실행할 수 있는 메뉴화면을 구현하세요.
		 * 
		 * ex)
		 * 실행할 기능을 선택하세요.
		 * 1. 메뉴 출력
		 * 2. 짝수/홀수
		 * 3. 합격/불합격
		 * 4. 계절
		 * 5. 로그인
		 * 6. 권한 확인
		 * 7. BMI
		 * 8. 계산기
		 * 9. Pass/Fail
		 * 선택 : 4 (실습문제4에 해당하는 메소드 호출) 
		 */
		public void practice10() {
			int menu = 0;
			Scanner sc = new Scanner(System.in);
			
			System.out.println("실행할 기능을 선택하세요.");
			System.out.println("1. 메뉴 출력");
			System.out.println("2. 짝수/홀수");
			System.out.println("3. 합격/불합격");
			System.out.println("4. 계절");
			System.out.println("5. 로그인");
			System.out.println("6. 권한 확인");
			System.out.println("7. BMI");
			System.out.println("8. 계산기");
			System.out.println("9. Pass/Fail");
			System.out.print("선택 : ");
			menu = sc.nextInt();
			
			switch(menu) {
			
				case 1 :
						practice1();
						
						break;
				case 2 :
						practice2();
					
						break;
				case 3 :
						practice3();
					
						break;
				case 4 :
						practice4();
					
						break;
				case 5 :
						practice5();
					
						break;
				case 6 :
						practice6();
					
						break;
				case 7 :
						practice7();
				
						break;
				case 8 :
						practice8();
				
						break;
				case 9 :
						practice9();
				
						break;
				default :
						System.out.println("잘못 입력하셨습니다.");
						
						return;
			}
		}
}
