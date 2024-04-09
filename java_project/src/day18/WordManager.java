package day18;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

import stdManager.Student;

public class WordManager{
	
	private HashMap<String, String> map = new HashMap<>();
	private String word;
	private String mean;
	
	public void addWord() {
		map.put("a", "a");
		map.put("b", "b");
		map.put("c", "c");
		map.put("d", "d");
		map.put("e", "e");
	}
	
	public void menu1(Scanner scan) {
		System.out.printf("--단어등록--%n단어 입력 > > %n");
		word = scan.next();
		System.out.printf("뜻 입력 > > %n");
		mean = scan.next();
		
		map.put(word, mean);
	}
	
	public void menu2(Scanner scan) {
		System.out.printf("--단어검색--%n단어 입력 > > %n");
		word = scan.next();
		if(map.containsKey(word)) {
			System.out.println("--검색 결과--");
			System.out.println(word+":"+map.get(word));
			return;
		}
			System.out.println("검색단어가 없습니다.");
	}
	
	public void menu3(Scanner scan) {
		//map은 set이 없음
		//remove -> put
		//key 중복 불가
		//put -> 덮어쓰기
		System.out.printf("--단어수정--%n단어 입력 > > %n");
		word = scan.next();
		if(map.containsKey(word)) {
			System.out.println("의미 > > ");
			String mean = scan.next();
			map.remove(word);
			map.put(word, mean);
			return;
		}
		System.out.println("수정할 단어가 없습니다.");
	}
	
	public void menu4() {
		System.out.printf("%n--단어출력--%n");
		int cnt = 0;
		for(String s : map.keySet()) {
			cnt++;
			System.out.println(cnt+"번 "+s+" : "+map.get(s));
		}		
	}
	
	public void menu5(Scanner scan) {
		System.out.printf("--단어삭제--%n단어 입력 > > %n");
		word = scan.next();
		String result = map.remove(word);
		if(result==null) {
			System.out.println("삭제할 단어가 없습니다.");
			return;
		}
		System.out.println("삭제완료");
	}

	


}
