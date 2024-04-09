package day04;

import java.util.Scanner;

public class 과제풀이 {

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
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("주사위 게임");
		System.out.println("엔터를 눌러 시작합니다.");
		
		int random = 0; //주사위 값(랜덤 수)를 저장할 변수
		int sum = 0; //거리 누적 값
		int count = 0; //던진 횟수 누적 값
		int last = 30; //최종 목표 이동 수
		
		while(sum<last) { //true -> 거리 누적값이 최종목적지보다 작다면 while를 돌릴 예정
			scan.nextLine(); //enter 값을 받는 역할 -> enter를 이용하여 주사위를 던질 수 있게 해줌
			random = (int)(Math.random()*6)+1; //1부터 6까지 랜덤 수 저장
			//발생값 거리 합산
			sum += random;
			count++;
			System.out.println("주사위 : "+random);
			System.out.println(random+"칸 전진 -> "+(last-sum+"칸 남았습니다."));
		}
		System.out.println("도착, 총 이동횟수 : "+count);
		
		
		
		
		scan.close();
		
		
		
	}

}
