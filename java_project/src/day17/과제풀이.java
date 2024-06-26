package day17;

import java.util.ArrayList;
import java.util.Scanner;

public class 과제풀이 {

	public static void main(String[] args) {
		/* 숫자를 입력받아 입력받은 숫자를 list로 구성하고 출력
		 * 합계를 출력
		 * 입력 : 45,78,89,97,68,57,48 -> String
		 * list에 넣고 출력한 후 합계 출력
		 * 70점이상 점수 개수 출력
		 * */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("입력 > ");
//		String num = scan.next();
		String num = "45,78,89,97,68,57,48";
		String[] numbers = num.split(",");
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(String n : numbers) {
			list.add(Integer.parseInt(n));
//			System.out.println(n);
		}
		System.out.println(list);
		
		int sum = 0;
		int count = 0;
		for(int tmp : list) {
			sum += tmp;
			if(tmp >= 70) {
				count++;
			}
		}
		System.out.println("종합:"+sum);
		System.out.println("70점 이상 인원수:"+count);
		
		//배열을 List로 구성할 때
		//List<Integer> list = new ArrayList<Integer>(Arrays.asList(arr));
		
		scan.close();

	}

}
