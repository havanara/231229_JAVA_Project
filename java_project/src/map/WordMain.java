package map;

import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class WordMain{

	public static void main(String[] args) throws IOException {
		/* 단어장 프로그램 작성
		 * | 1. 단어등록 | 2. 단어검색 | 3. 단어수정 | 4. 단어출력 | 5. 단어삭제 | 6. 종   료 |
		 * WordManager 클래스를 생성하여 메서드 구현
		 * map을 이용하여 단어 등록
		 * 기본단어 등록(5가지 등록)
		 * main에서는 메뉴가 반복 실행되도록 설정
		 * */
		
		Scanner scan = new Scanner(System.in);
		
		int menu;
		
		WordManager w = new WordManager();
		w.addWord();
		do{
			
			System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
			System.out.println("┃      > >   MENU   > >     ┃");
			System.out.println("┃━━━━━━━━━━━━━━━━━━━━━━━━━━━┃");
			System.out.println("┃ 1.단어등록 2.단어검색 3.단어수정 ┃");
			System.out.println("┃ 4.단어출력 5.단어삭제 6.파일출력 ┃");
			System.out.println("┃ 7.종료                     ┃");
			System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
			System.out.println(" ▷ MENU를 선택하세요.");
			
			menu = scan.nextInt();
		
			switch(menu) {
			case 1 : w.menu1(scan); break;
			case 2 : w.menu2(scan); break;
			case 3 : w.menu3(scan); break;
			case 4 : w.menu4(); break;
			case 5 : w.menu5(scan); break;
			case 6 : w.menu6(scan); break;
			case 7 : break;
			default : System.out.println("잘못 입력된 값입니다."); break;
		}	
			
		}while(menu!=7);
		System.out.println("종료합니다.");	
		
//		FileWriter file = new FileWriter("word.txt");
//		
//		for(String data : map.keySet()) {
//			file.write(data+":"+map.get(data)+"\r\n");
//		}
//		if(file!=null) {
//			file.close();
//		}
				
		scan.close();
		
	}

}
