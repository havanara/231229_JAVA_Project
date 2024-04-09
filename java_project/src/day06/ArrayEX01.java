package day06;

import java.util.Scanner;

public class ArrayEX01 {

	public static void main(String[] args) {
		/* 10개의 배열을 담을 수 있는 arr 생성
		 * 1~10까지 값을 입력한 후 출력
		 * */

		int arr[] = new int[10];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = i+1;
			System.out.print(arr[i]+" ");
		}
		
		System.out.println();
		
		/*배열을 섞는 코드
		* 랜덤 번지를 선택해서 순차적으로 하나씩 교환
		* (int)(Math.random()*10)+0; //0부터 10개의 랜덤 수
		* max = 최종번지 개수, min = 처음번지
		* 교환 코드
		* 앞번지:[i] 뒷번지:[i+1]
		* */
//		int temp = arr[i]; //임시 변수에 arr[i]를 잠시 보관
//		arr[i] = arr[i+1];
//		arr[i+1] = temp;
		
		int min = 0;
		int max = arr.length;
		for(int i=0; i<arr.length; i++) {
			int random = (int)(Math.random()*max)+min;
			int temp = arr[i];
			arr[i] = arr[random];
			arr[random] = temp;
		}	
		
		System.out.println("-----섞은 후 값 보기-----");
		for(int t : arr) {
			System.out.print(t+" ");
		}

		/* 섞은 값을 원래대로 정리(정렬)
		 * 작은수부터 정리 : 오름차순 정렬
		 * 큰수부터 정리 : 내림차순 정렬
		 * 3 2 5 6 7 1 9 4 10 8 
		 * 1 3 5 6 7 2 9 4 10 8 버블 정렬 pass1 적용 후
		 * 1 2 5 6 7 3 9 4 10 8 버블 정렬 pass2 적용 후
		 * 1 2 3 6 7 5 9 4 10 8 버블 정렬 pass3 적용 후
		 * 1 2 3 4 7 6 9 5 10 8 버블 정렬 pass4 적용 후
		 * 1 2 3 4 5 7 9 6 10 8 버블 정렬 pass5 적용 후
		 * 1 2 3 4 5 6 9 7 10 8 버블 정렬 pass6 적용 후
		 * 1 2 3 4 5 6 7 9 10 8 버블 정렬 pass7 적용 후
		 * 1 2 3 4 5 6 7 8 10 9 버블 정렬 pass8 적용 후
		 * 1 2 3 4 5 6 7 8 9 10 버블 정렬 pass9 적용 후
		 */
		
		System.out.println();
		System.out.println("-----정렬 후 값 보기-----");
		
		for(int i=0; i<arr.length-1; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i] > arr[j]) {
					//arr[i] > arr[j] 성립 시 교환
					int t = arr[i];
					arr[i] = arr[j];
					arr[j] = t;
					
				}
			}
		}
		
		for(int t : arr) {
			System.out.print(t+" ");
		}
		
	}

}
