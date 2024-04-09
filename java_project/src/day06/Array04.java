package day06;

public class Array04 {

	public static void main(String[] args) {
		/* 10개의 값을 가지는 배열을 생성
		 * 1~50 사이의 랜덤 수를 배열에 저장한 후 출력
		 * 합계, 평균, 최대, 최소값 출력
		 * */
		
		int arr[] = new int[10]; //배열의 초기값은 0
		
		int sum = 0;
		double avg = 0;
		int max = 0;
		int min = 50;
		
		//배열의 완성
		for(int i=0; i<arr.length; i++) {
			arr[i]=(int)(Math.random()*50)+1;
			System.out.println(arr[i]);	
		}
		for(int i=0; i<arr.length; i++) {
			sum += arr[i];
			
			max = Math.max(max,arr[i]);
			min = Math.min(min,arr[i]);		
			
		}
		
		System.out.println();
		
		avg = (double)sum/arr.length;
		
		System.out.println("합계 : "+sum);
		System.out.println("평균 : "+avg);
		System.out.println("최대값 : "+max);
		System.out.println("최소값 : "+min);

		
		
		
		
		
		
		
		

	}

}
