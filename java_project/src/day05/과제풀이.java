package day05;

public class 과제풀이 {

	public static void main(String[] args) {
		
		int arr[] = new int[] {10,56,78,89,48,62,93,50};
		/* arr배열의 합계와 평균을 출력
		 * 최대값 / 최소값 출력
		 * Math.max Math.min
		 * if문
		 * */
		
		int sum = 0;
		double avg = 0;
		//성적 데이터(0~100)
		int max = 0; //가장 큰 값을 넣기 위한 변수
		int min = 100; //가장 작은 값을 넣기 위한 변수
		
		for(int i=0; i<arr.length; i++) {
			sum += arr[i];
			
			//if문 사용
//			if(max<arr[i]) { //for문 안에서
//				max = arr[i]; //max의 값을 arr[i] 값으로 바꾸면서 비교하기 위함
//			}
//		    if(min>arr[i]) {
//		    	min = arr[i];
//		    }
		  
			//Math.max 사용
			max = Math.max(max,arr[i]); //둘중 더 큰값을 나타냄
			min = Math.min(min,arr[i]); //둘중 더 작은값을 나타냄

		}
		avg = sum/(double)arr.length;
		System.out.println("합계 : "+sum+" / 평균 : "+avg);
		System.out.println("최대값 : "+max+" / 최소값 : "+min);		
		
		
	}

}
