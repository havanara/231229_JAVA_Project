package day20;

import java.util.ArrayList;
import java.util.Comparator;

public class 과제 {

	public static void main(String[] args) {
		/* 스트림으로 출력
		 * 여행사 상품
		 * 여행 비용 15세 이상 100만원, 15세 미만은 50만원으로 계산
		 * 고객 3명 패키지 여행을 떠나는 경우
		 * 1.비용 계산 2.고객명단 검색 -> 출력
		 * 고객 클래스를 생성하고 ArrayList로 고객관리
		 * ex) 고객정보 -> 고객명단
		 * 이름:이순신, 나이:40, 비용:100만원
		 * 이름:홍길동, 나이:10, 비용:50만원
		 * 총 여행경비 : 250만원
		 * 20대 이상 고객명단 -> 이름순으로 정렬
		 * 이름:이순신 나이:40 비용:100만원
		 * 이름:홍길동 나이:10 비용:50만원
		 * */
		
		ArrayList<Trip> list = new ArrayList<>();
		list.add(new Trip("이순신",27));
		list.add(new Trip("김순신", 12));
		list.add(new Trip("박순신", 34));
		
		System.out.println("[총 비용]");
		int total = list.stream().mapToInt(n->n.getPrice()).sum();
		System.out.println(total+"만원");
		
		System.out.printf("%n[고객명단]%n");
		list.stream().forEach(n->System.out.println(n));
		
		System.out.printf("%n[20대이상 고객명단]%n");

		
		list.stream()
		.filter(n->n.getAge()>=20)
		.sorted(new Comparator<Trip>() {

		@Override
		public int compare(Trip o1, Trip o2) {
			return o1.getName().compareTo(o2.getName());
		}
	})
	.forEach(n->System.out.println(n));
		
		//원하는 요소만 출력
		System.out.println("--고객명만 출력--");
		list.stream()
		.map(m->m.getName())
		.forEach(n->System.out.println(n));
	}
}