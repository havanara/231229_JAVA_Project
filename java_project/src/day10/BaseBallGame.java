package day10;

import java.util.Scanner;

import day08.Method07;

public class BaseBallGame {

	public static void main(String[] args) {
		/* 야구 게임을 메서드화
		 * 사용자 번호는 직접 입력
		 * 번호는 랜덤 생성(1~9, 중복x)
		 * 중복 안되게 하는 메서드 isContain
		 * */

		Scanner scan = new Scanner(System.in);
		
		int comNum[] = new int[3];
		int myNum[] = new int[3];
			
		
		while(true) {
			
			
		//사용자 번호 입력
		System.out.println("숫자 입력 > ");
		String str = scan.next();
		String[] myStrNum = str.split(" ");
		for(int i=0; i<myStrNum.length; i++) {
			myNum[i] = Integer.parseInt(myStrNum[i]);
		}
		
		//숫자 비교
		int random = (int)(Math.random()*9)+1;
		isContain(comNum, random);
		
		int strike = 0;
		int ball = 0;
		
		count1Array(comNum, myNum, ball);
		ball++;
		
		count2Array(comNum, myNum, strike);
		strike++;

		//결과 출력
		if(ball == 0 && strike == 0) {
			System.out.println("out");
		}else {
			System.out.println(" : "+ball+" ball "+strike+" strike");			
		}
		
		if(strike==3) {
			System.out.println("성공하였습니다. 종료합니다.");
			break;
		}
		
		scan.close();
		
		}
		
	}

	/*랜덤으로 배열을 중복되지 않게 생성
	 * Method07의 isContain 가져와서 사용
	 */
	public static boolean isContain(int arr[], int random) {
		Method07.isContain(arr, random);
		return true;
		
	}
	
	/* 스트라이크 개수를 카운트 하는 메서드
	 * comNum, myNum를 주고 번호와 위치가 일치하면 count하는 메서드
	 * 리턴 타입 : int count를 리턴
	 * */
	public static int count2Array(int comNum[], int myNum[], int count) {
		count = 0;
		for(int i=0; i<comNum.length; i++ ) {
			for(int j=0; j<myNum.length; j++) {
				if(comNum[i]==myNum[j]&&i==j) {
					count++;
				}
			}
		}
		return count;
				
	}
	
	
	/* 볼 개수를 카운트하는 메서드
	 * comNum, myNum를 주고 번호만 일치하면 count하는 메서드
	 * 리턴 타입 : int count를 리턴
	 * */
	public static int count1Array(int comNum[], int myNum[], int count) {
		count = 0;
		for(int i=0; i<comNum.length; i++ ) {
			for(int j=0; j<myNum.length; j++) {
				if(comNum[i]==myNum[j]&&i!=j) {
					count++;
				}
			}
		}
		return count;
		
	}
	
	
}
