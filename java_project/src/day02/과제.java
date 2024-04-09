package day02;

import java.util.Scanner;

public class 과제 {

	public static void main(String[] args) {
		/* 카페에 제출
		 * 정수 2개와 연산자 1개를 입력받아 두 정수의 연산을 출력
		 * ex) 2,3 + -> 2+3 -> 5
		 * ex) 5,1 - -> 5-1 -> 4
		 * 연산자는 + - * / % 사용 가능
		 * 다른 종류의 연산자가 들어오면 잘못된 연산자로 출력
		 * */
		
		// 연산자 = char(기본자료형) == 비교가능 / String(객체) == 비교불가능
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("숫자(정수)를 입력해주세요.");
		int num1 = scan.nextInt();
		System.out.println("다음 숫자(정수)를 입력해주세요.");
		int num2 = scan.nextInt();
		System.out.println("연산자를 입력해주세요.");
		char op = scan.next().charAt(0); //한글자 받기
		
		//switch문
		
		int a = num1-num2;
		int b = num1*num2;
		double c = num1/(double)num2;
		int d = num1%num2;
		
		switch(op) {
		case '+' : System.out.println(""+num1+op+num2+"="+(num1+num2));
			break;
			//입력할때 char 가 숫자사이에 끼면 숫자로 변함
			//맨앞에 "" + 처리하여 방지
		case '-' : System.out.println(""+num1+op+num2+"="+a);
			break;
		case '*' : System.out.println(""+num1+op+num2+"="+b);
			break;
		case '/' : System.out.println(""+num1+op+num2+"="+c);
			break;
		case '%' : System.out.println(""+num1+op+num2+"="+d);
			break;
					
		}
		
		// /(나누기) 이거나 %(퍼센트) 일 경우 num2가 0이 되면 안내문구 띄우기
		if((op=='/')||(op=='%')&&num2==0) {
			System.out.println("잘못된 입력값입니다.");
		}else {
			
		}
		
//		
//		System.out.println("정수 2개와 연산자 1개(+,-,*,/,%)를 입력하시오.");
//		int num = scan.nextInt();
//		int num2 = scan.nextInt();
//		char ch = scan.next().charAt(0);
//		
//		switch(ch) {
//		case '+' : System.out.println(num+num2);
//		break;
//		case '-' : System.out.println(num-num2);
//		break;
//		case '*' : System.out.println(num*num2);
//		break;
//		case '/' : System.out.println(num/num2);
//		break;
//		case '%' : System.out.println(num%num2);
//		break;
//		
//		default : System.out.println("잘못된 연산자입니다.");
//		break;
		
		scan.close();
		
		}
		
	}
		
	
		
		
	
