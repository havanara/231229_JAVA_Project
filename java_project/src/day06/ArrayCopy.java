package day06;

public class ArrayCopy {

	public static void main(String[] args) {
		/* 
		 * */
		
		int arr[] = new int[] {1,2,3,4}; //new를 통해서 객체 생성
		int arr1[] = arr;
		
		int arr2[] = new int[5];
		
		//arr,arr1 두 객체의 주소 확인 시 주소가 같음
//		System.out.println(arr);
//		System.out.println(arr1);
//		
//		System.out.println(arr2);
		
		System.out.println();
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
		System.out.println();

		for(int i=0; i<arr1.length; i++) {
			System.out.print(arr1[i]+" ");
		}
		
		System.out.println();

		for(int i=0; i<arr2.length; i++) {
			System.out.print(arr2[i]+" ");
		}
		
		//arr의 값을 arr2로 복사
		
		for(int i=0; i<arr.length; i++) {
			arr2[i] = arr[i];
			//arr2[i+1] = arr[i]; -> 자리가 비워져 있는 경우에는 밀린채로 값을 복사할 수 있음
		}
		
		System.out.println();

		for(int i=0; i<arr2.length; i++) {
			System.out.print(arr2[i]+" ");
		}
		System.out.println();

		/* arr를 arr3으로 복사
		* arr3은 10개의 데이터를 담을 수 있는 배열로 생성
		* 향상된 for문 사용
		*/
		
		int arr3[] = new int[10];
		
//		for(int i=0; i<arr.length; i++) {
//			arr3[i]=arr[i];
//		}
		//향상된 for문으로 출력
		for(int num : arr3) {
			System.out.print(num+" ");
		}
		
		//system.arraycopy(이전배열,시작번지,복사할새배열,시작번지,개수
		System.arraycopy(arr, 0, arr3, 2, arr.length);
		
		//출력
		for(int num : arr3) {
			System.out.print(num+" ");
		
		
	}
  }
}
