package day03;

import java.util.Scanner;

public class For04 {

	public static void main(String[] args) {
		/* 단을 입력받아서 입력 받은 단을 출력 (단=구구단)
		 * ex) 2 -> 2*1=2, 2*2=4 ... 2*9=18
		 * */

		Scanner scan = new Scanner(System.in);
		
		System.out.println("출력할 단을 입력하세요.");
		int num = scan.nextInt();
		
		for(int i=1; i<=9; i++) {
			System.out.println(num+"*"+i+"="+(num*i));
				
			
		}
		
		
		
		scan.close();
		
		
		
		
		
		
	}

}
