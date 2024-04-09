package day04;

public class For07 {

	public static void main(String[] args) {
		/* 이중 for문
		 * ex) for(int i=1; i<=5; i++){     i = 1   2   3   4   5
		 *         for(int j=i; j<=5; j++){ j = 1~5 1~5 1~5 1~5 1~5
		 *             실행문; 5 5 5 5 5 -> 총 25번 실행
		 *     }
		 * }
		 * 
		 */
		
		/* 별찍기
		 * *****   i=1, j=5
		 * *****   i=2, j=5
		 * *****   i=3, j=5
		 * *****   i=4, j=5
		 * *****   i=5, j=5
		 * */
		
		for(int i=1; i<=5; i++) { //줄
            for(int j=1; j<=5; j++) {
            	System.out.print("*");
            }
            System.out.println();//한줄 끝나면 줄 바꿈
		}
		
		System.out.println("-------------------------------");

		/* *       i=1, j=1
		 * **      i=2, j=2
		 * ***     i=3, j=3
		 * ****    i=4, j=4
		 * *****   i=5, j=5
		 */
		
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("-------------------------------");
		
		/* *****   i=1, j=5
		 * ****    i=2, j=4
		 * ***     i=3, j=3
		 * **      i=4, j=2
		 * *       i=5, j=1
		 * */
		
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=6-i; j++) {
				System.out.print("*");
			}
			System.out.println();
			}
		
		System.out.println("-------------------------------");

		
		/*     *   i=1, 공백=4, j=1
		 *    **   i=2, 공백=3, j=2
		 *   ***   i=3, 공백=2, j=3
		 *  ****   i=4, 공백=1, j=4
		 * *****   i=5, 공백=0, j=5
		 */
		
		for(int i=1; i<=5; i++) {
			//공백
			for(int j=1; j<=5-i; j++) {
				System.out.print(" ");
			}
			//별(*)
				for(int k=1; k<=i; k++) {
					System.out.print("*");
				}
				System.out.println();
		}
		System.out.println("-------------------------------");
		
		/*     *       i=1, 공백=4, j=1
		 *    ***      i=2, 공백=3, j=3
		 *   *****     i=3, 공백=2, j=5
		 *  *******    i=4, 공백=1, j=7
		 * *********   i=5, 공백=0, j=9
		 */
		
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5-i; j++) {
				System.out.print(" ");
			}
			for(int k=1; k<=(i*2)-1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("-------------------------------");
	
		
		/* 1 2 3
		 * 4 5 6
		 * 7 8 9
		 * 3줄씩 3개 출력
		 * */
		
		int count = 0;
		for(int i=1; i<=3; i++) {
			for(int j=1; j<=3; j++) {
				count++;
				System.out.print(count+" ");
			}
			System.out.println();
		}
		
		
		
		
		
	}

}