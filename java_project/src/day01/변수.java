package day01;

public class 변수 {

	public static void main(String[] args) {
	
		int num = 123; //선언+초기화
		System.out.println(num);
		
		// int num = 456; // 변수는 중복선언 불가능
		int num1 = 12, num2 = 34, num3 = 56; //같은 자료형의 한줄 선언 가능
		System.out.println(num1);
		
		num1 = 78; // =(대입연산자) 오른족의 값을 왼쪽의 변수에 저장(덮어쓰기)
		System.out.println(num1);
	
		// 8개의 기본 자료형은 지역변수 범위(scope) { }
		
		
		System.out.println(num3);
		//한글자만 저장 가능한 char
		// "문자열" 따옴표는 문자열을 의미함, 숫자는 따옴표가 없음, char는 작은 따옴표 ex) 'a'
		// string("문자열") / char('한글자만 가능')
		
		char ch = 'a';
		System.out.println(ch);
		
		double dou = 3.1;
		System.out.println(dou);
		
		byte b = 1;
		System.out.println(b);
		
		boolean boo = false; //true, false 으로만 저장 가능
		System.out.println(boo);
		
		//float / long 자료형은 접미사(가장 끝)에 값을 붙여야 인식됨
		//float(f,F) long(l,L 보통 대문자를 많이 씀 숫자1이랑 헷갈려서)
		
		float f = 1.2f;
		System.out.println(f);
		
		long L = 11L;
		System.out.println(L);
		
		num1 = 010; //앞에 0을 붙이면 8진수(0~7만 인식, 8=>10)로 인식
		//10진수(0~9 10=>10) //16진수 (0~15 (A10B11C12D13E14F15) 10=>16)
		System.out.println(num1);
		
		num2 = 0x10; //16진수로 인식
		System.out.println(num2);
		
		// + 더하기 -빼기 *곱하기 /나누기 사칙연산 기호를 사용하여 연산 가능
		// % 나머지
		
		num1 = 10;
		num2 = 20;
		System.out.println(num1%num2);

		//국어점수(kor), 영어점수(eng), 수학점수(math) 를 변수로 선언하고,
		//값을 입력하여, 세 점수의 합과 평균을 콘솔에 출력
		

		// 정수 나누기 정수 = 정수, 하나라도 실수가 있으면 실수값이 나옴

		int kor = 80, eng = 95, math = 100;
		System.out.println(kor+eng+math);
		System.out.println((kor+eng+math)/3);
		
		int sum = kor+eng+math;
		// + : 숫자 + 숫자 = 숫자 (더하기 연산자)
		// + : 숫자 + 문자 = 문자 (연결 연산자)
		System.out.println("합계:"+sum);
		System.out.println("평균:"+sum/3.0); //정수 / 정수 = 정수
		System.out.println("합계:"+(kor+eng+math));
		
		int a = 10;
		a += 10;    // a = a + 10;
		System.out.println(a); //++ 증감연산자
		System.out.println(++a);
		System.out.println(a++);
		System.out.println(a);
		

		
		
	}
	

}
