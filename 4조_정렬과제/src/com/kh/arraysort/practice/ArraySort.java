package com.kh.arraysort.practice;

import java.util.Scanner;

public class ArraySort {
	
	int[] array = null;							//각 정렬함수에 매번 배열을 생성하기보다 ArraySort의 지역변수로 선언하여 매번 생성하는 번거로움 줄임
	Scanner scanner = new Scanner(System.in);	//위와 같은 이유로 ArraySort의 지역변수로 생성

	
	//메뉴를 보여주는 함수. 메뉴에서는 배열 정렬 알고리즘을 선택하거나 프로그램 종료가 가능하다.
	public void displaySortMenu() {
		
		int menu = 0;	//메뉴에서 번호를 입력받을 변수
		
		//메뉴 출력 및 실행, 반복문에 포함시켜서 정렬 알고리즘을 여러번 실행할 수 있도록 함.
		while(true) {
			System.out.println("=====배열 정렬 알고리즘 선택=====");
			System.out.println("1. 선택 정렬");
			System.out.println("2. 삽입 정렬");
			System.out.println("3. 버블 정렬");
			System.out.println("4. 합병 정렬");
			System.out.println("5. 셸 정렬");
			System.out.println("6. 퀵 정렬");
			System.out.println("0. 뒤로 가기");
			System.out.println("===========================");
			System.out.print("메뉴 선택 >> ");;

			menu =  scanner.nextInt(); //사용자로부터 메뉴 번호 입력받음
	
			//입력받은 메뉴에 따라 정렬 실행
			switch(menu) {
				case 1:
					makeArray();	  // 정렬하기 전에 정렬할 배열 생성
					selection_Sort(); // 만들어진 배열을 정렬할 선택정렬 함수 실행
					break;
				case 2:
					makeArray();	  // 정렬하기 전에 정렬할 배열 생성
					insertion_Sort(); // 만들어진 배열을 정렬할 삽입정렬 함수 실행
					break;
				case 3:
					makeArray();	  // 정렬하기 전에 정렬할 배열 생성
					bubble_Sort();    // 만들어진 배열을 정렬할 버블정렬 함수 실행
					break;
				case 4:
					makeArray();	  // 정렬하기 전에 정렬할 배열 생성
					merge_Sort();     // 만들어진 배열을 정렬할 합병정렬 함수 실행
					break;
				case 5:
					makeArray();	  // 정렬하기 전에 정렬할 배열 생성
					shell_Sort();	  // 만들어진 배열을 정렬할 셸정렬 함수 실행
					break;
				case 6:
					makeArray();	  // 정렬하기 전에 정렬할 배열 생성
					quick_Sort();	  // 만들어진 배열을 정렬할 퀵정렬 함수 실행
					break;
				case 0:
					return; // displaySortMenu함수 종료. 실행(메인) 메소드로 되돌아간다.
				default:
					System.out.println("잘못된 번호 입력입니다"); //반복문이기 때문에 잘못된 번호 입력시 다시 처음으로 돌아가서 메뉴출력후 사용자에게 번호 입력받는다.
					continue;
			}
			System.out.print("정렬후 배열 : ");	// 정렬 함수를 통해 배열을 정렬한 후 정렬된 배열값 출력을 통해 배열이 잘 되었는지 확인
			displayArray();
		}
			
	}
	

