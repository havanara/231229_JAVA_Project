package day03;

import java.util.Scanner;

public class 과제 {

	public static void main(String[] args) {
		/* up/down 게임
		 * 1~50 사이의 랜덤수를 생성하여 맞추는 게임
		 * ex) 컴퓨터가 랜덤 수 생성 : 23
		 * 입력하세요 -> 10
		 * 입력한 수보다 큰 경우 up~~! 출력
		 * 입력하세요 -> 20
		 * 입력한 수보다 큰 경우 up~~! 출력
		 * 입력하세요 -> 30
		 * 입력한 수보다 작은 경우 down~~! 출력
		 * 입력 -> 23
		 * 정답! 출력
		 * */

		Scanner scan = new Scanner(System.in);
		
		System.out.println("랜덤 숫자 맞추기 게임");
		System.out.println();
		System.out.println("1~50 사이의 수를 맞춰보세요.");
		
		int num1 = (int)(Math.random()*50)+1;
		int num2 = scan.nextInt();
		
		//for문 사용
		for(;;) {
			if(num1>num2) {
				System.out.println("up~~!");
				num2 = scan.nextInt();
			}else if(num1<num2) {
				System.out.println("down~~!");
				num2 = scan.nextInt();
			}else {
				System.out.println("정답!");
				break;				
			}
			
				
			}
			
		
		int num3 = (int)(Math.random()*50)+1;
		int num4 = scan.nextInt();
		int num5 = 0;
		
		System.out.println("랜덤 숫자 맞추기 게임");
		System.out.println();
		System.out.println("1~50 사이의 수를 맞춰보세요.");
		
		
		//while문 사용
		while(num4<=50) {
			if(num3>num4) {
				System.out.println("up~~!");
				num4=scan.nextInt();
			}else if(num3<num4){
				System.out.println("down~~!");
				num4=scan.nextInt();
			}else {
				System.out.println("정답!");
				break;			
			}
		}
		
		
		scan.close();
		
	}
		
		
		
		
	}

