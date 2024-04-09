package day03;

import java.util.Scanner;

public class For03 {

	public static void main(String[] args) {
		/* 약수 : 나누어서 떨어지는 수의 집합
		 * ex) 6의 약수 : 1,2,3,6
		 * -> 6%1=0, 6%2=0, 6%3=0, 6%4=2남음, 6%5=1남음, 6%6=0
		 * 모든 수는 1과 나자신의 수는 무조건 약수로 가짐 
		 */
		
		int num = 100; 
		
		//num를 1부터 num까지 나눈 나머지가 0인 수를 출력
		
		for(int i=1; i<=num; i++) {
			if(num%i==0) {
				System.out.print(i+" ");
			 }
		}
		
		//num1를 입력받아서 num1의 약수를 출력
		System.out.println();
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("1~50사이의 정수를 입력하세요.");
		int num1 = scan.nextInt();
	
		
		for(int i=1; i>=num1; i++) {
			if(num1%i==0) {
				System.out.print(i+" ");
			}
			
		}
		
		scan.close();
		
		
		

	}

}
