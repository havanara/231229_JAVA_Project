package day17;

import java.util.ArrayList;
import java.util.Comparator;

public class List02 {

	public static void main(String[] args) {
		/* 두 배열을 입력받아 하나로 합치는 ArrayList 생성
		 * 오름차순 정렬하여 출력
		 * */
		
		String arr1[] = new String[] {"a","c","f","b"};
		String arr2[] = new String[] {"d","g","h","k"};

		ArrayList<String> list = new ArrayList<String>();
		
// while문
// int cnt = arr1.length + arr2.length;
// int i=0; j=0;
// while(cnt>list.size()){
// if(i<arr1.length){
// list.add(arr1[i]);
// i++
// }
// if(j<arr2.length){	
// list.add(arr2[j]);
// j++;
//		}
//	}

		for(int i=0; i<arr1.length; i++) {
			list.add(arr1[i]);
		}
		for(int i=0; i<arr2.length; i++) {
			list.add(arr2[i]);
		}
		
		
		list.sort(new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2); //오름차순 정렬
			}
		});
		System.out.print(list);
		
		
		
	}
}
