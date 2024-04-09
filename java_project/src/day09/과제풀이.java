package day09;

import java.util.Scanner;

import day08.Method05;
import day08.Method07;

public class 과제풀이 {

	public static void main(String[] args) {
		/* 야구게임
		 * 컴퓨터가 3자리의 숫자를 생성 -> 배열로 랜덤 저장(중복 불가)
		 * (각 자리수는 1~9까지의 수)
		 * user가 3자리의 숫자를 맞추는 게임 -> 직접 입력(중복 불가)
		 * 자리와 숫자가 일치하면 strike
		 * 숫자만 맞으면 ball
		 * 아무것도 맞지 않으면 out
		 * ex) 컴퓨터 생성 번호 : 1 2 3
		 *     사용자 생성 번호 : 1 7 8 -> 1strike
		 *     사용자 생성 번호 : 1 3 2 -> 1strike 2ball
		 *     사용자 생성 번호 : 7 8 9 -> out
		 *     사용자 생성 번호 : 1 2 3 -> 3strike 정답
		 * */
		
		Scanner scan = new Scanner(System.in);
		
		int comNum[] = new int[3]; //컴퓨터가 생성한 번호 배열
		int myNum[] = new int[3]; //내 배열
		
//		//메서드는 다른 클래스에서도 불러올 수 있음
//		//static으로 생성했기 때문에 클래스명.메서드명으로 호출 가능
//		Method07.randomArray(comNum); //comNum에 랜덤 수 중복없이 생성
//		Method07.printArray(comNum);
//		
//		//static이 아닐 경우 객체를 생성하여 객체명으로 메서드명 호출
//		Method07 me = new Method07();
//		me.randomArray(myNum);
//		me.printArray(myNum);
		
		//컴퓨터 배열을 생성
		//중복되지 않게 랜덤수 추출 저장
		for(int i=0; i<comNum.length; i++) {
			comNum[i] = (int)(Math.random()*9)+1;
			for(int j=0; j<i; j++) {
				if(comNum[i]==comNum[j]) {
					i--;
					break;
				}
			}
		}
//			//결과 체크
//			for(int a : comNum) {
//				System.out.print(a+" ");
//			}
			System.out.println();
			
			while(true) {
				int strike = 0;
				int ball = 0;
				
				//사용자 숫자 입력
				System.out.println("숫자 입력 > ");
				String mystr = scan.next(); //숫자를 문자로 받음
				String[] myNumStr = mystr.split(" "); //한글자씩 나누어 배열에 저장
				for(int i=0; i<myNumStr.length; i++) {
					//문자를 숫자로 변환하여 myNum에 저장
					myNum[i] = Integer.parseInt(myNumStr[i]);
				}
				//결과 체크
//				for(int a : myNum) {
//					System.out.print(a+" ");
//				}
				
				//숫자비교
				for(int i=0; i<comNum.length; i++) {
					for(int j=0; j<myNum.length; j++) {
						if(comNum[i]==myNum[j]&&i==j) { //값도 같고 자리수도 같다는 전제
							strike++;
						}else if(comNum[i]==myNum[j]&&i!=j) { //값만 같고 자리수는 같지 않다는 전제
							ball++;
						}
					}
				}
				
				//결과 출력
				if(strike==0 && ball==0) {
					System.out.println("out");
				}else { //그렇지 않다면
					System.out.println("> "+strike+"strike "+ball+"ball");
				}
				
			if(strike==3) {
				//스트라이크가 3이면 종료
				System.out.println("성공했습니다. 게임을 종료합니다.");
				break;
			}
			}
			
			
		
		
		
		scan.close();
		
		}
		
	

}
