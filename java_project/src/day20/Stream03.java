package day20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class Stream03
{
	public static void main(String[] args) {
		// Student 클래스로 리스트 구성
		// add로 5명 추가
		
		
		ArrayList<Student> list = new ArrayList<>();
		list.add(new Student("홍길동",50));
		list.add(new Student("김길동",60));
		list.add(new Student("최길동",70));
		list.add(new Student("이길동",80));
		list.add(new Student("박길동",90));
		
		//스트림을 이용하여 콘솔에 출력 ex)홍길동 : 98점
		list.stream()
		.forEach(n->System.out.println(n+" "));

		list.stream()
		.forEach(n->{
			String name = n.getName();
			int score = n.getScore();
			System.out.println(name+" : "+score);
		});
		
		//list의 점수 합계와 전체 인원수 출력
		int sum = list.stream().mapToInt(n->n.getScore()).sum();
		System.out.println("점수합계 : "+sum);
		
		long count = list.stream().count();
		System.out.println("전체인원수 : "+count+"명");
		
		
	}
}
