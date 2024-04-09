package day06;

import java.util.Scanner;

public class 과제 {

	public static void main(String[] args) {
		/* 숫자를 입력 받아서 숫자를 거꾸로 출력, 각 자리의 합계 출력
		 * ex) 11456 -> 출력 65411 -> 6+5+4+1+1 -> 결과값 출력
		 * ex) 19874 -> 출력 47891 -> 4+7+8+9+1 -> 결과값 출력
		 * */

		Scanner scan = new Scanner(System.in);
		
		int arr[] = new int[5];
		
		int sum = 0; //각 자리의 합계
		
		System.out.println("5개의 숫자를 입력하세요.");
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = scan.nextInt();
			sum += arr[i];
			}
		for(int j=arr.length-1; j>=0; j--) {
			System.out.print(arr[j]+" ");
		}
		
		System.out.println();
		System.out.print("합계 : "+sum);
		System.out.println("");
		
		scan.close();
		
	}

}
