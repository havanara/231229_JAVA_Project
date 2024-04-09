package day17;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class List01 {

	public static void main(String[] args) {
		/* 하루 일과를 저장하는 list를 생성
		 * 일반 for문 / 향상된 for문 / iterator 출력
		 * */
		
		ArrayList<String> day = new ArrayList<String>();
		day.add("수면");
		day.add("식사");
		day.add("공부");
		day.add("휴식");
		System.out.println("-----하루 일과(일반for문)-----");
		for(int i=0; i<day.size(); i++) {
			System.out.print(day.get(i)+" ");
		}
		
		System.out.printf("%n%n-----하루 일과(향상된for문)-----%n");
		
		for(String str : day) {
			System.out.print(str+" ");
		}
		
		Iterator<String> dayList = day.iterator();
		System.out.printf("%n%n-----하루 일과(iterator)-----%n");
		while(dayList.hasNext()) {
			String tmp = dayList.next();
			System.out.print(tmp+" ");
		}
		System.out.printf("%n%n-----정렬(오름차순)-----%n");
		
		//정렬
		Collections.sort(day);
		System.out.println(day);
		
		System.out.printf("%n-----정렬(내림차순)-----%n");
		day.sort(new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				//숫자는(크다/작다를 이용) -/+의 값이 출력
				//문자는 comparaTo 메서드를 활용하여 정렬
				//o1.compareToIgnoreCase(o2); : 오름차순
				//o2.compareToIgnoreCase(o1); : 내림차순
				return o2.compareToIgnoreCase(o1);
			}
			
		});
		System.out.println(day);

		
	}

}
