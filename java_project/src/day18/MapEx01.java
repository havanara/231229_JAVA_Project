package day18;

import java.util.HashMap;
import java.util.Map;

public class MapEx01 {

	public static void main(String[] args) {
		/* map을 이용하여 상품과 가격을 추가하여 합계를 구하시오.
		 * 상품을 map에 추가하는 작업은 메서드를 활용
		 * 1. map을 main에 생성해놓고 매개변수로 받아 map의 데이터를 채우는 메서드
		 * 2. map을 메서드 내부에서 생성하여 main으로 리턴하는 메서드
		 * 
		 * 가위 2500, 크레파스 4000, 물감 5000 -> 합계 ?
		 * */

		System.out.println("--map을 매개변수로 받은 메서드 실행--");
		int sum = 0;		
		HashMap<String,Integer> map = new HashMap<String,Integer>();
		MapEx01 m = new MapEx01();
		m.makeMap(map);
		for(String s : map.keySet()) {
			sum += map.get(s);
			System.out.println(s+":"+map.get(s)+"원");
		}
		System.out.println("총합:"+sum+"원");
		
		System.out.printf("%n--map을 리턴으로 받은 메서드 실행--%n");
		int sum1 = 0;
		HashMap<String,Integer> map1 = m.makeMap2(); //메서드를 실행하면 map을 주는 케이스
		for(String s : map1.keySet()) {
			sum1 += map1.get(s);
			System.out.println(s+":"+map1.get(s)+"원");
		}
		System.out.println("총합:"+sum1+"원");

		
		
	}
	
	//map을 매개변수로 받는 케이스
	public void makeMap(HashMap<String,Integer> map){
		map.put("가위", 2000);
		map.put("크레파스", 4000);
		map.put("물감", 5000);		
	}

	
	//map을 내부에서 생성하여 리턴하는 케이스
	public HashMap<String, Integer> makeMap2(){
		HashMap<String,Integer> map = new HashMap<>();
		map.put("가위", 3000);
		map.put("크레파스", 5000);
		map.put("물감", 6000);	
		
		return map;
	}
	

}
