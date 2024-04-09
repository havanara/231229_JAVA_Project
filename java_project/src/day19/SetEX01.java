package day19;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.TreeSet;

public class SetEX01 {

	public static void main(String[] args) {
		/* Set 중복 저장X
		 * Set에 로또번호 6개 생성 후 출력
		 * 랜덤번호 1~45
		 * */

		HashSet<Integer> lotto = new HashSet<Integer>();

		//6번 생성X : 중복 발생 가능성
		//set이 6개 찰때까지
		
//		while(lotto.size()<6){
//			int random1 = new Random().nextInt(45)+1;
//			lotto.add(random1);
//		}
//		System.out.println(lotto);
//		System.out.println("-------------------------------");

		do {
			int random = (int)(Math.random()*45)+1;
			lotto.add(random);
		}while(lotto.size() != 6);
		
		List<Integer> lottoNum = new ArrayList<Integer>(lotto);
		Collections.sort(lottoNum);
		
		System.out.print("lotto 번호 "+lottoNum+" ");
		
		//TreeSet : set 중에서 정렬이 되는 set
		System.out.printf("%n--treeSet--%n");
		TreeSet<Integer> treeSet = new TreeSet<>();
		
		while(treeSet.size()<6){
			int random1 = new Random().nextInt(45)+1;
			treeSet.add(random1);
		}
		System.out.println(treeSet);
		
		//frist() : 가장 앞에 있는 값 / last() : 가장 뒤에 있는 값
		System.out.println(treeSet.first());
		System.out.println(treeSet.last());
		
		//headSet : 지정한 값보다 작은 값
		//tailSet : 지정한 값보다 큰 값
		System.out.println(treeSet.headSet(15));
		System.out.println(treeSet.tailSet(15));

		//subSet : 검색 범위 지정 뒤쪽 값은 미포함
		System.out.println(treeSet.subSet(15, 30)); //15~30 / 30은 미포함
		
		
		
		
		
		
	}

}
