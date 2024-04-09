package day08;

public class Method04 {

	public static void main(String[] args) {
		/* 최대공약수, 최소공배수 리턴
		 * 리턴을 받은 값을 메인에서 출력
		 */
		
		int max = max(6, 12);
		System.out.println(max);
		
		int min = min(10, 15);
		System.out.println(min);
		


	}
	
	//두 정수를 매개변수로 받아 최대공약수를 리턴하는 메서드
	public static int max(int num1, int num2) {
		
		int num = 0;
		
		for(int i=1; i<=num1; i++) {
			if(num1%i==0 && num2%i==0){
				num=i;
			}
		}
		return num;
	}
	
		
		
	//두 정수를 매개변수로 받아 최소공배수를 리턴하는 메서드
	public static int min(int num3, int num4) {

		for(int i=num3; ; i=i+num3) {
			if(i%num3==0 && i%num4==0) {
				return i;
		}
			
		}

	}
	

}
