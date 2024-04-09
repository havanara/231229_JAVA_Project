package day04;

import java.util.Scanner;

public class DoWhile03 {

	public static void main(String[] args) {
		/* 숫자 2개를 입력받고
		 * ex) num1 = 5, num2 = 3
		 * 1번 선택 시 5+3=8 ...
		 * 6번 종료
		 * 다른 번호는 잘못된 메뉴로 출력
		 * menu
		 * 1.+ | 2.- | 3.* | 4./ | 5.% | 6.종료 |
		 * menu에 따라서 두 수의 연산 결과를 출력
		 * */ 
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("첫번째 숫자를 입력하세요.");
		int num1 = scan.nextInt();
		
		System.out.println("두번째 숫자를 입력하세요.");
		int num2 = scan.nextInt();
		
		System.out.println("----------------------------");
		
		int menu = 0;
		
		do{ System.out.println();
			System.out.println("--menu--");
			System.out.println("1.+ | 2.- | 3.* | 4./ | 5.% | 6.종료 |");
			System.out.println("menu 선택 > ");
			menu = scan.nextInt(); //이걸 넣지 않으면 menu는 0이 됨
			
			switch(menu) {
			case 1 : System.out.println(num1+"+"+num2+"="+(num1+num2));
			break;
			case 2 : System.out.println(num1+"-"+num2+"="+(num1-num2));
			break;
			case 3 : System.out.println(num1+"*"+num2+"="+(num1*num2));
			break;
			case 4 : 
				if(num2==0) {
					System.out.println("입력값이 잘못 되었습니다. 다시 입력해주세요.");
					num2 = scan.nextInt();
				}{
				System.out.println(num1+"/"+num2+"="+(num1/num2));
				}break;
			case 5 :
				if(num2==0) {
					System.out.println("입력값이 잘못 되었습니다. 다시 입력해주세요.");
					num2 = scan.nextInt();
				}{
				System.out.println(num1+"%"+num2+"="+(num1%num2));
				}break;
			case 6 : System.out.println("종료합니다.");
			break;
			default : System.out.println("잘못된 메뉴입니다.");
			}
		}while(menu!=6); //menu가 6과 같지 않으면 돌아가지마
		
		scan.close();
		
		
	}

}
