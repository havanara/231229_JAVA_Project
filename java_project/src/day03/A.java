package day03;

import java.util.Scanner;

public class A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
Scanner scan = new Scanner(System.in);
		
		System.out.println("랜덤 숫자 맞추기 게임");
		System.out.println();
		System.out.println("1~50 사이의 수를 맞춰보세요.");
		
	
			
		
		int num3 = (int)(Math.random()*50)+1;
		int num4 = scan.nextInt();
		
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


