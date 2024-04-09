package day03;

import java.util.Scanner;

public class 과제풀이 {

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
		//1~50까지의 랜덤 수 생성
		
		int random = (int)(Math.random()*50)+1; //1~50까지의 랜덤 수 생성
		System.out.println("컴퓨터가 랜덤수를 생성하였습니다.");
		
		int num = 0; //사용자 입력 값
		int count = 0; //횟수
		
		while(num != random) { //true여야 반복
			System.out.println("입력>");
			num = scan.nextInt();
			count++; //게임 횟수 증가
			if(count>5) { //정답 맞추기 5회 이하로 제한
				System.out.println("입력 횟수가 초과 되었습니다.");
				break;
			}
			if(num>random) {
				System.out.println("down~!"+count+"회");
			}else if(num<random) {
				System.out.println("up~!"+count+"회");
			}else {
				System.out.println("정답~!");
			} 
		}
		
		
		
		
		
		scan.close();
	}

}
