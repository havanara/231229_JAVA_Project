package day16;

import stdManager.Student;

public class Exception06 {

	public static void main(String[] args) {
		//메서드에서 생성된 배열 출력

		Exception06 hi = new Exception06();
	
		int arr[] = null;
		int start = 1, count = 4, size = 5;
		
		try {
			hi.re(size, start, count);	
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		System.out.println("-------------------------------");
		
		try {
			hi.re1(arr, start, count);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("처리 종료");
	
	}


	//메서드 생성

	/* 기능 : size를 매개변수로 입력받아 size만큼의 길이를 가지는 배열 생성 후
	 * 랜덤값을 채워 배열 리턴
	 * 랜덤값의 범위는 매개변수 입력 start(시작값), count(개수)
	 * size가 0보다 작다면 예외발생(throw new)
	 * count 개수가 0보다 작다면 예외발생
	 */

	public static int[] re(int size, int start, int count) {
		int arr[] = new int[size];
		if(size < 0 ) {
			throw new ArrayIndexOutOfBoundsException("입력값이 0보다 작습니다.");
		}
		if(count < 0 ) {
			throw new NullPointerException("입력값이 0보다 작습니다.");
		}
		for(int i=0; i<size; i++) {
			arr[i] += (int)(Math.random()*start)+count;
		}
		return arr;
	}

	/* 기능 : 매개변수로 배열을 받아서 랜덤값을 채우는 매서드
	 * 랜덤값의 범위는 매개변수 입력 start(시작값), count(개수)
	 * 배열이 null이면 예외발생
//	 * 배열의 길이가 0보다 작으면 예외발생
	 */
	public static void re1(int arr[], int start, int count) {
			if(arr == null) {
				throw new NullPointerException("값이 null입니다.");
			}
			for(int i=0; i<arr.length; i++) {
				arr[i] += (int)(Math.random()*start)+count;
				System.out.println(arr[i]);
//			if(arr.length<0) {
//				throw new ArrayIndexOutOfBoundsException("배열의 범위가 벗어났습니다.");
//			}
		}
			
	}
	
	

}