	//정렬할 배열을 생성하는 함수
	public void makeArray() {
		
		int arraysize = 10;	//배열의 크기. 임의로 기본값을 10으로 두었다. 
		int menu = 0;			//메뉴번호를 입력받을 함수
	
		//displaySortMenu함수처럼 메뉴 출력 및 배열생성코드를 반복문에 포함시켰다.(여기서는 잘못된 번호 입력시 메뉴 반복실행을 위해서)
		//배열크기와 데이터를 사용자가 직접 입력하거나 랜덤값(1~100)이 들어간 10크기의 배열을 자동생성하거나를 선택할 수 있다.
		while(true) {
			System.out.println("-----배열 만들기-----");
			System.out.println("1. 사용자가 직접 입력");
			System.out.println("2. 랜덤배열 생성");
			System.out.print("번호 선택 >> ");
			
			menu = scanner.nextInt();
			
			switch(menu) {
				case 1: //사용자가 매열크기와 데이터를 직접 입력
					System.out.printf("배열의 크기를 입력해주세요. >> ");
					arraysize = scanner.nextInt();
					array = new int[arraysize];
					for(int i = 0; i < array.length; i++) {
						System.out.printf("array[%d]의 값 >> ",i);
						array[i] = scanner.nextInt();
					}
					return;
				case 2: // 랜덤값(1~100)이 들어간 10크기의 배열을 자동생성
					array = new int[arraysize];
					for(int i = 0; i < array.length; i++) {
						array[i] = (int)(Math.random() * 100 + 1);
					}
					return;
				default:
					System.out.println("잘못된 번호 입력입니다.");
			}
		}
		
	}
	
	//선택 정렬 함수
	public void selection_Sort() {
		
		System.out.println("선택 정렬 알고리즘 시작");
		System.out.print("정렬전 배열 : ");
		displayArray();
		
		//여기부터 작성 // 해당 순서에 넣을 배열에서 가장 작은 수를 하나씩 선택해 교환하는 정렬
		int min = 0;
		int temp = 0;
		for (int i = 0; i < array.length-1; i++) { // index 선택
			min = i;
			for (int j = i + 1; j < array.length; j++) { // i + 1번째 원소 부터 선택한 위치의 값과 비교 시작
				if(array[j] < array[min]) { // 선택한 index의 값보다 순회하고 있는 값이 작다면 index 갱신
					min = j;
				}
			}			
		// 안쪽 for문이 끝난 뒤 min과 바깥쪽 for문에서 선택된 index를 서로 교환
		temp = array[min];
		array[min] = array[i];
		array[i] = temp;
		}		
		
	}
	
	//삽입 정렬 함수
	public void insertion_Sort() {
		
		System.out.println("삽입 정렬 알고리즘 시작");
		System.out.print("정렬전 배열 : ");
		displayArray();
		
		//여기부터 작성
		int temp = 0;
		int prev = 0;
		for (int i = 1; i < array.length; i++) {
			// 현재 선택된 값을 임시 변수에 저장
			temp = array[i];
			// 현재 선택된 값을 기준으로 이전 값을 탐색하기 위한 index 변수
			prev = i - 1;
			// 현재 선택된 값이 이전 값보다 작을 때까지 반복(0번째 값까지만 비교)
			while(prev >= 0 && array[prev] > temp) {
				// 현재 선택된 값이 탐색중인 값보다 작을 경우 해당 값은 다음 인덱스로 넘어간다.
				array[prev + 1] = array[prev];
				// 다음 대상 값을 탐색
				prev--;
			}
			// 탐색이 종료된 지점에 현재 선택되었던 변수의 값을 삽입
			array[prev + 1] = temp;
			
		}
		
	}
	
