package day09;

import java.util.Scanner;

public class 가위바위보게임 {

	public static void main(String[] args) {
		/* 컴퓨터가 가위 바위 보를 랜덤으로 선택(0=가위, 1=바위, 2=보)
		 * 내가 가위 바위 보 중 하나를 선택해서 입력
		 * 승리/패배/무승부 결과 출력
		 * ex) com -> 0(가위)
		 *     user -> 0(가위) -> 무승부입니다.
		 * */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("가위 바위 보 game start");
		System.out.println("(가위 / 바위 / 보)를 입력 해주세요.");
		
		String a = scan.next();
		
		if(a=="가위") {
		System.out.println("user : "+a);
		}else if(a=="바위"){
			System.out.println("user : "+a);
		}else {
			System.out.println("user : "+a);
		}
		
		int b = (int)(Math.random()*2)+0;
		
		switch(b) {
		case 0 : 
			int num1 = 0;
			String str1 = String.valueOf("com : 가위");
			System.out.println(str1);	
			if(a.equals("가위"))
				System.out.println("결과 : 무승부");
			break;
		case 1 : 
			int num2 = 1;
			String str2 = String.valueOf("com : 바위");
			System.out.println(str2);
			if(a.equals("바위"))
				System.out.println("결과 : 무승부");
			break;
		case 2 : 
			int num3 = 2;
			String str3 = String.valueOf("com : 보");
			System.out.println(str3);		
			if(a.equals("보"))
				System.out.println("결과 : 무승부");
		default : System.out.println("잘못된 값입니다.");
			break;
		}
		
		
		
				
		scan.close();
	
	
	}
			


}
