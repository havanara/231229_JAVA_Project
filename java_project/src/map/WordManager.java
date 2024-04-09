package map;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class WordManager {

	private String word;
	private String mean;
	HashMap<String, String> map = new HashMap<String, String>();
	
	public void addWord() {
		map.put("banana", "바나나");
		map.put("cat", "고양이");
		map.put("dog", "강아지");
		map.put("tiger", "호랑이");
	}
	
	public void menu1(Scanner scan) { //등록
		System.out.println(" -- 단어 등록 -- ");
		System.out.println("단어 > ");
		word = scan.next();
		System.out.println("의미 > ");
		mean = scan.next();
		
		map.put(word, mean);
	}

	public void menu2(Scanner scan) { //검색
		System.out.println(" -- 단어 검색 -- ");
		System.out.println("검색할 단어 > ");
		word = scan.next();
		if(map.containsKey(word)) {
			System.out.println(" -- 검색 결과 -- ");
			System.out.println(word+":"+map.get(word));
			return;
		}
		System.out.println("검색 결과가 없습니다.");
	}

	public void menu3(Scanner scan) { //수정
		System.out.println(" -- 단어 수정 -- ");
		System.out.println("수정할 단어 > ");
		word = scan.next();
		if(map.containsKey(word)) {
			map.remove(word);
			map.put(word, mean);
			return;
		}
		System.out.println("수정할 단어가 없습니다.");
	}

	public void menu4() { //출력
		int cnt = 0;
		System.out.println(" -- 단어 출력 -- ");
		for(String s : map.keySet()) {
			cnt++;
			System.out.println(cnt+". "+s+" : "+map.get(s));
		}
	}

	public void menu5(Scanner scan) { //삭제
		
	}
	
	public void filePrint() throws IOException{
		// StringBuffer 객체
		// .append : 기존 String에 데이터 추가 가능
		// 파일출력
		FileWriter file = new FileWriter("word.txt");
		BufferedWriter bw = new BufferedWriter(file);
		
		StringBuffer sb = new StringBuffer();
		//sb.append : 기존 String에 데이터 추가
		String data = null;
		sb.append("단어장");
		sb.append("\r\n");
		
		for(String key : map.keySet()) {
			sb.append(key+":"+map.get(key));
			sb.append("\r\n");
		}
		data = sb.toString(); //StringBuffer 객체여서 String 객체로 변환
		System.out.println(data);
		bw.write(data);
		if(bw!=null) {
			bw.close();
		}
		if(file!=null) {
			file.close();
		}
	}

	public void menu6(Scanner scan) {
		try {
			FileWriter file = new FileWriter("word.txt");
			for(String data : map.keySet()) {
				file.write(data+":"+map.get(data)+"\n");
			}
			if(file!=null) {
				file.close();
			}
		}catch(Exception e){
			System.out.println("잘못된 값입니다.");
		}
		
	}

}
