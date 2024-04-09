package day02;

public class For01 {

	public static void main(String[] args) {
		/* 반복문 : 규칙적인 작업을 반복적으로 할 때 사용하는 문법
		 * for, while, do~while
		 * -for, while은 동작 방식이 같음
		 * -> 조건이 맞지 않으면 한번도 실행 되지 않을 수 있음
		 * -do~while
		 * -> 조건에 맞지 않아도 무조건 1번은 실행
		 * for(1.초기화; 2.5.8.조건식; 4.증감식){
		 * 3.6.실행문;
		 * }
		 * -초기화 : 값은 조건식이나 실행문에서 사용할 변수를 초기화 함 : 생략 가능
		 * -> 여러 변수를 초기화 가능, 처음 1번만 실행
		 * -조건식 : 반복의 반복을 결정하는 식(true->반복) : 생략 가능
		 * -증감식 : 조건식에서 사용할 변수를 증가, 감소시켜 반복 횟수 조절 : 생략 가능
		 * */
		
		//1부터 10까지 출력하는 예제
		for(int i=1; i<=10; i++) {
			System.out.print(i+" ");
		}
		//현재 상태에 i의 값은 11
		//System.out.println(i); //변수의 범위를 넘어섬
		
		System.out.println(""); //줄바꿈
		
		//10부터 1까지 출력하는 예제
		for(int i=10; i>=1; i--) {
			System.out.print(i+" ");			
		}

		System.out.println("");
		
		//2부터 10까지 짝수만 출력하는 예제
		for(int i=2; i<=10; i++) {
		if(i%2==0)
		System.out.print(i+" ");
		
		/*아래와 같이 여러가지 방법이 있음
		 *for(int i=2; i<=10; i=i+2) { //i+=2 = i+i+2
		 *System.out.println(i+" ");
		 *}
		 *
		 *for(int i=1; i<=5; i++) {
		 *system.out.println((i*2)+" ");
		 *}
		 *
		 *system.out.println();
		 *int num = 0;
		 *for(int i=1; i<=5; i++) {
		 *num = num+2;
		 *system.out.println(num+" ");
		 *}
		 */
		}
		
		System.out.println("");
		
		//1부터 10까지의 합계를 출력
		int sum = 0;
		for(int i=1; i<=10; i++) {
			sum=sum+i; // 0+1+2+3...+10
		}
		System.out.println(sum);


		
	}

}
