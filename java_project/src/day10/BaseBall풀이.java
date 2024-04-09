package day10;

import java.util.Scanner;

import day08.Method07;

public class BaseBall풀이 {

	public static void main(String[] args) {
		/* 야구 게임을 메서드화
		 * 사용자 번호는 직접 입력
		 * 번호는 랜덤 생성(1~9, 중복x)
		 * 중복 안되게 하는 메서드 isContain
		 * */
		
		Scanner scan = new Scanner(System.in);
		
		int comNum[] = new int[3];
		int myNum[] = new int[3];
		
		int strike = 0, ball = 0;
		createArray(comNum);
		createArrayRandom(comNum, 1, 9);
		
		
		//사용자 번호 입력
		while(strike!=3) {
			System.out.println("myNum 3개 입력 > ");
			int cnt = 0;
			while(cnt<3) {
				myNum[cnt] = scan.nextInt();
				cnt++;
			}
			
			//결과 출력
			strike = strike(comNum, myNum);
			ball = ball(comNum, myNum);
			
			if(strike!=0) {
				System.out.println(strike+"strike");
			}
			if(ball!=0) {
				System.out.println(ball+"ball");
			}
			if(strike==0 && ball==0) {
				System.out.println("out");
			}
			
			
			
		}
		System.out.println("정답입니다. 종료합니다.");

		scan.close();

		
		
	}
	
	/*랜덤으로 배열을 중복되지 않게 생성
	 * Method07의 isContain 가져와서 사용
	 */
	public static void createArray(int arr[]) {
		int cnt = 0;
		while(cnt<arr.length) {
			int r = (int)(Math.random()*9)+1;
			if(!Method07.isContain(arr, r)) {
				arr[cnt] = r;
				cnt++;
			}
		}
	}
	
	/* 랜덤 범위에 상관없이 랜덤수를 채우는 메서드
	 * 범위를 매개변수로 받아오면 됨
	 * (int)(Math.random()*개수)+시작값
	 * start, count 매개변수로 받아 범위를 생성
	 */
	public static void createArrayRandom(int arr[], int start, int count) {
		int cnt = 0;
		while(cnt<arr.length) {
			int r = (int)(Math.random()*count)+start;
			if(!Method07.isContain(arr, r)) {
				arr[cnt] = r;
				cnt++;
			}
		}
	}
			
	/* 스트라이크 개수를 카운트 하는 메서드
	 * comNum, myNum를 주고 번호와 위치가 일치하면 count하는 메서드
	 * 리턴 타입 : int count를 리턴
	 * */
	
	public static int strike(int com[], int my[]) {
		int cnt = 0;
		for(int i=0; i<com.length; i++)
			if(com[i]==my[i]) { //같은 위치(index)에 같은 값
				cnt++;
			}
		return cnt;
	}
	
	/* 볼 개수를 카운트하는 메서드
	 * comNum, myNum를 주고 번호만 일치하면 count하는 메서드
	 * 리턴 타입 : int count를 리턴
	 * */
	
	public static int ball(int com[], int my[]) {
		int cnt = 0;
		for(int i=0; i<com.length; i++) {
			if(Method07.isContain(my, com[i])) {
				cnt++; //ball + strike 같이 체크
			}
		}
		return cnt - strike(com, my);
	}
	
	
	
	
	
	
	
}
