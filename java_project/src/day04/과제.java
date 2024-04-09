package day04;

import java.util.Scanner;

public class 과제 {

	public static void main(String[] args) {
		/* 주사위 게임
		 * 주사위를 던져서 총 30칸을 이동
		 * 주사위는 랜덤으로 생성(1~6까지 생성)
		 * 주사위 : 3
		 * 3칸 전진 -> 27칸 남았습니다.
		 * 주사위 : 1
		 * 1칸 전진 -> 26칸 남았습니다.
		 * 주사위 : 6
		 * 6칸 전진 -> 20칸 남았습니다.
		 * ...
		 * 30칸 남았습니다 -> "도착"
		 * 총 이동횟수 -> 주사위를 던진 횟수
		 * */
						
		
		int sum = 0; //주사위 숫자 총합
		int count = 0; //던진 횟수
		
		Scanner scan = new Scanner(System.in);
		
		while(sum<=30) {
			int random = (int)(Math.random()*6)+1; //1~6 주사위
			System.out.println("주사위를 던집니다.");
			
			System.out.println("주사위를 던지기 위해 숫자 1을 누르세요.");
			int a = 1;
			a = scan.nextInt();		
			System.out.println("주사위 : "+random);
			
			sum+=random;
			count++; //게임 횟수 증가
			
			if(sum<=30) {
				System.out.println("주사위 : "+random+"칸 전진 -> "+(30-sum)+"칸 남았습니다.");
			}else if(sum<=30) {
				System.out.println("주사위 : "+random+"칸 전진 -> "+(30-sum)+"칸 남았습니다.");
			}else {
				System.out.println();
				System.out.println("주사위의 합 : "+sum+" -> 총 "+count+"번만에 성공했습니다.");
			}

			

		}
			scan.close();


				
		
		
	}

}
