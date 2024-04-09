package day07;

import java.util.Scanner;

public class StringEx02 {

	public static void main(String[] args) {
		/* 5개의 파일명
		 * 검색어를 입력하면 해당 단어를 포함하는 파일을 출력
		 * 없는 단어를 입력하면 검색결과 없음 출력
		 * */
		
		String[] fileName = {"이것이자바다.java","java의정석.java","String.jpg","String 메서드.txt","array.txt"};
		//ex) 검색어가 java 일 경우 -> 이것이자바다.java java의정석.java 출력
		//String -> String.jpg String 메서드.txt
		//txt -> String 메서드.txt array.txt
		
		
		
		Scanner scan = new Scanner(System.in);
		
		int count = 0;
		String a = fileName[0];
		
		System.out.println("검색어를 입력하세요.");
		String str = scan.nextLine();
		
		for(String tmp : fileName) {	
			if(tmp.contains(str)) {
				System.out.println("검색어 : "+str);
				System.out.println(tmp);
				count++;
				}
			}
		    if(count==0) {
			    System.out.println("검색 결과가 없습니다.");
		}
		
		
		
		scan.close();
		
		
	}

}
