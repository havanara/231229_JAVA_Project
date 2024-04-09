package day07;

import java.util.Scanner;

public class 과제풀이 {

	public static void main(String[] args) {
		/* 계산기 만들기
		 * --menu--
		 * 1.덧셈 | 2.뺄셈 | 3.곱셈 | 4.나눗셈 | 5.나머지 | 6.종료 |
		 * >>메뉴선택 1
		 * >>숫자1 5
		 * >>숫자2 10
		 * 결과 : 5+10=15
		 * (더하기 메서드를 호출하여 연산 결과를 출력)
		 * */
		
		Scanner scan = new Scanner(System.in);
		
		int menu = 0;
		
		do {
			System.out.println("--menu--");
			System.out.println("1.덧셈 | 2.뺄셈 | 3.곱셈 | 4.나눗셈 | 5.나머지 | 6.종료 |");
			System.out.println(">> 선택 : ");
			menu = scan.nextInt();
			int num1 = 0;
			int num2 = 0;
			System.out.println("숫자 2개 입력 > ");
			num1 = scan.nextInt();
			num2 = scan.nextInt();
			
			switch(menu) {
			case 1 :
				sum(num1,num2);
				break;
			case 2 :
				sub(num1,num2);
				break;
			case 3 :
				mul(num1,num2);
				break;
			case 4 :
				div(num1,num2);
				break;
			case 5 :
				mod(num1,num2);
				break;
			case 6 :
				System.out.println("프로그램 종료");
				break;
			default :
				System.out.println("잘못된 메뉴입니다.");
			}
			
		}while(menu != 6); //menu값이 6이
		
		
		
		
		scan.close();	

		
		

	}

	private static void sum(int num1, int num2) { //private -> 내 클래스에서만 사용 가능
		System.out.println(num1+"+"+num2+"="+(num1+num2));
	}
	private static void sub(int num1, int num2) {
		System.out.println(num1+"-"+num2+"="+(num1-num2));
	}
	private static void mul(int num1, int num2) { 
		System.out.println(num1+"*"+num2+"="+(num1*num2));
	}
	private static void div(int num1, int num2) {
		System.out.println(num1+"/"+num2+"="+(num1/num2));
	}
	private static void mod(int num1, int num2) {
		System.out.println(num1+"%"+num2+"="+(num1%num2));
	}
	
}
