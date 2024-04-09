package day21;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class File05 {

	public static void main(String[] args) throws IOException {
		// test.txt 파일을 읽어들여 map에 저장
		// 명단, 합계, 평균 출력
		/* txt에서 읽어들이는 값은 모두 String
		 * 계산을 위해서는 int 자료형으로 변환 필요
		 * Integer.parseInt(); String -> int로 변환
		 * */
		
		BufferedReader bu = new BufferedReader(new FileReader("test.txt"));
		
		HashMap<String, Integer> map = new HashMap<>();
		
		while(true) {
			String a = bu.readLine();
			if(a == null) {
				break;
			}
			//a가 null이 아니라면 ..
			//subString(포함,미포함)
			String name = a.substring(0, a.indexOf(" "));
			String sco = a.substring(a.indexOf(" ")+1);
			int score = Integer.parseInt(sco);
			map.put(name, score);
			}
		System.out.println("--명단--");
		int sum = 0;
		double avg = 0;
		for(String list : map.keySet()) {
			System.out.println(list+":"+map.get(list)+"점");
			sum += map.get(list);
			avg = (double)sum/map.size();
			
		}

		System.out.println("합계:"+sum+"점 / 평균:"+avg+"점");
		
		//bu 끊기
		if(bu!=null) { //객체가 생성되었다면 끊기
			bu.close();
		}

		
		
	}

}

