package test;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Random {
	

	public static void main(String[] args) throws IOException {
		
		/* 0~99 난수의 합을 계산하는 프로그램 생성(for문 사용)
		 * ex) 난수의 개수 : 7
		 * 난수 7개의 합 : 28
		 * 파일명 RandomNumber
		 * (채점조건) 입력문, 변수선언, for문, 실행문, 출력문, 실행여부
		 */
		
		FileWriter fw = new FileWriter("RandomNumber.txt");
		
		int sum = 0; //난수 합계
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("난수 개수 입력 > ");
		int ea = scan.nextInt();
		int arr[] = new int[ea];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] += (int)(Math.random()*99)+0;
			sum+=arr[i];
		}
		String data = "난수 개수 > "+ea+"개\r\n"+"난수 "+ea+"개의 합계 > "+sum;
				
		fw.write(data);
		
		scan.close();
		
		fw.close();
			
	}
}
