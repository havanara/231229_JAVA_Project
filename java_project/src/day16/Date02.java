package day16;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Date02 {

	public static void main(String[] args) {
		
		LocalDateTime today = LocalDateTime.now();
		System.out.println(today);
		System.out.println(today.getYear()); //get으로 가져올 수 있는것은 각자의 시,분,초,년,월,일
		String t = today.toString(); //toString() 스트링으로 객체를 변환
		System.out.println(t);
		
		System.out.println("-----------------------------");
		
		//날짜 2024-01-26 /시간 17:03:34
		System.out.printf("날짜 "+t.substring(0,t.indexOf("T"))+"%n");
		System.out.println("시간 "+t.substring(t.indexOf("T")+1, t.indexOf(".")));
		
		System.out.println("-----------------------------");
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd hh:mm:ss");
		System.out.println(dtf.format(today));
		
		LocalDateTime sDate = LocalDateTime.of(1995, 4, 3, 20, 21); //날짜 생성
		System.out.println(sDate.format(dtf));
	}

}