	//버블 정렬 함수
	public void bubble_Sort() {
		
		System.out.println("버블 정렬 알고리즘 시작");
		System.out.print("정렬전 배열 : ");
		displayArray();
		
		//여기부터 작성
		int temp = 0; // 데이터 교환을 위해 빈 공간의 변수 선언
		
		for(int i = 1; i < array.length; i++) {	// 총 라운드는 배열 크기 -1 만큼 진행됨
			for (int j = 0; j < array.length - i; j++) { // 각 라운드별 비교횟수는 배열 크기의 현재 라운드를 뺀 만큼 비교함
				if(array[j] > array[j + 1]) {	// 현재 인덱스의 값이 다음 인덱스 값보다 클 경우 서로의 위치를 교환
					temp = array[j + 1];		
					array[j + 1] = array[j];
					array[j] = temp;
				}
			}
		}
	}
	
	
	//합병 정렬 함수
	public void merge_Sort() {
	
		System.out.println("합병 정렬 알고리즘 시작");
		System.out.print("정렬전 배열 : ");
		displayArray();
		
		merge_Sort(0,(array.length)-1); // 합병정렬 시작
		
	}
	
	
	public void merge_Sort(int left, int right) { // 배열할 정렬, 시작 인덱스값, 끝 인덱스값을 매개변수로 둠
		
		if (left < right) { // 배열의 크기가 2이상(끝 인덱스가 시작 인덱스보다는 커야 정렬가능)일때 정렬시작

			int mid = (left + right) / 2; // 왼쪽과 오른쪽의 가운데 지점 {1,2,3, /(4)/ ,5,6,7}
			merge_Sort(left, mid); // mid를 중심으로 나눠진 왼쪽 부분 합병정렬
			merge_Sort(mid + 1, right); // mid를 중심으로 나눠진 오른쪽 부분 합병정렬
			merge(left, mid, right); // 나눠진 두개의 배열 합치기
		}

	}

	public void merge(int left,int mid, int right) {
		
		int[] sort = new int[right+1]; // 두 배열을 합칠 때 합쳐질 임시배열
		int part1 = left;  // arr의 왼쪽 부분을 움직이는 index (왼쪽그룹의 시작)
		int part2 = mid + 1;  // arr의 오른쪽 부분을 움직이는 index (오른쪽 그룹의 시작)
		int index = left; // 채워넣을 배열(sort)의 index 부분
			
		//분할된 part1의 index 부분이 mid까지 오면 왼쪽 완료 part2가 right 까지 가면 오른쪽 끝
		// 둘중 하나라도 정렬이 완료되면 반복문 나감
		while (part1 <= mid  && part2 <= right) {   
			if (array[part1] <= array[part2]) {    
				sort[index++] = array[part1++];
			}else{
				sort[index++] = array[part2++];
			}
		}
		while(part1 <= mid) {                   // 가운데 기준 왼쪽배열에 데이터가 남았을 경우
			sort[index++] = array[part1++];     // 왼쪽배열의 남은 값들을 sort에 넣어준다  
		}
		
		while(part2<= right) {                  // 가운데 기준 오른쪽배열에 데이터가 남았을 경우 
			sort[index++] = array[part2++];		// 오른쪽배열의 남은 값들을 sort에 넣어준다 
			
		}  // 오른쪽이 먼저 끝나는건 상관없고 왼쪽이 먼저끝나는건 정리해줘야한다.
		
		for(int i = left; i <= right; i++ ) {     // 배열 정렬
			array[i] = sort[i];
    
		}
	}
	//셸 정렬 함수
	public void shell_Sort() {
		
		System.out.println("셸 정렬 알고리즘 시작");
		System.out.print("정렬전 배열 : ");
		displayArray();
		
		int arrSize = array.length;										
        int interval = arrSize / 2;
 
        while (interval >= 1) {											
            for (int i = 0; i < interval; i++) {
                intervalSort(i, arrSize - 1, interval);
 
            }
            interval /= 2;
            
        }
		

		
	}
		    
    public void intervalSort(int start, int end, int interval) {		
 
        for (int i = start + interval; i <= end; i += interval) {
            int item = array[i];
            int j = 0;
            for (j = i - interval; j >= start && item < array[j]; j -= interval) {
                // arr[j]의 값이 크니까 삽입
                array[j + interval] = array[j];
            }
            //삽입 끝낫으니 기억해둔 값 삽입
            array[j + interval] = item;
        }
    }
	
	public void quick_Sort() {
		
		System.out.println("퀵 정렬 알고리즘 시작");
		System.out.print("정렬전 배열 : ");
		displayArray();
		
		//퀵정렬 실행
		q_Sort(array, 0, array.length - 1);
	}
	
