package day17;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class 과제 {

	public static void main(String[] args) {
		/* 숫자를 입력받아 입력받은 숫자를 list로 구성하고 출력
		 * 합계를 출력
		 * 입력 : 45,78,89,97,68,57,48 -> String
		 * list에 넣고 출력한 후 합계 출력
		 * 70점이상 점수 개수 출력
		 * */
		
		Scanner scan = new Scanner(System.in);
		
//		String num = "45,78,89,97,68,57,48";
		int num = 1;
		int sum = 0;
		int cnt = 0;
		int a = 0;
		
		ArrayList<String> str = new ArrayList<String>();		
		
		while(num!=0){
		System.out.println("점수를 입력하세요.");
		str.add(scan.next());
		System.out.println("계속해서 입력을 원하시면 1, 종료를 원하시면 0을 누르세요.");
		num = scan.nextInt();
		if(num==0) {
			System.out.println("종료되었습니다.");
		}
		}		
		for(int i=0; i<str.size(); i++) {
			a = Integer.parseInt(str.get(i));
			if(a>=70) {
				cnt++;
			}
			sum += a;
		}
		System.out.printf("%n합계 > "+sum+"%n");
		System.out.println("70점 이상 학생의 수 > "+cnt+"명");
	
		scan.close();

	}

}