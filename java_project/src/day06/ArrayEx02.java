package day06;

public class ArrayEx02 {

	public static void main(String[] args) {
		/* 1~50까지의 랜덤수를 10개 생성하여 배열(arr)에 저장 후 출력
		 * 오름차순 정렬 후 출력
		 * */
		
		int arr[] = new int[10];
		
		for(int i=0; i<arr.length; i++) {
			int random = (int)(Math.random()*50)+1;
			arr[i]=random;
			System.out.print(random+" ");
		}
		System.out.println();
		System.out.print("--------정렬 후 값 보기--------");
		System.out.println();

		for(int j=0; j<arr.length-1; j++) {
			for(int k=j+1; k<arr.length; k++) {
				if(arr[j] > arr[k]){
					int t = arr[j];
					arr[j] = arr[k];
					arr[k] = t;
				}
			}
		}
		for(int t : arr){
			System.out.print(t+" ");
		}
	}

}
