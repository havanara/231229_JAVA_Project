package day03;

import java.util.Scanner;

public class For02 {

	public static void main(String[] args) {
	
	
		Scanner scan = new Scanner(System.in);
		
		// 1~10까지 출력
		for(int i=1; i<=10; i++) {
			System.out.print(i+" ");			
		}
		
		System.out.println();
		
		// 1부터 10까지 짝수만 출력
		for(int i=2; i<=10; i++) {
			if(i%2==0) { //짝수의 조건
			System.out.print(i+" ");
			}		
	
		}
		
		System.out.println();
		
		//1~10까지 합계 출력
		{int sum = 0; //지역변수는 반드시 초기화 해야함, 초기화 기본값 숫자는 0, 문자는 null
		
		for(int i=1; i<=10; i++) {
			sum = sum+i; //sum+=i;
		}
		
		System.out.println("1~10까지의 합계 : "+sum);}
				
		//1~10까지의 짝수 합과, 홀수 합을 출력
		
		int sum1 = 0;
		int sum2 = 0;
		
		for(int i=1; i<=10; i++) {
			if(i%2==0){
				sum1+=i;
			}else if(i%2==1){
				sum2+=i;
			}
		}
		
		System.out.println("1~10까지의 짝수 합 : "+sum1);
		System.out.println("1~10까지의 홀수 합 : "+sum2);
		
		
		scan.close();
		
	

	}
}
