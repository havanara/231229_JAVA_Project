package day05;

import java.util.Scanner;

public class Array02 {

	public static void main(String[] args) {
		/* 5명의 점수를 입력할 수 있는 배열을 생성
		 * 5명의 점수를 입력받아서 배열에 저장
		 * 해당하는 점수를 출력
		 * */
		
		
		Scanner scan = new Scanner(System.in);
		
//		System.out.println("5명의 점수를 입력하세요");
//		int num1 = scan.nextInt();
//		int num2 = scan.nextInt();
//		int num3 = scan.nextInt();
//		int num4 = scan.nextInt();
//		int num5 = scan.nextInt();
//		
//		int arr1[] = new int[] {num1,num2,num3,num4,num5};
//		
//		for(int i=0; i<arr1.length; i++) {
//			System.out.println("점수 : "+arr1[i]);
		
		System.out.println("5명의 점수를 입력하세요.");
		int arr1[] = new int[5];
		int sum = 0;
		
		for(int i=0; i<arr1.length; i++) {
			arr1[i] = scan.nextInt();
			//System.out.println(arr1[i]);
			sum=sum+arr1[i];
		}
		double avg=sum/(double)arr1.length;
		System.out.println("점수 합계 : "+sum+"점");
		System.out.println("점수 평균 : "+avg+"점");


	}

}
