package day03;

public class While02 {

	public static void main(String[] args) {
		/* 1~50까지의 짝수
		 * 2 4 6 8 10
		 * 12 14 16 18 20 ...
		 * 42 44 46 48 50 끊어서 출력
		 * */
		
		int i=0;
		
		while(i<50) {
			i++;
			if(i%2==0) {
				System.out.printf("%3d",i); //정수를 세자리수에 맞춰서 i를 출력
				}
				if(i%10==0) {
				System.out.println();
				}	
		}
		
		System.out.println("출력구문");
		/* system.out.println : 줄바꿈이 있는 출력 -> 출력값이 없어도 가능 -> 줄바꿈
		 * system.out.print : 줄바꿈이 없는 출력 -> 출력값이 없으면 error
		 * system.out.printf : 지시자를 이용한 출력
		 * 지시자
		 * %d(정수형), %f(실수형), %c(char형 문자), %s(문자열), %n(줄바꿈)
		 * */
		
		System.out.println(); //줄바꿈
		
		System.out.printf("%.2f",1.33333333);//실수를 0.00에 맞춰서 1.33333333을 출력
		
		System.out.println();
		
		int num1 = 5;
		int num2 = 3;
		// 5+3=8
		
		System.out.println(num1+"+"+num2+"="+(num1+num2));
		
		System.out.printf("%d+%d=%d",num1,num2,(num1+num2));
		
		
		System.out.println();
		
		double num3 = 1.2;
		double num4 = 5;
		// 1.2/5=값
				
		System.out.printf("%.1f/%.1f=%.1f%n",num3,num4,(num3/num4)); //%n 줄바꿈
		
	}

}
