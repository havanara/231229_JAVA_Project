package day05;

import java.util.Scanner;

public class ForEx01 {

	public static void main(String[] args) {
		/* 소수 : 약수가 1과 자기자신만의 수를 가진 수
		 * ex) 3,5,7,11 ... 등
		 * 소수의 약수 = (1, 나 자신)
		 * 
		 * 숫자 하나를 입력받아서 해당수가 소수인지 아닌지 판별
		 * num = 13;
		 * -> 소수입니다.
		 * num = 12;
		 * -> 소수가 아닙니다.
		 * */
				
		int num = 5;
		int count = 0;
		
		for(int i=1; i<=num; i++) {
			if(num%i==0) {
				count++;
				}
			}
		if(count>2)
			System.out.println(num+" -> 소수가 아닙니다.");
		if(count==2) {
			System.out.println(num+" -> 소수입니다.");
		}
		
		System.out.println("-------------------------");
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("정수를 입력하세요.");
		int num1 = scan.nextInt();
		int count1 = 0;
		
		for(int i=1; i<=num1; i++) { //약수의 개수를 세기 위한 값
			if(num1%i==0) { //약수를 세는 공식
				count1++;
				}
			}
		if(count1==2) {//for문이 다 돌아갈때까지 기다린 다음에 if문 적용
			System.out.println(num1+" -> 소수입니다.");
		}else {
			System.out.println(num1+" -> 소수가 아닙니다.");
		}

		
		
		scan.close();
		
		
		System.out.println("-------------------------");
		
		//2부터 100까지의 소수를 모두 출력
		int count2 = 0;
		
		for(int j=2; j<=100; j++) { //2부터 100까지의 숫자
			
			count2 = 0;
			
			for(int k=1; k<=j; k++) {
				if(j%k==0) {
					count2++;
				}
			}
			if(count2==2) {
				System.out.print(j+" ");
			}
		}


		
		
	}

}