	//퀵정렬 실행함수
	public void q_Sort(int[] q_arr, int low, int high) { // q_arr은 정렬할 배열, low는 정렬할 배열의 맨 앞 인덱스, high는 맨 뒤 인덱스
		
		if(low >= high)
			return; // 배열의 크기가 1 이하이면 더이상 배열을 나누지 않음
		
		int mid = q_Partition(q_arr, low, high); // 배열을 두개로 나눌건데 어느 인덱스를 기준으로 나눠줄지를 q_Partition이 반환해줄 것. 
		q_Sort(q_arr, low, mid - 1); // mid 인덱스를 기준으로 나눠진 배열의 앞쪽을 다시 퀵정렬
		q_Sort(q_arr, mid, high); // mid 인덱스를 기준으로 나눠진 배열의 뒤쪽을 다시 퀵정렬
	}
	
	public int q_Partition(int[] q_arr, int low, int high) {
		
		int pivot = q_arr[(low + high) / 2]; // 배열의 중간값을 pivot으로 잡음. // 이 pivot보다 작은수는 pivot을 기준으로 배열의 왼쪽, 큰수는 오른쪽에 위치시킬 것.
		
		while(low <= high) { //low가 high보다 크다면 배열값을 한번 쭉 훑었다는 의미이므로 반복문 종료
			
			while(q_arr[low] < pivot) //배열의 왼쪽부터 시작해서 pivot보다 큰수를 찾을 때까지 인덱스를 증가(오른쪽으로 이동)
				low++;
			while(q_arr[high] > pivot) // 배열의 오른쪽부터 시작해서 pivot보다 작은수를 찾을 때까지 인ㄷ게스를 감소(왼쪽으로 이동)
				high--;
			
			if(low <= high) { 		//오른쪽으로 이동한 인덱스가 왼쪽으로 이동한 인덱스보다 커지면 자리바꾸면안됨
				int tmp = q_arr[low];		// 왼쪽에서부터 찾은 pivot보다 큰수, 오른쪽에서부터 찾은 pivot보다 작은수의 위치를 교환 
				q_arr[low] = q_arr[high];
				q_arr[high] = tmp;
				low++;	 //교환후 다음 인덱스로 이동
				high--;	 //교환후 다음 인덱스로 이동
			}
		}
		
		return low;
	}
	//배열 출력 함수
	public void displayArray() {
		
		for(int i = 0; i < array.length; i++) {
			System.out.printf("%d ", array[i]);
		}
		System.out.println();
		
	}
	
	public void displeyComplexity() {
		// TODO Auto-generated method stub
		System.out.println("================복잡도 출력================");
		System.out.println("\t\t시간복잡도\t\t공간복잡도");
		System.out.println("선택 정렬\t\tO(n^2)\t\tO(n)");
		System.out.println("삽입 정렬\t\tO(n^2)\t\tO(n)");
		System.out.println("버블 정렬\t\tO(n^2)\t\tO(n)");
		System.out.println("합병 정렬\t\tO(nlogn)\tO(n)");
		System.out.println("셸 정렬(gap seq=2)O(n^1.5)\tO(n)");
		System.out.println("퀵 정렬\t\tO(nlogn)\tO(n)");
		System.out.println("========================================");
	}
	/*
	 * 프로그램 종료시키기 직전 실행시킬 close함수.
	 * 추후 복잡한 프로그램을 만들게 되면 프로그램이 종료되는 케이스가 여러가지일텐데 그때마다 Scanner객체의 close함수를 넣기 번거로움.
	 * 지금은 Scanner만 반환하지만 나중에 JDBC, 버퍼 등 여러 자원들을 반환해야 하면 코드가 길어질 수 있음.
	 * 따라서 자원을 반환하는 close함수를 따로 생성해서 처리한다.
	 */
	public void close() {
		
		scanner.close();
	}

}
