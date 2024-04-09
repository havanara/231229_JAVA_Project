package day05;

public class Array03_겸_과제 {

	public static void main(String[] args) {

		// 과제 -> 카페에 제출
		
		int arr[] = new int[] {10,56,78,89,48,62,93,50};
		/* arr배열의 합계와 평균을 출력
		 * 최대값 / 최소값 출력
		 * Math.max Math.min
		 * if문
		 * */
		
		int sum = 0;
		int max = arr[0];
		int min = arr[0];
		
		for(int i=0; i<arr.length; i++) {
			sum=sum+arr[i];
			
			//if문 사용
			if(arr[i]>max) {
				max=arr[i];
				if(arr[i]<min) {
				min=arr[i];
				}
			}
		}
		
		double avg=(double)sum/arr.length;
		System.out.println("합계 : "+sum);
		System.out.println("평균 : "+avg);
		System.out.println("최대값 : "+max);
		System.out.println("최소값 : "+min);
		
		
		
		
		
		
	}

}
