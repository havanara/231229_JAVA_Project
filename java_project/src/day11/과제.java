package day11;

public class 과제 {

	public static void main(String[] args) {
		/* 메서드를 이용하여 작업
		 * 두 정수의 값이 주어졌을 때 두 정수 사이의 모든 정수의 합을 리턴하는 메서드
		 * ex) int a=3, int b=5 -> 3+4+5 = 12
		 * ex) int a=5, int b=1 -> 1+2+3+4+5 = 15
		 * ex) int a=3, int b=3 -> 3
		 * */

		과제 a = new 과제();
		
//		System.out.println(a.sum(2, 5));
//		System.out.println(a.sum(7, 1));
//		System.out.println(a.sum(3, 3));
		System.out.println(a.sum1(2, 5));
		System.out.println(a.sum1(7, 1));
		System.out.println(a.sum1(3, 3));
		
	}
	
	//1.들어가는 값(매개변수), 나오는 값(리턴타입)
	//매개변수 : int a, int b / 리턴타입 : 합(int)
	public int sum1(int num1, int num2) {
		int num = 0;
		//num1과 num2 사이의 모든값의 합계
		//num1과 num2를 비교하여 무조건 작은수부터 시작
		for(int i=(int)(Math.min(num1, num2)); i<=(int)(Math.max(num1, num2)); i++) {
			num += i;
		}
		
		return num;
	}
//	
//	public int sum(int num1, int num2) {
//		int num = 0;
//		
//		if(num1<num2) {
//			for(int i=num1; i<=num2; i++) {
//				num += i;
//			}
//		}else if(num1>num2){
//			for(int i=num2; i<=num1; i++) {
//				num += i;
//			}
//		}else{
//			num += num1;		
//		}
//		return num;
//
//	}
	
}	

