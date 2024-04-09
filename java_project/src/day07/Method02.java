package day07;

public class Method02 {

	public static void main(String[] args) {
		// + = * / % 5개의 결과를 알려주는 메서드 생성
		//main에서 호출하여 확인

		System.out.println(sum(10,20));
		System.out.println(sub(10,20));
		System.out.println(mul(10,20));
		System.out.println(div(10,20));
		System.out.println(mod(10,20));

		
		
	}

	//메서드 선언 위치
	
	//두 정수의 합을 알려주는 메서드 sum
	public static int sum(int num1, int num2) {
	return num1+num2;
	}
	
	//두 정수의 차를 알려주는 메서드 sub
	public static int sub(int num3, int num4) {
		if(num4>num3) {
			return num4-num3;
		}
			return num3-num4;
	}
	
	//두 정수의 곱을 알려주는 메서드 mul
	public static int mul(int num5, int num6) {
	return num5*num6;
	}
	
	//두 정수의 몫을 알려주는 메서드 div
	public static double div(double num7, double num8) {
	return num7/num8;
	}
	
	//두 정수의 나머지를 알려주는 메서드 mod
	public static int mod(int num9, int num0) {
	return num9%num0;
	}
	
	
}
