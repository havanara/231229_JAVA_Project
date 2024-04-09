package day09;

import java.util.Scanner;

public class 가위바위보_풀이 {

	public static void main(String[] args) {
		/* 컴퓨터가 가위 바위 보를 랜덤으로 선택(0=가위, 1=바위, 2=보)
		 * 내가 가위 바위 보 중 하나를 선택해서 입력
		 * 승리/패배/무승부 결과 출력
		 * ex) com -> 0(가위)
		 *     user -> 0(가위) -> 무승부입니다.
		 * */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("가위바위보 게임 시작");
		int comNum = (int)(Math.random()+3); //0,1,2선택
		System.out.println("컴퓨터 결정 완료");
		System.out.println("가위/바위/보 중 하나를 선택 > ");
		String myChoice = scan.next(); //가위, 바위, 보 중 하나
		String comChoice = (comNum==0? "가위" : comNum==1? "바위" : "보");
		System.out.println("comChoice > "+comChoice);
		System.out.println("myCoice > "+myChoice);
		
		//비교
		if(comChoice.equals(myChoice)) {
			System.out.println("무승부");
		}else {
			if(comChoice.equals("가위")) {
				System.out.println(myChoice.equals("바위")? "승" : "패");
			}else if(comChoice.equals("바위")) {
				System.out.println(myChoice.equals("보")? "승" : "패");
			}else {
				System.out.println(myChoice.equals("가위")? "승" : "패");
			}
		}
		
		System.out.println("종료");
		
		
		
		
		
		
		
		
		
		
		scan.close();

	}

}
